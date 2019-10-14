package admin.gui;

import static gui.Init.st;
import gui.homePage;
import javax.swing.ButtonGroup;

public class Panel_Modify extends javax.swing.JPanel {
    ButtonGroup bg;
    
    public Panel_Modify() {
        initComponents();
        bg = new ButtonGroup();
        setRadioButtons();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rb_money = new javax.swing.JRadioButton();
        rb_sew = new javax.swing.JRadioButton();
        rb_raw = new javax.swing.JRadioButton();
        rb_ready = new javax.swing.JRadioButton();
        rb_merchant = new javax.swing.JRadioButton();
        rb_rawMat = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        bt_save = new javax.swing.JButton();

        setBackground(new java.awt.Color(50, 50, 50));
        setPreferredSize(new java.awt.Dimension(955, 615));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(200, 200, 200));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(Panel_Modify.class, "Panel_Modify.jLabel4.text")); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(Panel_Modify.class, "Panel_Modify.jLabel6.text")); // NOI18N

        jPanel2.setBackground(new java.awt.Color(70, 70, 70));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel1.setBackground(new java.awt.Color(70, 70, 70));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        rb_money.setBackground(new java.awt.Color(204, 204, 204));
        rb_money.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(rb_money, org.openide.util.NbBundle.getMessage(Panel_Modify.class, "Panel_Modify.rb_money.text")); // NOI18N
        rb_money.setBorder(null);
        rb_money.setContentAreaFilled(false);
        rb_money.setFocusPainted(false);
        rb_money.setFocusable(false);
        rb_money.setRequestFocusEnabled(false);

        rb_sew.setBackground(new java.awt.Color(204, 204, 204));
        rb_sew.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(rb_sew, org.openide.util.NbBundle.getMessage(Panel_Modify.class, "Panel_Modify.rb_sew.text")); // NOI18N
        rb_sew.setBorder(null);
        rb_sew.setContentAreaFilled(false);
        rb_sew.setFocusPainted(false);
        rb_sew.setFocusable(false);
        rb_sew.setRequestFocusEnabled(false);

        rb_raw.setBackground(new java.awt.Color(204, 204, 204));
        rb_raw.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(rb_raw, org.openide.util.NbBundle.getMessage(Panel_Modify.class, "Panel_Modify.rb_ready.text")); // NOI18N
        rb_raw.setBorder(null);
        rb_raw.setContentAreaFilled(false);
        rb_raw.setFocusPainted(false);
        rb_raw.setFocusable(false);
        rb_raw.setRequestFocusEnabled(false);

        rb_ready.setBackground(new java.awt.Color(204, 204, 204));
        rb_ready.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(rb_ready, org.openide.util.NbBundle.getMessage(Panel_Modify.class, "Panel_Modify.rb_ready.text")); // NOI18N
        rb_ready.setBorder(null);
        rb_ready.setContentAreaFilled(false);
        rb_ready.setFocusPainted(false);
        rb_ready.setFocusable(false);
        rb_ready.setRequestFocusEnabled(false);

        rb_merchant.setBackground(new java.awt.Color(204, 204, 204));
        rb_merchant.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(rb_merchant, org.openide.util.NbBundle.getMessage(Panel_Modify.class, "Panel_Modify.rb_ready.text")); // NOI18N
        rb_merchant.setBorder(null);
        rb_merchant.setContentAreaFilled(false);
        rb_merchant.setFocusPainted(false);
        rb_merchant.setFocusable(false);
        rb_merchant.setRequestFocusEnabled(false);

        rb_rawMat.setBackground(new java.awt.Color(204, 204, 204));
        rb_rawMat.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(rb_rawMat, org.openide.util.NbBundle.getMessage(Panel_Modify.class, "Panel_Modify.rb_ready.text")); // NOI18N
        rb_rawMat.setBorder(null);
        rb_rawMat.setContentAreaFilled(false);
        rb_rawMat.setFocusPainted(false);
        rb_rawMat.setFocusable(false);
        rb_rawMat.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_money)
                    .addComponent(rb_sew)
                    .addComponent(rb_raw)
                    .addComponent(rb_ready)
                    .addComponent(rb_merchant)
                    .addComponent(rb_rawMat))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rb_money)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_sew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_raw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_ready)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_merchant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_rawMat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(Panel_Modify.class, "Panel_Modify.jLabel5.text")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(Panel_Modify.class, "Panel_Modify.jLabel7.text")); // NOI18N

        tf_name.setBackground(new java.awt.Color(90, 90, 90));
        tf_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_name.setForeground(new java.awt.Color(255, 255, 255));
        tf_name.setText(org.openide.util.NbBundle.getMessage(Panel_Modify.class, "Panel_Modify.tf_name.text")); // NOI18N
        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });

        bt_save.setBackground(new java.awt.Color(247, 99, 99));
        bt_save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_save.setForeground(new java.awt.Color(255, 255, 255));
        bt_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/change-32.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(bt_save, org.openide.util.NbBundle.getMessage(Panel_Modify.class, "Panel_Modify.bt_save.text")); // NOI18N
        bt_save.setBorderPainted(false);
        bt_save.setFocusPainted(false);
        bt_save.setFocusable(false);
        bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_name, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_save))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(bt_save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    private void setRadioButtons() {
        rb_money.setText(homePage.button_mt.getText()); rb_money.setSelected(true); rb_money.setActionCommand("1");
        rb_sew.setText(homePage.button_sw.getText()); rb_sew.setActionCommand("2");
        rb_raw.setText(homePage.button_rw.getText()); rb_raw.setActionCommand("3");
        rb_ready.setText(homePage.button_rm.getText()); rb_ready.setActionCommand("4");
        rb_merchant.setText(homePage.button_m.getText()); rb_merchant.setActionCommand("5");
        rb_rawMat.setText(homePage.bt_raw.getText()); rb_rawMat.setActionCommand("6");
        bg.add(rb_money); bg.add(rb_sew); bg.add(rb_raw); bg.add(rb_ready); bg.add(rb_merchant); bg.add(rb_rawMat); 
    }
    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        
    }//GEN-LAST:event_tf_nameActionPerformed

    private void bt_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saveActionPerformed
      try {
        switch(bg.getSelection().getActionCommand()) {
            case "1" : st.executeUpdate("update table_buttons set tables = '"+ tf_name.getText() +"' where tables = '"+ homePage.button_mt.getText() +"';"); break;
            case "2" : st.executeUpdate("update table_buttons set tables = '"+ tf_name.getText() +"' where tables = '"+ homePage.button_sw.getText() +"';"); break;
            case "3" : st.executeUpdate("update table_buttons set tables = '"+ tf_name.getText() +"' where tables = '"+ homePage.button_rw.getText() +"';"); break;
            case "4" : st.executeUpdate("update table_buttons set tables = '"+ tf_name.getText() +"' where tables = '"+ homePage.button_rm.getText() +"';"); break;
            case "5" : st.executeUpdate("update table_buttons set tables = '"+ tf_name.getText() +"' where tables = '"+ homePage.button_m.getText() +"';"); break;
            case "6" : st.executeUpdate("update table_buttons set tables = '"+ tf_name.getText() +"' where tables = '"+ homePage.bt_raw.getText() +"';"); break;
        }  homePage.setTableButtonNames();
      }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);} setRadioButtons();
    }//GEN-LAST:event_bt_saveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_save;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rb_merchant;
    private javax.swing.JRadioButton rb_money;
    private javax.swing.JRadioButton rb_raw;
    private javax.swing.JRadioButton rb_rawMat;
    private javax.swing.JRadioButton rb_ready;
    private javax.swing.JRadioButton rb_sew;
    private javax.swing.JTextField tf_name;
    // End of variables declaration//GEN-END:variables
}
