/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_otros_extras_2.Servicios;

import ejercicio_otros_extras_2.Entidades.Tiempo;
import java.util.Scanner;
import javax.management.StringValueExp;

/**
 *
 * @author droa
 */
public class tiempoServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Tiempo crearTiempo(){
        
        int hora_formateado=0;
        int minutos_formateado=0;
        int segundos_formateado=0;
        
        do{
            System.out.print("Ingrese la Hora [HH:MM:SS]: ");
            String hora = leer.next();
            String[] horaAux = hora.split("\\:", 0);

            

            switch (horaAux.length) {
                case 3 -> {
                        hora_formateado=(int)Integer.parseInt(horaAux[0]);
                        minutos_formateado=(int)Integer.parseInt(horaAux[1]);
                        segundos_formateado=(int)Integer.parseInt(horaAux[2]);
                        if(horaCorrecta(hora_formateado)){
                            continue;
                        }
                        if(minutosCorrecto(minutos_formateado)){
                            continue;
                        }
                        if(segundosCorrecto(segundos_formateado)){
                            continue;
                        }
                        
                    }
                default -> System.out.println("Hora Ingresada Erradamente. Intente Nuevamente. ");    
            }
        }while(String.valueOf(hora_formateado).length()>2 && String.valueOf(minutos_formateado).length()>2 && String.valueOf(segundos_formateado).length()>2);
        
        
        return new Tiempo(hora_formateado, minutos_formateado, segundos_formateado);
    }
        
    public boolean horaCorrecta(int hora){
        boolean respuesta= true;
        if(hora>23 || hora<0){
            respuesta=false;
        }
        return respuesta;
    }
    public boolean minutosCorrecto(int minutos){
        boolean respuesta= true;
        if(minutos>60 || minutos<0){
            respuesta=false;
        }
        return respuesta;
    }
    public boolean segundosCorrecto(int segundos){
        boolean respuesta= true;
        if(segundos>60 || segundos<0){
            respuesta=false;
        }
        return respuesta;
    }  
      
    
}
