/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1.controlador.Vehiculos;

import controlador.DAO.AdaptadorDao;
import controlador.tda.lista.ListaEnlazadaServices;
import Ejercicio1.modelo.Marca;

/**
 *
 * @author diego
 */
public class MarcaController extends AdaptadorDao<Marca> {

    private Marca marca;
    private ListaEnlazadaServices<Marca> listaMarca;

    public MarcaController() {
        super(Marca.class);
    }

    public Marca getMarca() {
        if (marca == null) {
            marca = new Marca();
        }
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public ListaEnlazadaServices<Marca> getListaMarca() {
        return listaMarca;
    }

    public void setListaMarca(ListaEnlazadaServices<Marca> listaMarca) {
        this.listaMarca = listaMarca;
    }

    public Boolean guardar() {
        try { 
            guardar(getMarca());
            return true;
        } catch (Exception e) {
            System.out.println("Error en guardar Marca" + e);
        }
        return false;
    }

    public Boolean modificar(Integer pos) {
        try {

            modificar(getMarca(), pos);
            return true;
        } catch (Exception e) {
            System.out.println("Error en modificar Marca" + e);
        }
        return false;
    }

    public Boolean eliminarDato(Integer pos) {
        try {
            eliminar(pos);
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar Marca ");
        }
        return false;

    }

    public ListaEnlazadaServices<Marca> listado() {
        setListaMarca(listar());
        return listaMarca;
    }

}
