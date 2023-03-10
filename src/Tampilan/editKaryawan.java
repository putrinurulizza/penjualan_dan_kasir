/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;
import Controller.UserSession;
import Controller.dt_karyawan;
import Controller.koneksi;
import static Tampilan.viewKaryawan.jTable1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.util.HashMap;


public class editKaryawan extends javax.swing.JFrame {

    /**
     * Creates new form data_karyawan
     */
    public editKaryawan() {
        initComponents();
        dataUser();
        dataJabatan();
        dataEdit();

    }
    
    public void dataEdit(){
        viewKaryawan vk = new viewKaryawan();
        int row = jTable1.getSelectedRow();
        String id = jTable1.getModel().getValueAt(row,0).toString();
        txid.setText(id);
//        ck.nama = jTable1.getModel().getValueAt(row,1).toString();
//        ck.jabatan = jTable1.getModel().getValueAt(row,2).toString();
//        ck.jenis_kelamin = jTable1.getModel().getValueAt(row, 3).toString();
//        ck.agama =jTable1.getModel().getValueAt(row,4).toString();
//        ck.status = jTable1.getModel().getValueAt(row, 5).toString();
//        ck.alamat = jTable1.getModel().getValueAt(row,6).toString();
//        ck.user = jTable1.getModel().getValueAt(row,7).toString();
        
        
    }
    
     public void dataUser(){
         Connection conn = null;
         conn = koneksi.getKoneksi();
        try {
            String query = "SELECT * FROM user";
            Statement st = koneksi.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {                
                cbusername.addItem(rs.getString("id_user")+ " - " +rs.getString("username"));
            }
            
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            
        } catch (SQLException e) {
        }
    }
    
    public void dataJabatan(){
        Connection conn = null;
        conn = koneksi.getKoneksi();
        try {
            String query = "SELECT * FROM jabatan";
            Statement st = koneksi.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {                
                cbjabatan.addItem(rs.getString("id_jabatan")+" - "+rs.getString("jabatan"));
            }
            
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            
        } catch (SQLException e) {
        }
    }
    
    private void AmbilJK(String jk){
        if (jk.equals("laki-laki")){
            rdlk.setSelected(true);
        }else{
            rdpr.setSelected(true);
        }
    }
    
    private void Ambilstatus(String status){
        if (status.equals("menikah")){
            rdmenikah.setSelected(true);
        }else{
            rdblmmenikah.setSelected(true);
       }
    }
    
    private void AmbilJabatan(String jabatan){
        String[] jb ={"Admin","Kasir","Stokker"};
        cbjabatan.removeAllItems();
        cbjabatan.addItem(jabatan);
        for(int i = 0;i<jb.length;i++){
            if(!jb[i].equals(jabatan)){
                cbagama.addItem(jb[i]); }
        }
    }

    private void AmbilAgama(String agama){
        String[] ag ={"Islam","Kristen","Budha","Hindu"};
        cbagama.removeAllItems();
        cbagama.addItem(agama);
        for(int i = 0;i<ag.length;i++){
            if(!ag[i].equals(agama)){
                cbagama.addItem(ag[i]); }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txid = new javax.swing.JTextField();
        txnama = new javax.swing.JTextField();
        rdlk = new javax.swing.JRadioButton();
        rdpr = new javax.swing.JRadioButton();
        cbagama = new javax.swing.JComboBox<>();
        rdmenikah = new javax.swing.JRadioButton();
        rdblmmenikah = new javax.swing.JRadioButton();
        txalamat = new javax.swing.JTextField();
        cbsimpan = new javax.swing.JButton();
        cbjabatan = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbusername = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM EDIT DATA KARYAWAN");

        jLabel2.setText("ID Karyawan");

        jLabel3.setText("Nama");

        jLabel4.setText("Jabatan");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Agama");

        jLabel7.setText("Status");

        jLabel8.setText("Alamat");

        txid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txidActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdlk);
        rdlk.setText("Laki-Laki");

        buttonGroup1.add(rdpr);
        rdpr.setText("Perempuan");
        rdpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdprActionPerformed(evt);
            }
        });

        cbagama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Budha", "Hindu", "Lain-lain" }));
        cbagama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbagamaActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdmenikah);
        rdmenikah.setText("Menikah");
        rdmenikah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdmenikahActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdblmmenikah);
        rdblmmenikah.setText("Belum Menikah");

        cbsimpan.setBackground(new java.awt.Color(51, 153, 255));
        cbsimpan.setText("Simpan");
        cbsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsimpanActionPerformed(evt);
            }
        });

        cbjabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjabatanActionPerformed(evt);
            }
        });

        jLabel9.setText("ID User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txnama, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addComponent(txid))
                            .addComponent(cbjabatan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)))))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(rdlk)
                        .addGap(32, 32, 32)
                        .addComponent(rdpr)))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbagama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txalamat)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdmenikah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdblmmenikah))
                    .addComponent(cbusername, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbsimpan)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(rdmenikah)
                    .addComponent(rdblmmenikah))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdlk)
                    .addComponent(rdpr)
                    .addComponent(jLabel9)
                    .addComponent(cbusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(cbsimpan)
                .addGap(55, 55, 55))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txidActionPerformed

    private void rdprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdprActionPerformed

    private void cbsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsimpanActionPerformed
        // TODO add your handling code here:
        try{
             String jenis_kelamin, status;
            Connection conn = koneksi.getKoneksi();
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement("UPDATE karyawan SET user=?, nama=?, jabatan=?, agama=?, status=?, jenis_kelamin=?, alamat=? where id_karyawan=?");
            
            String[] id_user = cbusername.getSelectedItem().toString().split(" - ");
            int user = Integer.parseInt(id_user[0]);
            stmt.setInt(1, user);
            
            stmt.setString(2,txnama.getText());
            
            String[] id_jabatan = cbjabatan.getSelectedItem().toString().split(" - ");
            int jabatan = Integer.parseInt(id_jabatan[0]);
            stmt.setInt(3, jabatan);
            
            String agama = cbagama.getSelectedItem().toString();
            stmt.setString(4, agama);
            
            if(rdmenikah.isSelected()==true){
             status="menikah";
            }else{
                status="belum menikah";
            }
            stmt.setString(5, status);
            
            if(rdlk.isSelected()==true){
             jenis_kelamin="laki-laki";
            }else{
                jenis_kelamin="perempuan";
            }
            stmt.setString(6, jenis_kelamin);
            
            
            
            stmt.setString(7,txalamat.getText());
            
            
            stmt.setString(8,txid.getText());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan!");
            viewKaryawan vk = new viewKaryawan();
            setVisible(false);
            vk.setVisible(true);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
//        dt_karyawan ck = new dt_karyawan();
//        ck.id = txid.getText();
//        ck.nama = txnama.getText();
//        String[] id_jabatan = cbjabatan.getSelectedItem().toString().split(" - ");
//        ck.jabatan = id_jabatan[0];
//        
//        if(rdlk.isSelected()==true){
//            ck.jenis_kelamin="laki-laki";
//        }else{
//            ck.jenis_kelamin="perempuan";
//        }
//        
//        ck.agama = (String) cbagama.getSelectedItem();
//        
//        if(rdmenikah.isSelected()==true){
//            ck.status="menikah";
//        }else{
//            ck.status="belum menikah";
//        }
//        
//        ck.alamat = txalamat.getText();
//        String[] id_user = cbusername.getSelectedItem().toString().split(" - ");
//        ck.user = id_user[0];
//        try{
//            ck.edit();
//            JOptionPane.showMessageDialog(null,"Data Berhasil Diedit!");
//            ck.UpdateJTable();
//            viewKaryawan vk = new viewKaryawan();
//            setVisible(false);
//            vk.setVisible(true);
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null,"Data Gagal Diedit!");
//        }
    }//GEN-LAST:event_cbsimpanActionPerformed

    private void cbagamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbagamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbagamaActionPerformed

    private void cbjabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbjabatanActionPerformed

    private void rdmenikahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdmenikahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdmenikahActionPerformed

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
            java.util.logging.Logger.getLogger(editKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbagama;
    private javax.swing.JComboBox<String> cbjabatan;
    private javax.swing.JButton cbsimpan;
    private javax.swing.JComboBox<String> cbusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rdblmmenikah;
    private javax.swing.JRadioButton rdlk;
    private javax.swing.JRadioButton rdmenikah;
    private javax.swing.JRadioButton rdpr;
    private javax.swing.JTextField txalamat;
    private javax.swing.JTextField txid;
    private javax.swing.JTextField txnama;
    // End of variables declaration//GEN-END:variables
}
