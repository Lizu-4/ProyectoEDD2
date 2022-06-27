/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTable;

/**
 *
 * @author Liz
 */
public class Funciones {
    
    public int ASCII(String titulo){
        
        int contador = 0;
        for (int i = 0; i < titulo.length(); i++) {
            contador = contador + (int)titulo.charAt(i);
        }
        return contador; 
    }
            
            
    
}
