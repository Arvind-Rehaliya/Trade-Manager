package gui;

import static gui.homePage.user_perm;
import db_client.Merchants;

public class Panel_merchants extends javax.swing.JPanel {
    Merchants m;
    
    public Panel_merchants() { 
        initComponents();
        m = new Merchants();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        Display = new javax.swing.JButton();
        ad = new javax.swing.JButton();

        setBackground(new java.awt.Color(80, 80, 80));

        sp.setBorder(null);

        org.openide.awt.Mnemonics.setLocalizedText(Display, org.openide.util.NbBundle.getMessage(Panel_merchants.class, "Panel_merchants.Display.text")); // NOI18N
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        ad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back-24.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(ad, org.openide.util.NbBundle.getMessage(Panel_merchants.class, "Panel_merchants.ad.text")); // NOI18N
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sp)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(539, 539, 539)
                        .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        if(user_perm.charAt(0) == '0') m.noRowDisplay();  else m.display();
    }//GEN-LAST:event_DisplayActionPerformed

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed
        m.addData();
    }//GEN-LAST:event_adActionPerformed

    public Merchants get() { return m; }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Display;
    public javax.swing.JButton ad;
    public static javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
