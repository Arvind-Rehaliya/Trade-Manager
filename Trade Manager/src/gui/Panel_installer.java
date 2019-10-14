package gui;

import static gui.Init.st;
import javax.swing.JFileChooser;
import java.io.File;
import javax.swing.JOptionPane;

public class Panel_installer extends javax.swing.JFrame {
    JFileChooser jfc;
    File file;
    String path, os="";
    
    public Panel_installer() {
        initComponents();
        jfc = new JFileChooser(javax.swing.filechooser.FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Setup - TradeManager");
        jfc.setDialogType(JFileChooser.CUSTOM_DIALOG);
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        setSize(580, 450); setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE); setTitle("Setup - Trade Manager");
        checkOS();
        lb_err.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_path = new javax.swing.JTextField();
        bt_browse = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        bt_next = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lb_icon = new javax.swing.JLabel();
        lb_err = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(833, 455));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(235, 235, 235));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(Panel_installer.class, "Panel_installer.jLabel1.text")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(Panel_installer.class, "Panel_installer.jLabel2.text")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\student\\Downloads\\trade-80.jpg")); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(Panel_installer.class, "Panel_installer.jLabel3.text")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(Panel_installer.class, "Panel_installer.jLabel4.text")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(Panel_installer.class, "Panel_installer.jLabel5.text")); // NOI18N

        tf_path.setBackground(new java.awt.Color(250, 250, 250));
        tf_path.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        tf_path.setText(org.openide.util.NbBundle.getMessage(Panel_installer.class, "Panel_installer.tf_path.text")); // NOI18N

        bt_browse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(bt_browse, org.openide.util.NbBundle.getMessage(Panel_installer.class, "Panel_installer.bt_browse.text")); // NOI18N
        bt_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_browseActionPerformed(evt);
            }
        });

        bt_next.setBackground(new java.awt.Color(0, 153, 153));
        bt_next.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_next.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(bt_next, org.openide.util.NbBundle.getMessage(Panel_installer.class, "Panel_installer.bt_next.text")); // NOI18N
        bt_next.setBorderPainted(false);
        bt_next.setFocusPainted(false);
        bt_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nextActionPerformed(evt);
            }
        });

        bt_cancel.setBackground(new java.awt.Color(0, 153, 153));
        bt_cancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_cancel.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(bt_cancel, org.openide.util.NbBundle.getMessage(Panel_installer.class, "Panel_installer.bt_cancel.text")); // NOI18N
        bt_cancel.setBorderPainted(false);
        bt_cancel.setFocusPainted(false);
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(Panel_installer.class, "Panel_installer.jLabel6.text")); // NOI18N

        lb_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\student\\Downloads\\folder-50.png")); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(lb_icon, org.openide.util.NbBundle.getMessage(Panel_installer.class, "Panel_installer.lb_icon.text")); // NOI18N

        lb_err.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_err.setForeground(new java.awt.Color(255, 51, 51));
        org.openide.awt.Mnemonics.setLocalizedText(lb_err, org.openide.util.NbBundle.getMessage(Panel_installer.class, "Panel_installer.lb_err.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_next)
                .addGap(29, 29, 29)
                .addComponent(bt_cancel)
                .addGap(46, 46, 46))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lb_icon)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel4))
                            .addComponent(jLabel6))
                        .addGap(0, 178, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_err, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(tf_path, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_browse))
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_browse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_path, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_err)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_next)
                    .addComponent(bt_cancel))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkOS() {
        if(System.getProperty("os.name").equalsIgnoreCase("Linux")) {
            os = "linux";
            tf_path.setText("/root/Trade_Manager");
        }
        else {
            os = "windows";
            tf_path.setText("C:\\Trade Manager");
        }
    }
    private void bt_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_browseActionPerformed
        if(jfc.showDialog(this, "Select") == JFileChooser.APPROVE_OPTION) {
            if(os.equals("windows"))
                tf_path.setText(jfc.getSelectedFile().getAbsolutePath()+"\\Trade Manager");
            else
            tf_path.setText(jfc.getSelectedFile().getAbsolutePath()+"/Trade_Manager");
        }
    }//GEN-LAST:event_bt_browseActionPerformed

    private String setBackSlash(String s) {
        char[] c;
        for(byte b=0; b<s.length(); b++) {
            if(s.charAt(b) == 92) {
                s += " "; c = s.toCharArray();
                for(int t = s.length()-1; t > b; t--) {
                    c[t] = c[t-1];
                }
                s = new String(c); ++b;
            }
        }
        return s;
    }
    private void delete(File path) {
        File[] files = path.listFiles();
        for(File f: files) {
          if(f.isDirectory()) delete(f);
          else f.delete();
        } path.delete();
    }
    private boolean pathExists(String s) { 
         return new File(s.substring(0, s.length()-14)).exists();
     }
    private void bt_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nextActionPerformed
            try {
                if(tf_path.getText().equals("") || tf_path.getText() == null || !pathExists(tf_path.getText())) {lb_err.setVisible(true); return;}
                if(os.equals("windows")) path = setBackSlash(tf_path.getText());
                else path = tf_path.getText();
                st.executeUpdate("insert into properties values('path', '"+path+"');");
            }catch(Exception e) {try{st.executeUpdate("update properties set const = '"+path+"' where id = 'path';");}catch(Exception ee) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+ee.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}}
            file = new File(path);
            if(file.exists()) delete(file); 
            file.mkdir();
            new Panel_inst_next(); this.dispose();
        
    }//GEN-LAST:event_bt_nextActionPerformed

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Do you want to exit", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) System.exit(0);
       
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        bt_next.requestFocus();
    }//GEN-LAST:event_formWindowGainedFocus
        
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel_installer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_installer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_installer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_installer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Panel_installer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_browse;
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_next;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_err;
    private javax.swing.JLabel lb_icon;
    private javax.swing.JTextField tf_path;
    // End of variables declaration//GEN-END:variables

}
