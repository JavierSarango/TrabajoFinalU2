/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio1.modelo;

/**
 *
 * @author Stalin Cueva
 */
public class Administrador {
    
    private String usuario="ADMIN123";
    private String contrasenia="ADMIN123";

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        
        this.usuario = usuario;
    }

    public String getContrasenia() {
        
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        
        this.contrasenia = contrasenia;
    }
    
}
