/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

/**
 *
 * @author reza
 */
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
public class rekapanTotal extends javax.swing.JFrame {

    koneksiDB x;
    public Connection conn;
    public ResultSet rs;
    public PreparedStatement pst;
    
    /**
     * Creates new form bioskop
     */
    
    
    public rekapanTotal() throws SQLException {
        this.jamberjalan = jamberjalan;
        
        initComponents();
        
        x = new koneksiDB();
        x.koneksi();
        
        Timer t2 = new Timer();
        t2.scheduleAtFixedRate( new TimerTask (){
            @Override
            public void run(){
                waktuBerjalan.setText(new SimpleDateFormat("EEEE dd-MM-yyyy").format(new java.util.Date()));
                jamberjalan.setText(new SimpleDateFormat("hh:mm:ss").format(new java.util.Date()));
            }
         
        },0,1000);
       conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost/inputan","root","");
        UpdateTabel();
        x = new koneksiDB();
        x.koneksi();
       
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        label21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnexit = new javax.swing.JButton();
        btnexit1 = new javax.swing.JButton();
        waktuBerjalan = new javax.swing.JLabel();
        jamberjalan = new javax.swing.JLabel();
        Panel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setUndecorated(true);
        setSize(new java.awt.Dimension(500, 500));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        label21.setFont(new java.awt.Font("Roboto Slab", 3, 48)); // NOI18N
        label21.setForeground(new java.awt.Color(153, 255, 255));
        label21.setText("Bioskop Sam Reza");

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        btnexit.setForeground(new java.awt.Color(0, 102, 102));
        btnexit.setText("EXIT");
        btnexit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
        btnexit.setContentAreaFilled(false);
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnexit1.setForeground(new java.awt.Color(0, 102, 102));
        btnexit1.setText("MENU");
        btnexit1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
        btnexit1.setContentAreaFilled(false);
        btnexit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnexit1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnexit1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(627, Short.MAX_VALUE))
        );

        waktuBerjalan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        waktuBerjalan.setForeground(new java.awt.Color(153, 255, 204));
        waktuBerjalan.setText("jLabel26");

        jamberjalan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jamberjalan.setForeground(new java.awt.Color(153, 255, 204));
        jamberjalan.setText("jLabel26");

        Panel3.setBackground(new java.awt.Color(204, 255, 204));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Waktu", "Hari", "Film1", "Film2", "Film3", "Film4"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jamberjalan)
                            .addComponent(waktuBerjalan))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(331, 331, 331)
                                .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1589, 1589, 1589))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label21)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(waktuBerjalan)
                                .addGap(18, 18, 18)
                                .addComponent(jamberjalan)))
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1556, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table1MouseClicked

    private void btnexit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexit1ActionPerformed
        try {
            // TODO add your handling code here:
            bioskop kirim = new bioskop();
            kirim.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(rekapanTotal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnexit1ActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Silhkan datang Kembali!");
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed
   private void UpdateTabel() {
        try {
            String sql = "SELECT * FROM total";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) table1.getModel();
        dtm.setRowCount(0);
        String [] data = new String[6];
        while(rs.next()) {
            data[0] = rs.getString("waktu");
            data[1] = rs.getString("hari");
            data[2] = rs.getString("film1");
            data[3] = rs.getString("film2");
            data[4] = rs.getString("film3");
            data[5] = rs.getString("film4");
            dtm.addRow(data);
        }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
        
        
        
        
       
    } 
   
   
   
   
   String gbr;
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Panel3;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnexit1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jamberjalan;
    private javax.swing.JLabel label21;
    private javax.swing.JTable table1;
    private javax.swing.JLabel waktuBerjalan;
    // End of variables declaration//GEN-END:variables
}
