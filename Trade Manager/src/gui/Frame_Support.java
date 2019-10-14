package gui;

import static gui.homePage.PATH;
import javax.swing.tree.TreePath;
import java.io.BufferedReader;
import java.io.FileReader;

public class Frame_Support extends javax.swing.JFrame {
    TreePath path;
    BufferedReader br;
    String st;
    
    public Frame_Support() { 
        initComponents(); setVisible(true); setTitle("Support");
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTree1.setForeground(new java.awt.Color(255, 255, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Overview");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Users");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Root User");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Administrator");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Super User");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Guest");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Permissions");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Read");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Add");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Delete");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Modify");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Control Panel");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Featues");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Backup");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Create Users");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Remove Users");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Timer");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Profile Picture");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Delete/Exit Prompt");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Update");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Security");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Auto Login");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Sort");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Data Checker");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Others");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Search Bar");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Drop down Menu");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Plans");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Android Version");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cloud Storage");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setShowsRootHandles(true);
        jTree1.setVisibleRowCount(0);
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ta.setEditable(false);
        ta.setBackground(new java.awt.Color(102, 102, 102));
        ta.setColumns(20);
        ta.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        ta.setForeground(new java.awt.Color(246, 246, 246));
        ta.setLineWrap(true);
        ta.setRows(5);
        ta.setText(org.openide.util.NbBundle.getMessage(Frame_Support.class, "Frame_Support.ta.text")); // NOI18N
        ta.setToolTipText(org.openide.util.NbBundle.getMessage(Frame_Support.class, "Frame_Support.ta.toolTipText")); // NOI18N
        ta.setWrapStyleWord(true);
        jScrollPane2.setViewportView(ta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
       path = evt.getNewLeadSelectionPath(); if(path == null) return;
         switch(path.getLastPathComponent().toString()) {
          case "Root User" : display(PATH+"\\docs\\Root User.txt"); break;
          case "Administrator" : display(PATH+"\\docs\\Administrator.txt"); break;
          case "Super User" : display(PATH+"\\docs\\Super User.txt"); break;
          case "Guest" : display(PATH+"\\docs\\Guest.txt"); break;
          case "Read" : display(PATH+"\\docs\\Read.txt"); break;
          case "Add" : display(PATH+"\\docs\\Add.txt"); break;
          case "Delete" : display(PATH+"\\docs\\Delete.txt"); break;
          case "Modify" : display(PATH+"\\docs\\Modify.txt"); break;
          case "Control Panel" : display(PATH+"\\docs\\Control Panel.txt"); break;
          case "Backup" : display(PATH+"\\docs\\Backup.txt"); break;
          case "Create Users" : display(PATH+"\\docs\\Create Users.txt"); break;
          case "Remove Users" : display(PATH+"\\docs\\Remove Users.txt"); break;
          case "Timer" : display(PATH+"\\docs\\Timer.txt"); break;
          case "Profile Picture" : display(PATH+"\\docs\\Profile Picture.txt"); break;
          case "Delete/Exit Prompt" : display(PATH+"\\docs\\Delete-Exit Prompt.txt"); break;
          case "Update" : display(PATH+"\\docs\\Update.txt"); break;
          case "Security" : display(PATH+"\\docs\\Security.txt"); break;
          case "Auto Login" : display(PATH+"\\docs\\Auto Login.txt"); break;
          case "Sort" : display(PATH+"\\docs\\Sort.txt"); break;
          case "Data Checker" : display(PATH+"\\docs\\Data Checker.txt"); break;
          case "Search Bar" : display(PATH+"\\docs\\Search Bar.txt"); break;
          case "Drop down Menu" : display(PATH+"\\docs\\Drop down Menu.txt"); break;
          case "Android Version" : display(PATH+"\\docs\\Android Version.txt"); break;
          case "Cloud Storage" : display(PATH+"\\docs\\Cloud Storage.txt"); break;
           
       }
    }//GEN-LAST:event_jTree1ValueChanged
    
    private void display(String src) {
        try {
            ta.setText("");
            br = new BufferedReader(new FileReader(src));
            while((st = br.readLine()) != null) ta.setText(ta.getText()+st+"\n");
            br.close();
        } catch(Exception e) {e.printStackTrace();}
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
            java.util.logging.Logger.getLogger(Frame_Support.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Support.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Support.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Support.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Support();//.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
// From Init(): tablesBaseVersion()
/*
   private void setTablesBaseVersion() {
            try {
                st.executeUpdate("Create table Tables_Version(Sno int primary key, Table_Name char(30), Table_Version float);");
                st.executeUpdate("Insert into tables_Version values(1, 'Panel_Col', 1.1);");
                st.executeUpdate("Insert into tables_Version values(2, 'Panel_Create', 1.1);");
                st.executeUpdate("Insert into tables_Version values(3, 'Panel_Gen_Settings', 1.1);");
                st.executeUpdate("Insert into tables_Version values(4, 'Panel_Modify', 1.1);");
                st.executeUpdate("Insert into tables_Version values(5, 'Panel_Permissions', 1.1);");
                st.executeUpdate("Insert into tables_Version values(6, 'Panel_User', 1.1);");
                st.executeUpdate("Insert into tables_Version values(7, 'Panel_UserDetails', 1.1);");
                st.executeUpdate("Insert into tables_Version values(8, 'Panel_root', 1.1);");
                st.executeUpdate("Insert into tables_Version values(9, 'EmptyFieldException', 1.1);");
                st.executeUpdate("Insert into tables_Version values(10, 'MerchantDetails', 1.1);");
                st.executeUpdate("Insert into tables_Version values(11, 'Merchants', 1.1);");
                st.executeUpdate("Insert into tables_Version values(12, 'Money_Tran', 1.1);");
                st.executeUpdate("Insert into tables_Version values(13, 'RawMaterial', 1.1);");
                st.executeUpdate("Insert into tables_Version values(14, 'RawWorker', 1.1);");
                st.executeUpdate("Insert into tables_Version values(15, 'RawWorkerDetails', 1.1);");
                st.executeUpdate("Insert into tables_Version values(16, 'Ready', 1.1);");
                st.executeUpdate("Insert into tables_Version values(17, 'Sewing', 1.1);");
                st.executeUpdate("Insert into tables_Version values(18, 'SewingWorkerDetails', 1.1);");
                st.executeUpdate("Insert into tables_Version values(19, 'TableEngine', 1.1);");
                st.executeUpdate("Insert into tables_Version values(20, 'Temp', 1.1);");
                st.executeUpdate("Insert into tables_Version values(21, 'Frame_Delete', 1.1);");
                st.executeUpdate("Insert into tables_Version values(22, 'Frame_Exit', 1.1);");
                st.executeUpdate("Insert into tables_Version values(23, 'Init', 1.1);");
                st.executeUpdate("Insert into tables_Version values(24, 'MatrixMagic', 1.1);");
                st.executeUpdate("Insert into tables_Version values(25, 'Panel_DbCred', 1.1);");
                st.executeUpdate("Insert into tables_Version values(26, 'Panel_Delete', 1.1);");
                st.executeUpdate("Insert into tables_Version values(27, 'Panel_Error', 1.1);");
                st.executeUpdate("Insert into tables_Version values(28, 'Panel_ForgetPassword', 1.1);");
                st.executeUpdate("Insert into tables_Version values(29, 'Panel_MerchantDetails', 1.1);");
                st.executeUpdate("Insert into tables_Version values(30, 'Panel_Raw', 1.1);");
                st.executeUpdate("Insert into tables_Version values(31, 'Panel_RawMaterial', 1.1);");
                st.executeUpdate("Insert into tables_Version values(32, 'Panel_RawWorkerDetails', 1.1);");
                st.executeUpdate("Insert into tables_Version values(33, 'Panel_Ready', 1.1);");
                st.executeUpdate("Insert into tables_Version values(34, 'Panel_Sewing', 1.1);");
                st.executeUpdate("Insert into tables_Version values(35, 'Panel_SewingWorkerDetails', 1.1);");
                st.executeUpdate("Insert into tables_Version values(36, 'Panel_Splash', 1.1);");
                st.executeUpdate("Insert into tables_Version values(37, 'Panel_admin', 1.1);");
                st.executeUpdate("Insert into tables_Version values(38, 'Panel_home', 1.1);");
                st.executeUpdate("Insert into tables_Version values(39, 'Panel_inst', 1.1);");
                st.executeUpdate("Insert into tables_Version values(40, 'Panel_inst_finish', 1.1);");
                st.executeUpdate("Insert into tables_Version values(41, 'Panel_inst_next', 1.1);");
                st.executeUpdate("Insert into tables_Version values(42, 'Panel_installer', 1.1);");
                st.executeUpdate("Insert into tables_Version values(43, 'Panel_merchants', 1.1);");
                st.executeUpdate("Insert into tables_Version values(44, 'Panel_money', 1.1);");
                st.executeUpdate("Insert into tables_Version values(45, 'Panel_password', 1.1);");
                st.executeUpdate("Insert into tables_Version values(46, 'Panel_user', 1.1);");
                st.executeUpdate("Insert into tables_Version values(47, 'TableEngine', 1.1);");
                st.executeUpdate("Insert into tables_Version values(48, 'homePage', 1.1);");
                st.executeUpdate("Insert into tables_Version values(49, 'notepad', 1.1);");
                st.executeUpdate("Insert into tables_Version values(50, 'Panel_create', 1.1);");
                st.executeUpdate("Insert into tables_Version values(51, 'temp', 1.1);");
                
            } catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
        }
*/