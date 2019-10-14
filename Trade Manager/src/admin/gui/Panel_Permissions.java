package admin.gui;

import static gui.Init.rs;
import static gui.Init.st;
import static gui.Init.st1;
import gui.homePage;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panel_Permissions extends javax.swing.JPanel {
    String user;
    
    public Panel_Permissions() {
        initComponents(); setUserNames();
    }
    
    public static void main(String ... args) {
      javax.swing.JFrame fr = new javax.swing.JFrame("Panel admin");
      javax.swing.JPanel pn = new Panel_Permissions(); pn.setSize(953, 550);
      fr.getContentPane().add(pn);
      fr.setVisible(true); fr.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE); fr.setSize(953, 550); //fr.setIconImage(new java.awt.Im);//new javax.swing.ImageIcon("C:\\Users\\student\\Downloads\\warning-50.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_set = new javax.swing.JLabel();
        pn_base = new javax.swing.JPanel();
        pn_perm = new javax.swing.JPanel();
        cb_read = new javax.swing.JCheckBox();
        cb_modify = new javax.swing.JCheckBox();
        delete_cb = new javax.swing.JCheckBox();
        cb_add = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sc_guest = new javax.swing.JScrollPane();
        pa_guest = new javax.swing.JPanel();
        sc_super = new javax.swing.JScrollPane();
        pa_super = new javax.swing.JPanel();
        sc_admin = new javax.swing.JScrollPane();
        pa_admin = new javax.swing.JPanel();
        bt_create = new javax.swing.JButton();

        setBackground(new java.awt.Color(50, 50, 50));
        setPreferredSize(new java.awt.Dimension(955, 696));

        lb_set.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_set.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(lb_set, org.openide.util.NbBundle.getMessage(Panel_Permissions.class, "Panel_Permissions.lb_set.text")); // NOI18N

        pn_base.setBackground(new java.awt.Color(70, 70, 70));
        pn_base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        pn_perm.setBackground(new java.awt.Color(70, 70, 70));
        pn_perm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, org.openide.util.NbBundle.getMessage(Panel_Permissions.class, "Panel_Permissions.pn_perm.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        cb_read.setBackground(new java.awt.Color(80, 80, 80));
        cb_read.setForeground(new java.awt.Color(214, 214, 214));
        cb_read.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(cb_read, org.openide.util.NbBundle.getMessage(Panel_Permissions.class, "Panel_Permissions.cb_read.text")); // NOI18N
        cb_read.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        cb_read.setBorderPainted(true);
        cb_read.setBorderPaintedFlat(true);
        cb_read.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cb_read.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cb_read.setMargin(new java.awt.Insets(20, 10, 20, 20));
        cb_read.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cb_readStateChanged(evt);
            }
        });

        cb_modify.setBackground(new java.awt.Color(80, 80, 80));
        cb_modify.setForeground(new java.awt.Color(214, 214, 214));
        org.openide.awt.Mnemonics.setLocalizedText(cb_modify, org.openide.util.NbBundle.getMessage(Panel_Permissions.class, "Panel_Permissions.cb_modify.text")); // NOI18N
        cb_modify.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        cb_modify.setBorderPainted(true);
        cb_modify.setBorderPaintedFlat(true);
        cb_modify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cb_modify.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cb_modify.setMargin(new java.awt.Insets(20, 10, 20, 20));

        delete_cb.setBackground(new java.awt.Color(80, 80, 80));
        delete_cb.setForeground(new java.awt.Color(214, 214, 214));
        org.openide.awt.Mnemonics.setLocalizedText(delete_cb, org.openide.util.NbBundle.getMessage(Panel_Permissions.class, "Panel_Permissions.delete_cb.text")); // NOI18N
        delete_cb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        delete_cb.setBorderPainted(true);
        delete_cb.setBorderPaintedFlat(true);
        delete_cb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete_cb.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        delete_cb.setMargin(new java.awt.Insets(20, 10, 20, 20));

        cb_add.setBackground(new java.awt.Color(80, 80, 80));
        cb_add.setForeground(new java.awt.Color(214, 214, 214));
        org.openide.awt.Mnemonics.setLocalizedText(cb_add, org.openide.util.NbBundle.getMessage(Panel_Permissions.class, "Panel_Permissions.cb_add.text")); // NOI18N
        cb_add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        cb_add.setBorderPainted(true);
        cb_add.setBorderPaintedFlat(true);
        cb_add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cb_add.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cb_add.setMargin(new java.awt.Insets(20, 10, 20, 20));

        javax.swing.GroupLayout pn_permLayout = new javax.swing.GroupLayout(pn_perm);
        pn_perm.setLayout(pn_permLayout);
        pn_permLayout.setHorizontalGroup(
            pn_permLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_permLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cb_read, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(cb_add, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(delete_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(cb_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pn_permLayout.setVerticalGroup(
            pn_permLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_permLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pn_permLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_read, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_add, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(210, 210, 210));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(Panel_Permissions.class, "Panel_Permissions.jLabel4.text")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(210, 210, 210));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(Panel_Permissions.class, "Panel_Permissions.jLabel5.text")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(210, 210, 210));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(Panel_Permissions.class, "Panel_Permissions.jLabel6.text")); // NOI18N

        sc_guest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        sc_guest.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pa_guest.setBackground(new java.awt.Color(60, 60, 60));
        pa_guest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pa_guest.setPreferredSize(new java.awt.Dimension(238, 271));

        javax.swing.GroupLayout pa_guestLayout = new javax.swing.GroupLayout(pa_guest);
        pa_guest.setLayout(pa_guestLayout);
        pa_guestLayout.setHorizontalGroup(
            pa_guestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        pa_guestLayout.setVerticalGroup(
            pa_guestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        sc_guest.setViewportView(pa_guest);

        sc_super.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        sc_super.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pa_super.setBackground(new java.awt.Color(60, 60, 60));
        pa_super.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout pa_superLayout = new javax.swing.GroupLayout(pa_super);
        pa_super.setLayout(pa_superLayout);
        pa_superLayout.setHorizontalGroup(
            pa_superLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        pa_superLayout.setVerticalGroup(
            pa_superLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        sc_super.setViewportView(pa_super);

        sc_admin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        sc_admin.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pa_admin.setBackground(new java.awt.Color(60, 60, 60));
        pa_admin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout pa_adminLayout = new javax.swing.GroupLayout(pa_admin);
        pa_admin.setLayout(pa_adminLayout);
        pa_adminLayout.setHorizontalGroup(
            pa_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        pa_adminLayout.setVerticalGroup(
            pa_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        sc_admin.setViewportView(pa_admin);

        javax.swing.GroupLayout pn_baseLayout = new javax.swing.GroupLayout(pn_base);
        pn_base.setLayout(pn_baseLayout);
        pn_baseLayout.setHorizontalGroup(
            pn_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_baseLayout.createSequentialGroup()
                .addGroup(pn_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_baseLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel4)
                        .addGap(133, 133, 133)
                        .addComponent(jLabel6)
                        .addGap(188, 188, 188)
                        .addComponent(jLabel5))
                    .addGroup(pn_baseLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pn_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn_perm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_baseLayout.createSequentialGroup()
                                .addComponent(sc_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(sc_super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(sc_guest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        pn_baseLayout.setVerticalGroup(
            pn_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_baseLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pn_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sc_admin)
                    .addComponent(sc_guest, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sc_super))
                .addGap(65, 65, 65)
                .addComponent(pn_perm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        bt_create.setBackground(new java.awt.Color(0, 177, 106));
        bt_create.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bt_create.setForeground(new java.awt.Color(255, 255, 255));
        bt_create.setIcon(new javax.swing.ImageIcon("C:\\Users\\student\\Downloads\\download-16.png")); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(bt_create, org.openide.util.NbBundle.getMessage(Panel_Permissions.class, "Panel_Permissions.bt_create.text")); // NOI18N
        bt_create.setBorderPainted(false);
        bt_create.setFocusPainted(false);
        bt_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_createActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_set)
                            .addComponent(pn_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(bt_create)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lb_set)
                .addGap(18, 18, 18)
                .addComponent(pn_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(bt_create, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_createActionPerformed
        try {  boolean rd= false, ad= false, dl= false, md= false; String perm=null;
            rs = st.executeQuery("select sno, username from user_details order by sno asc;");
            while(rs.next()) {
                if(rs.getString(2).equals(this.user)) {
                    if(cb_read.isSelected()) perm = "1"; else perm = "0";
                    if(cb_add.isSelected()) perm += "1"; else perm += "0";
                    if(delete_cb.isSelected()) perm += "1"; else perm += "0";
                    if(cb_modify.isSelected()) perm += "1"; else perm += "0";
                    if(perm.equals("0000")) {
                        if(JOptionPane.showConfirmDialog(this, "Do you want to remove user '"+this.user+"' ?", "Remove User", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                            st1.executeUpdate("delete from user_details where sno = "+rs.getInt(1)+";"); setUserNames(); return;}
                        else {st1.executeUpdate("update user_details set perm = '"+perm+"' where sno = "+rs.getInt(1)+";"); st1.executeUpdate("update user_details set status = "+1+" where sno = "+rs.getInt(1)+";"); return;}                        
                    } else {
                        st1.executeUpdate("update user_details set perm = '"+perm+"' where sno = "+rs.getInt(1)+";");
                        if(perm.charAt(0) == '1') rd=true;
                        if(perm.charAt(1) == '1') ad=true;
                        if(perm.charAt(2) == '1') dl=true;
                        if(perm.charAt(3) == '1') md=true;
                        if(rd && ad && dl && md) {
                            st1.executeUpdate("update user_details set status = "+0+" where sno = "+rs.getInt(1)+";");
                        }
                        else if((rd || ad) && !dl && !md) {
                            st1.executeUpdate("update user_details set status = "+2+" where sno = "+rs.getInt(1)+";");
                        }
                        else {
                            st1.executeUpdate("update user_details set status = "+1+" where sno = "+rs.getInt(1)+";");
                        }
                    }
                }
            } 
            setUserNames();
            homePage.hp.setLogOutButton();
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
    }//GEN-LAST:event_bt_createActionPerformed

    private void cb_readStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cb_readStateChanged
       if(cb_read.isSelected()) {delete_cb.setEnabled(true); cb_modify.setEnabled(true);}
       else {
          delete_cb.setSelected(false); delete_cb.setEnabled(false); cb_modify.setSelected(false); cb_modify.setEnabled(false);
       }
    }//GEN-LAST:event_cb_readStateChanged
  
   private void getPermissionsForUser(String user) {
       this.user = user.substring(4);
       try {
           rs = st.executeQuery("select username, perm from user_details order by sno asc;");
           while(rs.next()) {
               if(rs.getString(1).equals(this.user)) {
                   String perm = rs.getString(2);
                   if(perm.charAt(0) == '1') cb_read.setSelected(true); else cb_read.setSelected(false);
                   if(perm.charAt(1) == '1') cb_add.setSelected(true); else cb_add.setSelected(false);
                   if(perm.charAt(2) == '1') delete_cb.setSelected(true); else delete_cb.setSelected(false);
                   if(perm.charAt(3) == '1') cb_modify.setSelected(true); else cb_modify.setSelected(false);
               }
           }
       }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
   }
   public void setUserNames() {
       try {
          pn_base.setVisible(false); pa_admin.removeAll(); pa_super.removeAll(); pa_guest.removeAll(); pn_base.setVisible(true);
          rs = st.executeQuery("select status, username from user_details order by sno asc;");
          while(rs.next()) {
              switch(rs.getString(1)) {
                  case "0" : createButtons(rs.getString(2), pa_admin); break;
                  case "1" : createButtons(rs.getString(2), pa_super); break;
                  case "2" : createButtons(rs.getString(2), pa_guest); break;
              }
          }
          sc_admin.setPreferredSize(new java.awt.Dimension(240, 200));  sc_super.setPreferredSize(new java.awt.Dimension(240, 200)); sc_guest.setPreferredSize(new java.awt.Dimension(240, 200));
          pn_base.setVisible(false); pn_base.setVisible(true); 
       }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
   }
   private void createButtons(String data, JPanel pn) {
       JButton bt;
       int comp = pn.getComponentCount();
       bt = new JButton(); bt.setSize(240, 20); bt.setBackground(new Color(90, 90, 90)); bt.setText((comp+1)+".  "+data);
       bt.setForeground(new Color(200, 200, 200)); bt.setFocusPainted(false); bt.setFont(new Font("Arial", Font.BOLD, 13));  bt.setBorder(null);  bt.setHorizontalAlignment(2); bt.setFocusPainted(false);
       bt.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(java.awt.event.ActionEvent ae) {
               getPermissionsForUser(ae.getActionCommand());
           }
       }); int Y = getY(pn, comp);
       pn.setPreferredSize(new java.awt.Dimension(240, Y+20)); bt.setLocation(3, Y); pn.add(bt);
       bt.grabFocus();
   }
   private int getY(JPanel pn, int i) {
       if(pn == pa_admin) return i*20;
       else if(pn == pa_super) return i*20;
       else if(pn == pa_guest) return i*20;
       return -1;
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bt_create;
    public javax.swing.JCheckBox cb_add;
    public javax.swing.JCheckBox cb_modify;
    public javax.swing.JCheckBox cb_read;
    public javax.swing.JCheckBox delete_cb;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel lb_set;
    private javax.swing.JPanel pa_admin;
    private javax.swing.JPanel pa_guest;
    private javax.swing.JPanel pa_super;
    public javax.swing.JPanel pn_base;
    public javax.swing.JPanel pn_perm;
    private javax.swing.JScrollPane sc_admin;
    private javax.swing.JScrollPane sc_guest;
    private javax.swing.JScrollPane sc_super;
    // End of variables declaration//GEN-END:variables
}
