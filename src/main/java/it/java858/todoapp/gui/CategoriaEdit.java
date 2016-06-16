/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp.gui;


import it.java858.todoapp.entity.Categoria;
import it.java858.todoapp.service.CategoriaService;
import java.awt.Dialog;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class CategoriaEdit extends javax.swing.JDialog {

    /**
     * Creates new form CategoriaEdit
     */
    public CategoriaEdit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Crea o modifica categoria");
    }

    public CategoriaEdit(Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
        this.setTitle("Crea o modifica categoria");
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmdSalva = new javax.swing.JButton();
        cmdAnnulla = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome categoria:");

        cmdSalva.setText("Salva");
        cmdSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalvaActionPerformed(evt);
            }
        });

        cmdAnnulla.setText("Annulla");
        cmdAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAnnullaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Creazione Modifica Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(cmdSalva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdAnnulla)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdSalva)
                    .addComponent(cmdAnnulla))
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalvaActionPerformed
      Categoria newc= new Categoria();
      newc.setNome(txtNome.getText());
      
      CategoriaService.save(newc);
      JOptionPane.showMessageDialog(this, "categoria salvata");
      close();
      
    }//GEN-LAST:event_cmdSalvaActionPerformed

    private void cmdAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAnnullaActionPerformed
     close();
    }//GEN-LAST:event_cmdAnnullaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void close(){
        this.setVisible(false);
        this.dispose();
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAnnulla;
    private javax.swing.JButton cmdSalva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
