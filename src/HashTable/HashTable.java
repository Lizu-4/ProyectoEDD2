/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTable;

import HashTable.Articulo;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class HashTable {

    private final int size;
    private Articulo[] tabla;

    public HashTable(int size) {
        this.size = size;
        this.tabla = new Articulo[size];
        for (int i = 0; i < size; i++) {
            tabla[i] = null;
        }
    }

    public int hash(String titulo) {
        int i = 0, p;
        long d;
        d = this.transformaCadena(titulo);
        p = (int) (d % this.size);
        return p;
    }

    long transformaCadena(String titulo) {

        int d = 0;
        for (int i = 0; i < Math.min(12, titulo.length()); i++) {
            d = d + (int) titulo.charAt(i) * i;
        }
        if (d < 0) {
            d = -d;
        }
        return d;
    }

    public Articulo buscar(String clave) {
        Articulo art;
        int posicion;
        posicion = this.hash(clave);
        art = tabla[posicion];
        return art;
    }

    public boolean enTabla(String clave) {
        int posicion;
        posicion = this.hash(clave);
        if (tabla[posicion] != null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertar(Articulo articulo) {
        int posicion;
        if (this.enTabla(articulo.getTitulo())) {
            JOptionPane.showMessageDialog(null, "El Articulo a insertar ya existe");
        } else {
            posicion = this.hash(articulo.getTitulo());
            tabla[posicion] = articulo;
        }
    }

    public void eliminar(String titulo) {
        int posicion = this.hash(titulo);
        tabla[posicion] = null;
    }
}
