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
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author droa
 */
public class Ejercicio_Otros_Extras_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tiempoServicios tS = new tiempoServicios();
       
        
        Tiempo h1 = tS.crearTiempo();
        
        h1.imprimirHoraCompleta();
        
        

//
        
        
    }
    
}
