/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1.controlador.Vehiculos;

import controlador.DAO.AdaptadorDao;
import controlador.tda.lista.ListaEnlazadaServices;
import Ejercicio1.modelo.Auto;

/**
 *
 * @author Gigabyte
 */
public class AutoController extends AdaptadorDao<Auto> {

    private Auto auto;
    private ListaEnlazadaServices<Auto> listaAuto;

    public AutoController() {
        super(Auto.class);
    }

    public Auto getAuto() {
        if (auto == null) {
            auto = new Auto();
        }
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public ListaEnlazadaServices<Auto> getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(ListaEnlazadaServices<Auto> listaAuto) {
        this.listaAuto = listaAuto;
    }

    public Boolean guardar() {
        try {
            getAuto().setId(listaAuto.getSize() + 1);
            guardar(getAuto());
            return true;
        } catch (Exception e) {
            System.out.println("Error en guardar Auto" + e);
        }
        return false;
    }

    public Boolean modificar(Integer pos) {
        try {

            modificar(getAuto(), pos);
            return true;
        } catch (Exception e) {
            System.out.println("Error en modificar Auto" + e);
        }
        return false;
    }

    public Boolean eliminarDato(Integer pos) {
        try {
            eliminar(pos);
            return true;
        } catch (Exception e) {
            System.out.println("Error al dar de baja ");
        }
        return false;

    }

    public ListaEnlazadaServices<Auto> listado() {
        setListaAuto(listar());
        return listaAuto;
    }

}
