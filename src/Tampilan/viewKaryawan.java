/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import Controller.UserSession;
import Controller.dt_karyawan;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Cut Jihan Riska
 */
public class viewKaryawan extends javax.swing.JFrame {

    private void ViewData(){
        dt_karyawan ck = new dt_karyawan();
        try{
            jTable1.setModel(DbUtils.resultSetToTableModel(ck.UpdateJTable()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * Creates new form viewKaryawan
     */
    public viewKaryawan() {
        initComponents();
        ViewData();
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
        cbedit = new javax.swing.JButton();
        cbkembali = new javax.swing.JButton();
        cbhapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        cbedit.setBackground(new java.awt.Color(51, 153, 255));
        cbedit.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        cbedit.setForeground(new java.awt.Color(51, 255, 255));
        cbedit.setText("Edit");
        cbedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbeditActionPerformed(evt);
            }
        });

        cbkembali.setBackground(new java.awt.Color(51, 153, 255));
        cbkembali.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        cbkembali.setText("Kembali");
        cbkembali.setToolTipText("");
        cbkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkembaliActionPerformed(evt);
            }
        });

        cbhapus.setBackground(new java.awt.Color(51, 153, 255));
        cbhapus.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        cbhapus.setForeground(new java.awt.Color(255, 0, 0));
        cbhapus.setText("Hapus");
        cbhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbhapusActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("DATA KARYAWAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(906, Short.MAX_VALUE)
                .addComponent(cbkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbedit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbedit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(cbkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        dt_karyawan ck = new dt_karyawan();
        int row = jTable1.getSelectedRow();
        ck.id = jTable1.getModel().getValueAt(row,0).toString();
        ck.nama = jTable1.getModel().getValueAt(row,1).toString();
        ck.jabatan = jTable1.getModel().getValueAt(row,2).toString();
        ck.jenis_kelamin = jTable1.getModel().getValueAt(row, 3).toString();
        ck.agama =jTable1.getModel().getValueAt(row,4).toString();
        ck.status = jTable1.getModel().getValueAt(row, 5).toString();
        ck.alamat = jTable1.getModel().getValueAt(row,6).toString();
        ck.user = jTable1.getModel().getValueAt(row,7).toString();
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void cbeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbeditActionPerformed
        editKaryawan ek = new editKaryawan();
        ek.setVisible(true);
    }//GEN-LAST:event_cbeditActionPerformed

    private void cbkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkembaliActionPerformed
        // TODO add your handling code here:
        setVisible(false);
                new menuKaryawan().setVisible(true);
    }//GEN-LAST:event_cbkembaliActionPerformed

    private void cbhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbhapusActionPerformed
        // TODO add your handling code here:
        String ObjButtons[]={"Ya","Tidak"};
        int PromptResult =JOptionPane.showOptionDialog(null, "Yakin Menghapus Data Ini ?", "Message", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, ObjButtons, ObjButtons[1]);
        if(PromptResult ==0){
            dt_karyawan ck = new dt_karyawan();
            ck.id = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
            try{
                ck.hapus();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
                ViewData();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_cbhapusActionPerformed

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
            java.util.logging.Logger.getLogger(viewKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cbedit;
    private javax.swing.JButton cbhapus;
    private javax.swing.JButton cbkembali;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
