/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTable;

import java.util.Objects;

/**
 *
 * @author Liz
 */
public class Articulo {
    private final String Titulo;
    private final String [] Autores;
    private final String Resumen;
    private final String [] PalabrasClave;
    
    public Articulo(String titulo, String autores [], String resumen, String palabrasClave []){
        this.Titulo = titulo;
        this.Autores = autores;
        this.Resumen = resumen;
        this.PalabrasClave = palabrasClave;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.Titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Articulo other = (Articulo) obj;
        return true;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String[] getAutores() {
        return Autores;
    }

    public String getResumen() {
        return Resumen;
    }

    public String[] getPalabrasClave() {
        return PalabrasClave;
    }

    
       
    
}
