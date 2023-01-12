/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.main;

import com.raven.chart.ModelChart;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author RAVEN
 */
public class Main extends javax.swing.JFrame {

    private static java.sql.Connection c;
    private static java.sql.Statement stm;
    int[]a = new int[12];
    int[]b = new int[12];
    
    public Main() {
        initComponents();
        getContentPane().setBackground(new Color(250, 250, 250));
        chart.addLegend("Penjualan", new Color(245, 189, 135));
        try{
            int i=0;
            Connection c = koneksi.getKoneksi();
            DateFormat FormatTahun = new SimpleDateFormat("yyyy");
            Calendar kalender = Calendar.getInstance();
                String sql = "SELECT SUM(total_bayar) as j, month(tgl_transaksi) as t from transaksi WHERE year(tgl_transaksi) = '"+ FormatTahun.format(kalender.getTime()) +"' GROUP BY month(tgl_transaksi)";
                Statement s = c.createStatement();
                ResultSet r = s.executeQuery(sql);
                while(r.next()){
                    a[r.getInt("t")] = r.getInt("j");
                }
        }catch(Exception e){
            System.out.println(e);
        }
        chart.addLegend("Pembelian", new Color(99, 231, 252));
        try{
            int i=0;
            Connection c = koneksi.getKoneksi();
            DateFormat FormatTahun = new SimpleDateFormat("yyyy");
            Calendar kalender = Calendar.getInstance();
                String sql = "SELECT SUM(harga_beli) as j, month(tanggal) as t from barang WHERE year(tanggal) = '"+ FormatTahun.format(kalender.getTime()) +"' GROUP BY month(tanggal)";
                Statement s = c.createStatement();
                ResultSet r = s.executeQuery(sql);
                while(r.next()){
                    b[r.getInt("t")] = r.getInt("j");
                }
        }catch(Exception e){
            System.out.println(e);
        }
        chart.addData(new ModelChart("January", new double[]{a[0],b[0]}));
        chart.addData(new ModelChart("February", new double[]{a[1],b[1]}));
        chart.addData(new ModelChart("March", new double[]{a[2],b[2]}));
        chart.addData(new ModelChart("April", new double[]{a[3],b[3]}));
        chart.addData(new ModelChart("May", new double[]{a[4],b[4]}));
        chart.addData(new ModelChart("June", new double[]{a[5],b[5]}));
        chart.addData(new ModelChart("Juli", new double[]{a[6],b[6]}));
        chart.addData(new ModelChart("Agustus", new double[]{a[7],b[9]}));
        chart.addData(new ModelChart("September", new double[]{a[8],b[8]}));
        chart.addData(new ModelChart("Oktober", new double[]{a[9],b[9]}));
        chart.addData(new ModelChart("November", new double[]{a[10],b[10]}));
        chart.addData(new ModelChart("Desember", new double[]{a[11],b[0]}));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chart = new com.raven.chart.Chart();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(119, 119, 119))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.chart.Chart chart;
    // End of variables declaration//GEN-END:variables
}
