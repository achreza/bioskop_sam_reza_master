package ta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CreateConnection {
    
    String host;
    String user;
    String pass;
    String dbname;
    
    Connection conn;
    
    public CreateConnection(){
        this.dbname = "inputan";
        
        this.host = "jdbc:mysql://localhost:3306/"+this.dbname;
        this.user = "root";
        this.pass = "";
        
        this.makeConnection();
         
    }
    private void makeConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            this.conn = DriverManager.getConnection(this.host, this.user, this.pass);
        }
        catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Connection not Found");
            System.exit(0);
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Connection Failed");
            System.exit(0);
        }
        
        
    }
    public Connection getConnection(){
        return this.conn;
    }
    
}
