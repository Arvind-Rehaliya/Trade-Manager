package gui;

import static gui.Init.rs;
import static gui.Init.st;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Panel_inst_next extends javax.swing.JFrame {
    String path, fname, stt;
    File file;
    BufferedWriter bw;
    BufferedReader br;
    static Panel_inst_next pn;
    File[] file_arr;
    FileInputStream fis;
    FileOutputStream fos;
    
    public Panel_inst_next() {
        initComponents();  super.setVisible(true); 
        file = new File("./"); getDefaultPath(); 
        new Thread(() -> {setFileNames();}).start(); 
        super.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE); super.setTitle("Installing Trade Manager");
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
        tf_path = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        bt_next = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_path = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(225, 225, 225));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(Panel_inst_next.class, "Panel_inst_next.jLabel1.text")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(Panel_inst_next.class, "Panel_inst_next.jLabel2.text")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/trade-80.jpg"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(Panel_inst_next.class, "Panel_inst_next.jLabel3.text")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(Panel_inst_next.class, "Panel_inst_next.jLabel4.text")); // NOI18N

        tf_path.setBackground(new java.awt.Color(235, 235, 235));
        tf_path.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        tf_path.setText(org.openide.util.NbBundle.getMessage(Panel_inst_next.class, "Panel_inst_next.tf_path.text")); // NOI18N

        bt_next.setBackground(new java.awt.Color(0, 153, 153));
        bt_next.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_next.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(bt_next, org.openide.util.NbBundle.getMessage(Panel_inst_next.class, "Panel_inst_next.bt_next.text")); // NOI18N
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
        org.openide.awt.Mnemonics.setLocalizedText(bt_cancel, org.openide.util.NbBundle.getMessage(Panel_inst_next.class, "Panel_inst_next.bt_cancel.text")); // NOI18N
        bt_cancel.setBorderPainted(false);
        bt_cancel.setFocusPainted(false);
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        ta_path.setEditable(false);
        ta_path.setBackground(new java.awt.Color(235, 235, 235));
        ta_path.setColumns(20);
        ta_path.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ta_path.setForeground(new java.awt.Color(102, 102, 102));
        ta_path.setRows(5);
        ta_path.setText(org.openide.util.NbBundle.getMessage(Panel_inst_next.class, "Panel_inst_next.ta_path.text")); // NOI18N
        ta_path.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ta_path);

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
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                    .addComponent(tf_path))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(tf_path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_next)
                    .addComponent(bt_cancel))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void getDefaultPath() {
        try {
            rs = st.executeQuery("Select const from properties where id = 'path';"); rs.next(); this.path = rs.getString(1);
        }catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    private void setFileNames() {
        try { bt_next.setEnabled(false);
            file_arr = file.listFiles(); 
            for(byte b=0; b<file_arr.length; b++) {
                if(file_arr[b].getName().length()<14) continue;
                fname = file_arr[b].getName();
                if(fname.substring(fname.length()-7).equals(".config")) { 
                    tf_path.setText("Copied : "+path+"/"+fname);
                    ta_path.setText(ta_path.getText()+"Copied : "+path+"/"+fname+"\n");
                    try {Thread.sleep(50);}catch(Exception e) {}
                   
                    new Thread(() -> { 
                       try {
                           bw = new BufferedWriter(new FileWriter(path+"/"+fname, false));
                           br = new BufferedReader(new FileReader(new File("./"+fname)));
                           while((stt = br.readLine()) != null)  bw.write(stt+"\n");
                           bw.close(); br.close();
                       }catch(Exception e) {e.printStackTrace();}
                    }).start();
                }
            }
      
      tf_path.setText("Created dir : "+path+"/backup");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/backup"+"\n");
      file = new File(path+"/backup");  file.mkdir();
      
      tf_path.setText("Created dir : "+path+"/update");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/update"+"\n");
      file = new File(path+"/update");  file.mkdir();
      
      tf_path.setText("Created dir : "+path+"/docs");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/docs"+"\n");
      file = new File(path+"/docs");  file.mkdir();
      
      tf_path.setText("Created dir : "+path+"/tmp");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/tmp"+"\n");
      file = new File(path+"/tmp");  file.mkdir();
      
      tf_path.setText("Created dir : "+path+"/build");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/build"+"\n");
      file = new File(path+"/build");  file.mkdir();
      
      tf_path.setText("Created dir : "+path+"/build/classes");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/build/classes"+"\n");
      file = new File(path+"/build/classes"); file.mkdir();
      
      tf_path.setText("Created dir : "+path+"/build/classes/admin");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/build/classes/admin"+"\n");
      file = new File(path+"/build/classes/admin");  file.mkdir();
         
      tf_path.setText("Created dir : "+path+"/build/classes/admin/gui");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/build/classes/admin/gui"+"\n");
      file = new File(path+"/build/classes/admin/gui"); file.mkdir();
      
      tf_path.setText("Created dir : "+path+"/build/classes/db_client");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/build/classes/db_client"+"\n");
      file = new File(path+"/build/classes/db_client");  file.mkdir();
      
      tf_path.setText("Created dir : "+path+"/build/classes/gui");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/build/classes/gui"+"\n");
      file = new File(path+"/build/classes/gui");  file.mkdir();
            
      tf_path.setText("Created dir : "+path+"/build/classes/res");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/build/classes/res"+"\n");
      file = new File(path+"/build/classes/res");  file.mkdir();
       // here
      file = new File("admin/gui");
      file_arr = file.listFiles();
      for(int i=0; i<file_arr.length; i++) {
          fname = file_arr[i].getName();
              try {
                  fis = new FileInputStream(new File("./admin/gui/"+fname));
                  fos = new FileOutputStream(new File(path+"/build/classes/admin/gui/"+fname)); 
                  tf_path.setText("Copied : "+path+"/build/classes/admin/gui/"+fname);
                  ta_path.setText(ta_path.getText()+"Copied : "+path+"/build/classes/admin/gui/"+fname+"\n");
                  byte[] b = new byte[4096]; int length;
                  while((length = fis.read(b)) > 0)  fos.write(b, 0, length); try {Thread.sleep(150);}catch(Exception e) {}
                  fis.close(); fos.close();
                  
              }catch(Exception e) {e.printStackTrace();}
     }
            // here
     file = new File("db_client");
     file_arr = file.listFiles();
     for(int i=0; i<file_arr.length; i++) {
         fname = file_arr[i].getName();
         try {
             fis = new FileInputStream(new File("./db_client/"+fname));
             fos = new FileOutputStream(new File(path+"/build/classes/db_client/"+fname)); 
             tf_path.setText("Copied : "+path+"/build/classes/db_client/"+fname);
             ta_path.setText(ta_path.getText()+"Copied : "+path+"/build/classes/db_client/"+fname+"\n");
             byte[] b = new byte[4096]; int length;
             while((length = fis.read(b)) > 0)  fos.write(b, 0, length); try {Thread.sleep(150);}catch(Exception e) {}
             fis.close(); fos.close();
             
         }catch(Exception e) {e.printStackTrace();}
     }
            // here    
     file = new File("gui");
     file_arr = file.listFiles();
     for(int i=0; i<file_arr.length; i++) {
         fname = file_arr[i].getName();
             try {
                 fis = new FileInputStream(new File("./gui/"+fname));
                 fos = new FileOutputStream(new File(path+"/build/classes/gui/"+fname)); 
                 tf_path.setText("Copied : "+path+"/build/classes/gui/"+fname);
                 ta_path.setText(ta_path.getText()+"Copied : "+path+"/build/classes/gui/"+fname+"\n");
                 byte[] b = new byte[4096]; int length;
                 while((length = fis.read(b)) > 0)  fos.write(b, 0, length); try {Thread.sleep(150);}catch(Exception e) {}
                 fis.close(); fos.close();
                 
             }catch(Exception e) {e.printStackTrace();}
     }
            // here
     file = new File("res");
     file_arr = file.listFiles();
     for(int i=0; i<file_arr.length; i++) {
           fname = file_arr[i].getName();
             try {
                 fis = new FileInputStream(new File("./res/"+fname));
                 fos = new FileOutputStream(new File(path+"/build/classes/res/"+fname)); 
                 tf_path.setText("Copied : "+path+"/build/classes/res/"+fname);
                 ta_path.setText(ta_path.getText()+"Copied : "+path+"/build/classes/res/"+fname+"\n");
                 byte[] b = new byte[4096]; int length;
                 while((length = fis.read(b)) > 0)  fos.write(b, 0, length); try {Thread.sleep(150);}catch(Exception e) {}
                 fis.close(); fos.close();
                 
              }catch(Exception e) {e.printStackTrace();}
     }
// ends here   
      tf_path.setText("Creatied dir : "+path+"/src");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/src"+"\n");
      file = new File(path+"/src");  file.mkdir();
      
      tf_path.setText("Created dir : "+path+"/src/admin");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/src/admin"+"\n");
      file = new File(path+"/src/admin");  file.mkdir();
      
      tf_path.setText("Created dir : "+path+"/src/gui");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/src/gui"+"\n");
      file = new File(path+"/src/gui"); file.mkdir();
         
      tf_path.setText("Created dir : "+path+"/src/db_client");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/src/db_client"+"\n");
      file = new File(path+"/src/db_client");  file.mkdir();
      
 //     tf_path.setText("Created dir : "+path+"/src/res");
 //     ta_path.setText(ta_path.getText()+"Created dir : "+path+"/src/res"+"\n");
 //     file = new File(path+"/src/res"); file.mkdir();
      
      tf_path.setText("Created dir : "+path+"/src/admin/gui");
      ta_path.setText(ta_path.getText()+"Created dir : "+path+"/src/admin/gui"+"\n");
      file = new File(path+"/src/admin/gui");  file.mkdir();
      
      file = new File("./src/admin/gui");
      file_arr = file.listFiles();
      for(int i=0; i<file_arr.length; i++) {
          fname = file_arr[i].getName(); if(fname.equals("Bundle.properties")) continue;
              try { 
                  bw = new BufferedWriter(new FileWriter(path+"/src/admin/gui/"+fname, false));
                  br = new BufferedReader(new FileReader(new File("./src/admin/gui/"+fname)));
                  tf_path.setText("Copied : "+path+"/src/admin/gui/"+fname);
                  ta_path.setText(ta_path.getText()+"Copied : "+path+"/src/admin/gui/"+fname+"\n");
                  while((stt = br.readLine()) != null)  bw.write(stt+"\n"); try {Thread.sleep(150);}catch(Exception e) {}
                  bw.close(); br.close();
              }catch(Exception e) {e.printStackTrace();}
     }
            
     file = new File("./src/db_client");
     file_arr = file.listFiles();
     for(int i=0; i<file_arr.length; i++) {
         fname = file_arr[i].getName();
         try {
             bw = new BufferedWriter(new FileWriter(path+"/src/db_client/"+fname, false));
             br = new BufferedReader(new FileReader(new File("./src/db_client/"+fname)));
             tf_path.setText("Copied  : "+path+"/src/db_client/"+fname);
             ta_path.setText(ta_path.getText()+"Copied : "+path+"/src/db_client/"+fname+"\n");
             while((stt = br.readLine()) != null)  bw.write(stt+"\n"); try {Thread.sleep(150);}catch(Exception e) {}
             bw.close(); br.close();
            }catch(Exception e) {e.printStackTrace();}
     }
                
     file = new File("./src/gui");
     file_arr = file.listFiles();
     for(int i=0; i<file_arr.length; i++) {
         fname = file_arr[i].getName(); if(fname.equals("Bundle.properties") || fname.equals("homePage_button_mt.ser")) continue;
             try {
                 bw = new BufferedWriter(new FileWriter(path+"/src/gui/"+fname, false));
                 br = new BufferedReader(new FileReader(new File("./src/gui/"+fname)));
                 tf_path.setText("Copied  : "+path+"/src/gui/"+fname);
                 ta_path.setText(ta_path.getText()+"Copied : "+path+"/src/gui/"+fname+"\n");
                 while((stt = br.readLine()) != null)  bw.write(stt+"\n"); try {Thread.sleep(150);}catch(Exception e) {}
                 bw.close(); br.close();
              }catch(Exception e) {e.printStackTrace();}
     }
     
     file = new File("./docs");
     file_arr = file.listFiles();
     for(int i=0; i<file_arr.length; i++) {
         fname = file_arr[i].getName();
             try {
                 bw = new BufferedWriter(new FileWriter(path+"/docs/"+fname, false));
                 br = new BufferedReader(new FileReader(new File("./docs/"+fname)));
                 tf_path.setText("Copied  : "+path+"/docs/"+fname);
                 ta_path.setText(ta_path.getText()+"Copied : "+path+"/docs/"+fname+"\n");
                 while((stt = br.readLine()) != null)  bw.write(stt+"\n"); try {Thread.sleep(150);}catch(Exception e) {}
                 bw.close(); br.close();
              }catch(Exception e) {e.printStackTrace();}
     }
            
  /*   file = new File("./src/res");
     file_arr = file.listFiles();
     for(int i=0; i<file_arr.length; i++) {
           fname = file_arr[i].getName();
             try {
                 fis = new FileInputStream(new File("./src/res/"+fname));
                 fos = new FileOutputStream(new File(path+"/src/res/"+fname)); 
                 tf_path.setText(path+"/src/res/"+fname);
                 ta_path.setText(ta_path.getText()+path+"/src/res/"+fname+"\n");
                 byte[] b = new byte[12288]; int length;
                 while((length = fis.read(b)) > 0)  fos.write(b, 0, length); try {Thread.sleep(300);}catch(Exception e) {}
                 fis.close(); fos.close();
              }catch(Exception e) {e.printStackTrace();}
     }
 */
     bt_next.setEnabled(true);
        }catch(Exception e) {e.printStackTrace(); homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(true);}
    }
    
    private void bt_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nextActionPerformed
        new Panel_inst_finish().setVisible(true); this.dispose();
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
            java.util.logging.Logger.getLogger(Panel_inst_next.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_inst_next.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_inst_next.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_inst_next.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        new Panel_inst_next();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_next;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea ta_path;
    private javax.swing.JTextField tf_path;
    // End of variables declaration//GEN-END:variables
}
