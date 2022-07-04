/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import HashTable.Global;

/**
 *
 * @author Liz
 */
public class Lector {
    
    public String readTxt(String path){

        String line;
        String txt = "";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        txt += line + "\n";
                    }
                }
            }
            return txt;
        } catch (Exception err) {
          return txt;
        }

    }
    
    public Articulo loadFiles(String txt){
        try {
            String[] t = txt.split("Autores");
                    String titulo = t[0].replace("\n", "");
//                    System.out.println(titulo);
//                    System.out.println("si");

                    String[] r= t[1].split("Resumen");
                    String[] autores = r[0].replaceAll("(?m)^[\t]*r?\n", "").split("\n");
//                    System.out.println(autores[0]);
//                    System.out.println("si");
                    
                    String[] s = r[1].replaceAll("(?m)^[\t]*r?\n", "").split("\n");
                    String resumen = s[0];
//                    System.out.println(resumen);
//                    System.out.println("so");
    //                
                    for (int i = 0; i < s.length; i++) {
                        if (s[i].contains("Palabras")) {
                            s[i] = s[i].replace("Palabras claves: ","");
                            s[i] = s[i].replace("Palabras Claves: ","");
                            String[] palabrasClave = s[i].split(", ");
//                            System.out.println(palabrasClave[0]);
//                            System.out.println("so");
                            Articulo art = new Articulo(titulo, autores, resumen, palabrasClave);
                            Global.getTabla().insertar(art);
                            Global.getListaTitulos().insertOrdered(titulo);
                            return art;
                        }
                }
                    return null;
                
        } catch (Exception e) {
            return null;
        }
    }
}

    
        

