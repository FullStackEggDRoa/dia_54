/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_otros_extras_3.Entidades;

/**
 *
 * @author droa
 */
public class Pass {
    
    // Atributos
    private String pass;
    private String nombre;
    private String dni;
    
    // Constructores;

    public Pass() {
        this.nombre="Francisca Gorzetti";
        this.dni="81.544.670";
        this.pass="";
    }

    public Pass(String pass, String nombre, String dni) {
        this.pass = pass;
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Metodos

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    
}
