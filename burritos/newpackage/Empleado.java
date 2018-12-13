/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burritos.newpackage;

/**
 *
 * @author escritorio
 */
public class Empleado extends Persona{
    private String rfc;

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    
    
    
    @Override
    public void imprimirNombre() {
        System.out.println("Empleado: " + getNombre() + " " + getApellido() + " Clave " +getRfc());
    }
    
    
    
    
}
