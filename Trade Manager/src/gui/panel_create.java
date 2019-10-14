package gui;

import static gui.Init.rs;
import static gui.Init.rs1;
import static gui.Init.st;
import static gui.Init.st1;
import javax.swing.ButtonGroup;

public class panel_create extends javax.swing.JPanel {
    ButtonGroup bg;
    Thread t;
    boolean bt_ck=true, bt_mb=true, bt_al=true, bt_user=true; int temp;
    
    public panel_create() {
        initComponents();
        bg = new ButtonGroup(); rb_male.setActionCommand("male"); rb_female.setActionCommand("female"); bg.add(rb_male); bg.add(rb_female); rb_male.setSelected(true);
        al_mob.setVisible(false); al_almob.setVisible(false); al_user.setVisible(false); al_down.setVisible(false);
        lb_mobileErr.setVisible(false); lb_userErr.setVisible(false); lb_altErr.setVisible(false); lb_err.setVisible(false);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        pf_pass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        tf_user = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        tf_mn = new javax.swing.JTextField();
        rb_female = new javax.swing.JRadioButton();
        rb_male = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        tf_fn = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        tf_ln = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        tf_al = new javax.swing.JTextField();
        lb_altErr = new javax.swing.JLabel();
        al_almob = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        checkBox = new javax.swing.JCheckBox();
        lb_userErr = new javax.swing.JLabel();
        lb_mobileErr = new javax.swing.JLabel();
        al_mob = new javax.swing.JLabel();
        al_user = new javax.swing.JLabel();
        bt_create = new javax.swing.JButton();
        lb_err = new javax.swing.JLabel();
        al_down = new javax.swing.JLabel();

        setBackground(new java.awt.Color(60, 60, 60));
        setPreferredSize(new java.awt.Dimension(953, 550));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.jLabel7.text")); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel7.setBackground(new java.awt.Color(90, 90, 90));
        jPanel7.setFocusCycleRoot(true);
        jPanel7.setFocusTraversalPolicyProvider(true);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.jLabel3.text")); // NOI18N

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.jLabel2.text")); // NOI18N

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.jLabel1.text")); // NOI18N

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.jLabel6.text")); // NOI18N

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.jLabel8.text")); // NOI18N

        jPanel6.setBackground(new java.awt.Color(80, 80, 80));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        pf_pass.setBackground(new java.awt.Color(80, 80, 80));
        pf_pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pf_pass.setForeground(new java.awt.Color(240, 240, 240));
        pf_pass.setText(org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.pf_pass.text")); // NOI18N
        pf_pass.setBorder(null);
        pf_pass.setCaretColor(null);
        pf_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pf_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pf_passFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(pf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(80, 80, 80));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tf_user.setBackground(new java.awt.Color(80, 80, 80));
        tf_user.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        tf_user.setForeground(new java.awt.Color(240, 240, 240));
        tf_user.setText(org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.jTextField3.text")); // NOI18N
        tf_user.setBorder(null);
        tf_user.setCaretColor(null);
        tf_user.setMargin(new java.awt.Insets(1, 5, 1, 1));
        tf_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_userFocusLost(evt);
            }
        });
        tf_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_userKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(80, 80, 80));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tf_mn.setBackground(new java.awt.Color(80, 80, 80));
        tf_mn.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        tf_mn.setForeground(new java.awt.Color(240, 240, 240));
        tf_mn.setText(org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.tf_mn.text")); // NOI18N
        tf_mn.setBorder(null);
        tf_mn.setCaretColor(null);
        tf_mn.setMargin(new java.awt.Insets(1, 5, 1, 1));
        tf_mn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_mnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_mnFocusLost(evt);
            }
        });
        tf_mn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_mnKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(tf_mn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tf_mn, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        rb_female.setBackground(new java.awt.Color(80, 80, 80));
        rb_female.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        rb_female.setForeground(new java.awt.Color(240, 240, 240));
        org.openide.awt.Mnemonics.setLocalizedText(rb_female, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.rb_female.text")); // NOI18N
        rb_female.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        rb_female.setBorderPainted(true);
        rb_female.setFocusPainted(false);

        rb_male.setBackground(new java.awt.Color(80, 80, 80));
        rb_male.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        rb_male.setForeground(new java.awt.Color(240, 240, 240));
        rb_male.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(rb_male, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.rb_male.text")); // NOI18N
        rb_male.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        rb_male.setBorderPainted(true);
        rb_male.setFocusPainted(false);

        jPanel5.setBackground(new java.awt.Color(80, 80, 80));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tf_fn.setBackground(new java.awt.Color(80, 80, 80));
        tf_fn.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        tf_fn.setForeground(new java.awt.Color(240, 240, 240));
        tf_fn.setText(org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.tf_fn.text")); // NOI18N
        tf_fn.setBorder(null);
        tf_fn.setCaretColor(null);
        tf_fn.setMargin(new java.awt.Insets(1, 5, 1, 1));
        tf_fn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_fnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_fnFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(tf_fn, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tf_fn)
        );

        jPanel3.setBackground(new java.awt.Color(80, 80, 80));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tf_ln.setBackground(new java.awt.Color(80, 80, 80));
        tf_ln.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        tf_ln.setForeground(new java.awt.Color(240, 240, 240));
        tf_ln.setText(org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.tf_ln.text")); // NOI18N
        tf_ln.setBorder(null);
        tf_ln.setCaretColor(null);
        tf_ln.setMargin(new java.awt.Insets(1, 5, 1, 1));
        tf_ln.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_lnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_lnFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(tf_ln, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tf_ln, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.jLabel4.text")); // NOI18N

        jPanel8.setBackground(new java.awt.Color(100, 100, 100));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.jPanel8.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(255, 153, 153));

        jLabel11.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel11, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.jLabel11.text")); // NOI18N

        jPanel9.setBackground(new java.awt.Color(80, 80, 80));

        tf_al.setBackground(new java.awt.Color(80, 80, 80));
        tf_al.setColumns(10);
        tf_al.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        tf_al.setForeground(new java.awt.Color(240, 240, 240));
        tf_al.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_al.setText(org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.tf_al.text")); // NOI18N
        tf_al.setBorder(null);
        tf_al.setCaretColor(null);
        tf_al.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_alFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_alFocusLost(evt);
            }
        });
        tf_al.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_alKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(tf_al, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(tf_al, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        lb_altErr.setBackground(new java.awt.Color(70, 70, 70));
        lb_altErr.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lb_altErr.setForeground(new java.awt.Color(255, 0, 0));
        lb_altErr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(lb_altErr, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.lb_altErr.text")); // NOI18N
        lb_altErr.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lb_altErr.setOpaque(true);

        al_almob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/alert-20.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(al_almob, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.al_almob.text")); // NOI18N
        al_almob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                al_almobMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(al_almob)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_altErr, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(al_almob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_altErr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 204, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 255, 102));

        checkBox.setBackground(new java.awt.Color(102, 102, 102));
        checkBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkBox.setForeground(new java.awt.Color(0, 255, 204));
        checkBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(checkBox, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.checkBox.text")); // NOI18N
        checkBox.setBorder(null);
        checkBox.setFocusPainted(false);
        checkBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkBox.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        checkBox.setIconTextGap(15);
        checkBox.setMargin(new java.awt.Insets(2, 5, 2, 2));
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });

        lb_userErr.setBackground(new java.awt.Color(70, 70, 70));
        lb_userErr.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lb_userErr.setForeground(new java.awt.Color(255, 0, 0));
        lb_userErr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(lb_userErr, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.lb_err.text")); // NOI18N
        lb_userErr.setOpaque(true);

        lb_mobileErr.setBackground(new java.awt.Color(70, 70, 70));
        lb_mobileErr.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lb_mobileErr.setForeground(new java.awt.Color(255, 0, 0));
        lb_mobileErr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(lb_mobileErr, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.lb_err.text")); // NOI18N
        lb_mobileErr.setOpaque(true);

        al_mob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/alert-20.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(al_mob, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.al_mob.text")); // NOI18N
        al_mob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                al_mobMouseClicked(evt);
            }
        });

        al_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/alert-20.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(al_user, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.al_user.text")); // NOI18N
        al_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                al_userMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(23, 23, 23))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(24, 24, 24)))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_female, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rb_male, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(al_user))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(al_mob)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lb_mobileErr, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                            .addComponent(lb_userErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addComponent(jLabel8)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(rb_male, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_female, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(al_mob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_mobileErr, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_userErr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(al_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        bt_create.setBackground(new java.awt.Color(0, 177, 106));
        bt_create.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bt_create.setForeground(new java.awt.Color(255, 255, 255));
        bt_create.setIcon(new javax.swing.ImageIcon("C:\\Users\\student\\Downloads\\download-16.png")); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(bt_create, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.bt_create.text")); // NOI18N
        bt_create.setBorderPainted(false);
        bt_create.setFocusPainted(false);
        bt_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_createActionPerformed(evt);
            }
        });

        lb_err.setBackground(new java.awt.Color(50, 50, 50));
        lb_err.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lb_err.setForeground(new java.awt.Color(255, 0, 0));
        lb_err.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(lb_err, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.lb_err.text")); // NOI18N
        lb_err.setOpaque(true);

        al_down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/alert-20.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(al_down, org.openide.util.NbBundle.getMessage(panel_create.class, "panel_create.al_down.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(bt_create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(681, 681, 681))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(al_down)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_err, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(al_down, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_err, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_create)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents
       
    private void tf_fnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_fnFocusGained
        if(tf_fn.getText().equals("First Name")) {
            tf_fn.setText("");
        }
    }//GEN-LAST:event_tf_fnFocusGained

    private void tf_fnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_fnFocusLost
        if(tf_fn.getText().equals("")) {
            tf_fn.setText("First Name");
        }
    }//GEN-LAST:event_tf_fnFocusLost

    private void tf_lnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_lnFocusGained
        if(tf_ln.getText().equals("Last Name")) {
            tf_ln.setText("");
        }
    }//GEN-LAST:event_tf_lnFocusGained

    private void tf_lnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_lnFocusLost
        if(tf_ln.getText().equals("")) {
            tf_ln.setText("Last Name");
        } 
    }//GEN-LAST:event_tf_lnFocusLost

    private void tf_mnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_mnFocusGained
        if(tf_mn.getText().equals("Mobile Number")) {
            tf_mn.setText("");
        }
    }//GEN-LAST:event_tf_mnFocusGained

    private void tf_mnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_mnFocusLost
        if(tf_mn.getText().equals("")) {
            tf_mn.setText("Mobile Number");
        }
    }//GEN-LAST:event_tf_mnFocusLost

    private void tf_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_userFocusGained
        if(tf_user.getText().equals("Username")) {
            tf_user.setText("");
        }
    }//GEN-LAST:event_tf_userFocusGained

    private void tf_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_userFocusLost
        if(tf_user.getText().equals("")) {
            tf_user.setText("Username");
        }
    }//GEN-LAST:event_tf_userFocusLost

    private void pf_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf_passFocusGained
        String s = new String(pf_pass.getPassword());
        if(s.equals("passdd")) {
            pf_pass.setText("");
        }
    }//GEN-LAST:event_pf_passFocusGained

    private void pf_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf_passFocusLost
        String s = new String(pf_pass.getPassword());
        if(s.equals("")) {
            pf_pass.setText("passdd");
        }
    }//GEN-LAST:event_pf_passFocusLost

    private void tf_alFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_alFocusGained
       if(tf_al.getText().equals("Mobile Number")) {
            tf_al.setText("");
        }
    }//GEN-LAST:event_tf_alFocusGained

    private void tf_alFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_alFocusLost
        if(tf_al.getText().equals("")) {
            tf_al.setText("Mobile Number");
        }
    }//GEN-LAST:event_tf_alFocusLost

    private void bt_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_createActionPerformed
        String fname = tf_fn.getText(); String lname = tf_ln.getText(); String user = tf_user.getText(); char[] arr = pf_pass.getPassword();
        String pass = new String(arr); String mobile = tf_mn.getText(); String alt = tf_al.getText();
        
        if(validateData(fname, lname, user, pass, mobile, alt)) return;
         try { int i=1;
             rs = st.executeQuery("select * from user_details order by sno asc;");
             while(rs.next()) {
                  st1.executeUpdate("update user_details set sno = "+i+" where sno = "+rs.getInt(1)+" ;"); i++;
             }
             st.executeUpdate("insert into user_details values("+i+", '"+fname+"', '"+lname+"', '"+(bg.getSelection().getActionCommand().equals("male") ? "M" : "F")+"', "+mobile+", '"+user+"', '"+pass+"', "+alt+", "+1+", '1100');");
             st.executeUpdate("insert into user_images(username) values('"+user+"');");
             homePage.setButtonAdmin();
         }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
    }//GEN-LAST:event_bt_createActionPerformed

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
        if(checkBox.isSelected()) {bt_ck = true; setButtonState();}
        else {bt_ck = false; setButtonState();}
    }//GEN-LAST:event_checkBoxActionPerformed

    private void tf_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_userKeyReleased
        checkForUserName();
    }//GEN-LAST:event_tf_userKeyReleased

    private void tf_mnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_mnKeyReleased
        checkForMobileNo(tf_mn.getText());        
    }//GEN-LAST:event_tf_mnKeyReleased

    private void tf_alKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_alKeyReleased
        checkForAltNo(tf_al.getText());
    }//GEN-LAST:event_tf_alKeyReleased

    private void al_mobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_al_mobMouseClicked
        lb_mobileErr.setText("Mobile Number must be consist of Integer only"); lb_mobileErr.setVisible(true);
    }//GEN-LAST:event_al_mobMouseClicked

    private void al_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_al_userMouseClicked
        lb_userErr.setText(tf_user.getText()+" already exists !!"); lb_userErr.setVisible(true);
    }//GEN-LAST:event_al_userMouseClicked

    private void al_almobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_al_almobMouseClicked
        lb_altErr.setText("Mobile Number must be of Integer only."); lb_altErr.setVisible(true);
    }//GEN-LAST:event_al_almobMouseClicked

    private void checkForMobileNo(String data) {
            for(int i=0; i<data.length(); i++) {
                if(data.charAt(i) > 47 && data.charAt(i) < 58) temp = 1;
                else {temp = 0; break;}
            }
            if(temp == 1) {bt_mb = true; lb_mobileErr.setText(""); setButtonState(); al_mob.setVisible(false); lb_mobileErr.setVisible(false);}
            else {bt_mb = false; al_mob.setVisible(true); al_mob.setToolTipText("Mobile Number must be consist of Integer only."); setButtonState();}
    }
    private void checkForAltNo(String data) {
            for(int i=0; i<data.length(); i++) {
                if(data.charAt(i) > 47 && data.charAt(i) < 58) temp = 1;
                else {temp = 0; break;}
            }
            if(temp == 1) {bt_al = true; lb_altErr.setText(""); setButtonState(); al_almob.setVisible(false); lb_altErr.setVisible(false);}
            else {bt_al = false; al_almob.setVisible(true); al_almob.setToolTipText("Mobile Number must be consist of Integer only."); setButtonState();}
    }
    private void setButtonState() {
        if(bt_mb && bt_al && bt_ck && bt_user) bt_create.setEnabled(true);
        else bt_create.setEnabled(false);
    }
    private void checkForUserName() {
        try {
            rs1 = st.executeQuery("select username from user_details;");
            while(rs1.next()) {
                if(rs1.getString(1).equalsIgnoreCase(tf_user.getText())) { al_user.setVisible(true); al_user.setToolTipText(tf_user.getText()+" already exists !!");  bt_user=false; setButtonState(); return;}
                else {bt_user=true; al_user.setVisible(false); lb_userErr.setVisible(false); setButtonState(); lb_userErr.setText("");}
            }
            
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
    }    
    private boolean validateData(String fname, String lname, String user, String pass, String mobile, String alt) {
        if(fname.equals("First Name") || lname.equals("Last Name") || mobile.equals("Mobile Number") || user.equals("Username") || pass.equals("passdd") || alt.equals("Mobile Number")) { al_down.setVisible(true); lb_err.setText("Enter your Details Correctly !!"); lb_err.setVisible(true); return true; }
        else {lb_err.setText(""); al_down.setVisible(false); return false; }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel al_almob;
    private javax.swing.JLabel al_down;
    private javax.swing.JLabel al_mob;
    private javax.swing.JLabel al_user;
    private javax.swing.JButton bt_create;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_altErr;
    private javax.swing.JLabel lb_err;
    private javax.swing.JLabel lb_mobileErr;
    private javax.swing.JLabel lb_userErr;
    private javax.swing.JPasswordField pf_pass;
    private javax.swing.JRadioButton rb_female;
    private javax.swing.JRadioButton rb_male;
    private javax.swing.JTextField tf_al;
    private javax.swing.JTextField tf_fn;
    private javax.swing.JTextField tf_ln;
    private javax.swing.JTextField tf_mn;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}


