package gui;

import java.awt.Color;

public class MatrixMagic extends javax.swing.JFrame {
    
    public MatrixMagic() {
        initComponents(); setVisible(true); setSize(763, 474); setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE); setTitle("Matrix Effect");
       
        try { 
   
   /*         String st=null;
            String[] command = {"cmd", "cd ..", "dir"};
            Process process = Runtime.getRuntime().exec("cmd /c date");
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
            BufferedReader err = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            
            bw.write("03-03-18"); bw.close();
            while((st = br.readLine()) != null) System.out.println(st);
         
            while((st = err.readLine()) != null) System.out.print(st);
    */
        } catch(Exception e) {e.printStackTrace();}
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) {
                  ta_1.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_1.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
        
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_2.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_2.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_3.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_3.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_4.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_4.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_5.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_5.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_6.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_6.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_7.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_7.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_8.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_8.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_9.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_9.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_10.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_10.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_11.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_11.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_12.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_12.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_13.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_13.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_14.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_14.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_15.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_15.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_16.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_16.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_17.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_17.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_18.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_18.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_19.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_19.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_20.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_20.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_21.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_21.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
          
        new Thread(() -> {
              String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", pass="";
              byte b=0; int index=0; 
              while(true) { 
                  ta_22.setText(""); b=0; pass="";
                 while(b++<23) {
                      index = (int)(str.length() * Math.random());
                     pass += str.charAt(index);
                 }
                 ta_22.setText(pass); 
                 try{Thread.sleep(100);}catch(Exception e) {e.printStackTrace();}
             }
       }).start();
        
        setBackground(new Color(1, 1, 1, 0.0f));
        setVisible(true); setSize(771, 474); setResizable(false); setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE); setTitle("Matrix Magic");
        }

    @Override
    public String toString() {
      return "toString() hijacked";
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_4 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_9 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_7 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        ta_10 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        ta_8 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        ta_12 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        ta_11 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        ta_15 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        ta_13 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        ta_14 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        ta_16 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        ta_5 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        ta_6 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        ta_3 = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        ta_1 = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        ta_17 = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        ta_18 = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        ta_19 = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        ta_20 = new javax.swing.JTextArea();
        jScrollPane21 = new javax.swing.JScrollPane();
        ta_21 = new javax.swing.JTextArea();
        jScrollPane22 = new javax.swing.JScrollPane();
        ta_22 = new javax.swing.JTextArea();
        bt_gen = new javax.swing.JButton();
        bt_gen1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);

        pn.setBackground(new java.awt.Color(90, 90, 90));

        jScrollPane1.setBackground(new java.awt.Color(90, 90, 90));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        ta_2.setEditable(false);
        ta_2.setBackground(new java.awt.Color(90, 90, 90));
        ta_2.setColumns(20);
        ta_2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_2.setForeground(new java.awt.Color(51, 255, 0));
        ta_2.setLineWrap(true);
        ta_2.setRows(1);
        ta_2.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "MatrixMagic.ta_22.text")); // NOI18N
        jScrollPane1.setViewportView(ta_2);

        jScrollPane2.setBackground(new java.awt.Color(90, 90, 90));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setOpaque(false);

        ta_4.setEditable(false);
        ta_4.setBackground(new java.awt.Color(90, 90, 90));
        ta_4.setColumns(20);
        ta_4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_4.setForeground(new java.awt.Color(51, 255, 0));
        ta_4.setLineWrap(true);
        ta_4.setRows(1);
        ta_4.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "tempFrame.ta_15.text")); // NOI18N
        ta_4.setBorder(null);
        jScrollPane2.setViewportView(ta_4);

        jScrollPane3.setBackground(new java.awt.Color(90, 90, 90));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setOpaque(false);

        ta_9.setEditable(false);
        ta_9.setBackground(new java.awt.Color(90, 90, 90));
        ta_9.setColumns(20);
        ta_9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_9.setForeground(new java.awt.Color(51, 255, 0));
        ta_9.setLineWrap(true);
        ta_9.setRows(1);
        ta_9.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "tempFrame.ta_15.text")); // NOI18N
        ta_9.setBorder(null);
        jScrollPane3.setViewportView(ta_9);

        jScrollPane4.setBackground(new java.awt.Color(90, 90, 90));
        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setOpaque(false);

        ta_7.setEditable(false);
        ta_7.setBackground(new java.awt.Color(90, 90, 90));
        ta_7.setColumns(20);
        ta_7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_7.setForeground(new java.awt.Color(51, 255, 0));
        ta_7.setLineWrap(true);
        ta_7.setRows(1);
        ta_7.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "tempFrame.ta_15.text")); // NOI18N
        ta_7.setBorder(null);
        jScrollPane4.setViewportView(ta_7);

        jScrollPane5.setBackground(new java.awt.Color(90, 90, 90));
        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setOpaque(false);

        ta_10.setEditable(false);
        ta_10.setBackground(new java.awt.Color(90, 90, 90));
        ta_10.setColumns(20);
        ta_10.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_10.setForeground(new java.awt.Color(51, 255, 0));
        ta_10.setLineWrap(true);
        ta_10.setRows(1);
        ta_10.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "tempFrame.ta_15.text")); // NOI18N
        ta_10.setBorder(null);
        jScrollPane5.setViewportView(ta_10);

        jScrollPane6.setBackground(new java.awt.Color(90, 90, 90));
        jScrollPane6.setBorder(null);
        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane6.setOpaque(false);

        ta_8.setEditable(false);
        ta_8.setBackground(new java.awt.Color(90, 90, 90));
        ta_8.setColumns(20);
        ta_8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_8.setForeground(new java.awt.Color(51, 255, 0));
        ta_8.setLineWrap(true);
        ta_8.setRows(1);
        ta_8.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "tempFrame.ta_15.text")); // NOI18N
        ta_8.setBorder(null);
        jScrollPane6.setViewportView(ta_8);

        jScrollPane7.setBackground(new java.awt.Color(90, 90, 90));
        jScrollPane7.setBorder(null);
        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ta_12.setEditable(false);
        ta_12.setBackground(new java.awt.Color(90, 90, 90));
        ta_12.setColumns(20);
        ta_12.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_12.setForeground(new java.awt.Color(51, 255, 0));
        ta_12.setLineWrap(true);
        ta_12.setRows(1);
        ta_12.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "tempFrame.ta_15.text")); // NOI18N
        ta_12.setBorder(null);
        jScrollPane7.setViewportView(ta_12);

        jScrollPane8.setBackground(new java.awt.Color(90, 90, 90));
        jScrollPane8.setBorder(null);
        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane8.setOpaque(false);

        ta_11.setEditable(false);
        ta_11.setBackground(new java.awt.Color(90, 90, 90));
        ta_11.setColumns(20);
        ta_11.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_11.setForeground(new java.awt.Color(51, 255, 0));
        ta_11.setLineWrap(true);
        ta_11.setRows(1);
        ta_11.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "tempFrame.ta_15.text")); // NOI18N
        ta_11.setBorder(null);
        ta_11.setPreferredSize(new java.awt.Dimension(162, 14));
        jScrollPane8.setViewportView(ta_11);

        jScrollPane9.setBackground(new java.awt.Color(90, 90, 90));
        jScrollPane9.setBorder(null);
        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane9.setOpaque(false);

        ta_15.setEditable(false);
        ta_15.setBackground(new java.awt.Color(90, 90, 90));
        ta_15.setColumns(20);
        ta_15.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_15.setForeground(new java.awt.Color(51, 255, 0));
        ta_15.setLineWrap(true);
        ta_15.setRows(1);
        ta_15.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "tempFrame.ta_15.text")); // NOI18N
        ta_15.setBorder(null);
        jScrollPane9.setViewportView(ta_15);

        jScrollPane10.setBorder(null);
        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ta_13.setEditable(false);
        ta_13.setBackground(new java.awt.Color(90, 90, 90));
        ta_13.setColumns(20);
        ta_13.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_13.setForeground(new java.awt.Color(51, 255, 0));
        ta_13.setLineWrap(true);
        ta_13.setRows(1);
        ta_13.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "tempFrame.ta_15.text")); // NOI18N
        ta_13.setBorder(null);
        jScrollPane10.setViewportView(ta_13);

        jScrollPane11.setBorder(null);
        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ta_14.setEditable(false);
        ta_14.setBackground(new java.awt.Color(90, 90, 90));
        ta_14.setColumns(20);
        ta_14.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_14.setForeground(new java.awt.Color(51, 255, 0));
        ta_14.setLineWrap(true);
        ta_14.setRows(1);
        ta_14.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "tempFrame.ta_15.text")); // NOI18N
        ta_14.setBorder(null);
        jScrollPane11.setViewportView(ta_14);

        jScrollPane12.setBorder(null);
        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ta_16.setEditable(false);
        ta_16.setBackground(new java.awt.Color(90, 90, 90));
        ta_16.setColumns(20);
        ta_16.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_16.setForeground(new java.awt.Color(51, 255, 0));
        ta_16.setLineWrap(true);
        ta_16.setRows(1);
        ta_16.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "tempFrame.ta_15.text")); // NOI18N
        ta_16.setBorder(null);
        jScrollPane12.setViewportView(ta_16);

        jScrollPane13.setBorder(null);
        jScrollPane13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ta_5.setEditable(false);
        ta_5.setBackground(new java.awt.Color(90, 90, 90));
        ta_5.setColumns(20);
        ta_5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_5.setForeground(new java.awt.Color(51, 255, 0));
        ta_5.setLineWrap(true);
        ta_5.setRows(1);
        ta_5.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "tempFrame.ta_15.text")); // NOI18N
        ta_5.setToolTipText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "MatrixMagic.ta_5.toolTipText")); // NOI18N
        ta_5.setBorder(null);
        jScrollPane13.setViewportView(ta_5);

        jScrollPane14.setBorder(null);
        jScrollPane14.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ta_6.setEditable(false);
        ta_6.setBackground(new java.awt.Color(90, 90, 90));
        ta_6.setColumns(20);
        ta_6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_6.setForeground(new java.awt.Color(51, 255, 0));
        ta_6.setLineWrap(true);
        ta_6.setRows(1);
        ta_6.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "tempFrame.ta_15.text")); // NOI18N
        ta_6.setBorder(null);
        jScrollPane14.setViewportView(ta_6);

        jScrollPane15.setBorder(null);
        jScrollPane15.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane15.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ta_3.setEditable(false);
        ta_3.setBackground(new java.awt.Color(90, 90, 90));
        ta_3.setColumns(20);
        ta_3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_3.setForeground(new java.awt.Color(51, 255, 0));
        ta_3.setLineWrap(true);
        ta_3.setRows(1);
        ta_3.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "tempFrame.ta_15.text")); // NOI18N
        ta_3.setBorder(null);
        jScrollPane15.setViewportView(ta_3);

        jScrollPane16.setBackground(new java.awt.Color(90, 90, 90));
        jScrollPane16.setBorder(null);
        jScrollPane16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane16.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane16.setOpaque(false);

        ta_1.setEditable(false);
        ta_1.setBackground(new java.awt.Color(90, 90, 90));
        ta_1.setColumns(20);
        ta_1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_1.setForeground(new java.awt.Color(51, 255, 0));
        ta_1.setLineWrap(true);
        ta_1.setRows(1);
        ta_1.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "MatrixMagic.ta_22.text")); // NOI18N
        jScrollPane16.setViewportView(ta_1);

        jScrollPane17.setBorder(null);
        jScrollPane17.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane17.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ta_17.setEditable(false);
        ta_17.setBackground(new java.awt.Color(90, 90, 90));
        ta_17.setColumns(20);
        ta_17.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_17.setForeground(new java.awt.Color(51, 255, 0));
        ta_17.setLineWrap(true);
        ta_17.setRows(1);
        ta_17.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "tempFrame.ta_15.text")); // NOI18N
        ta_17.setBorder(null);
        jScrollPane17.setViewportView(ta_17);

        jScrollPane18.setBorder(null);
        jScrollPane18.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane18.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ta_18.setEditable(false);
        ta_18.setBackground(new java.awt.Color(90, 90, 90));
        ta_18.setColumns(20);
        ta_18.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_18.setForeground(new java.awt.Color(51, 255, 0));
        ta_18.setLineWrap(true);
        ta_18.setRows(1);
        ta_18.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "MatrixMagic.ta_22.text")); // NOI18N
        ta_18.setBorder(null);
        jScrollPane18.setViewportView(ta_18);

        jScrollPane19.setBorder(null);
        jScrollPane19.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane19.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ta_19.setEditable(false);
        ta_19.setBackground(new java.awt.Color(90, 90, 90));
        ta_19.setColumns(20);
        ta_19.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_19.setForeground(new java.awt.Color(51, 255, 0));
        ta_19.setLineWrap(true);
        ta_19.setRows(1);
        ta_19.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "MatrixMagic.ta_22.text")); // NOI18N
        ta_19.setBorder(null);
        jScrollPane19.setViewportView(ta_19);

        jScrollPane20.setBorder(null);
        jScrollPane20.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane20.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ta_20.setEditable(false);
        ta_20.setBackground(new java.awt.Color(90, 90, 90));
        ta_20.setColumns(20);
        ta_20.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_20.setForeground(new java.awt.Color(51, 255, 0));
        ta_20.setLineWrap(true);
        ta_20.setRows(1);
        ta_20.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "MatrixMagic.ta_22.text")); // NOI18N
        ta_20.setBorder(null);
        jScrollPane20.setViewportView(ta_20);

        jScrollPane21.setBorder(null);
        jScrollPane21.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane21.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ta_21.setEditable(false);
        ta_21.setBackground(new java.awt.Color(90, 90, 90));
        ta_21.setColumns(20);
        ta_21.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_21.setForeground(new java.awt.Color(51, 255, 0));
        ta_21.setLineWrap(true);
        ta_21.setRows(1);
        ta_21.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "MatrixMagic.ta_22.text")); // NOI18N
        ta_21.setBorder(null);
        jScrollPane21.setViewportView(ta_21);

        jScrollPane22.setBorder(null);
        jScrollPane22.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane22.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ta_22.setEditable(false);
        ta_22.setBackground(new java.awt.Color(90, 90, 90));
        ta_22.setColumns(20);
        ta_22.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta_22.setForeground(new java.awt.Color(51, 255, 0));
        ta_22.setLineWrap(true);
        ta_22.setRows(1);
        ta_22.setText(org.openide.util.NbBundle.getMessage(MatrixMagic.class, "MatrixMagic.ta_22.text")); // NOI18N
        ta_22.setBorder(null);
        jScrollPane22.setViewportView(ta_22);

        javax.swing.GroupLayout pnLayout = new javax.swing.GroupLayout(pn);
        pn.setLayout(pnLayout);
        pnLayout.setHorizontalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnLayout.setVerticalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane15)
            .addComponent(jScrollPane2)
            .addComponent(jScrollPane14)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane4)
            .addComponent(jScrollPane6)
            .addComponent(jScrollPane3)
            .addComponent(jScrollPane5)
            .addComponent(jScrollPane8)
            .addComponent(jScrollPane7)
            .addComponent(jScrollPane10)
            .addComponent(jScrollPane11)
            .addComponent(jScrollPane9)
            .addComponent(jScrollPane12)
            .addComponent(jScrollPane17)
            .addComponent(jScrollPane22)
            .addComponent(jScrollPane21)
            .addComponent(jScrollPane20, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane19)
            .addComponent(jScrollPane18)
        );

        bt_gen.setBackground(new java.awt.Color(0, 153, 153));
        bt_gen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_gen.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(bt_gen, org.openide.util.NbBundle.getMessage(MatrixMagic.class, "MatrixMagic.bt_gen.text")); // NOI18N
        bt_gen.setBorderPainted(false);
        bt_gen.setContentAreaFilled(false);
        bt_gen.setFocusable(false);
        bt_gen.setOpaque(true);
        bt_gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_genActionPerformed(evt);
            }
        });

        bt_gen1.setBackground(new java.awt.Color(255, 51, 51));
        bt_gen1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_gen1.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(bt_gen1, org.openide.util.NbBundle.getMessage(MatrixMagic.class, "MatrixMagic.bt_gen1.text")); // NOI18N
        bt_gen1.setBorderPainted(false);
        bt_gen1.setFocusable(false);
        bt_gen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_gen1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_gen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_gen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(bt_gen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_gen1)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_genActionPerformed
      
        switch((int)(13 * Math.random())) {
          case 1: pn.setBackground(new Color(0,204,51)); bt_gen.setBackground(new Color(0,204,51)); break;
          case 2: pn.setBackground(new Color(51,255,51)); bt_gen.setBackground(new Color(51,255,51)); break;
          case 3: pn.setBackground(new Color(0,204,204)); bt_gen.setBackground(new Color(0,204,204)); break;
          case 4: pn.setBackground(new Color(51,255,255)); bt_gen.setBackground(new Color(51,255,255)); break;
          case 5: pn.setBackground(new Color(102,255,102)); bt_gen.setBackground(new Color(102,255,102)); break;
          case 6: pn.setBackground(new Color(102,102,102)); bt_gen.setBackground(new Color(102,102,102)); break;
          case 7: pn.setBackground(new Color(255,102,102)); bt_gen.setBackground(new Color(255,102,102)); break;
          case 8: pn.setBackground(new Color(255,255,51)); bt_gen.setBackground(new Color(255,255,51)); break;
          case 9: pn.setBackground(new Color(153,102,255)); bt_gen.setBackground(new Color(153,102,255)); break;
          case 10: pn.setBackground(new Color(51,51,255)); bt_gen.setBackground(new Color(51,51,255)); break;
          case 11: pn.setBackground(new Color(0,204,204)); bt_gen.setBackground(new Color(0,204,204)); break;
          case 12: pn.setBackground(new Color(0,153,153)); bt_gen.setBackground(new Color(0,153,153)); break;
          case 13: pn.setBackground(new Color(153,255,153)); bt_gen.setBackground(new Color(153,255,153)); break;
          default : pn.setBackground(new Color(90, 90, 90)); bt_gen.setBackground(new Color(90, 90, 90));
        }
   
   //      pn.setBackground(new Color(1, 1, 1, 0.2f));  bt_gen.setBackground(new Color(1, 1, 1, 0.6f));
      
    }//GEN-LAST:event_bt_genActionPerformed

    private void bt_gen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_gen1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_bt_gen1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MatrixMagic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatrixMagic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatrixMagic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatrixMagic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  new MatrixMagic();  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_gen;
    private javax.swing.JButton bt_gen1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel pn;
    private javax.swing.JTextArea ta_1;
    private javax.swing.JTextArea ta_10;
    private javax.swing.JTextArea ta_11;
    private javax.swing.JTextArea ta_12;
    private javax.swing.JTextArea ta_13;
    private javax.swing.JTextArea ta_14;
    private javax.swing.JTextArea ta_15;
    private javax.swing.JTextArea ta_16;
    private javax.swing.JTextArea ta_17;
    private javax.swing.JTextArea ta_18;
    private javax.swing.JTextArea ta_19;
    private javax.swing.JTextArea ta_2;
    private javax.swing.JTextArea ta_20;
    private javax.swing.JTextArea ta_21;
    private javax.swing.JTextArea ta_22;
    private javax.swing.JTextArea ta_3;
    private javax.swing.JTextArea ta_4;
    private javax.swing.JTextArea ta_5;
    private javax.swing.JTextArea ta_6;
    private javax.swing.JTextArea ta_7;
    private javax.swing.JTextArea ta_8;
    private javax.swing.JTextArea ta_9;
    // End of variables declaration//GEN-END:variables
}
