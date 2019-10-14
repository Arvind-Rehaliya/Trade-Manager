package gui;

public class Panel_DbCred extends javax.swing.JFrame {
    Init init;
    admin.gui.Panel_Gen_Settings sett;
    
    public Panel_DbCred(Init init) {
        initComponents(); tf_user.setEnabled(false); pf_pass.setEnabled(false); tf_address.setEnabled(false); tf_port.setEnabled(false); tf_db.setEnabled(false); setTitle("Database Credentials");
        setVisible(true); this.init = init;
        sett = new admin.gui.Panel_Gen_Settings();
    }

    @SuppressWarnings("unchecked")  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt_custom = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb_close = new javax.swing.JLabel();
        lb_icon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bt_ok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf_port = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pf_pass = new javax.swing.JPasswordField();
        tf_address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_db = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(70, 70, 70));

        bt_custom.setBackground(new java.awt.Color(255, 102, 102));
        bt_custom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_custom.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(bt_custom, org.openide.util.NbBundle.getMessage(Panel_DbCred.class, "Panel_DbCred.bt_custom.text")); // NOI18N
        bt_custom.setFocusPainted(false);
        bt_custom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_customActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        lb_close.setIcon(new javax.swing.ImageIcon("C:\\Users\\student\\Downloads\\cancel.png")); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(lb_close, org.openide.util.NbBundle.getMessage(Panel_DbCred.class, "Panel_DbCred.lb_close.text")); // NOI18N
        lb_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_close)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lb_close)
                .addGap(3, 3, 3))
        );

        lb_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/alert-40.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(lb_icon, org.openide.util.NbBundle.getMessage(Panel_DbCred.class, "Panel_DbCred.lb_icon.text")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(Panel_DbCred.class, "Panel_DbCred.jLabel1.text")); // NOI18N

        tf_user.setBackground(new java.awt.Color(90, 90, 90));
        tf_user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_user.setForeground(new java.awt.Color(255, 255, 0));
        tf_user.setText(org.openide.util.NbBundle.getMessage(Panel_DbCred.class, "Panel_DbCred.tf_user.text")); // NOI18N
        tf_user.setCaretColor(new java.awt.Color(255, 51, 51));
        tf_user.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(Panel_DbCred.class, "Panel_DbCred.jLabel2.text")); // NOI18N

        bt_ok.setBackground(new java.awt.Color(255, 102, 102));
        bt_ok.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_ok.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(bt_ok, org.openide.util.NbBundle.getMessage(Panel_DbCred.class, "Panel_DbCred.bt_ok.text")); // NOI18N
        bt_ok.setFocusPainted(false);
        bt_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_okActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(Panel_DbCred.class, "Panel_DbCred.jLabel3.text")); // NOI18N

        tf_port.setBackground(new java.awt.Color(90, 90, 90));
        tf_port.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_port.setForeground(new java.awt.Color(255, 255, 0));
        tf_port.setText(org.openide.util.NbBundle.getMessage(Panel_DbCred.class, "Panel_DbCred.tf_port.text")); // NOI18N
        tf_port.setCaretColor(new java.awt.Color(255, 51, 51));
        tf_port.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 204));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(Panel_DbCred.class, "Panel_DbCred.jLabel4.text")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 204));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(Panel_DbCred.class, "Panel_DbCred.jLabel5.text")); // NOI18N

        pf_pass.setBackground(new java.awt.Color(90, 90, 90));
        pf_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pf_pass.setForeground(new java.awt.Color(255, 255, 0));
        pf_pass.setText(org.openide.util.NbBundle.getMessage(Panel_DbCred.class, "Panel_DbCred.pf_pass.text")); // NOI18N
        pf_pass.setCaretColor(new java.awt.Color(255, 51, 51));
        pf_pass.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        tf_address.setBackground(new java.awt.Color(90, 90, 90));
        tf_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_address.setForeground(new java.awt.Color(255, 255, 0));
        tf_address.setText(org.openide.util.NbBundle.getMessage(Panel_DbCred.class, "Panel_DbCred.tf_address.text")); // NOI18N
        tf_address.setCaretColor(new java.awt.Color(255, 51, 51));
        tf_address.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 204));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(Panel_DbCred.class, "Panel_DbCred.jLabel6.text")); // NOI18N

        tf_db.setBackground(new java.awt.Color(90, 90, 90));
        tf_db.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_db.setForeground(new java.awt.Color(255, 255, 0));
        tf_db.setText(org.openide.util.NbBundle.getMessage(Panel_DbCred.class, "Panel_DbCred.tf_db.text")); // NOI18N
        tf_db.setCaretColor(new java.awt.Color(255, 51, 51));
        tf_db.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lb_icon)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 55, Short.MAX_VALUE)
                                    .addComponent(bt_custom)
                                    .addGap(88, 88, 88)
                                    .addComponent(bt_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(55, 55, 55)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(pf_pass, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_user, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_port, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                        .addComponent(tf_db))))
                            .addContainerGap(64, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(205, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_icon)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addComponent(tf_port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_db, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_custom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_customActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_customActionPerformed
        tf_user.setEnabled(true); pf_pass.setEnabled(true); tf_address.setEnabled(true); tf_port.setEnabled(true); tf_db.setEnabled(true);
    }//GEN-LAST:event_bt_customActionPerformed

    private void lb_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_lb_closeMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        bt_custom.requestFocus();
    }//GEN-LAST:event_formWindowGainedFocus

    private void bt_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_okActionPerformed
         init.turnOnDB(tf_address.getText(), tf_port.getText(), tf_db.getText(), tf_user.getText(), new String(pf_pass.getPassword()));
          if(sett.lb_splash.getText().equals("Enabled")) {init.ps.isVisible = true; init.ps.setSecurity();} else {init.ps.setVisible(false); init.ps.setSecurity();}        
          this.dispose();        
    }//GEN-LAST:event_bt_okActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel_DbCred.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_DbCred.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_DbCred.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_DbCred.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
                //new Panel_DbCred();
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_custom;
    private javax.swing.JButton bt_ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_close;
    private javax.swing.JLabel lb_icon;
    public javax.swing.JPasswordField pf_pass;
    public javax.swing.JTextField tf_address;
    public javax.swing.JTextField tf_db;
    public javax.swing.JTextField tf_port;
    public javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
