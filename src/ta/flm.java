/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Reza
 */
public abstract class flm {
     koneksiDB x;
    public Connection conn;
    public ResultSet rs;
    public Statement st;
    public PreparedStatement pst;
    protected String namafilm;
    protected String foto;
    
    public void flm() throws SQLException{
         x = new koneksiDB();
        x.koneksi();
        conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost/inputan","root","");
    }

    public String getNamafilm() {
        return namafilm;
    }

    public void setNamafilm(String namafilm) {
        this.namafilm = namafilm;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    void ambildata(){
   
    }  
}
