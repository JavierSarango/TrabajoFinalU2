/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.controlador.Inmueble;

import controlador.DAO.AdaptadorDao;
import controlador.tda.lista.ListaEnlazadaServices;
import Ejercicio2.modelo.BienInmueble;

/**
 *
 * @author jy
 */
public class InmuebleController extends AdaptadorDao<BienInmueble> {

    private BienInmueble inmueble;
    private ListaEnlazadaServices<BienInmueble> listainmueble = new ListaEnlazadaServices<BienInmueble>();

    public InmuebleController() {
        super(BienInmueble.class);
        listado();
    }

    public BienInmueble getInmueble() {
        if (this.inmueble == null) {
            this.inmueble = new BienInmueble();
        }

        return inmueble;
    }

    public void setAuto(BienInmueble inmueble) {
        this.inmueble = inmueble;
    }

    public ListaEnlazadaServices<BienInmueble> getListainmueble() {
        return listainmueble;
    }

    public void setListainmueble(ListaEnlazadaServices<BienInmueble> listainmueble) {
        this.listainmueble = listainmueble;
    }

    public Boolean guardar() {
        try {

            guardar(getInmueble());
            return true;
        } catch (Exception e) {
            System.out.println("Error en guardar autor" + e);
        }
        return false;
    }

    public Boolean modificar(Integer pos) {
        try {

            modificar(getInmueble(), pos);
            return true;
        } catch (Exception e) {
            System.out.println("Error en modificar ticket" + e);
        }
        return false;
    }


    public Boolean eliminars(Integer pos) {
        try {

            eliminar(pos);
            return true;
        } catch (Exception e) {
            System.out.println("Error en modificar ticket" + e);
        }
        return false;
    }


    public ListaEnlazadaServices<BienInmueble> listado() {
        setListainmueble(listar());
        return listainmueble;

    }

    public static void main(String[] args) {
        InmuebleController cb = new InmuebleController();
        cb.getInmueble().setId(Integer.parseInt("01"));
        cb.getInmueble().setDescripcion("amskmsa");
        cb.getInmueble().setClasificacion("Empleado");
        cb.getInmueble().setNro_Registro("01");
        cb.getInmueble().setServicios("nose");
        cb.guardar();

    }

}
