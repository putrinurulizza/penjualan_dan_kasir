/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class dt_karyawan {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String id;
    public String nama;
    public String jabatan;
    public String jenis_kelamin;
    public String agama;
    public String status;
    public String alamat;
    public String user;
    
    public void simpan()throws SQLException{ 
        conn = koneksi.getKoneksi();
        sql = "INSERT INTO karyawan(id_karyawan, user, nama, jabatan, jenis_kelamin, agama, status, alamat)VALUES(?,?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,id);
        pst.setString(2,user);
        pst.setString(3,nama);
        pst.setString(4,jabatan);
        pst.setString(5,jenis_kelamin);
        pst.setString(6,agama);
        pst.setString(7,status);
        pst.setString(8,alamat);
        pst.execute();
        pst.close();
    }
 
    public void edit()throws SQLException {
        conn = koneksi.getKoneksi();
        String sql = "UPDATE karyawan SET user=?, nama=?, jabatan=?, agama=?, status=?, jenis_kelamin=?, alamat=? where id_karyawan=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1,user);
        pst.setString(2,nama);
        pst.setString(3,jabatan);
        pst.setString(4,agama);
        pst.setString(5,status);
        pst.setString(6,jenis_kelamin);
        pst.setString(7,alamat);
        pst.setString(8,id);
        pst.executeUpdate();
        pst.close();
    }


    public void hapus()throws SQLException{
       conn=koneksi.getKoneksi();
       String sql = "DELETE FROM karyawan WHERE id_karyawan=?";
       try{
           pst=conn.prepareStatement(sql);
           pst.setString(1, id);
           pst.execute();
       }
       catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
       }
    }

    public ResultSet UpdateJTable()throws SQLException{
        conn = koneksi.getKoneksi();
        sql = "SELECT id_karyawan, user, nama, jabatan, jenis_kelamin, agama, status, alamat FROM karyawan";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }

}

