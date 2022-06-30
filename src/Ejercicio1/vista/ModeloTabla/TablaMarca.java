/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1.vista.ModeloTabla;

import controlador.tda.lista.ListaEnlazadaServices;
import javax.swing.table.AbstractTableModel;
import Ejercicio1.modelo.Marca;


/**
 *
 * @author diego
 */
public class TablaMarca extends AbstractTableModel{
    private ListaEnlazadaServices<Marca> lista;
    
    public ListaEnlazadaServices<Marca> getLista() {
        return lista;
    }

    public void setLista(ListaEnlazadaServices<Marca> lista) {
        this.lista = lista;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return lista.getSize();
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "Id";
            case 1: return "Nombre Marca";
            case 2: return "Color Distintivo";
            case 3: return "Rango de Precios"; 
            default: return null;
        }
    }

    @Override
    public Object getValueAt(int arg0, int arg1) {
        Marca marca = lista.obtenerDato(arg0);
        switch(arg1) {
            case 0: return (arg0+1);
            case 1: return marca.getNombre();
            case 2: return marca.getColorMarca();
            case 3: return marca.getTipoPrecio();      
            default: return null;
        }
    }
    
}
