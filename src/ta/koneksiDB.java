/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

/**
 *
 * @author Asus
 */
import java.sql.*;
public class koneksiDB {
    public Connection conn;
    public Statement st;
    public ResultSet rs;


    

    
    
    public void koneksi(){
        konek("localhost","inputan","root","");
    }
    public void konek(String server,String db,String user,String password){
        System.out.println("Keterangan");
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println("Ada kesalahan jdbc tidak bisa di Load");
            return;
        }
        System.out.println("JDBC driver berhasil di Load");
        conn = null;
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inputan","root","");
        }
        catch (SQLException e){
            System.out.println("Tidak bisa koneksi ke Database");
            return;
        }
        if (conn != null){
            System.out.println("berhasil koneksi");
        }
        else{
            System.out.println("koneksi gagal");
        }
    }
}
