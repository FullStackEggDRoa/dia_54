/*
    Ejercicio Otro Extra 2:
    *
    Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
   constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
   además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
   Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
   animas a simular el paso del tiempo en consola??????
 */
package ejercicio_otros_extras_2;

import ejercicio_otros_extras_2.Entidades.Tiempo;
import ejercicio_otros_extras_2.Servicios.tiempoServicios;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author droa
 */
public class Ejercicio_Otros_Extras_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        tiempoServicios tS = new tiempoServicios();
        boolean primeravez = true;
        
        Tiempo h1 = tS.crearTiempo();
        
        do{
            if(!primeravez){
                //System.out.print("\\u0033[F");
                
            }
            //System.out.print(""+Tiempo.ANSI_RESET);
            System.out.print(h1.imprimirHoraCompleta());
            TimeUnit.SECONDS.sleep(1);
            primeravez=false;
            h1.setSegundos(h1.getSegundos()+1);            //System.out.print(""+Tiempo.ANSI_BLACK);            
            clearScreen();
        }while(true);
        
        
    }
    public static void clearScreen(){
    
        try{
            //System.out.println("Presione enter para continuar...");
            //new java.util.Scanner(System.in).nextLine();

            Robot limpiar = new Robot();
            limpiar.keyPress(KeyEvent.VK_WINDOWS);
            limpiar.keyPress(KeyEvent.VK_L);
            limpiar.keyRelease(KeyEvent.VK_L);
            limpiar.keyRelease(KeyEvent.VK_WINDOWS);
            limpiar.keyPress(KeyEvent.VK_BACK_SPACE);
            limpiar.keyPress(KeyEvent.VK_BACK_SPACE);
            
        }  catch (AWTException e) {
            System.out.println("Error al limpiar la pantalla"+e.getMessage());
        }
    }
    
}