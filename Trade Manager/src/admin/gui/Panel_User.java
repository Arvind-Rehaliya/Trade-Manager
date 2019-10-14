package admin.gui;

import static gui.Init.rs;
import static gui.Init.st;
import gui.homePage;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
  
public class Panel_User extends JPanel {
    
    public Panel_User() {
        initComponents(); setUserNames(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_guest = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pn_super = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pn_admin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sp_super = new javax.swing.JScrollPane();
        pa_super = new javax.swing.JPanel();
        sp_guest = new javax.swing.JScrollPane();
        pa_guest = new javax.swing.JPanel();
        sp_admin = new javax.swing.JScrollPane();
        pa_admin = new javax.swing.JPanel();

        setBackground(new java.awt.Color(50, 50, 50));

        pn_guest.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(Panel_User.class, "Panel_User.jLabel8.text")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/guest-200.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(Panel_User.class, "Panel_User.jLabel3.text")); // NOI18N

        javax.swing.GroupLayout pn_guestLayout = new javax.swing.GroupLayout(pn_guest);
        pn_guest.setLayout(pn_guestLayout);
        pn_guestLayout.setHorizontalGroup(
            pn_guestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_guestLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_guestLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(80, 80, 80))
        );
        pn_guestLayout.setVerticalGroup(
            pn_guestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_guestLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pn_super.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(Panel_User.class, "Panel_User.jLabel7.text")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/super-200.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(Panel_User.class, "Panel_User.jLabel2.text")); // NOI18N

        javax.swing.GroupLayout pn_superLayout = new javax.swing.GroupLayout(pn_super);
        pn_super.setLayout(pn_superLayout);
        pn_superLayout.setHorizontalGroup(
            pn_superLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_superLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(54, 54, 54))
            .addGroup(pn_superLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_superLayout.setVerticalGroup(
            pn_superLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_superLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pn_admin.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/admin_1.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(Panel_User.class, "Panel_User.jLabel1.text_1")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(Panel_User.class, "Panel_User.jLabel6.text")); // NOI18N

        javax.swing.GroupLayout pn_adminLayout = new javax.swing.GroupLayout(pn_admin);
        pn_admin.setLayout(pn_adminLayout);
        pn_adminLayout.setHorizontalGroup(
            pn_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_adminLayout.createSequentialGroup()
                .addGroup(pn_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_adminLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6))
                    .addGroup(pn_adminLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        pn_adminLayout.setVerticalGroup(
            pn_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_adminLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sp_super.setBackground(new java.awt.Color(240, 240, 240));
        sp_super.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pa_super.setBackground(new java.awt.Color(60, 60, 60));

        javax.swing.GroupLayout pa_superLayout = new javax.swing.GroupLayout(pa_super);
        pa_super.setLayout(pa_superLayout);
        pa_superLayout.setHorizontalGroup(
            pa_superLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );
        pa_superLayout.setVerticalGroup(
            pa_superLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        sp_super.setViewportView(pa_super);

        sp_guest.setBackground(new java.awt.Color(240, 240, 240));
        sp_guest.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pa_guest.setBackground(new java.awt.Color(60, 60, 60));

        javax.swing.GroupLayout pa_guestLayout = new javax.swing.GroupLayout(pa_guest);
        pa_guest.setLayout(pa_guestLayout);
        pa_guestLayout.setHorizontalGroup(
            pa_guestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );
        pa_guestLayout.setVerticalGroup(
            pa_guestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        sp_guest.setViewportView(pa_guest);

        sp_admin.setBackground(new java.awt.Color(240, 240, 240));
        sp_admin.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pa_admin.setBackground(new java.awt.Color(60, 60, 60));

        javax.swing.GroupLayout pa_adminLayout = new javax.swing.GroupLayout(pa_admin);
        pa_admin.setLayout(pa_adminLayout);
        pa_adminLayout.setHorizontalGroup(
            pa_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );
        pa_adminLayout.setVerticalGroup(
            pa_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        sp_admin.setViewportView(pa_admin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp_super)
                    .addComponent(pn_super, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_guest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_guest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_guest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_super, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sp_super, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp_admin, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp_guest))
                .addGap(139, 139, 139))
        );
    }// </editor-fold>//GEN-END:initComponents

   private void setUserDetails(String user) {
       try { user = user.substring(4);
           rs = st.executeQuery("select * from user_images;");
           while(rs.next()) {
               if(rs.getString(1).equals(user)) {
                  java.sql.Blob blob = rs.getBlob(2);
                  byte[] b = blob.getBytes(1, (int)blob.length());
                  Panel_UserDetails.lb_user.setIcon(new javax.swing.ImageIcon(b));
               }
            }
       }catch(Exception e) {Panel_UserDetails.lb_user.setIcon(null);}
       
       try {
           rs = st.executeQuery("select * from user_details order by sno asc;");
           while(rs.next()) {
               if(rs.getString(6).equals(user)) {
                   Panel_root.ps.lb_name.setText(rs.getString(2)+"  "+rs.getString(3));
                   if(rs.getString(4).equals("M")) Panel_root.ps.lb_gender.setText("Male"); else Panel_root.ps.lb_gender.setText("Female");
                   Panel_root.ps.tf_mobile.setText("  "+rs.getObject(5).toString());
                   Panel_root.ps.tf_alt.setText("  "+rs.getObject(8).toString());
                   Panel_root.ps.tf_user.setText("  "+rs.getString(6));
                   Panel_root.ps.pf_pass.setText("  "+rs.getString(7));
                   switch(rs.getInt(9)) 
                   {
                       case 0 : Panel_root.ps.tf_status.setText("  "+"Administrator"); break;
                       case 1 : Panel_root.ps.tf_status.setText("  "+"Super User"); break;
                       case 2 : Panel_root.ps.tf_status.setText("  "+"Guest"); break;
                   }
                   String perm = rs.getString(10);
                   Panel_root.ps.tf_read.setText((perm.charAt(0) == '1') ? "  "+"yes" : "  "+"no");
                   Panel_root.ps.tf_add.setText((perm.charAt(1) == '1') ? "  "+"yes" : "  "+"no");
                   Panel_root.ps.tf_delete.setText((perm.charAt(2) == '1') ? "  "+"yes" : "  "+"no");
                   Panel_root.ps.tf_modify.setText((perm.charAt(3) == '1') ? "  "+"yes" : "  "+"no");
               }
           }
       }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
       Panel_root.pn_base.removeAll();
        javax.swing.JPanel pn = Panel_root.ps; pn.setBounds(0, 0, 955, 696);
        Panel_root.pn_base.add(pn); Panel_root.pn_base.setVisible(false); Panel_root.pn_base.setVisible(true);
   }     
   void setUserNames() {
       try { pa_admin.removeAll(); pa_super.removeAll(); pa_guest.removeAll();
          rs = st.executeQuery("select status, username from user_details order by sno asc;");
          while(rs.next()) {
              switch(rs.getString(1)) {
                  case "0" : createButtons(rs.getString(2), pa_admin); break;
                  case "1" : createButtons(rs.getString(2), pa_super); break;
                  case "2" : createButtons(rs.getString(2), pa_guest); break;
              }
          }
          sp_admin.setPreferredSize(new java.awt.Dimension(240, 200));  sp_super.setPreferredSize(new java.awt.Dimension(240, 200)); sp_guest.setPreferredSize(new java.awt.Dimension(240, 200));
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
   }   
   private void createButtons(String data, JPanel pn) {
       JButton bt;
       int comp = pn.getComponentCount();
       bt = new JButton(); bt.setSize(240, 20); bt.setBackground(new Color(90, 90, 90)); bt.setText((comp+1)+".  "+data);
       bt.setForeground(new Color(200, 200, 200)); bt.setFocusPainted(false); bt.setFont(new Font("Arial", Font.BOLD, 13));  bt.setBorder(null);  bt.setHorizontalAlignment(2); bt.setFocusPainted(false);
       bt.addActionListener((java.awt.event.ActionEvent ae) -> {
           setUserDetails(ae.getActionCommand());
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel pa_admin;
    private javax.swing.JPanel pa_guest;
    private javax.swing.JPanel pa_super;
    private javax.swing.JPanel pn_admin;
    private javax.swing.JPanel pn_guest;
    private javax.swing.JPanel pn_super;
    private javax.swing.JScrollPane sp_admin;
    private javax.swing.JScrollPane sp_guest;
    private javax.swing.JScrollPane sp_super;
    // End of variables declaration//GEN-END:variables
}
