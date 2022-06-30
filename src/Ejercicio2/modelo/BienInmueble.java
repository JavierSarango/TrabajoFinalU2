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

public class BienInmueble {
    private Integer id;
    private String Nro_Registro;
    private String ubicacion;
    private String valor;
    private String clasificacion;
    private String servicios;
    private String descripcion;
    private String tipo;
    
    public BienInmueble(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNro_Registro() {
        return Nro_Registro;
    }

    public void setNro_Registro(String Nro_Registro) {
        this.Nro_Registro = Nro_Registro;
    }

    

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

  

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BienInmueble(Integer id, String Nro_Registro, String ubicacion, String valor, String clasificacion, String servicios, String descripcion, String tipo) {
        this.id = id;
        this.Nro_Registro = Nro_Registro;
        this.ubicacion = ubicacion;
        this.valor = valor;
        this.clasificacion = clasificacion;
        this.servicios = servicios;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

   
    
}
