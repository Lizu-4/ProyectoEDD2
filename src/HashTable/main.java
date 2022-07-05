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
        HashTable hT = new HashTable(10);
        String a = "test\\art3.txt";
        String b = "test\\art4.txt";

        String texto = l.readTxt(a);
        String text = l.readTxt(b);

        Articulo art = l.loadFiles(texto);
        Articulo art2 = l.loadFiles(text);


//        hT.insertar(art);
//        hT.insertar(art2);


//        var lista = hT.buscarPalabraClave("AutoCAD");
        
        Lista lis = new Lista(10);
        lis.insertOrdered("hola");
        lis.insertOrdered("mientras tanto");
        lis.insertOrdered("asi es");
        lis.insertOrdered("como");
        System.out.println(lis.printList());
        


       

//        
//        Lista list = hT.buscarAutor("Christian Guillén-Drija");
//      
//        System.out.println(list.getPfirst().getArt().getResumen());
//        System.out.println("");
//        System.out.println(list.getPfirst().getNext().getArt().getResumen());
//        
//        String tit = l.loadFiles(texto).getTitulo();
//        Lectur lector = l.loadFiles(texto);
//        System.out.println(tit);
//        Lector p = l.loadFiles(texto);

//            Funciones fun = new Funciones();
//            String titulo = "ABC";
//            int ascii = fun.ASCII(titulo);
//            System.out.println(ascii);
   
    }

}
