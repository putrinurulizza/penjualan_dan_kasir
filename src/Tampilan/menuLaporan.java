/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import Controller.UserSession;
import com.raven.main.Main;
import views.laporanBarangMasuk;
import views.laporanStokBarang;
import views.laporanBarangKeluar;
import views.laporanGaji;

/**
 *
 * @author user
 */
public class menuLaporan extends javax.swing.JFrame {

    /**
     * Creates new form menuLaporan
     */
    public menuLaporan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lapbrgmasuk = new javax.swing.JButton();
        lapstokbrg = new javax.swing.JButton();
        lapbrgkeluar = new javax.swing.JButton();
        lapkeuangan = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        grafik = new javax.swing.JButton();
        lbluserlogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel10.setBackground(new java.awt.Color(0, 29, 110));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOKO AMAR JAYA");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        lapbrgmasuk.setBackground(new java.awt.Color(0, 29, 110));
        lapbrgmasuk.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lapbrgmasuk.setForeground(new java.awt.Color(255, 255, 255));
        lapbrgmasuk.setText("Lap. Barang Masuk");
        lapbrgmasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapbrgmasukActionPerformed(evt);
            }
        });

        lapstokbrg.setBackground(new java.awt.Color(0, 29, 110));
        lapstokbrg.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lapstokbrg.setForeground(new java.awt.Color(255, 255, 255));
        lapstokbrg.setText("Lap. Stok Barang");
        lapstokbrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapstokbrgActionPerformed(evt);
            }
        });

        lapbrgkeluar.setBackground(new java.awt.Color(0, 29, 110));
        lapbrgkeluar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lapbrgkeluar.setForeground(new java.awt.Color(255, 255, 255));
        lapbrgkeluar.setText("Lap. Barang Keluar");
        lapbrgkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapbrgkeluarActionPerformed(evt);
            }
        });

        lapkeuangan.setBackground(new java.awt.Color(0, 29, 110));
        lapkeuangan.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lapkeuangan.setForeground(new java.awt.Color(255, 255, 255));
        lapkeuangan.setText("Lap. Penggajian");
        lapkeuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapkeuanganActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Kembali");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        grafik.setBackground(new java.awt.Color(0, 29, 110));
        grafik.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        grafik.setForeground(new java.awt.Color(255, 255, 255));
        grafik.setText("Grafik");
        grafik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grafikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(grafik, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lapstokbrg, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lapkeuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lapbrgmasuk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lapbrgkeluar)))))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lapbrgmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lapbrgkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lapkeuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(lapstokbrg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(grafik, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );

        lbluserlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbluserlogin.setForeground(new java.awt.Color(255, 255, 255));
        lbluserlogin.setText("jLabel2");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbluserlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbluserlogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lapbrgmasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapbrgmasukActionPerformed
        // TODO add your handling code here:
        laporanBarangMasuk bm = new laporanBarangMasuk(null,true);
        setVisible(false);
        bm.setVisible(true);
//        new laporanBarangMasuk().setVisible(true);
    }//GEN-LAST:event_lapbrgmasukActionPerformed

    private void lapstokbrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapstokbrgActionPerformed
        // TODO add your handling code here:
        laporanStokBarang sb = new laporanStokBarang(null,true);
        setVisible(false);
        sb.setVisible(true);
//        new laporanStokBarang().setVisible(true);
    }//GEN-LAST:event_lapstokbrgActionPerformed

    private void lapbrgkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapbrgkeluarActionPerformed
        // TODO add your handling code here:
        laporanBarangKeluar bk = new laporanBarangKeluar(null,true);
        setVisible(false);
        bk.setVisible(true);
//        new laporanBarangKeluar().setVisible(true);
    }//GEN-LAST:event_lapbrgkeluarActionPerformed

    private void lapkeuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapkeuanganActionPerformed
        // TODO add your handling code here:
        laporanGaji lg = new laporanGaji(null,true);
        setVisible(false);
        lg.setVisible(true);
    }//GEN-LAST:event_lapkeuanganActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        String user = UserSession.getUserLogin();
        if(user.equals("Admin")) {
            menu mm = new menu();
            setVisible(false);
            mm.setVisible(true);
        }
        else{
            menuOwner mo = new menuOwner();
            setVisible(false);
            mo.setVisible(true);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void grafikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grafikActionPerformed
        // TODO add your handling code here:n
        Main m = new Main();
        m.setVisible(true);
    }//GEN-LAST:event_grafikActionPerformed

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
            java.util.logging.Logger.getLogger(menuLaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuLaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuLaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuLaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuLaporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton grafik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JButton lapbrgkeluar;
    private javax.swing.JButton lapbrgmasuk;
    private javax.swing.JButton lapkeuangan;
    private javax.swing.JButton lapstokbrg;
    private javax.swing.JLabel lbluserlogin;
    // End of variables declaration//GEN-END:variables
}
