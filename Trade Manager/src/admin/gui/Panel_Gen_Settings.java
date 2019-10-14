package admin.gui;

import static gui.Init.rs;
import static gui.Init.st;
import java.awt.Color;
import gui.homePage;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class Panel_Gen_Settings extends javax.swing.JPanel {
    boolean clicked=false;
    public Panel_Gen_Settings() {
        initComponents(); connection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_backup = new javax.swing.JLabel();
        pn_backup = new javax.swing.JPanel();
        bt_backupdisable = new javax.swing.JButton();
        bt_backupenable = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb_login = new javax.swing.JLabel();
        pn_login = new javax.swing.JPanel();
        bt_logindisable = new javax.swing.JButton();
        bt_loginenable = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_timer = new javax.swing.JLabel();
        pn_timer = new javax.swing.JPanel();
        bt_timerdisable = new javax.swing.JButton();
        bt_timerenable = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lb_image = new javax.swing.JLabel();
        pn_image = new javax.swing.JPanel();
        bt_imagedisable = new javax.swing.JButton();
        bt_imageenable = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lb_guest = new javax.swing.JLabel();
        pn_guest = new javax.swing.JPanel();
        bt_guestdisable = new javax.swing.JButton();
        bt_guestenable = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lb_delete = new javax.swing.JLabel();
        pn_delete = new javax.swing.JPanel();
        bt_deletedisable = new javax.swing.JButton();
        bt_deleteenable = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lb_exit = new javax.swing.JLabel();
        pn_exit = new javax.swing.JPanel();
        bt_exitdisable = new javax.swing.JButton();
        bt_exitenable = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lb_update = new javax.swing.JLabel();
        pn_update = new javax.swing.JPanel();
        bt_updatedisable = new javax.swing.JButton();
        bt_updateenable = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bt_backup = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pn_superuser = new javax.swing.JPanel();
        bt_superuserdisable = new javax.swing.JButton();
        bt_superuserenable = new javax.swing.JButton();
        lb_superuser = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lb_splash = new javax.swing.JLabel();
        pn_splash = new javax.swing.JPanel();
        bt_splashdisable = new javax.swing.JButton();
        bt_splashenable = new javax.swing.JButton();
        pn_security = new javax.swing.JPanel();
        bt_securitydisable = new javax.swing.JButton();
        bt_securityenable = new javax.swing.JButton();
        lb_security = new javax.swing.JLabel();
        pn_auto = new javax.swing.JPanel();
        bt_autodisable = new javax.swing.JButton();
        bt_autoenable = new javax.swing.JButton();
        lb_auto = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        pf_pass = new javax.swing.JPasswordField();
        lb_eye = new javax.swing.JLabel();
        bt_set = new javax.swing.JButton();
        bt_update = new javax.swing.JButton();

        setBackground(new java.awt.Color(50, 50, 50));
        setPreferredSize(new java.awt.Dimension(942, 653));

        pn.setBackground(new java.awt.Color(60, 60, 60));
        pn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel6.text")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(190, 190, 190));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel7.text")); // NOI18N

        jPanel1.setOpaque(false);

        lb_backup.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_backup.setForeground(java.awt.Color.lightGray);
        org.openide.awt.Mnemonics.setLocalizedText(lb_backup, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.lb_backup.text")); // NOI18N

        pn_backup.setBackground(new java.awt.Color(120, 120, 120));
        pn_backup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_backup.setPreferredSize(new java.awt.Dimension(58, 16));
        pn_backup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_backupMouseClicked(evt);
            }
        });

        bt_backupdisable.setBackground(new java.awt.Color(252, 252, 252));
        bt_backupdisable.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(bt_backupdisable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_backupdisable.text")); // NOI18N
        bt_backupdisable.setBorder(null);
        bt_backupdisable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_backupdisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backupdisableActionPerformed(evt);
            }
        });

        bt_backupenable.setBackground(new java.awt.Color(252, 252, 252));
        bt_backupenable.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(bt_backupenable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_backupenable.text")); // NOI18N
        bt_backupenable.setBorder(null);
        bt_backupenable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_backupenable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backupenableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_backupLayout = new javax.swing.GroupLayout(pn_backup);
        pn_backup.setLayout(pn_backupLayout);
        pn_backupLayout.setHorizontalGroup(
            pn_backupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_backupLayout.createSequentialGroup()
                .addComponent(bt_backupdisable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_backupenable, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_backupLayout.setVerticalGroup(
            pn_backupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_backupdisable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bt_backupenable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb_backup, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(pn_backup, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_backup, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(lb_backup))
                .addGap(0, 0, 0))
        );

        jPanel2.setOpaque(false);

        lb_login.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_login.setForeground(java.awt.Color.lightGray);
        org.openide.awt.Mnemonics.setLocalizedText(lb_login, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.lb_login.text")); // NOI18N

        pn_login.setBackground(new java.awt.Color(120, 120, 120));
        pn_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_login.setPreferredSize(new java.awt.Dimension(58, 16));
        pn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_loginMouseClicked(evt);
            }
        });

        bt_logindisable.setBackground(new java.awt.Color(252, 252, 252));
        bt_logindisable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_logindisable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_logindisable.text")); // NOI18N
        bt_logindisable.setBorder(null);
        bt_logindisable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_logindisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_logindisableActionPerformed(evt);
            }
        });

        bt_loginenable.setBackground(new java.awt.Color(252, 252, 252));
        bt_loginenable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_loginenable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_loginenable.text")); // NOI18N
        bt_loginenable.setBorder(null);
        bt_loginenable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_loginenable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginenableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_loginLayout = new javax.swing.GroupLayout(pn_login);
        pn_login.setLayout(pn_loginLayout);
        pn_loginLayout.setHorizontalGroup(
            pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_loginLayout.createSequentialGroup()
                .addComponent(bt_logindisable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_loginenable, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_loginLayout.setVerticalGroup(
            pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_logindisable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bt_loginenable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lb_login, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(pn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_login, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(lb_login))
                .addGap(0, 0, 0))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel8.text")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(190, 190, 190));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel9, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel9.text")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel10.text")); // NOI18N

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(190, 190, 190));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel11, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel11.text")); // NOI18N

        jPanel3.setOpaque(false);

        lb_timer.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_timer.setForeground(java.awt.Color.lightGray);
        org.openide.awt.Mnemonics.setLocalizedText(lb_timer, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.lb_timer.text")); // NOI18N

        pn_timer.setBackground(new java.awt.Color(120, 120, 120));
        pn_timer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_timer.setForeground(new java.awt.Color(173, 173, 173));
        pn_timer.setPreferredSize(new java.awt.Dimension(58, 16));
        pn_timer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_timerMouseClicked(evt);
            }
        });

        bt_timerdisable.setBackground(new java.awt.Color(252, 252, 252));
        bt_timerdisable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_timerdisable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_timerdisable.text")); // NOI18N
        bt_timerdisable.setBorder(null);
        bt_timerdisable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_timerdisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timerdisableActionPerformed(evt);
            }
        });

        bt_timerenable.setBackground(new java.awt.Color(252, 252, 252));
        bt_timerenable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_timerenable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_timerenable.text")); // NOI18N
        bt_timerenable.setBorder(null);
        bt_timerenable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_timerenable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timerenableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_timerLayout = new javax.swing.GroupLayout(pn_timer);
        pn_timer.setLayout(pn_timerLayout);
        pn_timerLayout.setHorizontalGroup(
            pn_timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_timerLayout.createSequentialGroup()
                .addComponent(bt_timerdisable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_timerenable, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_timerLayout.setVerticalGroup(
            pn_timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_timerdisable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bt_timerenable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lb_timer, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(pn_timer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_timer, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(lb_timer))
                .addGap(0, 0, 0))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel12, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel12.text")); // NOI18N

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(190, 190, 190));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel13, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel13.text")); // NOI18N

        jPanel4.setOpaque(false);

        lb_image.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_image.setForeground(java.awt.Color.lightGray);
        org.openide.awt.Mnemonics.setLocalizedText(lb_image, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.lb_image.text")); // NOI18N

        pn_image.setBackground(new java.awt.Color(120, 120, 120));
        pn_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_image.setPreferredSize(new java.awt.Dimension(58, 16));
        pn_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_imageMouseClicked(evt);
            }
        });

        bt_imagedisable.setBackground(new java.awt.Color(252, 252, 252));
        bt_imagedisable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_imagedisable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_imagedisable.text")); // NOI18N
        bt_imagedisable.setBorder(null);
        bt_imagedisable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_imagedisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_imagedisableActionPerformed(evt);
            }
        });

        bt_imageenable.setBackground(new java.awt.Color(252, 252, 252));
        bt_imageenable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_imageenable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_imageenable.text")); // NOI18N
        bt_imageenable.setBorder(null);
        bt_imageenable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_imageenable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_imageenableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_imageLayout = new javax.swing.GroupLayout(pn_image);
        pn_image.setLayout(pn_imageLayout);
        pn_imageLayout.setHorizontalGroup(
            pn_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_imageLayout.createSequentialGroup()
                .addComponent(bt_imagedisable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_imageenable, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_imageLayout.setVerticalGroup(
            pn_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_imagedisable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bt_imageenable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lb_image, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(pn_image, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_image, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(lb_image))
                .addGap(0, 0, 0))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel14, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel14.text")); // NOI18N

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(190, 190, 190));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel15, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel15.text")); // NOI18N

        jPanel5.setOpaque(false);

        lb_guest.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_guest.setForeground(java.awt.Color.lightGray);
        org.openide.awt.Mnemonics.setLocalizedText(lb_guest, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.lb_guest.text")); // NOI18N

        pn_guest.setBackground(new java.awt.Color(120, 120, 120));
        pn_guest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_guest.setPreferredSize(new java.awt.Dimension(58, 16));
        pn_guest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_guestMouseClicked(evt);
            }
        });

        bt_guestdisable.setBackground(new java.awt.Color(252, 252, 252));
        bt_guestdisable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_guestdisable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_guestdisable.text")); // NOI18N
        bt_guestdisable.setBorder(null);
        bt_guestdisable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_guestdisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guestdisableActionPerformed(evt);
            }
        });

        bt_guestenable.setBackground(new java.awt.Color(252, 252, 252));
        bt_guestenable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_guestenable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_guestenable.text")); // NOI18N
        bt_guestenable.setBorder(null);
        bt_guestenable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_guestenable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guestenableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_guestLayout = new javax.swing.GroupLayout(pn_guest);
        pn_guest.setLayout(pn_guestLayout);
        pn_guestLayout.setHorizontalGroup(
            pn_guestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_guestLayout.createSequentialGroup()
                .addComponent(bt_guestdisable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_guestenable, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_guestLayout.setVerticalGroup(
            pn_guestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_guestdisable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bt_guestenable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lb_guest, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(pn_guest, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_guest, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(lb_guest))
                .addGap(0, 0, 0))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel16, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel16.text")); // NOI18N

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(190, 190, 190));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel17, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel17.text")); // NOI18N

        jPanel6.setOpaque(false);

        lb_delete.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_delete.setForeground(java.awt.Color.lightGray);
        org.openide.awt.Mnemonics.setLocalizedText(lb_delete, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.lb_delete.text")); // NOI18N

        pn_delete.setBackground(new java.awt.Color(120, 120, 120));
        pn_delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_delete.setPreferredSize(new java.awt.Dimension(58, 16));
        pn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_deleteMouseClicked(evt);
            }
        });

        bt_deletedisable.setBackground(new java.awt.Color(252, 252, 252));
        bt_deletedisable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_deletedisable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_deletedisable.text")); // NOI18N
        bt_deletedisable.setBorder(null);
        bt_deletedisable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_deletedisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deletedisableActionPerformed(evt);
            }
        });

        bt_deleteenable.setBackground(new java.awt.Color(252, 252, 252));
        bt_deleteenable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_deleteenable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_deleteenable.text")); // NOI18N
        bt_deleteenable.setBorder(null);
        bt_deleteenable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_deleteenable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteenableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_deleteLayout = new javax.swing.GroupLayout(pn_delete);
        pn_delete.setLayout(pn_deleteLayout);
        pn_deleteLayout.setHorizontalGroup(
            pn_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_deleteLayout.createSequentialGroup()
                .addComponent(bt_deletedisable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_deleteenable, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_deleteLayout.setVerticalGroup(
            pn_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_deletedisable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bt_deleteenable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lb_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(pn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(lb_delete))
                .addGap(0, 0, 0))
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel18, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel18.text")); // NOI18N

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(190, 190, 190));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel19, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel19.text")); // NOI18N

        jPanel7.setOpaque(false);

        lb_exit.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_exit.setForeground(java.awt.Color.lightGray);
        org.openide.awt.Mnemonics.setLocalizedText(lb_exit, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.lb_exit.text")); // NOI18N

        pn_exit.setBackground(new java.awt.Color(120, 120, 120));
        pn_exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_exit.setPreferredSize(new java.awt.Dimension(58, 16));
        pn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_exitMouseClicked(evt);
            }
        });

        bt_exitdisable.setBackground(new java.awt.Color(252, 252, 252));
        bt_exitdisable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_exitdisable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_exitdisable.text")); // NOI18N
        bt_exitdisable.setBorder(null);
        bt_exitdisable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_exitdisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitdisableActionPerformed(evt);
            }
        });

        bt_exitenable.setBackground(new java.awt.Color(252, 252, 252));
        bt_exitenable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_exitenable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_exitenable.text")); // NOI18N
        bt_exitenable.setBorder(null);
        bt_exitenable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_exitenable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitenableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_exitLayout = new javax.swing.GroupLayout(pn_exit);
        pn_exit.setLayout(pn_exitLayout);
        pn_exitLayout.setHorizontalGroup(
            pn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_exitLayout.createSequentialGroup()
                .addComponent(bt_exitdisable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_exitenable, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_exitLayout.setVerticalGroup(
            pn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_exitdisable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bt_exitenable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(lb_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(pn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(lb_exit))
                .addGap(0, 0, 0))
        );

        jPanel8.setOpaque(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel22, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel22.text")); // NOI18N

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(190, 190, 190));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel23, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel23.text")); // NOI18N

        jPanel9.setOpaque(false);

        lb_update.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_update.setForeground(java.awt.Color.lightGray);
        org.openide.awt.Mnemonics.setLocalizedText(lb_update, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.lb_update.text")); // NOI18N

        pn_update.setBackground(new java.awt.Color(120, 120, 120));
        pn_update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_update.setPreferredSize(new java.awt.Dimension(58, 16));
        pn_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_updateMouseClicked(evt);
            }
        });

        bt_updatedisable.setBackground(new java.awt.Color(252, 252, 252));
        bt_updatedisable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_updatedisable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_updatedisable.text")); // NOI18N
        bt_updatedisable.setBorder(null);
        bt_updatedisable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_updatedisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updatedisableActionPerformed(evt);
            }
        });

        bt_updateenable.setBackground(new java.awt.Color(252, 252, 252));
        bt_updateenable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_updateenable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_updateenable.text")); // NOI18N
        bt_updateenable.setBorder(null);
        bt_updateenable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_updateenable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateenableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_updateLayout = new javax.swing.GroupLayout(pn_update);
        pn_update.setLayout(pn_updateLayout);
        pn_updateLayout.setHorizontalGroup(
            pn_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_updateLayout.createSequentialGroup()
                .addComponent(bt_updatedisable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_updateenable, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_updateLayout.setVerticalGroup(
            pn_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_updatedisable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bt_updateenable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(lb_update, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(pn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_update, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(lb_update))
                .addGap(0, 0, 0))
        );

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel1.text")); // NOI18N

        bt_backup.setBackground(new java.awt.Color(69, 183, 150));
        bt_backup.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(bt_backup, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_backup.text")); // NOI18N
        bt_backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backupActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel24, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel24.text")); // NOI18N

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(190, 190, 190));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel25, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel25.text")); // NOI18N

        pn_superuser.setBackground(new java.awt.Color(120, 120, 120));
        pn_superuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_superuser.setPreferredSize(new java.awt.Dimension(58, 16));
        pn_superuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_superuserMouseClicked(evt);
            }
        });

        bt_superuserdisable.setBackground(new java.awt.Color(252, 252, 252));
        bt_superuserdisable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_superuserdisable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_superuserdisable.text")); // NOI18N
        bt_superuserdisable.setBorder(null);
        bt_superuserdisable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_superuserdisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_superuserdisableActionPerformed(evt);
            }
        });

        bt_superuserenable.setBackground(new java.awt.Color(252, 252, 252));
        bt_superuserenable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_superuserenable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_superuserenable.text")); // NOI18N
        bt_superuserenable.setBorder(null);
        bt_superuserenable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_superuserenable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_superuserenableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_superuserLayout = new javax.swing.GroupLayout(pn_superuser);
        pn_superuser.setLayout(pn_superuserLayout);
        pn_superuserLayout.setHorizontalGroup(
            pn_superuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_superuserLayout.createSequentialGroup()
                .addComponent(bt_superuserdisable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_superuserenable, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_superuserLayout.setVerticalGroup(
            pn_superuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_superuserdisable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bt_superuserenable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lb_superuser.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_superuser.setForeground(java.awt.Color.lightGray);
        org.openide.awt.Mnemonics.setLocalizedText(lb_superuser, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.lb_superuser.text")); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel26, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel26.text")); // NOI18N

        jLabel27.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(190, 190, 190));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel27, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel27.text")); // NOI18N

        lb_splash.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_splash.setForeground(java.awt.Color.lightGray);
        org.openide.awt.Mnemonics.setLocalizedText(lb_splash, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.lb_splash.text")); // NOI18N

        pn_splash.setBackground(new java.awt.Color(120, 120, 120));
        pn_splash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_splash.setPreferredSize(new java.awt.Dimension(58, 16));
        pn_splash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_splashMouseClicked(evt);
            }
        });

        bt_splashdisable.setBackground(new java.awt.Color(252, 252, 252));
        bt_splashdisable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_splashdisable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_splashdisable.text")); // NOI18N
        bt_splashdisable.setBorder(null);
        bt_splashdisable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_splashdisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_splashdisableActionPerformed(evt);
            }
        });

        bt_splashenable.setBackground(new java.awt.Color(252, 252, 252));
        bt_splashenable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_splashenable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_splashenable.text")); // NOI18N
        bt_splashenable.setBorder(null);
        bt_splashenable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_splashenable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_splashenableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_splashLayout = new javax.swing.GroupLayout(pn_splash);
        pn_splash.setLayout(pn_splashLayout);
        pn_splashLayout.setHorizontalGroup(
            pn_splashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_splashLayout.createSequentialGroup()
                .addComponent(bt_splashdisable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_splashenable, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_splashLayout.setVerticalGroup(
            pn_splashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_splashdisable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bt_splashenable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pn_security.setBackground(new java.awt.Color(120, 120, 120));
        pn_security.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_security.setForeground(new java.awt.Color(252, 252, 252));
        pn_security.setPreferredSize(new java.awt.Dimension(58, 16));
        pn_security.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_securityMouseClicked(evt);
            }
        });

        bt_securitydisable.setBackground(new java.awt.Color(252, 252, 252));
        bt_securitydisable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_securitydisable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_securitydisable.text")); // NOI18N
        bt_securitydisable.setBorder(null);
        bt_securitydisable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_securitydisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_securitydisableActionPerformed(evt);
            }
        });

        bt_securityenable.setBackground(new java.awt.Color(252, 252, 252));
        bt_securityenable.setForeground(new java.awt.Color(204, 204, 204));
        org.openide.awt.Mnemonics.setLocalizedText(bt_securityenable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_securityenable.text")); // NOI18N
        bt_securityenable.setBorder(null);
        bt_securityenable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_securityenable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_securityenableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_securityLayout = new javax.swing.GroupLayout(pn_security);
        pn_security.setLayout(pn_securityLayout);
        pn_securityLayout.setHorizontalGroup(
            pn_securityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_securityLayout.createSequentialGroup()
                .addComponent(bt_securitydisable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_securityenable, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_securityLayout.setVerticalGroup(
            pn_securityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_securitydisable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bt_securityenable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lb_security.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_security.setForeground(java.awt.Color.lightGray);
        org.openide.awt.Mnemonics.setLocalizedText(lb_security, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.lb_security.text")); // NOI18N

        pn_auto.setBackground(new java.awt.Color(120, 120, 120));
        pn_auto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pn_auto.setPreferredSize(new java.awt.Dimension(58, 16));
        pn_auto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_autoMouseClicked(evt);
            }
        });

        bt_autodisable.setBackground(new java.awt.Color(252, 252, 252));
        bt_autodisable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_autodisable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_autodisable.text")); // NOI18N
        bt_autodisable.setBorder(null);
        bt_autodisable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_autodisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_autodisableActionPerformed(evt);
            }
        });

        bt_autoenable.setBackground(new java.awt.Color(252, 252, 252));
        bt_autoenable.setForeground(new java.awt.Color(252, 252, 252));
        org.openide.awt.Mnemonics.setLocalizedText(bt_autoenable, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_autoenable.text")); // NOI18N
        bt_autoenable.setBorder(null);
        bt_autoenable.setPreferredSize(new java.awt.Dimension(25, 15));
        bt_autoenable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_autoenableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_autoLayout = new javax.swing.GroupLayout(pn_auto);
        pn_auto.setLayout(pn_autoLayout);
        pn_autoLayout.setHorizontalGroup(
            pn_autoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_autoLayout.createSequentialGroup()
                .addComponent(bt_autodisable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bt_autoenable, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_autoLayout.setVerticalGroup(
            pn_autoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_autodisable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bt_autoenable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lb_auto.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_auto.setForeground(java.awt.Color.lightGray);
        org.openide.awt.Mnemonics.setLocalizedText(lb_auto, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.lb_auto.text")); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel28, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel28.text")); // NOI18N

        jLabel29.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(190, 190, 190));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel29, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel29.text")); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel30, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel30.text")); // NOI18N

        jLabel31.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(190, 190, 190));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel31, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.jLabel31.text")); // NOI18N

        pf_pass.setBackground(new java.awt.Color(90, 90, 90));
        pf_pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pf_pass.setForeground(new java.awt.Color(204, 204, 204));
        pf_pass.setText(org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.pf_pass.text")); // NOI18N

        lb_eye.setBackground(new java.awt.Color(102, 102, 102));
        lb_eye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/visible-16.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(lb_eye, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.lb_eye.text")); // NOI18N
        lb_eye.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lb_eye.setFocusable(false);
        lb_eye.setIconTextGap(8);
        lb_eye.setOpaque(true);
        lb_eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_eyeMouseClicked(evt);
            }
        });

        bt_set.setBackground(new java.awt.Color(69, 183, 150));
        bt_set.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(bt_set, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_set.text")); // NOI18N
        bt_set.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.gray, java.awt.Color.black, java.awt.Color.gray));
        bt_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_setActionPerformed(evt);
            }
        });

        bt_update.setBackground(new java.awt.Color(69, 183, 150));
        bt_update.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(bt_update, org.openide.util.NbBundle.getMessage(Panel_Gen_Settings.class, "Panel_Gen_Settings.bt_update.text")); // NOI18N
        bt_update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        bt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnLayout = new javax.swing.GroupLayout(pn);
        pn.setLayout(pnLayout);
        pnLayout.setHorizontalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(47, 47, 47)
                        .addComponent(bt_backup)
                        .addGap(71, 71, 71))
                    .addGroup(pnLayout.createSequentialGroup()
                        .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnLayout.createSequentialGroup()
                                .addComponent(pf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(bt_set, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnLayout.createSequentialGroup()
                                .addComponent(lb_auto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(pn_auto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel26)
                            .addGroup(pnLayout.createSequentialGroup()
                                .addComponent(lb_superuser, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(pn_superuser, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnLayout.createSequentialGroup()
                                .addComponent(lb_splash, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(pn_splash, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel8)
                            .addGroup(pnLayout.createSequentialGroup()
                                .addComponent(lb_security, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(pn_security, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel27)
                            .addComponent(jLabel25)
                            .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnLayout.createSequentialGroup()
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_update, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        pnLayout.setVerticalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(bt_backup)))
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_update, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_superuser, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(lb_superuser))
                .addGap(33, 33, 33)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_splash)
                    .addComponent(pn_splash, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_security, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(lb_security))
                .addGap(28, 28, 28)
                .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLayout.createSequentialGroup()
                        .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_eye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pf_pass))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pn_auto, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                            .addComponent(lb_auto)))
                    .addComponent(bt_set, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(pn);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void connection() {
        try {
            rs = st.executeQuery("select * from gen_settings order by Sno asc;");
            rs.absolute(1); if(rs.getString(3).equals("Enabled")) setbackupBtOn(); else setbackupBtOff();
            rs.absolute(2); if(rs.getString(3).equals("Enabled")) setloginBtOn(); else setloginBtOff();
            rs.absolute(3); if(rs.getString(3).equals("Enabled")) settimerBtOn(); else settimerBtOff();
            rs.absolute(4); if(rs.getString(3).equals("Enabled")) setimageBtOn(); else setimageBtOff();
            rs.absolute(5); if(rs.getString(3).equals("Enabled")) setguestBtOn(); else setguestBtOff();
            rs.absolute(6); if(rs.getString(3).equals("Enabled")) setdeleteBtOn(); else setdeleteBtOff();
            rs.absolute(7); if(rs.getString(3).equals("Enabled")) setexitBtOn(); else setexitBtOff();
            rs.absolute(8); if(rs.getString(3).equals("Enabled")) setupdateBtOn(); else setupdateBtOff();
            rs.absolute(9); if(rs.getString(3).equals("Enabled")) setsuperuserBtOn(); else setsuperuserBtOff();
            rs.absolute(10); if(rs.getString(3).equals("Enabled")) setsplashBtOn(); else setsplashBtOff();
            rs.absolute(11); if(rs.getString(3).equals("Enabled")) {setsecurityBtOn(); pf_pass.setEnabled(true);} else {setsecurityBtOff(); pf_pass.setEnabled(false);}
            rs.absolute(12); if(rs.getString(3).equals("Enabled")) setautoBtOn(); else setautoBtOff();
            rs = st.executeQuery("Select const from properties where id = 'pass';"); rs.next();
            pf_pass.setText(rs.getString(1));
            
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
    }
    
    private void bt_backupdisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backupdisableActionPerformed
        setbackupBtOff();
    }//GEN-LAST:event_bt_backupdisableActionPerformed

    private void bt_backupenableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backupenableActionPerformed
        setbackupBtOn();
    }//GEN-LAST:event_bt_backupenableActionPerformed

    private void pn_backupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_backupMouseClicked
        if(lb_backup.getText().equals("Disabled")) setbackupBtOn();
        else setbackupBtOff();
    }//GEN-LAST:event_pn_backupMouseClicked
    public void setbackupBtOn() {
       pn_backup.setLayout(null); pn_backup.setBackground(new Color(0,204,153)); bt_backupenable.setVisible(false); bt_backupdisable.setVisible(true); bt_backupdisable.setBounds(35, 0, 20, 17); lb_backup.setText("Enabled"); 
    }
    public void setbackupBtOff() {
        pn_backup.setLayout(null); pn_backup.setBackground(new Color(120,120,120)); bt_backupdisable.setVisible(false); bt_backupenable.setVisible(true); bt_backupenable.setBounds(0, 0, 20, 17); lb_backup.setText("Disabled");
    }
    
    private void bt_logindisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_logindisableActionPerformed
        setloginBtOff();
    }//GEN-LAST:event_bt_logindisableActionPerformed

    private void bt_loginenableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginenableActionPerformed
        setloginBtOn();
    }//GEN-LAST:event_bt_loginenableActionPerformed

    private void pn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_loginMouseClicked
        if(lb_login.getText().equals("Disabled")) setloginBtOn();
        else setloginBtOff();
    }//GEN-LAST:event_pn_loginMouseClicked
    public void setloginBtOn() {
       pn_login.setLayout(null); pn_login.setBackground(new Color(0,204,153)); bt_loginenable.setVisible(false); bt_logindisable.setVisible(true); bt_logindisable.setBounds(35, 0, 20, 17); lb_login.setText("Enabled"); 
    }
    public void setloginBtOff() {
        pn_login.setLayout(null); pn_login.setBackground(new Color(120,120,120)); bt_logindisable.setVisible(false); bt_loginenable.setVisible(true); bt_loginenable.setBounds(0, 0, 20, 17); lb_login.setText("Disabled");
    }
    
    private void bt_timerdisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timerdisableActionPerformed
        settimerBtOff();
    }//GEN-LAST:event_bt_timerdisableActionPerformed

    private void bt_timerenableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timerenableActionPerformed
        settimerBtOn();
    }//GEN-LAST:event_bt_timerenableActionPerformed

    private void pn_timerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_timerMouseClicked
        if(lb_timer.getText().equals("Disabled")) settimerBtOn();
        else settimerBtOff();
    }//GEN-LAST:event_pn_timerMouseClicked
    public void settimerBtOn() {
       pn_timer.setLayout(null); pn_timer.setBackground(new Color(0,204,153)); bt_timerenable.setVisible(false); bt_timerdisable.setVisible(true); bt_timerdisable.setBounds(35, 0, 20, 17); lb_timer.setText("Enabled"); 
    }
    public void settimerBtOff() {
        pn_timer.setLayout(null); pn_timer.setBackground(new Color(120,120,120)); bt_timerdisable.setVisible(false); bt_timerenable.setVisible(true); bt_timerenable.setBounds(0, 0, 20, 17); lb_timer.setText("Disabled");
    }
    
    private void bt_imagedisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_imagedisableActionPerformed
        setimageBtOff();
    }//GEN-LAST:event_bt_imagedisableActionPerformed

    private void bt_imageenableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_imageenableActionPerformed
        setimageBtOn();
    }//GEN-LAST:event_bt_imageenableActionPerformed

    private void pn_imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_imageMouseClicked
        if(lb_image.getText().equals("Disabled")) setimageBtOn();
        else setimageBtOff();
    }//GEN-LAST:event_pn_imageMouseClicked
    public void setimageBtOn() {
       pn_image.setLayout(null); pn_image.setBackground(new Color(0,204,153)); bt_imageenable.setVisible(false); bt_imagedisable.setVisible(true); bt_imagedisable.setBounds(35, 0, 20, 17); lb_image.setText("Enabled"); 
    }
    public void setimageBtOff() {
        pn_image.setLayout(null); pn_image.setBackground(new Color(120,120,120)); bt_imagedisable.setVisible(false); bt_imageenable.setVisible(true); bt_imageenable.setBounds(0, 0, 20, 17); lb_image.setText("Disabled");
    }
    
    private void bt_guestdisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guestdisableActionPerformed
        setguestBtOff();
    }//GEN-LAST:event_bt_guestdisableActionPerformed

    private void bt_guestenableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guestenableActionPerformed
        setguestBtOn();
    }//GEN-LAST:event_bt_guestenableActionPerformed

    private void pn_guestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_guestMouseClicked
        if(lb_guest.getText().equals("Disabled")) setguestBtOn();
        else setguestBtOff();
    }//GEN-LAST:event_pn_guestMouseClicked
    public void setguestBtOn() {
       pn_guest.setLayout(null); pn_guest.setBackground(new Color(0,204,153)); bt_guestenable.setVisible(false); bt_guestdisable.setVisible(true); bt_guestdisable.setBounds(35, 0, 20, 17); lb_guest.setText("Enabled"); 
    }
    public void setguestBtOff() {
        pn_guest.setLayout(null); pn_guest.setBackground(new Color(120,120,120)); bt_guestdisable.setVisible(false); bt_guestenable.setVisible(true); bt_guestenable.setBounds(0, 0, 20, 17); lb_guest.setText("Disabled");
    }
    
    private void bt_deletedisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deletedisableActionPerformed
        setdeleteBtOff();
    }//GEN-LAST:event_bt_deletedisableActionPerformed

    private void bt_deleteenableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteenableActionPerformed
        setdeleteBtOn();
    }//GEN-LAST:event_bt_deleteenableActionPerformed

    private void pn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_deleteMouseClicked
        if(lb_delete.getText().equals("Disabled")) setdeleteBtOn();
        else setdeleteBtOff();
    }//GEN-LAST:event_pn_deleteMouseClicked
    public void setdeleteBtOn() {
       pn_delete.setLayout(null); pn_delete.setBackground(new Color(0,204,153)); bt_deleteenable.setVisible(false); bt_deletedisable.setVisible(true); bt_deletedisable.setBounds(35, 0, 20, 17); lb_delete.setText("Enabled"); 
    }
    public void setdeleteBtOff() {
        pn_delete.setLayout(null); pn_delete.setBackground(new Color(120,120,120)); bt_deletedisable.setVisible(false); bt_deleteenable.setVisible(true); bt_deleteenable.setBounds(0, 0, 20, 17); lb_delete.setText("Disabled");
    }
    
    private void bt_exitdisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitdisableActionPerformed
        setexitBtOff();
    }//GEN-LAST:event_bt_exitdisableActionPerformed

    private void bt_exitenableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitenableActionPerformed
        setexitBtOn();
    }//GEN-LAST:event_bt_exitenableActionPerformed

    private void pn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_exitMouseClicked
        if(lb_exit.getText().equals("Disabled")) setexitBtOn();
        else setexitBtOff();
    }//GEN-LAST:event_pn_exitMouseClicked
    public void setexitBtOn() {
       pn_exit.setLayout(null); pn_exit.setBackground(new Color(0,204,153)); bt_exitenable.setVisible(false); bt_exitdisable.setVisible(true); bt_exitdisable.setBounds(35, 0, 20, 17); lb_exit.setText("Enabled"); 
    }
    public void setexitBtOff() {
        pn_exit.setLayout(null); pn_exit.setBackground(new Color(120,120,120)); bt_exitdisable.setVisible(false); bt_exitenable.setVisible(true); bt_exitenable.setBounds(0, 0, 20, 17); lb_exit.setText("Disabled");
    }
    
    private void bt_updatedisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_updatedisableActionPerformed
        setupdateBtOff();
    }//GEN-LAST:event_bt_updatedisableActionPerformed

    private void bt_updateenableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_updateenableActionPerformed
        setupdateBtOn();
    }//GEN-LAST:event_bt_updateenableActionPerformed

    private void pn_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_updateMouseClicked
        if(lb_update.getText().equals("Disabled")) setupdateBtOn();
        else setupdateBtOff();
    }//GEN-LAST:event_pn_updateMouseClicked
    public void setupdateBtOn() {
       pn_update.setLayout(null); pn_update.setBackground(new Color(0,204,153)); bt_updateenable.setVisible(false); bt_updatedisable.setVisible(true); bt_updatedisable.setBounds(35, 0, 20, 17); lb_update.setText("Enabled"); 
    }
    public void setupdateBtOff() {
        pn_update.setLayout(null); pn_update.setBackground(new Color(120,120,120)); bt_updatedisable.setVisible(false); bt_updateenable.setVisible(true); bt_updateenable.setBounds(0, 0, 20, 17); lb_update.setText("Disabled");
    }
    
    private void bt_backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backupActionPerformed
        db_client.TableEngine.Inner.takeBackup();
    }//GEN-LAST:event_bt_backupActionPerformed

    private void bt_superuserdisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_superuserdisableActionPerformed
        setsuperuserBtOff();
    }//GEN-LAST:event_bt_superuserdisableActionPerformed

    private void bt_superuserenableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_superuserenableActionPerformed
        setsuperuserBtOn();
    }//GEN-LAST:event_bt_superuserenableActionPerformed

    private void pn_superuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_superuserMouseClicked
        if(lb_superuser.getText().equals("Disabled")) setsuperuserBtOn();
        else setsuperuserBtOff();
    }//GEN-LAST:event_pn_superuserMouseClicked
    public void setsuperuserBtOn() {
       pn_superuser.setLayout(null); pn_superuser.setBackground(new Color(0,204,153)); bt_superuserenable.setVisible(false); bt_superuserdisable.setVisible(true); bt_superuserdisable.setBounds(35, 0, 20, 17); lb_superuser.setText("Enabled"); 
    }
    public void setsuperuserBtOff() {
        pn_superuser.setLayout(null); pn_superuser.setBackground(new Color(120,120,120)); bt_superuserdisable.setVisible(false); bt_superuserenable.setVisible(true); bt_superuserenable.setBounds(0, 0, 20, 17); lb_superuser.setText("Disabled");
    }
    
    private void bt_splashdisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_splashdisableActionPerformed
        setsplashBtOff();
    }//GEN-LAST:event_bt_splashdisableActionPerformed

    private void bt_splashenableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_splashenableActionPerformed
        setsplashBtOn();
    }//GEN-LAST:event_bt_splashenableActionPerformed

    private void pn_splashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_splashMouseClicked
        if(lb_splash.getText().equals("Disabled")) setsplashBtOn();
        else setsplashBtOff();
    }//GEN-LAST:event_pn_splashMouseClicked
    
    public void setsplashBtOn() {
       pn_splash.setLayout(null); pn_splash.setBackground(new Color(0,204,153)); bt_splashenable.setVisible(false); bt_splashdisable.setVisible(true); bt_splashdisable.setBounds(35, 0, 20, 17); lb_splash.setText("Enabled"); 
    }
    public void setsplashBtOff() {
        pn_splash.setLayout(null); pn_splash.setBackground(new Color(120,120,120)); bt_splashdisable.setVisible(false); bt_splashenable.setVisible(true); bt_splashenable.setBounds(0, 0, 20, 17); lb_splash.setText("Disabled");
    }
    
    private void bt_securitydisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_securitydisableActionPerformed
        setsecurityBtOff();
        if(lb_security.getText().equals("Enabled")) {pf_pass.setEnabled(true); lb_eye.setEnabled(true); bt_set.setEnabled(true);}
        else {pf_pass.setEnabled(false); lb_eye.setEnabled(false); bt_set.setEnabled(false);}
    }//GEN-LAST:event_bt_securitydisableActionPerformed

    private void bt_securityenableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_securityenableActionPerformed
        setsecurityBtOn();  
        if(lb_security.getText().equals("Enabled")) {pf_pass.setEnabled(true); lb_eye.setEnabled(true); bt_set.setEnabled(true);}
        else {pf_pass.setEnabled(false); lb_eye.setEnabled(false); bt_set.setEnabled(false);}
    }//GEN-LAST:event_bt_securityenableActionPerformed

    private void pn_securityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_securityMouseClicked
        if(lb_security.getText().equals("Disabled")) setsecurityBtOn();
        else setsecurityBtOff();
        if(lb_security.getText().equals("Enabled")) {pf_pass.setEnabled(true); lb_eye.setEnabled(true); bt_set.setEnabled(true);}
        else {pf_pass.setEnabled(false); lb_eye.setEnabled(false); bt_set.setEnabled(false);}
    }//GEN-LAST:event_pn_securityMouseClicked
 
    public void setsecurityBtOn() {
       pn_security.setLayout(null); pn_security.setBackground(new Color(0,204,153)); bt_securityenable.setVisible(false); bt_securitydisable.setVisible(true); bt_securitydisable.setBounds(35, 0, 20, 17); lb_security.setText("Enabled"); 
    }
    public void setsecurityBtOff() {
        pn_security.setLayout(null); pn_security.setBackground(new Color(120,120,120)); bt_securitydisable.setVisible(false); bt_securityenable.setVisible(true); bt_securityenable.setBounds(0, 0, 20, 17); lb_security.setText("Disabled");
    }
    
    private void bt_autodisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_autodisableActionPerformed
        setautoBtOff();
    }//GEN-LAST:event_bt_autodisableActionPerformed

    private void bt_autoenableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_autoenableActionPerformed
        setautoBtOn();
    }//GEN-LAST:event_bt_autoenableActionPerformed

    private void pn_autoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_autoMouseClicked
        if(lb_auto.getText().equals("Disabled")) setautoBtOn();
        else setautoBtOff();
    }//GEN-LAST:event_pn_autoMouseClicked

    private void lb_eyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_eyeMouseClicked
        if(clicked) {pf_pass.setEchoChar('*'); clicked=false;}
        else {pf_pass.setEchoChar((char)0); clicked=true;}
        pf_pass.setText(new String(pf_pass.getPassword()));
    }//GEN-LAST:event_lb_eyeMouseClicked

    private void bt_setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_setActionPerformed
        try {
            st.executeUpdate("update properties set const = '"+new String(pf_pass.getPassword())+"' where id = 'pass';");
        } catch(Exception e) {e.printStackTrace();}
    }//GEN-LAST:event_bt_setActionPerformed

    private void bt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_updateActionPerformed
        manualUpdate();
    }//GEN-LAST:event_bt_updateActionPerformed
    public void manualUpdate() {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getDefaultDirectory());
        jfc.setDialogTitle("Select Update File"); jfc.setApproveButtonText("Select");
        if(jfc.showOpenDialog(null) == 0) db_client.TableEngine.Inner.checkForUpdates(jfc.getSelectedFile());
    }
    public void setautoBtOn() {
       pn_auto.setLayout(null); pn_auto.setBackground(new Color(0,204,153)); bt_autoenable.setVisible(false); bt_autodisable.setVisible(true); bt_autodisable.setBounds(35, 0, 20, 17); lb_auto.setText("Enabled"); 
    }
    public void setautoBtOff() {
        pn_auto.setLayout(null); pn_auto.setBackground(new Color(120,120,120)); bt_autodisable.setVisible(false); bt_autoenable.setVisible(true); bt_autoenable.setBounds(0, 0, 20, 17); lb_auto.setText("Disabled");
    }
    
    static void setOptionValues() {
        try {
        st.executeUpdate("update gen_settings set status = '"+lb_backup.getText()+"' where Sno = 1;");
        st.executeUpdate("update gen_settings set status = '"+lb_login.getText()+"' where Sno = 2;");
        st.executeUpdate("update gen_settings set status = '"+lb_timer.getText()+"' where Sno = 3;");
        st.executeUpdate("update gen_settings set status = '"+lb_image.getText()+"' where Sno = 4;");
        st.executeUpdate("update gen_settings set status = '"+lb_guest.getText()+"' where Sno = 5;");
        st.executeUpdate("update gen_settings set status = '"+lb_delete.getText()+"' where Sno = 6;");
        st.executeUpdate("update gen_settings set status = '"+lb_exit.getText()+"' where Sno = 7;");
        st.executeUpdate("update gen_settings set status = '"+lb_update.getText()+"' where Sno = 8;");      
        st.executeUpdate("update gen_settings set status = '"+lb_superuser.getText()+"' where Sno = 9;");
        st.executeUpdate("update gen_settings set status = '"+lb_splash.getText()+"' where Sno = 10;");      
        st.executeUpdate("update gen_settings set status = '"+lb_security.getText()+"' where Sno = 11;");
        st.executeUpdate("update gen_settings set status = '"+lb_auto.getText()+"' where Sno = 12;");  
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_autodisable;
    private javax.swing.JButton bt_autoenable;
    private javax.swing.JButton bt_backup;
    private javax.swing.JButton bt_backupdisable;
    private javax.swing.JButton bt_backupenable;
    private javax.swing.JButton bt_deletedisable;
    private javax.swing.JButton bt_deleteenable;
    private javax.swing.JButton bt_exitdisable;
    private javax.swing.JButton bt_exitenable;
    private javax.swing.JButton bt_guestdisable;
    private javax.swing.JButton bt_guestenable;
    private javax.swing.JButton bt_imagedisable;
    private javax.swing.JButton bt_imageenable;
    private javax.swing.JButton bt_logindisable;
    private javax.swing.JButton bt_loginenable;
    private javax.swing.JButton bt_securitydisable;
    private javax.swing.JButton bt_securityenable;
    private javax.swing.JButton bt_set;
    private javax.swing.JButton bt_splashdisable;
    private javax.swing.JButton bt_splashenable;
    private javax.swing.JButton bt_superuserdisable;
    private javax.swing.JButton bt_superuserenable;
    private javax.swing.JButton bt_timerdisable;
    private javax.swing.JButton bt_timerenable;
    private javax.swing.JButton bt_update;
    private javax.swing.JButton bt_updatedisable;
    private javax.swing.JButton bt_updateenable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lb_auto;
    public static javax.swing.JLabel lb_backup;
    public static javax.swing.JLabel lb_delete;
    public static javax.swing.JLabel lb_exit;
    private javax.swing.JLabel lb_eye;
    public static javax.swing.JLabel lb_guest;
    public static javax.swing.JLabel lb_image;
    public static javax.swing.JLabel lb_login;
    public static javax.swing.JLabel lb_security;
    public static javax.swing.JLabel lb_splash;
    public static javax.swing.JLabel lb_superuser;
    public static javax.swing.JLabel lb_timer;
    public static javax.swing.JLabel lb_update;
    private javax.swing.JPasswordField pf_pass;
    private javax.swing.JPanel pn;
    private javax.swing.JPanel pn_auto;
    private javax.swing.JPanel pn_backup;
    private javax.swing.JPanel pn_delete;
    private javax.swing.JPanel pn_exit;
    private javax.swing.JPanel pn_guest;
    private javax.swing.JPanel pn_image;
    private javax.swing.JPanel pn_login;
    private javax.swing.JPanel pn_security;
    private javax.swing.JPanel pn_splash;
    private javax.swing.JPanel pn_superuser;
    private javax.swing.JPanel pn_timer;
    private javax.swing.JPanel pn_update;
    // End of variables declaration//GEN-END:variables
}
