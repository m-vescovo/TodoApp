/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp.gui;

import it.java858.todoapp.entity.Categoria;
import it.java858.todoapp.service.CategoriaService;
import it.java858.todoapp.service.event.CategoriaEventListener;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 *
 *
 * @author tss
 */
public class Main extends javax.swing.JFrame implements CategoriaEventListener {

    /**
     * Creates new form Main
     */
    public Main() {

        initComponents();
        this.setTitle("Gestione ToDo");
        CategoriaService.addCategoriaEventListener(this);
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //int heigth = screenSize.heigth;
        //int width = screenSize.width;
        //this.setSize(width/2, height/2 );
        //this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuesci = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuCreaCategoira = new javax.swing.JMenuItem();
        mnuGestCategorie = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        mnuesci.setText("Esci");
        mnuesci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuesciActionPerformed(evt);
            }
        });
        jMenu1.add(mnuesci);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Categorie");

        mnuCreaCategoira.setText("Crea categoria");
        mnuCreaCategoira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCreaCategoiraActionPerformed(evt);
            }
        });
        jMenu2.add(mnuCreaCategoira);

        mnuGestCategorie.setText("Gestione categorie");
        mnuGestCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGestCategorieActionPerformed(evt);
            }
        });
        jMenu2.add(mnuGestCategorie);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuesciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuesciActionPerformed
        // genera il pulsante esci

        System.exit(0);//per terminare il programma
    }//GEN-LAST:event_mnuesciActionPerformed

    private void mnuCreaCategoiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCreaCategoiraActionPerformed
        CategoriaEdit edit = new CategoriaEdit(new Categoria(), this, true);
        edit.setLocationRelativeTo(this);
        edit.setVisible(true);

    }//GEN-LAST:event_mnuCreaCategoiraActionPerformed

    private void mnuGestCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGestCategorieActionPerformed
        CategoriaCRUD crud = new CategoriaCRUD(this, true);
        crud.setLocationRelativeTo(this);
        crud.setVisible(true);

    }//GEN-LAST:event_mnuGestCategorieActionPerformed

        //</editor-fold>

    /* Create and display the form */
       // java.awt.EventQueue.invokeLater(new Runnable() {
    //   public void run() {
    //     new Main().setVisible(true);
    // }
    //});
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem mnuCreaCategoira;
    private javax.swing.JMenuItem mnuGestCategorie;
    private javax.swing.JMenuItem mnuesci;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onCreate(Categoria c) {
        JOptionPane.showMessageDialog(this, "Nuova Categoria salvata "); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onUddate(Categoria c) {
        JOptionPane.showMessageDialog(this, "Categoria modificata"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onDelete(Categoria c) {
        JOptionPane.showMessageDialog(this, "Categoria eliminata "); //To change body of generated methods, choose Tools | Templates.
    }
}
