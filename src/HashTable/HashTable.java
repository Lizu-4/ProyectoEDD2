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

  

    private int size;
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
        p = (int) (d % this.getSize());
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
        art = getTabla()[posicion];
        return art;
    }

    public boolean enTabla(String clave) {
        int posicion;
        posicion = this.hash(clave);
        if (getTabla()[posicion] != null) {
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
            this.getTabla()[posicion] = articulo;
        }
    }

    public void eliminar(String titulo) {
        int posicion = this.hash(titulo);
        getTabla()[posicion] = null;
    }
    
    public Lista buscarPalabraClave(String pClave){
        Lista lista = new Lista(60);
        for (int i = 0; i < this.tabla.length; i++) {
            if(this.tabla[i] != null){
                for (int j = 0; j < this.tabla[i].getPalabrasClave().length; j++) {
                    
                    if(pClave.toLowerCase().equals(this.tabla[i].getPalabrasClave()[j].toLowerCase()) ){

                        lista.addEnd(this.tabla[i]);
                    }
                }
            }
        }
        return lista;
    }
   
    public Lista buscarAutor(String autor){
        Lista lista = new Lista(60);
        for (int i = 0; i < this.tabla.length; i++) {
            if(this.tabla[i] != null){
                for (int j = 0; j < this.tabla[i].getAutores().length; j++) {
                    if(autor.equals(this.tabla[i].getAutores()[j]) ){

                        lista.insertOrdered(this.tabla[i]);
                        
                    }
                }
            }
        }
        return lista;
    }
    
    
    
      /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the tabla
     */
    public Articulo[] getTabla() {
        return tabla;
    }

    /**
     * @param tabla the tabla to set
     */
    public void setTabla(Articulo[] tabla) {
        this.tabla = tabla;
    }
}
