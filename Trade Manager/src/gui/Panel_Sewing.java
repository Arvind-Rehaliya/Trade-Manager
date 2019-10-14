package gui;

import static gui.homePage.user_perm;
import db_client.Sewing;

public class Panel_Sewing extends javax.swing.JPanel {
    public Sewing ps;
    
    public Panel_Sewing() {
        initComponents(); 
        ps = new Sewing();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        Display = new javax.swing.JButton();
        ad = new javax.swing.JButton();

        setBackground(new java.awt.Color(80, 80, 80));
        setPreferredSize(new java.awt.Dimension(953, 550));

        sp.setBorder(null);

        org.openide.awt.Mnemonics.setLocalizedText(Display, org.openide.util.NbBundle.getMessage(Panel_Sewing.class, "Panel_Sewing.Display.text")); // NOI18N
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        ad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back-24.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(ad, org.openide.util.NbBundle.getMessage(Panel_Sewing.class, "Panel_Sewing.ad.text")); // NOI18N
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
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
                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        if(user_perm.charAt(0) == '0') ps.noRowDisplay();  else ps.display();
    }//GEN-LAST:event_DisplayActionPerformed

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed
        ps.addData();
    }//GEN-LAST:event_adActionPerformed
    public Sewing get() { return ps; }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Display;
    public javax.swing.JButton ad;
    public static javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
