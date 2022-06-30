/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.modelo;

/**
 *
 * @author Nathaly
 */
public class Cuenta {

    private Integer id;
    private String user;
    private String password;

    public Cuenta() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cuenta(Integer id, String user, String password) {
        this.id = id;
        this.user = user;
        this.password = password;
    }

}
