/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_otros_extras_2.Entidades;
import javax.swing.JOptionPane;

/**
 *
 * @author droa
 */
public class Tiempo {
    
    // Atributos
    
    private int hora;
    private int minutos;
    private int segundos;
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String HOME = "\r";
    
    
    // Constructores

    public Tiempo() {
    }

    public Tiempo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    // Métodos

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public String imprimirHoraCompleta(){
        //System.out.print("\rHora: ["+hora+":"+minutos+":"+segundos+"]");
        
        
        if(segundos>59){
            this.minutos=minutos+1;            
            
            if(minutos>59){
                this.hora=hora+1;
                this.minutos=0;
                if(hora>23){
                    this.hora=0;
                }
            }
            
            this.segundos=segundos-60;
        }
        
        String respuesta = HOME+"Hora: ["+String.format("%02d",hora)+":"+String.format("%02d",minutos)+":"+String.format("%02d",segundos)+"]";
                
        return respuesta;
    }
    
}
