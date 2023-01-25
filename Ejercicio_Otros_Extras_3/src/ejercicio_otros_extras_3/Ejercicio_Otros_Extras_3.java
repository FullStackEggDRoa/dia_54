/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_otros_extras_3;

import ejercicio_otros_extras_3.Entidades.Pass;
import ejercicio_otros_extras_3.Servicios.serviciosPass;

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
        serviciosPass sP = new serviciosPass(); 
        Pass p1 = new Pass();
        do {            
            System.out.println(".:: MENU ::.");
            System.out.println("A. Ingresar Contraseña");
            System.out.println("B. Verificar Nivel Contraseña");
            System.out.println("C. Modificar Nombre");
            System.out.println("D. Modificar DNI");
            
        } while (true);
        
        sP.crearPass(p1);
        
        
    }
    
}
