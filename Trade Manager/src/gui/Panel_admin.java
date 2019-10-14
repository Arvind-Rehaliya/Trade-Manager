package gui;

import static gui.Init.st1;
import static gui.Init.rs1;

public class Panel_admin extends javax.swing.JPanel {
    boolean eye_clicked=true; byte b=0; String[] cred;
    
    public Panel_admin() {
        initComponents(); lb_err.setVisible(false); if(admin.gui.Panel_Gen_Settings.lb_login.getText() == "Enabled") lb_create.setVisible(false); else lb_create.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lb_forgot = new javax.swing.JLabel();
        lb_create = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        tf_user = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        pf_pass = new javax.swing.JPasswordField();
        lb_err = new javax.swing.JLabel();
        lb_eye = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPanel6.setBackground(new java.awt.Color(20, 214, 157));

        jPanel7.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        setBackground(new java.awt.Color(80, 80, 80));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(953, 550));

        jPanel1.setBackground(new java.awt.Color(90, 90, 90));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60), 3));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(Panel_admin.class, "Panel_admin.jLabel1.text")); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(Panel_admin.class, "Panel_admin.jLabel2.text")); // NOI18N

        bt_login.setBackground(new java.awt.Color(0, 177, 106));
        bt_login.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bt_login.setForeground(new java.awt.Color(255, 255, 255));
        bt_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/lock-16.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(bt_login, org.openide.util.NbBundle.getMessage(Panel_admin.class, "Panel_admin.bt_login.text")); // NOI18N
        bt_login.setBorder(null);
        bt_login.setBorderPainted(false);
        bt_login.setFocusable(false);
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/malae.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(Panel_admin.class, "Panel_admin.jLabel3.text")); // NOI18N

        lb_forgot.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_forgot.setForeground(new java.awt.Color(255, 255, 51));
        org.openide.awt.Mnemonics.setLocalizedText(lb_forgot, org.openide.util.NbBundle.getMessage(Panel_admin.class, "Panel_admin.lb_forgot.text")); // NOI18N
        lb_forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_forgotMouseClicked(evt);
            }
        });

        lb_create.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lb_create.setForeground(new java.awt.Color(255, 255, 0));
        org.openide.awt.Mnemonics.setLocalizedText(lb_create, org.openide.util.NbBundle.getMessage(Panel_admin.class, "Panel_admin.lb_create.text")); // NOI18N
        lb_create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_createMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(20, 214, 157));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jPanel5.setBackground(new java.awt.Color(120, 120, 120));

        tf_user.setBackground(new java.awt.Color(120, 120, 120));
        tf_user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_user.setForeground(new java.awt.Color(255, 255, 255));
        tf_user.setText(org.openide.util.NbBundle.getMessage(Panel_admin.class, "Panel_admin.pf_pass.text")); // NOI18N
        tf_user.setToolTipText(org.openide.util.NbBundle.getMessage(Panel_admin.class, "Panel_admin.tf_user.toolTipText")); // NOI18N
        tf_user.setBorder(null);
        tf_user.setCaretColor(new java.awt.Color(255, 255, 255));
        tf_user.setMargin(new java.awt.Insets(1, 10, 1, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(tf_user, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel12.setBackground(new java.awt.Color(20, 214, 157));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jPanel13.setBackground(new java.awt.Color(120, 120, 120));

        pf_pass.setBackground(new java.awt.Color(120, 120, 120));
        pf_pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pf_pass.setForeground(new java.awt.Color(255, 255, 255));
        pf_pass.setText(org.openide.util.NbBundle.getMessage(Panel_admin.class, "Panel_admin.pf_pass.text")); // NOI18N
        pf_pass.setToolTipText(org.openide.util.NbBundle.getMessage(Panel_admin.class, "Panel_admin.pf_pass.toolTipText")); // NOI18N
        pf_pass.setBorder(null);
        pf_pass.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(pf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        lb_err.setBackground(new java.awt.Color(51, 51, 51));
        lb_err.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lb_err.setForeground(new java.awt.Color(255, 40, 0));
        lb_err.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(lb_err, org.openide.util.NbBundle.getMessage(Panel_admin.class, "Panel_admin.lb_err.text")); // NOI18N

        lb_eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/visible-16.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(lb_eye, org.openide.util.NbBundle.getMessage(Panel_admin.class, "Panel_admin.lb_eye.text")); // NOI18N
        lb_eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_eyeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_err, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_eye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addComponent(lb_create, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(lb_forgot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_eye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lb_forgot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(lb_err)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_create)
                .addGap(8, 8, 8))
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(Panel_admin.class, "Panel_admin.jLabel4.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(88, 88, 88))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        try { if(tf_user.getText().equals("") && new String(pf_pass.getPassword()).equals("")) {lb_err.setText("Fill both TextFields Correctly !"); lb_err.setVisible(true); return;}
              rs1 = st1.executeQuery("Select const from properties where id = 'root_cred';"); rs1.next();
              cred = rs1.getString(1).split(" ");
              if(tf_user.getText().equals(cred[0]) && new String(pf_pass.getPassword()).equals(cred[1])) {
                  lb_forgot.setVisible(false); lb_err.setVisible(false);
                  homePage.user_perm = "1111"; homePage.setCheckbox(); homePage.lb_logout.setVisible(true);
                  homePage.lb_username.setText("   [ROOT]"); homePage.button_admin.setText("Control Panel");homePage.panel_root.pc.setInitialTableModel();
                  if(admin.gui.Panel_Gen_Settings.lb_image.getText().equals("Enabled")) homePage.setUserImage(); else homePage.lb_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user.png")));
                  tf_user.setText(""); pf_pass.setText("");
                  return;
              }              
              rs1 = st1.executeQuery("Select username, password, perm, status from user_details order by sno asc;");
              while(rs1.next()) {
                 if(rs1.getString(1).equals(tf_user.getText()) && rs1.getString(2).equals(new String(pf_pass.getPassword()))) {
                     lb_forgot.setVisible(false); lb_err.setVisible(false);  homePage.lb_logout.setVisible(true);
                     homePage.user_perm = rs1.getString(3); homePage.setCheckbox();
                             switch(rs1.getInt(4)) {
                                  case 0: homePage.lb_username.setText(rs1.getString(1)+"   [administrator]"); homePage.button_admin.setText("Control Panel");homePage.panel_root.pc.setInitialTableModel(); break;
                                  case 1: homePage.lb_username.setText(rs1.getString(1)+"   [superuser]");
                                          if(admin.gui.Panel_Gen_Settings.lb_superuser.getText().equals("Enabled")) {
                                              homePage.panel_root.pc.setInitialTableModel();  homePage.button_admin.setText("Control Panel"); 
                                          } else homePage.button_admin.setText("Log in as Administrator");break;
                                 case 2: homePage.lb_username.setText(rs1.getString(1)+"   [guest]"); homePage.button_admin.setText("Log in as Administrator"); break;
                             }
                     if(admin.gui.Panel_Gen_Settings.lb_image.getText().equals("Enabled")) homePage.setUserImage(); else homePage.lb_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user.png")));
                     break;
                 }  // if-block
                 else {lb_err.setText("Enter correct username and password"); lb_err.setVisible(true);}
             }             
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
        tf_user.setText(""); pf_pass.setText("");
    }//GEN-LAST:event_bt_loginActionPerformed

    private void lb_forgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_forgotMouseClicked
         forgetAccount();
    }//GEN-LAST:event_lb_forgotMouseClicked

    private void lb_createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_createMouseClicked
        createUserAccount();
    }//GEN-LAST:event_lb_createMouseClicked

    private void lb_eyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_eyeMouseClicked
       if(eye_clicked) {pf_pass.setEchoChar((char)0);  eye_clicked=false;}
       else {pf_pass.setEchoChar('*'); eye_clicked = true;}
       pf_pass.setText(new String(pf_pass.getPassword())); 
    }//GEN-LAST:event_lb_eyeMouseClicked
    
    public void createUserAccount() {
        homePage.jp.removeAll();  homePage.jp.setVisible(false);
         javax.swing.JPanel pn = new panel_create(); pn.setBounds(0, 0, 953, 550);  
         homePage.jp.add(pn); homePage.jp.setVisible(true);
    }
    
    public void forgetAccount() {
         homePage.jp.removeAll();  homePage.jp.setVisible(false);
         javax.swing.JPanel pn = new Panel_ForgetPassword(); pn.setBounds(0, 0, 953, 550);  
         homePage.jp.add(pn); homePage.jp.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    public static javax.swing.JLabel lb_create;
    public javax.swing.JLabel lb_err;
    private javax.swing.JLabel lb_eye;
    private javax.swing.JLabel lb_forgot;
    javax.swing.JPasswordField pf_pass;
    javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
