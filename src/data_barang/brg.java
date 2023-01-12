/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_barang;

import Controller.koneksi;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Cut Jihan Riska
 */
public class brg {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public String sql;
    public String kode_barang;
    public String nama_barang;
    public String satuan;
    public String id_ktgr;
    public int stok;
    public int harga_jual;
    public int harga_beli;
    public String tanggal;
    public String idsuplier;
    
    public void simpan()throws SQLException{
        conn = Koneksi.getKoneksi();
        String sql = "INSERT INTO barang(kode_barang, nama_barang, satuan, id_ktgr, stok, harga_jual,  harga_beli, tanggal, idsuplier)VALUES(?,?,?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setInt(5,stok);
        pst.setInt(6,harga_jual);
        pst.setInt(7,harga_beli);
        pst.setDate(8,Date.valueOf(tanggal));
        pst.setString(9,idsuplier);
        pst.execute();
        pst.close();
    }
    
    public void edit()throws SQLException{
        conn = Koneksi.getKoneksi();
        String sql = "UPDATE barang SET nama_barang=?, satuan=?, id_ktgr=?, stok=?, harga_jual=?,  harga_beli=?, tanggal=?, idsuplier=? where kode_barang=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1,kode_barang);
        pst.setString(2,nama_barang);
        pst.setString(3,satuan);
        pst.setString(4,id_ktgr);
        pst.setInt(5,stok);
        pst.setInt(6,harga_jual);
        pst.setInt(7,harga_beli);
        pst.setDate(8,Date.valueOf(tanggal));
        pst.setString(9,idsuplier);
        pst.executeUpdate();
        pst.close();
    }
    
    public void hapus()throws SQLException{
       conn=Koneksi.getKoneksi();
       String sql = "DELETE FROM barang WHERE kode_barang=?";
       try{
           pst=conn.prepareStatement(sql);
           pst.setString(1, kode_barang);
           pst.execute();
       }
       catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
       }
    }
    
    public ResultSet UpdateJTable()throws SQLException{
        conn = koneksi.getKoneksi();
        sql = "SELECT * FROM barang";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }
    
}
