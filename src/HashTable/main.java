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
        l.loadFiles(l.readTxt("test\\todo.txt"));
        HashTable tabla = Global.getTabla();
        String txt = "";
        String aux = "";
        
//////        var key = Global.getTabla().hash("Sistema de diseño basado en Grid");
//////        Articulo art = Global.getTabla().buscar(Integer.toString(key));
//////        String[] palabrasclave = art.getPalabrasClave();
//////
//////        String txt = "" + art.getTitulo() + "\n"
//////                + "Autores:\n";
//////
//////        for (int i = 0; i < art.getAutores().length; i++) {
//////            txt = txt + art.getAutores()[i]+ "\n";
//////        }
//////
//////        for (int j = 0; j < palabrasclave.length; j++) {
//////            txt = txt + palabrasclave[j] + ": " + art.contarPalabrasClave(palabrasclave[j]) + "\n";
//////        }
//////        
//////        System.out.println(txt);
        
         for (int i = 0; i < tabla.getSize(); i++) {
             if (tabla.getTabla()[i] != null) {
                 txt += tabla.getTabla()[i].getTitulo() + "\n";
                 aux += i + ",";
             }
        }
         System.out.println(txt);
         System.out.println(aux);
         Articulo art = tabla.buscar("GraphQL vs REST: una comparación desde la perspectiva de eficiencia de desempeño.");
         System.out.println(art.getPalabrasClave()[0]);
         



//        hT.insertar(art);
//        hT.insertar(art2);


//        var lista = hT.buscarPalabraClave("AutoCAD");
        
        


      

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

   
    }

}


