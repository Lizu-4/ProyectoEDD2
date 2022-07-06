/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

/**
 *
 * @author Liz
 */
import HashTable.Articulo;
import HashTable.Global;
import HashTable.HashTable;
import HashTable.Lector;
import HashTable.Lista;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class BuscarAutor extends javax.swing.JFrame {

    /**
     * Creates new form BuscarAutor
     */
    Global global = new Global();

    public BuscarAutor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDatos();
    }
    
    public DefaultListModel getDatos(Lista titulos) {
        DefaultListModel modelo = new DefaultListModel();
        int position = titulos.getFirst();
        while (position != -1) {
            Articulo art = (Articulo) titulos.array[position].getData();
            modelo.addElement(art.getTitulo());
            position = titulos.array[position].getNext();
        }
        this.panelTitulos.setModel(modelo);
        return modelo;
    }

    public void setDatos() {
        Lista lista = Global.getListaAutores();
        int position = lista.getFirst();
        while (position != -1) {
            this.choice.add((String) lista.array[position].data);
            position = lista.array[position].getNext();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        choice = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        mostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        send = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelTitulos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(choice, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 190, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Seleccione un articulo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, 20));

        mostrar.setText("Solicitar Detalles");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        jPanel1.add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Seleccione un autor:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        send.setText("Enviar");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        jPanel1.add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jScrollPane3.setViewportView(panelTitulos);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 350, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
        HashTable tabla = Global.getTabla();
        Articulo art = tabla.buscar(this.panelTitulos.getSelectedValue());
        String[] palabrasclave = art.getPalabrasClave();

        String txt = "" + art.getTitulo() + "\n"
                + "Autores:\n";

        for (int i = 0; i < art.getAutores().length; i++) {
            txt = txt + art.getAutores()[i]+ "\n";
        }
       txt = txt +"Palabras clave: " ;
       
        for (int i = 0; i < art.getPalabrasClave().length; i++) {
            txt = txt + art.getPalabrasClave()[i] + ", ";
        }
       
        JOptionPane.showMessageDialog(null,txt);
    }//GEN-LAST:event_mostrarActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        // TODO add your handling code here:
        var tabla = global.getTabla();
        var autor = choice.getSelectedItem();
        Lista resultados = tabla.buscarAutor(autor);
        this.getDatos(resultados);
    }//GEN-LAST:event_sendActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton mostrar;
    private javax.swing.JList<String> panelTitulos;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables
}
