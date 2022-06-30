/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Stalin Cueva
 */
public class Gerente {
    
    private String usuario="USER123";
    private String contrasenia ="CONTRA123";
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        
        this.usuario = usuario;
    }

    public String getContrasenia() {
        
        return contrasenia;
    }

    public void setContraseña(String contraseña) {
        this.contrasenia = contraseña;
    }
    
}
