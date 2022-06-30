/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.vista.ModeloTabla;

import controlador.tda.lista.ListaEnlazadaServices;
import javax.swing.table.AbstractTableModel;
import Ejercicio1.modelo.Auto;

/**
 *
 * @author sebastian
 */
public class TablaAutos extends AbstractTableModel {
    private ListaEnlazadaServices<Auto> lista;

    public ListaEnlazadaServices<Auto> getLista() {
        return lista;
    }

    public void setLista(ListaEnlazadaServices<Auto> lista) {
        this.lista = lista;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public int getRowCount() {
        return lista.getSize();
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "id";
            case 1: return "Marca";
            case 2: return "Color";
            case 3: return "Precio";
            case 4: return "Placa";           
            default: return null;
        }
    }

    @Override
    public Object getValueAt(int arg0, int arg1) {
        Auto auto = lista.obtenerDato(arg0);
        switch(arg1) {
            case 0: return (arg0+1);
            case 1: return auto.getMarca().getNombre();
            case 2: return auto.getColor();
            case 3: return auto.getPrecio();
            case 4: return auto.getPlaca();            
            default: return null;
        }
    }
    
    
    
    
}
