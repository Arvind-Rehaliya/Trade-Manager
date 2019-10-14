package gui;

import static gui.Init.st;
import static gui.Init.rs;

public class Panel_Splash extends javax.swing.JFrame {
    boolean isVisible = false;
    int t=0;
    
    public Panel_Splash() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lb = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb_status = new javax.swing.JLabel();
        pb = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(Panel_Splash.class, "Panel_Splash.title")); // NOI18N
        setUndecorated(true);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/trade_4.jpg"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(lb, org.openide.util.NbBundle.getMessage(Panel_Splash.class, "Panel_Splash.lb.text")); // NOI18N
        lb.setOpaque(true);

        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/trade_220.jpg"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(lb1, org.openide.util.NbBundle.getMessage(Panel_Splash.class, "Panel_Splash.lb1.text")); // NOI18N
        lb1.setOpaque(true);

        lb_status.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lb_status.setForeground(new java.awt.Color(225, 153, 0));
        org.openide.awt.Mnemonics.setLocalizedText(lb_status, org.openide.util.NbBundle.getMessage(Panel_Splash.class, "Panel_Splash.lb_status.text")); // NOI18N
        lb_status.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(lb)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(lb1)
                        .addGap(135, 135, 135))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(lb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb1)
                .addGap(10, 10, 10)
                .addComponent(lb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pb.setBackground(new java.awt.Color(255, 255, 255));
        pb.setForeground(new java.awt.Color(225, 103, 0));
        pb.setBorder(null);
        pb.setBorderPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pb, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pb, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    void setSecurity() {
       if(admin.gui.Panel_Gen_Settings.lb_security.getText().equals("Enabled")) new Panel_password(this); 
       else {new Thread(() -> {try {if(isVisible) this.setVisible(true); Thread.sleep(1000); fill();}catch(Exception e) {}}).start(); }
   }
    void fill() {
        try { byte b=0;
            rs = st.executeQuery("show tables;");
            while(rs.next()) b++;
            if(b == 2) createTables();
            searchTables();
            new homePage().setVisible(true); this.dispose();
        } catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    private void searchTables() {
        try { byte bb=0, rows=0;
            
            String[] tables = {"money_tran", "emp_sew", "emp_raw", "emp_sewdetails", "emp_rawdetails", "merchant", "merchant_details", "ready_material", "raw_material", "table_buttons", "table_name", "user_details", "user_images"};
            rs = st.executeQuery("Show Tables;"); while(rs.next()) rows++;
            pb.setValue(8);
            for(byte b=1; b<=tables.length; b++) { 
                lb_status.setText("Looking for : "+tables[b-1]); Thread.sleep(800);
                rs = st.executeQuery("Show Tables;");
                while(rs.next()) {
                    if(tables[b-1].equalsIgnoreCase(rs.getString(1))) { bb = 0; lb_status.setText("Found."); Thread.sleep(200); break;}
                    else ++bb;
                pb.setValue(b*8);
                 }
                if(bb == rows) {
                    lb_status.setText("Not Found : Creating Table - "+tables[b-1]); Thread.sleep(2000);
                    createThisTable(tables[b-1]);
                    pb.setValue(b*8); lb_status.setText("Created"); Thread.sleep(200);
                    lb_status.setText("Again checking for"+tables[b-1]); ++rows;  Thread.sleep(500);
                } bb=0;
            } pb.setValue(100);
        } catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false); }
    }
    private void createThisTable(String table) {
        switch(table) {
            case "money_tran" : createMoney_Tran(); break;
            case "emp_sew" : createEmp_Sew(); break;
            case "emp_raw" : createEmp_Raw(); break;
            case "emp_sewdetails" : createEmp_SewDetails(); break;
            case "emp_rawdetails" : createEmp_RawDetails(); break;
            case "merchant" : createMerchant(); break;
            case "merchant_details" : createMerchant_Details(); break;
            case "ready_material" : createReady_Material(); break;
            case "raw_material" : createRaw_Material(); break;
            case "table_buttons" : createTable_Buttons(); break;
            case "table_name" : createTable_Name(); break;
            case "user_details" : createUser_Details(); break;
            case "user_images" : createUser_Images(); break;        
        }
    }
    private void createMoney_Tran() {
        try {
            st.executeUpdate("Create table money_tran (Sno int primary key, Amount_Paid_To char(100) default '', Amount_Paid float default 0, Date date default '1992-01-02', Remarks char(200) default '', last_upd int);");
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    private void createEmp_Sew() {
        try {
            st.executeUpdate("Create table emp_sew (Sno int primary key, Date date default '1999-01-02', Category char(50) default '', Color char(50) default '', Qty_in_kg float default 0, Qty_in_dozen float default 0, Rate float default 0, Qty_balance float default 0, Remarks char(200) default '', last_upd int);");
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    private void createEmp_Raw() {
        try {
            st.executeUpdate("Create table emp_raw (Sno int primary key, Date date default '1999-01-02', Category char(50) default '', Color char(50) default '', Qty_in_kg float default 0, Qty_in_dozen float default 0, Rate float default 0, Qty_balance float default 0, Remarks char(200) default '', last_upd int);");
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    private void createEmp_SewDetails() {
        try {
            st.executeUpdate("Create table emp_sewdetails (Sno int primary key, Name char(50) default '', Mobile_No bigint default 0, Address char(50) default '', Remarks char(200) default '', last_upd int);");
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    private void createEmp_RawDetails() {
        try {
            st.executeUpdate("Create table emp_rawdetails (Sno int primary key, Name char(50) default '', Mobile_No bigint default 0, Address char(50) default '', Remarks char(200) default '', last_upd int);");
                
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    private void createMerchant() {
        try {
            st.executeUpdate("Create table merchant (Sno int primary key, Rate float default 0, Amount float default 0, Amount_Paid_On date default '1999-01-02', Qty_dozen float default 0, Remarks char(200) default '', last_upd int);");
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    private void createMerchant_Details() {
        try {
            st.executeUpdate("Create table merchant_details (Sno int primary key, Name char(50) default '', Mobile_No bigint default 0, Address char(50) default '', Remarks char(200) default '', last_upd int);");
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    private void createReady_Material() {
        try {
            st.executeUpdate("Create table ready_material (Sno int primary key, Sewed_On date default '1999-01-02', Category char(50) default '', Sewed_By char(50) default '', Color char(50) default '', Qty_dozen float default 0, Remarks char(200) default '', last_upd int);");
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    private void createRaw_Material() {
        try {
            st.executeUpdate("Create table raw_material (Sno int Primary key, Category char(50) default '', Rate float default 0, Qty_kg float default 0, Total_Amt float default 0, Amt_paid float default 0, Amt_remaining float default 0, Remarks char(200) default '', last_upd int);");
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    private void createTable_Buttons() {
        try {
            st.executeUpdate("Create table table_buttons (Sno int Primary key, Tables char(30));");
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    private void createTable_Name() {
        try {
            st.executeUpdate("Create table table_name (Sno int Primary key, Table_name char(30));");
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    private void createUser_Details() {
        try {
            st.executeUpdate("Create table user_details (Sno int Primary key, fname char(20) default '', lname char(20) default '', Gender char(1) default 'M', Mobile_no bigint default 0, username char(30), password char(30), alt_mobile bigint default 0, Status int default 2, perm char(4) default '1000');");
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    private void createUser_Images() {
        try {
           st.executeUpdate("Create table user_images (Username char(20), Image mediumblob);");
           st.executeUpdate("Insert into user_images(Username) values ('root');");           
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }    
    private void createTables() {
        try {  
                lb_status.setText("Creating table : Money Transaction"); pb.setValue(9); Thread.sleep(1000);
                createMoney_Tran();
                lb_status.setText("Created.");   Thread.sleep(500);
                
                lb_status.setText("Creating table : Sewing Workers"); Thread.sleep(1000);
                createEmp_Sew();
                pb.setValue(18); lb_status.setText("Created.");  Thread.sleep(500);
                
                lb_status.setText("Creating table : Raw Workers");Thread.sleep(1000);
                createEmp_Raw();
                pb.setValue(27); lb_status.setText("Created.");  Thread.sleep(500);
                
                lb_status.setText("Creating table : Sewing Worker Details");Thread.sleep(1000);
                createEmp_SewDetails();
                pb.setValue(36); lb_status.setText("Created.");  Thread.sleep(500);
                
                lb_status.setText("Creating table : Raw Worker Details");Thread.sleep(1000);
                createEmp_RawDetails();
                pb.setValue(45); lb_status.setText("Created.");  Thread.sleep(500);
                
                lb_status.setText("Creating table : Merchant");Thread.sleep(1000);
                createMerchant();
                pb.setValue(54); lb_status.setText("Created.");  Thread.sleep(500);
                
                lb_status.setText("Creating table : Merchant Details");Thread.sleep(1000);
                createMerchant_Details();
                pb.setValue(63); lb_status.setText("Created.");  Thread.sleep(500);
                
                lb_status.setText("Creating table : Ready Material");Thread.sleep(1000);
                createReady_Material();
                pb.setValue(72); lb_status.setText("Created.");  Thread.sleep(500);
                
                lb_status.setText("Creating table : Raw Material");Thread.sleep(1000);
                createRaw_Material();
                pb.setValue(81); lb_status.setText("Created.");  Thread.sleep(500);
                
                lb_status.setText("Creating table : Table Buttons");Thread.sleep(1000);
                createTable_Buttons();
                pb.setValue(90); lb_status.setText("Created.");  Thread.sleep(500);
                
                lb_status.setText("Creating table : Table Name");Thread.sleep(1000);
                createTable_Name();
                pb.setValue(93); lb_status.setText("Created.");  Thread.sleep(500);
                
                lb_status.setText("Creating table : User Details");Thread.sleep(1000);
                createUser_Details();
                pb.setValue(98); lb_status.setText("Created.");  Thread.sleep(2000);
                
                lb_status.setText("Creating table : User Images");Thread.sleep(1000);
                createUser_Images();
                pb.setValue(100); lb_status.setText("Created.");  Thread.sleep(500);
               
                lb_status.setText("Creating tables done.");Thread.sleep(2000);
                
               } catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    public static void main(String args[]) { 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel_Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         Panel_Splash ps = new Panel_Splash(); ps.setVisible(true);
         for(int i=1; i<101; i++) {try{Thread.sleep(250); ps.pb.setValue(i);}catch(Exception e) {}} 
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb_status;
    private javax.swing.JPanel panel;
    private javax.swing.JProgressBar pb;
    // End of variables declaration//GEN-END:variables
}
