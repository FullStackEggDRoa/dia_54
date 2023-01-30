/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_otros_extras_3;

import ejercicio_otros_extras_3.Entidades.Pass;
import ejercicio_otros_extras_3.Servicios.serviciosPass;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_Otros_Extras_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        serviciosPass sP = new serviciosPass(); 
        Pass p1 = new Pass();
        char opcion;
        do {            
            System.out.println(".:: MENU ::.");
            System.out.println("A. Ingresar Contraseña");
            System.out.println("B. Verificar Nivel Contraseña");
            System.out.println("C. Modificar Nombre");
            System.out.println("D. Modificar DNI");
            System.out.print("Elija una Opción: ");
            switch (leer.next().charAt(0)) {
                case 'A' -> sP.crearPass(p1);
                case 'B' -> sP.analizarPass(p1);
                case 'C' -> sP.modificarPass(p1,1);
                case 'D' -> sP.modificarPass(p1,2);
                default -> System.out.print("Opción Errada, Intentelo Nuamente. ");
            }
        } while (true);
        
        
        
        
    }
    
}
