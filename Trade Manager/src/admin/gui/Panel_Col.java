package admin.gui;

import static gui.Init.st;
import static gui.Init.st1;
import static gui.Init.rs;
import gui.homePage;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

public class Panel_Col extends javax.swing.JPanel {
    ButtonGroup bg, col_bg;
    DefaultTableModel md;
    
    public Panel_Col() {
        initComponents(); bg = new ButtonGroup(); col_bg = new ButtonGroup();
         setColRadioButtons(); setRadioButtons(); setrb_moneyButton();
         setColumnNames(bg.getSelection().getActionCommand());        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rb_money = new javax.swing.JRadioButton();
        rb_sew = new javax.swing.JRadioButton();
        rb_raw = new javax.swing.JRadioButton();
        rb_ready = new javax.swing.JRadioButton();
        rb_merchant = new javax.swing.JRadioButton();
        rb_rawMat = new javax.swing.JRadioButton();
        rb_sewDetails = new javax.swing.JRadioButton();
        rb_rawDetails = new javax.swing.JRadioButton();
        rb_merDetails = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lb_up = new javax.swing.JLabel();
        lb_after = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        cb2 = new javax.swing.JComboBox<>();
        bt_save = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        lb_opt = new javax.swing.JLabel();
        sep = new javax.swing.JSeparator();
        lb_down = new javax.swing.JLabel();
        cb = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rb_add = new javax.swing.JRadioButton();
        rb_remove = new javax.swing.JRadioButton();
        rb_rename = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(50, 50, 50));
        setPreferredSize(new java.awt.Dimension(955, 696));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(200, 200, 200));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.jLabel4.text")); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(70, 70, 70));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.jLabel5.text")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(80, 80, 80));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        rb_money.setBackground(new java.awt.Color(80, 80, 80));
        rb_money.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb_money.setForeground(new java.awt.Color(200, 200, 200));
        org.openide.awt.Mnemonics.setLocalizedText(rb_money, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.rb_money.text")); // NOI18N
        rb_money.setBorder(null);
        rb_money.setContentAreaFilled(false);
        rb_money.setFocusPainted(false);
        rb_money.setFocusable(false);
        rb_money.setRequestFocusEnabled(false);
        rb_money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_moneyActionPerformed(evt);
            }
        });

        rb_sew.setBackground(new java.awt.Color(80, 80, 80));
        rb_sew.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb_sew.setForeground(new java.awt.Color(200, 200, 200));
        org.openide.awt.Mnemonics.setLocalizedText(rb_sew, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.rb_money.text")); // NOI18N
        rb_sew.setBorder(null);
        rb_sew.setContentAreaFilled(false);
        rb_sew.setFocusPainted(false);
        rb_sew.setFocusable(false);
        rb_sew.setRequestFocusEnabled(false);
        rb_sew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_sewActionPerformed(evt);
            }
        });

        rb_raw.setBackground(new java.awt.Color(80, 80, 80));
        rb_raw.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb_raw.setForeground(new java.awt.Color(200, 200, 200));
        org.openide.awt.Mnemonics.setLocalizedText(rb_raw, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.rb_raw.text")); // NOI18N
        rb_raw.setBorder(null);
        rb_raw.setContentAreaFilled(false);
        rb_raw.setFocusPainted(false);
        rb_raw.setFocusable(false);
        rb_raw.setRequestFocusEnabled(false);
        rb_raw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_rawActionPerformed(evt);
            }
        });

        rb_ready.setBackground(new java.awt.Color(80, 80, 80));
        rb_ready.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb_ready.setForeground(new java.awt.Color(200, 200, 200));
        org.openide.awt.Mnemonics.setLocalizedText(rb_ready, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.rb_ready.text")); // NOI18N
        rb_ready.setBorder(null);
        rb_ready.setContentAreaFilled(false);
        rb_ready.setFocusPainted(false);
        rb_ready.setFocusable(false);
        rb_ready.setRequestFocusEnabled(false);
        rb_ready.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_readyActionPerformed(evt);
            }
        });

        rb_merchant.setBackground(new java.awt.Color(80, 80, 80));
        rb_merchant.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb_merchant.setForeground(new java.awt.Color(200, 200, 200));
        org.openide.awt.Mnemonics.setLocalizedText(rb_merchant, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.rb_merchant.text")); // NOI18N
        rb_merchant.setBorder(null);
        rb_merchant.setContentAreaFilled(false);
        rb_merchant.setFocusPainted(false);
        rb_merchant.setFocusable(false);
        rb_merchant.setRequestFocusEnabled(false);
        rb_merchant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_merchantActionPerformed(evt);
            }
        });

        rb_rawMat.setBackground(new java.awt.Color(80, 80, 80));
        rb_rawMat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb_rawMat.setForeground(new java.awt.Color(200, 200, 200));
        org.openide.awt.Mnemonics.setLocalizedText(rb_rawMat, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.rb_rawMat.text")); // NOI18N
        rb_rawMat.setBorder(null);
        rb_rawMat.setContentAreaFilled(false);
        rb_rawMat.setFocusPainted(false);
        rb_rawMat.setFocusable(false);
        rb_rawMat.setRequestFocusEnabled(false);
        rb_rawMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_rawMatActionPerformed(evt);
            }
        });

        rb_sewDetails.setBackground(new java.awt.Color(80, 80, 80));
        rb_sewDetails.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb_sewDetails.setForeground(new java.awt.Color(200, 200, 200));
        org.openide.awt.Mnemonics.setLocalizedText(rb_sewDetails, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.rb_sewDetails.text")); // NOI18N
        rb_sewDetails.setBorder(null);
        rb_sewDetails.setContentAreaFilled(false);
        rb_sewDetails.setFocusPainted(false);
        rb_sewDetails.setFocusable(false);
        rb_sewDetails.setRequestFocusEnabled(false);
        rb_sewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_sewDetailsActionPerformed(evt);
            }
        });

        rb_rawDetails.setBackground(new java.awt.Color(80, 80, 80));
        rb_rawDetails.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb_rawDetails.setForeground(new java.awt.Color(200, 200, 200));
        org.openide.awt.Mnemonics.setLocalizedText(rb_rawDetails, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.rb_rawDetails.text")); // NOI18N
        rb_rawDetails.setBorder(null);
        rb_rawDetails.setContentAreaFilled(false);
        rb_rawDetails.setFocusPainted(false);
        rb_rawDetails.setFocusable(false);
        rb_rawDetails.setRequestFocusEnabled(false);
        rb_rawDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_rawDetailsActionPerformed(evt);
            }
        });

        rb_merDetails.setBackground(new java.awt.Color(80, 80, 80));
        rb_merDetails.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb_merDetails.setForeground(new java.awt.Color(200, 200, 200));
        org.openide.awt.Mnemonics.setLocalizedText(rb_merDetails, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.rb_merDetails.text")); // NOI18N
        rb_merDetails.setBorder(null);
        rb_merDetails.setContentAreaFilled(false);
        rb_merDetails.setFocusPainted(false);
        rb_merDetails.setFocusable(false);
        rb_merDetails.setRequestFocusEnabled(false);
        rb_merDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_merDetailsActionPerformed(evt);
            }
        });

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
                    .addComponent(rb_rawMat)
                    .addComponent(rb_sewDetails)
                    .addComponent(rb_rawDetails)
                    .addComponent(rb_merDetails))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(11, 11, 11)
                .addComponent(rb_sewDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_rawDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_merDetails)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel9, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.jLabel9.text")); // NOI18N

        tab.setEditable(false);
        tab.setBackground(new java.awt.Color(80, 80, 80));
        tab.setColumns(20);
        tab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tab.setForeground(new java.awt.Color(0, 204, 204));
        tab.setLineWrap(true);
        tab.setRows(5);
        tab.setText(org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.tab.text")); // NOI18N
        tab.setBorder(null);
        tab.setFocusable(false);
        tab.setMargin(new java.awt.Insets(1, 10, 1, 1));
        tab.setRequestFocusEnabled(false);
        tab.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(tab);

        jSeparator2.setForeground(new java.awt.Color(158, 158, 158));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(13, 13, 13)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(65, 65, 65));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lb_up.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lb_up.setForeground(new java.awt.Color(255, 255, 255));
        lb_up.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(lb_up, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.lb_up.text")); // NOI18N

        lb_after.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lb_after.setForeground(new java.awt.Color(255, 255, 255));
        lb_after.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(lb_after, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.lb_after.text")); // NOI18N

        tf_name.setBackground(new java.awt.Color(70, 70, 70));
        tf_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_name.setForeground(new java.awt.Color(255, 255, 255));
        tf_name.setText(org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.tf_name.text")); // NOI18N
        tf_name.setCaretColor(new java.awt.Color(255, 255, 255));
        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });
        tf_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_nameKeyReleased(evt);
            }
        });

        cb2.setBackground(new java.awt.Color(50, 50, 50));
        cb2.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        cb2.setForeground(new java.awt.Color(190, 190, 190));
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Character", "Integer", "Decimal", "Date", "Long Integer" }));
        cb2.setBorder(null);
        cb2.setFocusable(false);
        cb2.setMinimumSize(new java.awt.Dimension(52, 15));
        cb2.setPreferredSize(new java.awt.Dimension(52, 15));
        cb2.setRequestFocusEnabled(false);
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        bt_save.setBackground(new java.awt.Color(43, 173, 92));
        bt_save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_save.setForeground(new java.awt.Color(255, 255, 255));
        bt_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/plus-16.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(bt_save, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.bt_save.text")); // NOI18N
        bt_save.setBorderPainted(false);
        bt_save.setFocusPainted(false);
        bt_save.setFocusable(false);
        bt_save.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveActionPerformed(evt);
            }
        });

        lb.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lb.setForeground(new java.awt.Color(255, 51, 51));
        org.openide.awt.Mnemonics.setLocalizedText(lb, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.lb.text_1")); // NOI18N

        lb_opt.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lb_opt.setForeground(new java.awt.Color(255, 255, 255));
        lb_opt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(lb_opt, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.lb_opt.text")); // NOI18N

        sep.setForeground(new java.awt.Color(158, 158, 158));

        lb_down.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lb_down.setForeground(new java.awt.Color(255, 255, 255));
        lb_down.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(lb_down, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.lb_down.text")); // NOI18N

        cb.setBackground(new java.awt.Color(50, 50, 50));
        cb.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        cb.setForeground(new java.awt.Color(190, 190, 190));
        cb.setBorder(null);
        cb.setFocusable(false);
        cb.setMinimumSize(new java.awt.Dimension(52, 15));
        cb.setPreferredSize(new java.awt.Dimension(52, 15));
        cb.setRequestFocusEnabled(false);
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_opt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sep)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_up, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_down, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_after, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_save))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_up, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_down, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lb_opt, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(sep, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_after, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(bt_save, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setRequestFocusEnabled(false);
        jSeparator3.setVerifyInputWhenFocusTarget(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.jLabel10.text")); // NOI18N

        jPanel4.setBackground(new java.awt.Color(70, 70, 70));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        rb_add.setBackground(new java.awt.Color(204, 204, 204));
        rb_add.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        rb_add.setForeground(new java.awt.Color(255, 255, 153));
        rb_add.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(rb_add, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.rb_add.text")); // NOI18N
        rb_add.setBorder(null);
        rb_add.setContentAreaFilled(false);
        rb_add.setFocusPainted(false);
        rb_add.setFocusable(false);
        rb_add.setRequestFocusEnabled(false);
        rb_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_addActionPerformed(evt);
            }
        });

        rb_remove.setBackground(new java.awt.Color(204, 204, 204));
        rb_remove.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        rb_remove.setForeground(new java.awt.Color(255, 255, 153));
        org.openide.awt.Mnemonics.setLocalizedText(rb_remove, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.rb_remove.text")); // NOI18N
        rb_remove.setBorder(null);
        rb_remove.setContentAreaFilled(false);
        rb_remove.setFocusPainted(false);
        rb_remove.setFocusable(false);
        rb_remove.setRequestFocusEnabled(false);
        rb_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_removeActionPerformed(evt);
            }
        });

        rb_rename.setBackground(new java.awt.Color(204, 204, 204));
        rb_rename.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        rb_rename.setForeground(new java.awt.Color(255, 255, 153));
        org.openide.awt.Mnemonics.setLocalizedText(rb_rename, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.rb_rename.text")); // NOI18N
        rb_rename.setBorder(null);
        rb_rename.setContentAreaFilled(false);
        rb_rename.setFocusPainted(false);
        rb_rename.setFocusable(false);
        rb_rename.setRequestFocusEnabled(false);
        rb_rename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_renameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(Panel_Col.class, "Panel_Col.jLabel6.text")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_rename)
                    .addComponent(rb_add)
                    .addComponent(rb_remove))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(rb_add)
                .addGap(10, 10, 10)
                .addComponent(rb_remove)
                .addGap(10, 10, 10)
                .addComponent(rb_rename)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void setInitialTableModel() {
        md=(DefaultTableModel)homePage.mt.table.getModel();
    }
    private void setColRadioButtons() {
        col_bg.add(rb_add); col_bg.add(rb_rename); col_bg.add(rb_remove);
    }
    private void setRadioButtons() {
        try { int i=0;
            rs = st.executeQuery("show tables;");
            while(rs.next()) ++i; rs.first();
            for(int j=0; j<i; j++) {
              switch(rs.getString(1)) { 
                case "money_tran" : rb_money.setText(homePage.button_mt.getText()); rb_money.setSelected(true); rb_money.setActionCommand("1"); break;
                case "emp_sew" : rb_sew.setText(homePage.button_sw.getText()); rb_sew.setActionCommand("2"); break;
                case "emp_raw" : rb_raw.setText(homePage.button_rw.getText()); rb_raw.setActionCommand("3"); break;
                case "ready_material" : rb_ready.setText(homePage.button_rm.getText()); rb_ready.setActionCommand("4"); break;
                case "merchant" : rb_merchant.setText(homePage.button_m.getText()); rb_merchant.setActionCommand("5"); break;
                case "raw_material" : rb_rawMat.setText(homePage.bt_raw.getText()); rb_rawMat.setActionCommand("6"); break;
                case "emp_sewdetails" : rb_sewDetails.setText(homePage.button_sw.getText()+" Details"); rb_sewDetails.setActionCommand("7"); break;
                case "emp_rawdetails" : rb_rawDetails.setText(homePage.button_rw.getText()+" Details"); rb_rawDetails.setActionCommand("8"); break;
                case "merchant_details" : rb_merDetails.setText(homePage.button_m.getText()+" Details"); rb_merDetails.setActionCommand("9"); break;
              } rs.next();
           } 
        }catch(Exception e) {e.printStackTrace(); homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
        bg.add(rb_money); bg.add(rb_sew); bg.add(rb_raw); bg.add(rb_ready); bg.add(rb_merchant); bg.add(rb_rawMat); bg.add(rb_sewDetails); bg.add(rb_rawDetails); bg.add(rb_merDetails); 
    }

    private void rb_moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_moneyActionPerformed
        setrb_moneyButton();
    }//GEN-LAST:event_rb_moneyActionPerformed
    private void setrb_moneyButton() {
        setColumnNames(rb_money.getActionCommand());
    }
    private void rb_sewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_sewActionPerformed
        setColumnNames(rb_sew.getActionCommand());
    }//GEN-LAST:event_rb_sewActionPerformed

    private void rb_rawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_rawActionPerformed
        setColumnNames(rb_raw.getActionCommand());
    }//GEN-LAST:event_rb_rawActionPerformed

    private void rb_readyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_readyActionPerformed
         setColumnNames(rb_ready.getActionCommand());
    }//GEN-LAST:event_rb_readyActionPerformed

    private void rb_merchantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_merchantActionPerformed
         setColumnNames(rb_merchant.getActionCommand());
    }//GEN-LAST:event_rb_merchantActionPerformed

    private void rb_rawMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_rawMatActionPerformed
         setColumnNames(rb_rawMat.getActionCommand());
    }//GEN-LAST:event_rb_rawMatActionPerformed

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
         
    }//GEN-LAST:event_tf_nameActionPerformed

    void setMessage(String s) {
        lb.setText(s);
    }
    
    private void bt_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saveActionPerformed
        if(bt_save.getText().equals("  Add Column")) addColumns(tf_name.getText(), cb.getSelectedItem().toString());  
         else if(bt_save.getText().equals("Remove Column")) removeColumns(cb2.getSelectedItem().toString());
         else if(bt_save.getText().equals("Rename Column")) {renameColumns(tf_name.getText(), cb2.getSelectedItem().toString()); }      
    }//GEN-LAST:event_bt_saveActionPerformed

    private void rb_sewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_sewDetailsActionPerformed
        setColumnNames(rb_sewDetails.getActionCommand());
    }//GEN-LAST:event_rb_sewDetailsActionPerformed

    private void rb_rawDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_rawDetailsActionPerformed
        setColumnNames(rb_rawDetails.getActionCommand());
    }//GEN-LAST:event_rb_rawDetailsActionPerformed

    private void rb_merDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_merDetailsActionPerformed
       setColumnNames(rb_merDetails.getActionCommand());
    }//GEN-LAST:event_rb_merDetailsActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void rb_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_addActionPerformed
        setMessage(""); tf_name.setText(""); lb_up.setText("Column Name :"); lb_up.setVisible(true); tf_name.setVisible(true); lb_down.setText("Column Type :"); cb2.setVisible(true); cb2.removeAllItems(); cb2.addItem("Character"); cb2.addItem("Integer"); cb2.addItem("Decimal"); cb2.addItem("Date"); cb2.addItem("Long Integer"); bt_save.setText("  Add Column");
        bt_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/plus-16.png"))); lb_opt.setVisible(true); sep.setVisible(true);lb_after.setVisible(true); lb_after.setText("After Column :"); cb.setVisible(true); setColumnNames(bg.getSelection().getActionCommand());
    }//GEN-LAST:event_rb_addActionPerformed

    private void rb_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_removeActionPerformed
       bt_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/forward-16.png"))); setMessage(""); tf_name.setText(""); lb_opt.setVisible(false); sep.setVisible(false); lb_up.setVisible(false); lb_after.setVisible(false); cb.setVisible(false); tf_name.setVisible(false); cb2.setVisible(true); bt_save.setText("Remove Column"); lb_down.setText("select Column"); setColumnNames(bg.getSelection().getActionCommand());
    }//GEN-LAST:event_rb_removeActionPerformed

    private void rb_renameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_renameActionPerformed
       bt_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/rename-16.png"))); setMessage(""); tf_name.setText(""); lb_opt.setVisible(false); sep.setVisible(false); lb_up.setVisible(true); tf_name.setVisible(true); lb_after.setVisible(false); cb.setVisible(false); lb_up.setText("Rename To :"); lb_down.setText("Rename From :"); bt_save.setText("Rename Column"); cb2.setVisible(true); setColumnNames(bg.getSelection().getActionCommand());
    }//GEN-LAST:event_rb_renameActionPerformed

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActionPerformed

    private void tf_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nameKeyReleased
 
    }//GEN-LAST:event_tf_nameKeyReleased
    
    boolean validateText() {
        String s = tf_name.getText();
        if(s == null || s.equals("")) {setMessage("Enter Column Name"); return true;}
        for(int i=0; i<md.getColumnCount(); i++) if(md.getColumnName(i).equalsIgnoreCase(s)) {setMessage(s+" already exists!"); return true;}
        if(s.charAt(0) > 47 && s.charAt(0) < 58) {setMessage("Column name must be start with alphabets only"); return true; }
        setMessage(" "); return false;
    }
    String getTableName() {
        switch(bg.getSelection().getActionCommand()) {
            case "1" : return "money_tran";
            case "2" : return "emp_sew";
            case "3" : return "emp_raw";
            case "4" : return "ready_material";
            case "5" : return "merchant";
            case "6" : return "raw_material";
            case "7" : return "emp_sewdetails";
            case "8" : return "emp_rawdetails";
            case "9" : return "merchant_details";
        } return "";
    }
    void removeColumns(String s) {
        try {
        switch(bg.getSelection().getActionCommand()) {
                case "1" : st.executeUpdate("alter table money_tran drop "+s+";"); break;
                case "2" : st.executeUpdate("alter table emp_sew drop "+s+";"); break;
                case "3" : st.executeUpdate("alter table emp_raw drop "+s+";"); break;
                case "4" : st.executeUpdate("alter table ready_material drop "+s+";"); break;
                case "5" : st.executeUpdate("alter table merchant drop "+s+";"); break;
                case "6" : st.executeUpdate("alter table raw_material drop "+s+";"); break;
                case "7" : st.executeUpdate("alter table emp_sewdetails drop "+s+";"); break;
                case "8" : st.executeUpdate("alter table emp_rawdetails drop "+s+";"); break;
                case "9" : st.executeUpdate("alter table merchant_details drop "+s+";"); break;
            } 
        refreshTable(bg.getSelection().getActionCommand()); setColumnNames(bg.getSelection().getActionCommand()); 
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
    }
    void renameColumns(String text, String item) {
            validateText();
            String table = getTableName();
            if(table.equals("") || table == null) return;
            String prev_col=null; String col_type_name=null;
            ArrayList<Object> sno= new ArrayList(); Object[] o=null; 
            try {
            rs = st.executeQuery("select "+item+" from "+table+" order by Sno asc;");
            while(rs.next()) sno.add(rs.getObject(1));
            o = sno.toArray();
            for(int i=1; i<md.getColumnCount(); i++) if(md.getColumnName(i).equalsIgnoreCase(item)) prev_col = md.getColumnName(i-1); 
            java.sql.ResultSetMetaData rsmd = rs.getMetaData();
            col_type_name = rsmd.getColumnTypeName(cb.getSelectedIndex()+1);
      //      System.out.println("\ntext. "+text+"\nitem. "+item+"\ntable. "+table+"\nprev_col. "+prev_col+"\nsno. "+sno+"\ncol_type_name. "+col_type_name);
            st.executeUpdate("alter table "+table+" drop "+item+";");
              switch(col_type_name) {
                  case "INT" : st.executeUpdate("alter table "+table+" add column "+text+" int default 0 after "+prev_col+";"); break;
                  case "CHAR" : st.executeUpdate("alter table "+table+" add column "+text+" char(100) default '' after "+prev_col+";"); break;
                  case "FLOAT" : st.executeUpdate("alter table "+table+" add column "+text+" float default 0 after "+prev_col+";"); break;
                  case "DATE" : st.executeUpdate("alter table "+table+" add column "+text+" date default '1999-01-20' after "+prev_col+";"); break;
                  case "BIGINT" : st.executeUpdate("alter table "+table+" add column "+text+" bigint default 0 after "+prev_col+";"); break;
                  default : System.out.println("SomeThing went wrong !!\n'"+table+"' table is not modified !!"); return;
              }
            }catch(Exception e) {setMessage("Remove Special Symbol including Space (if any)");}
              switch(bg.getSelection().getActionCommand()) {
                case "1" : for(int i=0; i<homePage.mt.table.getRowCount(); i++) setColumnData(table, o[i], i, text); break;
                case "2" : for(int i=0; i<homePage.sw.table.getRowCount(); i++) setColumnData(table, o[i], i, text); break;
                case "3" : for(int i=0; i<homePage.rw.table.getRowCount(); i++) setColumnData(table, o[i], i, text); break;
                case "4" : for(int i=0; i<homePage.r.table.getRowCount(); i++) setColumnData(table, o[i], i, text); break;
                case "5" : for(int i=0; i<homePage.m.table.getRowCount(); i++) setColumnData(table, o[i], i, text); break;
                case "6" : for(int i=0; i<homePage.rm.table.getRowCount(); i++) setColumnData(table, o[i], i, text); break;
                case "7" : for(int i=0; i<homePage.swd.table.getRowCount(); i++) setColumnData(table, o[i], i, text); break;
                case "8" : for(int i=0; i<homePage.rwd.table.getRowCount(); i++) setColumnData(table, o[i], i, text); break;
                case "9" : for(int i=0; i<homePage.md.table.getRowCount(); i++) setColumnData(table, o[i], i, text); break;
                default :  return; 
           }
           refreshTable(bg.getSelection().getActionCommand()); setColumnNames(bg.getSelection().getActionCommand());
    }
    void addColumns(String col, String col_after) {
            if(validateText()) return; String str=null; 
            switch(cb2.getSelectedIndex()) {
                case 0: str = "char (100) default ''"; break;
                case 1: str = "int default 0"; break;
                case 2: str = "float default 0.0"; break;
                case 3: str = "date default '1999-01-02'"; break;
                case 4: str = "bigint default 0"; break;
            }
          try {
            switch(bg.getSelection().getActionCommand()) { 
                case "1": st.executeUpdate("alter table money_tran add column "+col+" "+str+" after "+col_after+";"); break;
                case "2": st.executeUpdate("alter table emp_sew add column "+col+" "+str+" after "+col_after+";"); break;
                case "3": st.executeUpdate("alter table emp_raw add column "+col+" "+str+" after "+col_after+";"); break;
                case "4": st.executeUpdate("alter table ready_material add column "+col+" "+str+" after "+col_after+";"); break;
                case "5": st.executeUpdate("alter table merchant add column "+col+" "+str+" after "+col_after+";"); break;
                case "6": st.executeUpdate("alter table raw_material add column "+col+" "+str+" after "+col_after+";"); break;
                case "7": st.executeUpdate("alter table emp_sewDetails add column "+col+" "+str+" after "+col_after+";"); break;
                case "8": st.executeUpdate("alter table emp_rawdetails add column "+col+" "+str+" after "+col_after+";"); break;
                case "9": st.executeUpdate("alter table merchant_details add column "+col+" "+str+" after "+col_after+";"); break; 
            }
          }catch(Exception e) {setMessage("Remove Special Symbol including Space (if any)");}
          refreshTable(bg.getSelection().getActionCommand()); setColumnNames(bg.getSelection().getActionCommand());
    }
    private void refreshTable(String s) {
        switch(s) {
            case "1" : homePage.mt.prepareColumnData(); homePage.mt.createTable(); homePage.mt.tableRendering(); break;
            case "2" : homePage.sw.prepareColumnData(); homePage.sw.createTable(); homePage.sw.tableRendering(); break;
            case "3" : homePage.rw.prepareColumnData(); homePage.rw.createTable(); homePage.rw.tableRendering(); break;
            case "4" : homePage.r.prepareColumnData(); homePage.r.createTable(); homePage.r.tableRendering(); break;
            case "5" : homePage.m.prepareColumnData(); homePage.m.createTable(); homePage.m.tableRendering(); break;
            case "6" : homePage.rm.prepareColumnData(); homePage.rm.createTable(); homePage.rm.tableRendering(); break;
            case "7" : homePage.swd.prepareColumnData(); homePage.swd.createTable(); homePage.swd.tableRendering(); break;
            case "8" : homePage.rwd.prepareColumnData(); homePage.rwd.createTable(); homePage.rwd.tableRendering(); break;
            case "9" : homePage.md.prepareColumnData(); homePage.md.createTable(); homePage.md.tableRendering(); break;
        }
    } 
    private void setTableModel(String s) {
        switch(s) {
            case "1" : md=(DefaultTableModel)homePage.mt.table.getModel(); break;
            case "2" : md=(DefaultTableModel)homePage.sw.table.getModel(); break;
            case "3" : md=(DefaultTableModel)homePage.rw.table.getModel(); break;
            case "4" : md=(DefaultTableModel)homePage.r.table.getModel(); break;
            case "5" : md=(DefaultTableModel)homePage.m.table.getModel(); break;
            case "6" : md=(DefaultTableModel)homePage.rm.table.getModel(); break;
            case "7" : md=(DefaultTableModel)homePage.swd.table.getModel(); break;
            case "8" : md=(DefaultTableModel)homePage.rwd.table.getModel(); break;
            case "9" : md=(DefaultTableModel)homePage.md.table.getModel(); break;
        }
    }
    private void setColumnNames(String s) {
        tab.setText("");
        setTableModel(s);
        for(int i=0; i<md.getColumnCount(); i++) tab.setText(tab.getText()+(i+1)+".  "+md.getColumnName(i)+"\n");
        if(rb_rename.isSelected() || rb_remove.isSelected()){ cb2.removeAllItems(); for(int i=0; i<md.getColumnCount()-1; i++) cb2.addItem(md.getColumnName(i+1)); }
        else{ cb.removeAllItems(); for(int i=md.getColumnCount()-1; i>-1; i--) cb.addItem(md.getColumnName(i)); }
    }
    private void setColumnData(String table, Object data, int i, String col) {
        try { 
        rs = st.executeQuery("select Sno from "+table+" order by Sno asc;");
       for(int j=0; j<=i; j++)  rs.next(); 
           st1.executeUpdate("update "+table+" set "+col+" = '"+data+"' where Sno = "+rs.getInt(1)); 
        }catch(Exception e) {e.printStackTrace(); homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_save;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb_after;
    private javax.swing.JLabel lb_down;
    private javax.swing.JLabel lb_opt;
    private javax.swing.JLabel lb_up;
    private javax.swing.JRadioButton rb_add;
    private javax.swing.JRadioButton rb_merDetails;
    private javax.swing.JRadioButton rb_merchant;
    private javax.swing.JRadioButton rb_money;
    private javax.swing.JRadioButton rb_raw;
    private javax.swing.JRadioButton rb_rawDetails;
    private javax.swing.JRadioButton rb_rawMat;
    private javax.swing.JRadioButton rb_ready;
    private javax.swing.JRadioButton rb_remove;
    private javax.swing.JRadioButton rb_rename;
    private javax.swing.JRadioButton rb_sew;
    private javax.swing.JRadioButton rb_sewDetails;
    private javax.swing.JSeparator sep;
    private javax.swing.JTextArea tab;
    private javax.swing.JTextField tf_name;
    // End of variables declaration//GEN-END:variables
}
