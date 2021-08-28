package ta;

public class Loading extends javax.swing.JFrame {

    // Ini adalah kelas tampilan splash screen loading    
    public Loading() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBackground = new javax.swing.JPanel();
        LabelJudul = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        LabelPersen = new javax.swing.JLabel();
        LabelDeveloper1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PanelBackground.setBackground(new java.awt.Color(0, 102, 102));

        LabelJudul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelJudul.setForeground(new java.awt.Color(255, 255, 255));
        LabelJudul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ta/bioskop.png"))); // NOI18N
        LabelJudul.setText("BIOSKOP SAM REZA");

        progressBar.setForeground(new java.awt.Color(0, 204, 153));

        LabelPersen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelPersen.setForeground(new java.awt.Color(255, 255, 255));
        LabelPersen.setText("100%");

        LabelDeveloper1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelDeveloper1.setForeground(new java.awt.Color(255, 255, 255));
        LabelDeveloper1.setText("Sabar boss..");

        javax.swing.GroupLayout PanelBackgroundLayout = new javax.swing.GroupLayout(PanelBackground);
        PanelBackground.setLayout(PanelBackgroundLayout);
        PanelBackgroundLayout.setHorizontalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBackgroundLayout.createSequentialGroup()
                .addGroup(PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBackgroundLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelBackgroundLayout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(LabelPersen))))
                    .addGroup(PanelBackgroundLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(LabelDeveloper1))
                    .addGroup(PanelBackgroundLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(LabelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PanelBackgroundLayout.setVerticalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBackgroundLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(LabelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(LabelPersen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelDeveloper1)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDeveloper1;
    private javax.swing.JLabel LabelJudul;
    public javax.swing.JLabel LabelPersen;
    private javax.swing.JPanel PanelBackground;
    public javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}