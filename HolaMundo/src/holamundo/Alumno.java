/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author PC
 */
public class Alumno {
    private String codigo;
    private String nombre;
    private String apellidos;
    private String estado;
    private int edad;
    
    public Alumno(){
        this.edad = 18;
        this.estado= "Regular";
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", estado=" + estado + ", edad=" + edad + '}';
    }
    
    public void setEdad(int edad){
        this.edad=edad;
        
    }
    
    
    
}
