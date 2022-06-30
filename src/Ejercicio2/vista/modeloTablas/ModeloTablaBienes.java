/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.vista.modeloTablas;

import controlador.tda.lista.ListaEnlazadaServices;
import javax.swing.table.AbstractTableModel;
import Ejercicio2.modelo.BienInmueble;

/**
 *
 * @author Nathaly
 */
public class ModeloTablaBienes extends AbstractTableModel {

    private ListaEnlazadaServices<BienInmueble> lista = new ListaEnlazadaServices<>();

    public ListaEnlazadaServices<BienInmueble> getLista() {
        return lista;
    }

    public void setLista(ListaEnlazadaServices<BienInmueble> lista) {
        this.lista = lista;
    }

    @Override
    public int getColumnCount() {
        return 7;
        
    }

    @Override
    public int getRowCount() {
        return lista.getSize();
    }

    @Override
    public Object getValueAt(int i, int i1) {
        BienInmueble bienes = lista.obtenerDato(i);
        switch (i1) {
            case 0:
                return bienes.getNro_Registro();
            case 1:
                return bienes.getUbicacion();
            case 2:
                return bienes.getValor();
            case 3:
                return bienes.getClasificacion();
            case 4:
                return bienes.getServicios();
            case 5:
                return bienes.getTipo();
            case 6:
                return bienes.getDescripcion();

            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int i) {
        switch (i) {
            case 0:
                return "NRO REGISTRO";
            case 1:
                return "UBICACION";
            case 2:
                return "VALOR";
            case 3:
                return "CLASIFICACION";
            case 4:
                return "SERVICIOS";
            case 5:
                return "TIPO";
            case 6:
                return "DESCRIPCION";

            default:
                return null;
        }
    }

}
