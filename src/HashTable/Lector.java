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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Liz
 */
public class Lector {

    public String readTxt(String path) {

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

    public String openTxt() {
        String aux = "";
        String txt = "";
        try {
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(file);
            File abrir = file.getSelectedFile();
            if (abrir != null) {
                FileReader fr = new FileReader(abrir);
                BufferedReader br = new BufferedReader(fr);
                while ((aux = br.readLine()) != null) {
                    txt += aux + "\n";
                }
                br.close();
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
        }
        return txt;
    }

    public void writeTxt(String txt) {
        // escribe en "todo" el contenido del archivo cargado por el usuario
        String texto = this.readTxt("test\\todo.txt");
        try {
            PrintWriter pw = new PrintWriter("test\\todo.txt");
            pw.write(texto);
            pw.append(txt);
            pw.append("##");
            pw.close();
            JOptionPane.showMessageDialog(null, "Articulo añadido con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void loadFiles(String txt) {

        String[] t = null;
        try {
            if (txt.contains("##")) {
                String[] a = txt.split("##");
                for (int i = 0; i < a.length; i++) {
                    t = a[i].split("Autores");
                    this.cargar(t);
                }
            } else {
                t = txt.split("Autores");
                this.cargar(t);
                this.writeTxt(txt);
            }
        } catch (Exception e) {
            
        }
    }

    public void cargar(String[] t) {
        
        String titulo = t[0].replace("\n", "");
        String[] r = t[1].split("Resumen");
        String[] autores = r[0].replaceAll("(?m)^[\t]*r?\n", "").split("\n");
        String[] s = r[1].replaceAll("(?m)^[\t]*r?\n", "").split("\n");
        String resumen = s[0];

        for (int i = 0; i < s.length; i++) {
            if (s[i].contains("Palabras")) {
                s[i] = s[i].replace("Palabras claves: ", "");
                s[i] = s[i].replace("Palabras Claves: ", "");
                if (s[i].contains(".")) {
                    s[i] = s[i].replace(".", "");
                }
                String[] palabrasClave = s[i].split(", ");

                if (Global.getListaTitulos().isEmpty()) {
                    Articulo art = new Articulo(titulo, autores, resumen, palabrasClave);
                    Global.getTabla().insertar(art);
                    Global.getListaTitulos().insertOrdered(titulo);
                } else {
                    if (!Global.getListaTitulos().existeTitulo(titulo)) {
                        Articulo art = new Articulo(titulo, autores, resumen, palabrasClave);
                        Global.getTabla().insertar(art);
                        Global.getListaTitulos().insertOrdered(titulo);
                    } else {
                        JOptionPane.showMessageDialog(null, "El articulo que desea ingresar ya se encuentra registrado");
                    }
                }
            }
        }
    }
}
