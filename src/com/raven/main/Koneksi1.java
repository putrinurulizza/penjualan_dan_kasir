/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.main;

import java.sql.DriverManager;

/**
 *
 * @author ALVIN
 */
public class Koneksi1 {
    private static java.sql.Connection koneksi;
    private static java.sql.Statement stm;
   
    public static java.sql.Connection getKoneksi(){
        if (koneksi == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/tokoamarjaya","root","");
                stm = koneksi.createStatement();
                System.out.println("Berhasil Terhubung");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return koneksi;
    }
    public static void main(String args[]){
        getKoneksi();
    }   
}
