/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import javax.swing.JOptionPane;

/**
 *
 * @author Reza
 */
public class flm2 extends flm{
    @Override
    public void setNamafilm(String namafilm) {
        super.setNamafilm(namafilm); 
    }

    @Override
    public void setFoto(String foto) {
        super.setFoto(foto); 
    }
    @Override
    void ambildata(){
        try{  
        String sql;
        sql = "select * from film where id='2'";
        st = conn.createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            setNamafilm(rs.getString("namafilm"));
        }
      }
      catch(Exception e){
          JOptionPane.showMessageDialog(null, "GAGAL");
      }
        try{  
        String sql;
        sql = "select * from film where id='2'";
        st = conn.createStatement();        
        rs = st.executeQuery(sql);      
        while(rs.next()){               
            setFoto(rs.getString("foto"));
            }
      } 
      catch(Exception e){
          JOptionPane.showMessageDialog(null, "GAGAL");
      }
    }
}
