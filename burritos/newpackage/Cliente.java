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
public class Cliente extends Persona{
    private String contraseña;

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void imprimirNombre() {
        System.out.println("Alumno: " + getNombre() + " " + getApellido() + " " +getContraseña() );
    }
    
    
}
