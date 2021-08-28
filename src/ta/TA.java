/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rayan
 */
public class TA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Loading login = new Loading();
        bioskop halamanutama = new bioskop();
        login.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(10);
                login.LabelPersen.setText(Integer.toString(i) + "%");
                login.progressBar.setValue(i);
                if (i == 100) { 
                    halamanutama.setVisible(true);
                    login.dispose();
                }
            }
        } 
        catch (InterruptedException e) {
        }

    }
}
