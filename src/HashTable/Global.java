/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTable;
import HashTable.HashTable;

/**
 *
 * @author Juan
 */
public class Global {
    public static HashTable tabla = new HashTable(200);
    public static Lista listaTitulos = new Lista(60);

    /**
     * @return the tabla
     */
    public static HashTable getTabla() {
        return tabla;
    }

    /**
     * @param aTabla the tabla to set
     */
    public static void setTabla(HashTable aTabla) {
        tabla = aTabla;
    }

    /**
     * @return the listaTitulos
     */
    public static Lista getListaTitulos() {
        return listaTitulos;
    }

    /**
     * @param aListaTitulos the listaTitulos to set
     */
    public static void setListaTitulos(Lista aListaTitulos) {
        listaTitulos = aListaTitulos;
    }
    
    
    
    
}
