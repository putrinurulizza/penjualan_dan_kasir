/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.main;
import Controller.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        //cek apakah koneksi null
        if(koneksi==null){
            try{
                String url;
                url="jdbc:mysql://localhost/tokoamarjaya";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi=DriverManager.getConnection(url,username,password);
            }catch (SQLException t){
                JOptionPane.showMessageDialog(null,"Koneksi Gagal!");
            }
        }
        return koneksi;
    }

    
}
