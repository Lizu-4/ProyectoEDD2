/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HashTable;

/**
 *
 * @author Liz
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lector l = new Lector();
        String a = "test\\art3.txt";
        String texto = l.readTxt(a);
        String tit = l.loadFiles(texto).getTitulo();
//        Lectur lector = l.loadFiles(texto);
        System.out.println(tit);
//        Lector p = l.loadFiles(texto);

//            Funciones fun = new Funciones();
//            String titulo = "ABC";
//            int ascii = fun.ASCII(titulo);
//            System.out.println(ascii);
    }
    
}
