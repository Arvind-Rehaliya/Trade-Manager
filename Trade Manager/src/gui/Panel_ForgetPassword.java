package gui;

import static gui.Init.rs;
import static gui.Init.st;

public class Panel_ForgetPassword extends javax.swing.JPanel {
    boolean b=false, b1=false;
    
    public Panel_ForgetPassword() {
        initComponents(); lb_ErrText.setVisible(false);  lb_err.setVisible(false); lb_ErrText_mobile.setVisible(false);  lb_err_mobile.setVisible(false); pf_pass.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_change = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bt_check = new javax.swing.JButton();
        lb_pass3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        pf_pass = new javax.swing.JPasswordField();
        jPanel11 = new javax.swing.JPanel();
        tf_mobile = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        tf_username = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        lb_ErrText_mobile = new javax.swing.JLabel();
        lb_ErrText = new javax.swing.JLabel();
        lb_err = new javax.swing.JLabel();
        lb_err_mobile = new javax.swing.JLabel();

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(70, 70, 70));
        jPanel1.setPreferredSize(new java.awt.Dimension(953, 550));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(Panel_ForgetPassword.class, "Panel_ForgetPassword.jLabel1.text")); // NOI18N

        bt_change.setBackground(new java.awt.Color(247, 99, 99));
        bt_change.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bt_change.setForeground(new java.awt.Color(255, 255, 255));
        bt_change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/change-32.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(bt_change, org.openide.util.NbBundle.getMessage(Panel_ForgetPassword.class, "Panel_ForgetPassword.bt_change.text")); // NOI18N
        bt_change.setBorderPainted(false);
        bt_change.setFocusPainted(false);
        bt_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_changeActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(90, 90, 90));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        jPanel9.setDoubleBuffered(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(628, 297));
        jPanel9.setRequestFocusEnabled(false);
        jPanel9.setVerifyInputWhenFocusTarget(false);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 245, 100));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(Panel_ForgetPassword.class, "Panel_ForgetPassword.jLabel5.text")); // NOI18N

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel15, org.openide.util.NbBundle.getMessage(Panel_ForgetPassword.class, "Panel_ForgetPassword.jLabel15.text")); // NOI18N

        bt_check.setBackground(new java.awt.Color(0, 177, 106));
        bt_check.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bt_check.setForeground(new java.awt.Color(255, 255, 255));
        bt_check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/check-16.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(bt_check, org.openide.util.NbBundle.getMessage(Panel_ForgetPassword.class, "Panel_ForgetPassword.bt_check.text")); // NOI18N
        bt_check.setBorderPainted(false);
        bt_check.setFocusPainted(false);
        bt_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_checkjButton4ActionPerformed(evt);
            }
        });

        lb_pass3.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        lb_pass3.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(lb_pass3, org.openide.util.NbBundle.getMessage(Panel_ForgetPassword.class, "Panel_ForgetPassword.lb_pass3.text")); // NOI18N
        lb_pass3.setEnabled(false);

        jPanel10.setBackground(new java.awt.Color(80, 80, 80));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        pf_pass.setBackground(new java.awt.Color(80, 80, 80));
        pf_pass.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        pf_pass.setForeground(new java.awt.Color(255, 255, 255));
        pf_pass.setText(org.openide.util.NbBundle.getMessage(Panel_ForgetPassword.class, "Panel_ForgetPassword.pf_pass.text")); // NOI18N
        pf_pass.setBorder(null);
        pf_pass.setCaretColor(new java.awt.Color(255, 255, 255));
        pf_pass.setEnabled(false);
        pf_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pf_passpf_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pf_passpf_passFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(pf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pf_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(80, 80, 80));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        tf_mobile.setBackground(new java.awt.Color(80, 80, 80));
        tf_mobile.setColumns(10);
        tf_mobile.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        tf_mobile.setForeground(new java.awt.Color(255, 255, 255));
        tf_mobile.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_mobile.setText(org.openide.util.NbBundle.getMessage(Panel_ForgetPassword.class, "Panel_ForgetPassword.tf_mobile.text")); // NOI18N
        tf_mobile.setBorder(null);
        tf_mobile.setCaretColor(new java.awt.Color(255, 255, 255));
        tf_mobile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_mobileFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_mobileFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(tf_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(tf_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel12.setBackground(new java.awt.Color(80, 80, 80));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        tf_username.setBackground(new java.awt.Color(80, 80, 80));
        tf_username.setColumns(10);
        tf_username.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        tf_username.setForeground(new java.awt.Color(255, 255, 255));
        tf_username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_username.setText(org.openide.util.NbBundle.getMessage(Panel_ForgetPassword.class, "Panel_ForgetPassword.tf_username.text")); // NOI18N
        tf_username.setBorder(null);
        tf_username.setCaretColor(new java.awt.Color(255, 255, 255));
        tf_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_usernameFocusLost(evt);
            }
        });
        tf_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_usernameKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel16, org.openide.util.NbBundle.getMessage(Panel_ForgetPassword.class, "Panel_ForgetPassword.jLabel16.text")); // NOI18N

        lb_ErrText_mobile.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lb_ErrText_mobile.setForeground(new java.awt.Color(255, 255, 51));
        org.openide.awt.Mnemonics.setLocalizedText(lb_ErrText_mobile, org.openide.util.NbBundle.getMessage(Panel_ForgetPassword.class, "Panel_ForgetPassword.lb_ErrText_mobile.text")); // NOI18N

        lb_ErrText.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lb_ErrText.setForeground(new java.awt.Color(255, 255, 51));
        org.openide.awt.Mnemonics.setLocalizedText(lb_ErrText, org.openide.util.NbBundle.getMessage(Panel_ForgetPassword.class, "Panel_ForgetPassword.lb_ErrText.text")); // NOI18N

        lb_err.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/alert-20.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(lb_err, org.openide.util.NbBundle.getMessage(Panel_ForgetPassword.class, "Panel_ForgetPassword.lb_err.text")); // NOI18N
        lb_err.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_errMouseClicked(evt);
            }
        });

        lb_err_mobile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/alert-20.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(lb_err_mobile, org.openide.util.NbBundle.getMessage(Panel_ForgetPassword.class, "Panel_ForgetPassword.lb_err_mobile.text")); // NOI18N
        lb_err_mobile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_err_mobileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_err, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_ErrText, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(lb_pass3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt_check)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lb_err_mobile)
                        .addGap(18, 18, 18)
                        .addComponent(lb_ErrText_mobile, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                        .addGap(13, 13, 13))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_ErrText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_err, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_err_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_ErrText_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addComponent(bt_check)
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_pass3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(bt_change))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(bt_change)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 953, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_changeActionPerformed
        try {
            if(lb_err_mobile.isVisible() || lb_err.isVisible() || new String(pf_pass.getPassword()).equals("")) return;
            st.executeUpdate("update user_details set password = '"+new String(pf_pass.getPassword())+"' where username = '"+tf_username.getText()+"';");
            homePage.setButtonAdmin(); 
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }//GEN-LAST:event_bt_changeActionPerformed

    private void bt_checkjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_checkjButton4ActionPerformed
        try {
            if(lb_err_mobile.isVisible() || lb_err.isVisible() || tf_mobile.getText().equals("")) return;
            rs = st.executeQuery("Select mobile_no, alt_mobile from user_details order by sno asc;");
            while(rs.next()) {
                if(tf_mobile.getText().equals(rs.getObject(1).toString()) || tf_mobile.getText().equals(rs.getObject(2).toString())) 
                {pf_pass.setEnabled(true); lb_pass3.setEnabled(true); lb_ErrText_mobile.setVisible(false);  lb_err_mobile.setVisible(false); b1=false; break;}
                else b1=true;
            }
            if(b1) {
                lb_err_mobile.setVisible(true);
                lb_err_mobile.setToolTipText("mobile no not match!");
            }
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }//GEN-LAST:event_bt_checkjButton4ActionPerformed

    private void pf_passpf_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf_passpf_passFocusGained
        if(new String(pf_pass.getPassword()).equals("passdd")) pf_pass.setText("");
    }//GEN-LAST:event_pf_passpf_passFocusGained

    private void pf_passpf_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf_passpf_passFocusLost
        if(new String(pf_pass.getPassword()).equals("")) pf_pass.setText("passdd");
    }//GEN-LAST:event_pf_passpf_passFocusLost

    private void tf_mobileFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_mobileFocusGained
        if(tf_mobile.getText().equals("Mobile Number")) tf_mobile.setText("");
        if(b) {
           lb_err.setVisible(true);
           lb_err.setToolTipText(tf_username.getText()+" not exists !!");
        }
    }//GEN-LAST:event_tf_mobileFocusGained

    private void tf_mobileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_mobileFocusLost
        if(tf_mobile.getText().equals("")) tf_mobile.setText("Mobile Number");
    }//GEN-LAST:event_tf_mobileFocusLost

    private void tf_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_usernameFocusGained
        if(tf_username.getText().equals("Username")) tf_username.setText("");

    }//GEN-LAST:event_tf_usernameFocusGained

    private void tf_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_usernameFocusLost
        if(tf_username.getText().equals("")) tf_username.setText("Username");
    }//GEN-LAST:event_tf_usernameFocusLost

    private void tf_usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_usernameKeyReleased
        try {
            rs = st.executeQuery("Select username from user_details order by sno asc;");
            while(rs.next()) {
                if(tf_username.getText().equals(rs.getString(1))) {
                    lb_err.setVisible(false); lb_ErrText.setVisible(false); b=false; break;
                }
                else b=true;
            }
        } catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }//GEN-LAST:event_tf_usernameKeyReleased

    private void lb_errMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_errMouseClicked
        lb_ErrText.setText(tf_username.getText()+" not exists !!"); lb_ErrText.setVisible(true);
    }//GEN-LAST:event_lb_errMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        tf_username.setText("Username"); tf_mobile.setText("Mobile Number"); pf_pass.setText("passdd"); lb_pass3.setEnabled(false); pf_pass.setEnabled(false);
    }//GEN-LAST:event_formFocusGained

    private void lb_err_mobileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_err_mobileMouseClicked
        lb_ErrText_mobile.setText("mobile no. not match !");lb_ErrText_mobile.setVisible(true);
    }//GEN-LAST:event_lb_err_mobileMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_change;
    private javax.swing.JButton bt_check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lb_ErrText;
    private javax.swing.JLabel lb_ErrText_mobile;
    private javax.swing.JLabel lb_err;
    private javax.swing.JLabel lb_err_mobile;
    private javax.swing.JLabel lb_pass3;
    private javax.swing.JPasswordField pf_pass;
    private javax.swing.JTextField tf_mobile;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
