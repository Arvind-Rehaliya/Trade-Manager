package gui;

import javax.swing.JOptionPane;

public class Frame_Delete extends javax.swing.JFrame {
    
    public Frame_Delete() {
        initComponents();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_base = new javax.swing.JPanel();
        bt_ok = new javax.swing.JButton();
        lb_msg = new javax.swing.JLabel();
        bt_cancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb_close = new javax.swing.JLabel();
        lb_icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(Frame_Delete.class, "Frame_Delete.title")); // NOI18N
        setAlwaysOnTop(true);
        setUndecorated(true);

        pn_base.setBackground(new java.awt.Color(80, 80, 80));

        bt_ok.setBackground(new java.awt.Color(255, 102, 102));
        bt_ok.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        bt_ok.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(bt_ok, org.openide.util.NbBundle.getMessage(Frame_Delete.class, "Frame_Delete.bt_ok.text")); // NOI18N
        bt_ok.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        bt_ok.setFocusPainted(false);
        bt_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_okActionPerformed(evt);
            }
        });

        lb_msg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_msg.setForeground(new java.awt.Color(51, 51, 51));
        org.openide.awt.Mnemonics.setLocalizedText(lb_msg, org.openide.util.NbBundle.getMessage(Frame_Delete.class, "Frame_Delete.lb_msg.text")); // NOI18N

        bt_cancel.setBackground(new java.awt.Color(255, 102, 102));
        bt_cancel.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        bt_cancel.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(bt_cancel, org.openide.util.NbBundle.getMessage(Frame_Delete.class, "Frame_Delete.bt_cancel.text")); // NOI18N
        bt_cancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        bt_cancel.setFocusPainted(false);
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(125, 125, 125));

        lb_close.setIcon(new javax.swing.ImageIcon("C:\\Users\\student\\Downloads\\cancel.png")); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(lb_close, org.openide.util.NbBundle.getMessage(Frame_Delete.class, "Frame_Delete.lb_close.text")); // NOI18N
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

        lb_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\student\\Downloads\\warning-50.png")); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(lb_icon, org.openide.util.NbBundle.getMessage(Frame_Delete.class, "Frame_Delete.lb_icon.text")); // NOI18N

        javax.swing.GroupLayout pn_baseLayout = new javax.swing.GroupLayout(pn_base);
        pn_base.setLayout(pn_baseLayout);
        pn_baseLayout.setHorizontalGroup(
            pn_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_baseLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_baseLayout.createSequentialGroup()
                        .addComponent(bt_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_msg))
                .addGap(27, 27, 27))
        );
        pn_baseLayout.setVerticalGroup(
            pn_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_baseLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_baseLayout.createSequentialGroup()
                        .addComponent(lb_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lb_icon))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void bt_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_okActionPerformed
          
    }//GEN-LAST:event_bt_okActionPerformed

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
       setVisible(false);       
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void lb_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_closeMouseClicked
      this.dispose();
    }//GEN-LAST:event_lb_closeMouseClicked
    public int getStatus() {
        if(admin.gui.Panel_Gen_Settings.lb_delete.getText().equals("Enabled")) return 0; else
        return JOptionPane.showConfirmDialog(rootPane, lb_msg, "Rows to be delete", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);// new javax.swing.ImageIcon("C:/Users/student/Downloads/warning-50.png"));
    }
    public void setText(String s) {
        lb_msg.setText(s);
    }
   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Delete();//.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_ok;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_close;
    private javax.swing.JLabel lb_icon;
    private javax.swing.JLabel lb_msg;
    private javax.swing.JPanel pn_base;
    // End of variables declaration//GEN-END:variables
}
