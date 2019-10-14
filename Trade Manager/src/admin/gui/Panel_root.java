package admin.gui;

import javax.swing.JPanel;
import gui.homePage;
import java.awt.Color;

public class Panel_root extends javax.swing.JFrame {
    JPanel pn; 
    static Panel_UserDetails ps = new Panel_UserDetails();
    Panel_User pu = new Panel_User();
    public Panel_Permissions pp = new Panel_Permissions();
    Panel_Modify pm = new Panel_Modify();
    public Panel_Col pc = new Panel_Col();
    public Panel_Gen_Settings pgenset = new Panel_Gen_Settings();
    
    public Panel_root() {
        initComponents(); setTitle("Administrator Panel");
        setbt_modifyButton(); setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bt_per = new javax.swing.JLabel();
        bt_modify = new javax.swing.JLabel();
        bt_user = new javax.swing.JLabel();
        bt_set = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bt_col = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_back = new javax.swing.JLabel();
        pn_base = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1170, 744));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1180, 744));

        jPanel2.setBackground(new java.awt.Color(130, 130, 130));

        bt_per.setBackground(new java.awt.Color(20, 20, 20));
        bt_per.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        bt_per.setForeground(new java.awt.Color(255, 255, 255));
        bt_per.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_per.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/key-24.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(bt_per, org.openide.util.NbBundle.getMessage(Panel_root.class, "Panel_root.bt_per.text")); // NOI18N
        bt_per.setOpaque(true);
        bt_per.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_perMouseClicked(evt);
            }
        });

        bt_modify.setBackground(new java.awt.Color(20, 20, 20));
        bt_modify.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        bt_modify.setForeground(new java.awt.Color(255, 255, 255));
        bt_modify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_modify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/table-25.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(bt_modify, org.openide.util.NbBundle.getMessage(Panel_root.class, "Panel_root.bt_modify.text")); // NOI18N
        bt_modify.setOpaque(true);
        bt_modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modifyMouseClicked(evt);
            }
        });

        bt_user.setBackground(new java.awt.Color(20, 20, 20));
        bt_user.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        bt_user.setForeground(new java.awt.Color(255, 255, 255));
        bt_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user details-25.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(bt_user, org.openide.util.NbBundle.getMessage(Panel_root.class, "Panel_root.bt_user.text")); // NOI18N
        bt_user.setOpaque(true);
        bt_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_userMouseClicked(evt);
            }
        });

        bt_set.setBackground(new java.awt.Color(20, 20, 20));
        bt_set.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        bt_set.setForeground(new java.awt.Color(255, 255, 255));
        bt_set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_set.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/settings-24.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(bt_set, org.openide.util.NbBundle.getMessage(Panel_root.class, "Panel_root.bt_set.text")); // NOI18N
        bt_set.setOpaque(true);
        bt_set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_setMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(80, 80, 80));

        bt_col.setBackground(new java.awt.Color(20, 20, 20));
        bt_col.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        bt_col.setForeground(new java.awt.Color(255, 255, 255));
        bt_col.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_col.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/refactor-251.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(bt_col, org.openide.util.NbBundle.getMessage(Panel_root.class, "Panel_root.bt_col.text")); // NOI18N
        bt_col.setOpaque(true);
        bt_col.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_colMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_col, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(bt_col, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_modify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_per, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_set, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(bt_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_per, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_set, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(442, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(81, 214, 176));

        lb_back.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(lb_back, org.openide.util.NbBundle.getMessage(Panel_root.class, "Panel_root.lb_back.text")); // NOI18N
        lb_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lb_back, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1126, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, Short.MAX_VALUE)
        );

        pn_base.setBackground(new java.awt.Color(255, 153, 153));
        pn_base.setPreferredSize(new java.awt.Dimension(955, 696));
        pn_base.setRequestFocusEnabled(false);
        pn_base.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout pn_baseLayout = new javax.swing.GroupLayout(pn_base);
        pn_base.setLayout(pn_baseLayout);
        pn_baseLayout.setHorizontalGroup(
            pn_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pn_baseLayout.setVerticalGroup(
            pn_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pn_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_base, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_modifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modifyMouseClicked
        setbt_modifyButton();
    }//GEN-LAST:event_bt_modifyMouseClicked
    private void setbt_modifyButton() {
        bt_modify.setBackground(new Color(50, 50, 50)); bt_modify.setForeground(Color.white);
        bt_col.setBackground(new Color(70,70,70)); bt_col.setForeground(new Color(240,240,240));
        bt_user.setBackground(new Color(70,70,70)); bt_user.setForeground(new Color(240,240,240));
        bt_set.setBackground(new Color(70,70,70)); bt_set.setForeground(new Color(240,240,240));
        bt_per.setBackground(new Color(70,70,70)); bt_per.setForeground(new Color(240,240,240));
        
        pn_base.removeAll();
        pn = pm; pn.setBounds(0, 0, 955, 696);
        pn_base.add(pn); pn_base.setVisible(false); pn_base.setVisible(true);
    }
    private void bt_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_userMouseClicked
        bt_user.setBackground(new Color(50, 50,50)); bt_user.setForeground(Color.white);
        bt_col.setBackground(new Color(70,70,70)); bt_col.setForeground(new Color(240,240,240));
        bt_modify.setBackground(new Color(70,70,70)); bt_modify.setForeground(new Color(240,240,240));
        bt_set.setBackground(new Color(70,70,70)); bt_set.setForeground(new Color(240,240,240));
        bt_per.setBackground(new Color(70,70,70)); bt_per.setForeground(new Color(240,240,240));
       
        pn_base.removeAll();
        pn = pu; pu.setUserNames(); pn.setBounds(0, 0, 955, 696);
        pn_base.add(pn); pn_base.setVisible(false); pn_base.setVisible(true);
    }//GEN-LAST:event_bt_userMouseClicked

    private void bt_perMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_perMouseClicked
        bt_per.setBackground(new Color(50,50,50)); bt_per.setForeground(Color.white);
        bt_col.setBackground(new Color(70,70,70)); bt_col.setForeground(new Color(240,240,240));
        bt_modify.setBackground(new Color(70,70,70)); bt_modify.setForeground(new Color(240,240,240));
        bt_user.setBackground(new Color(70,70,70)); bt_user.setForeground(new Color(240,240,240));
        bt_set.setBackground(new Color(70,70,70)); bt_set.setForeground(new Color(240,240,240));
        
        pn_base.removeAll();
        pn = new Panel_Permissions(); pp.setUserNames(); pn.setBounds(0, 0, 955, 696);  pp.bt_create.setVisible(true); pp.pn_base.setBackground(new Color(70, 70, 70)); pp.pn_perm.setBackground(new Color(70, 70, 70));
        pp.cb_read.setEnabled(true); pp.cb_add.setEnabled(true); pp.delete_cb.setEnabled(true); pp.cb_modify.setEnabled(true);
        pn_base.add(pn); pn_base.setVisible(false); pn_base.setVisible(true);
    }//GEN-LAST:event_bt_perMouseClicked

    private void bt_setMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_setMouseClicked
        bt_set.setBackground(new Color(50,50,50)); bt_set.setForeground(Color.white);
        bt_col.setBackground(new Color(70,70,70)); bt_col.setForeground(new Color(240,240,240));
        bt_modify.setBackground(new Color(70,70,70)); bt_modify.setForeground(new Color(240,240,240));
        bt_user.setBackground(new Color(70,70,70)); bt_user.setForeground(new Color(240,240,240));
        bt_per.setBackground(new Color(70,70,70)); bt_per.setForeground(new Color(240,240,240));
        
        pn_base.removeAll();
        pn = pgenset; pn.setBounds(0, 0, 955, 696);
        pn_base.add(pn); pn_base.setVisible(false); pn_base.setVisible(true);
    }//GEN-LAST:event_bt_setMouseClicked

    private void lb_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_backMouseClicked
         homePage.hp.setVisible(true); homePage.pad.lb_err.setVisible(false);
         Panel_Gen_Settings.setOptionValues();
         if(Panel_Gen_Settings.lb_login.getText().equals("Enabled")) homePage.pad.lb_create.setVisible(false); else homePage.pad.lb_create.setVisible(true);
         if(Panel_Gen_Settings.lb_timer.getText().equals("Disabled")) homePage.runTimer(); else {homePage.lb_time.setVisible(false); homePage.lb_timer.setVisible(false);}
         if(Panel_Gen_Settings.lb_image.getText().equals("Enabled")) homePage.setUserImage(); else homePage.lb_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user.png")));
         dispose();
    }//GEN-LAST:event_lb_backMouseClicked

    private void bt_colMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_colMouseClicked
        bt_col.setBackground(new Color(50, 50, 50)); bt_col.setForeground(Color.white);
        bt_modify.setBackground(new Color(70,70,70)); bt_modify.setForeground(new Color(240,240,240));
        bt_user.setBackground(new Color(70,70,70)); bt_user.setForeground(new Color(240,240,240));
        bt_set.setBackground(new Color(70,70,70)); bt_set.setForeground(new Color(240,240,240));
        bt_per.setBackground(new Color(70,70,70)); bt_per.setForeground(new Color(240,240,240));
        
        pn_base.removeAll();
        pn = pc; pn.setBounds(0, 0, 955, 696);
        pn_base.add(pn); pn_base.setVisible(false); pn_base.setVisible(true);
    }//GEN-LAST:event_bt_colMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       if(Panel_Gen_Settings.lb_backup.getText().equals("Enabled")) db_client.TableEngine.Inner.takeBackup();                                       
       if(Panel_Gen_Settings.lb_exit.getText().equals("Disabled")) new gui.Frame_Exit(); 
       Panel_Gen_Settings.setOptionValues();
       System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel_root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
                new Panel_root();
            }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bt_col;
    private javax.swing.JLabel bt_modify;
    private javax.swing.JLabel bt_per;
    private javax.swing.JLabel bt_set;
    private javax.swing.JLabel bt_user;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb_back;
    public static javax.swing.JPanel pn_base;
    // End of variables declaration//GEN-END:variables
}
