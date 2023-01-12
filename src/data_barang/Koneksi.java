/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_barang;
import java.sql.DriverManager;


/**
 *
 * @author User
 */
class Koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getKoneksi() {
     if (koneksi == null){
         try{
             String url = "jdbc:mysql://localhost:3306/tokoamarjaya";
             String user = "root";
             String password = "";
             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
             koneksi = DriverManager.getConnection(url, user, password);
             System.out.println("berhasil");
         }catch (Exception e){
             System.out.println("erorr");   
         }
             
     }
     return koneksi;
    }
    
    public static void main(String args[]){
     getKoneksi();   
    }
}
