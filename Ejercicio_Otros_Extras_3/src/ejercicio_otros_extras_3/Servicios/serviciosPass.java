/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_otros_extras_3.Servicios;

import ejercicio_otros_extras_3.Entidades.Pass;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosPass {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String contrasenia="";
    Boolean primeravez=true;
    
    public void crearPass(Pass p1){
        
        do {
            if(primeravez){
                System.out.print("Ingrese Contraseña: ");
                primeravez=false;
            }else{
                System.out.println("Reingrese Contraseña: ");
            }
                
            System.out.print("Ingrese Contraseña: ");
            contrasenia=leer.next();
        } while (contrasenia.length()!=10);
        p1.setPass(contrasenia);
    }
    
    public int analizarPass(Pass p1){
        int contador_z=0;
        int contador_a=0;
        int respuesta=0;
        
        for(int i=0;i<p1.getPass().length();i++){
            switch (p1.getPass().charAt(i)) {
                case 'a' -> contador_a++;
                case 'z' -> contador_z++;
            }
        }
        
        if(contador_z>=1 && contador_a>=2){
            respuesta=1;    
        }else if(contador_z>=1){
            respuesta=0;
        }else{
            respuesta=-1;
        }
        return respuesta;
    }
    
    public void modificarPass(Pass p1){
        System.out.print("Ingrese su Contraseña: ");
        String contrasenia_ingresada=leer.next();
        if(p1.getPass().equals(contrasenia_ingresada)){
            System.out.print("Validación Exitosa ... ");
            System.out.print("Cambiar: 1. Nombre o 2. DNI ?: ");
            switch(leer.nextInt()){
                case 1 -> { System.out.print("Ingrese el nuevo Nombre: ");
                    p1.setNombre(leer.next());                          
                }
                case 2 -> { System.out.print("Ingrese el nuevo DNI: ");
                    p1.setNombre(leer.next());                          
                } 
            }
        }else{
            System.out.println("Validación Incorrecta... ");
            System.out.println("No hubo modificación....");
        }
    }
}
