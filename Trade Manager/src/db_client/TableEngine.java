package db_client;

import gui.homePage;
import static gui.homePage.user_perm;
import static gui.Init.rs;
import static gui.Init.rs1;
import static gui.Init.rs2;
import static gui.Init.st;
import static gui.Init.st1;
import static gui.Init.st2;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ListIterator;
import java.util.ArrayList;
import java.sql.ResultSetMetaData;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.EventObject;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipEntry;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class TableEngine {
    static int l_new_sn = 0, l_display_row=0, l_table_rows=0, l_row_index = 0, l_last_upd=0, row1=0, l_colNum; static boolean l_is_clicked = true; static String l_current_col, l_current_order;
    static JTable l_table;  static DefaultTableModel l_md;
    static BufferedReader l_br; static BufferedWriter l_bw;
    static ResultSetMetaData l_rsmd;
    static ArrayList<String> l_al, l_al_col_name, l_al_col_type; static ListIterator<String> l_li;
    static JPopupMenu l_menu; static JMenuItem l_add, l_dlt, l_ref; static JSeparator l_sept;
    static Object[] l_col; static String l_table_name, l_file_name, ad_ex;
    static FileInputStream fis; static FileOutputStream fos;
    static ZipInputStream zis; static ZipEntry ze;
    static String soft_ver, prev_ver, req_ver, col_name;
    static boolean u = false, f_ex=false;
    
    public static class Inner {
        static private void setRsmd() {try{ l_rsmd =rs.getMetaData(); }catch(Exception e){};}
        static public void prepareColumnData(String table_name, String file_name, Object ob) {
        try {
            getTableDetails(table_name, homePage.PATH+"/"+file_name);
            String str=null; String[] st_arr; try{l_br = new BufferedReader(new FileReader(homePage.PATH+"/"+file_name));}catch(Exception e){e.printStackTrace();} l_al = new ArrayList<>(); l_al_col_name = new ArrayList<>(); l_al_col_type = new ArrayList<>();
            while((str = l_br.readLine()) != null) l_al.add(str);  l_li = l_al.listIterator();
            while(l_li.hasNext()) {
                st_arr = l_li.next().split("\t");
                l_al_col_name.add(st_arr[0].trim()); l_al_col_type.add(st_arr[1].trim());
                switch(table_name) {
                    case "money_tran" :  Money_Tran mt = (Money_Tran)ob; mt.al_col_name = l_al_col_name; mt.al_col_type = l_al_col_type; break;
                    case "emp_sew" : Sewing sw = (Sewing)ob; sw.al_col_name = l_al_col_name; sw.al_col_type = l_al_col_type; break;
                    case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; swd.al_col_name = l_al_col_name; swd.al_col_type = l_al_col_type; break;
                    case "emp_raw" : RawWorker rw = (RawWorker)ob; rw.al_col_name = l_al_col_name; rw.al_col_type = l_al_col_type; break;
                    case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob; rwd.al_col_name = l_al_col_name; rwd.al_col_type = l_al_col_type; break;
                    case "merchant" : Merchants m = (Merchants)ob; m.al_col_name = l_al_col_name; m.al_col_type = l_al_col_type; break;
                    case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob; mdd.al_col_name = l_al_col_name; mdd.al_col_type = l_al_col_type; break;
                    case "raw_material" : RawMaterial rm = (RawMaterial)ob; rm.al_col_name = l_al_col_name; rm.al_col_type = l_al_col_type; break;
                    case "ready_material" : Ready r = (Ready)ob; r.al_col_name = l_al_col_name; r.al_col_type = l_al_col_type; break;
                }
            } 
        }catch(Exception e) {e.printStackTrace();}// {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
    }
        static private void getTableDetails(String table_name, String fileName) {
        String col_name, col_type;
        try {  setRsmd();
            rs = st.executeQuery("select * from "+table_name+";");  l_rsmd = rs.getMetaData();
            l_bw = new BufferedWriter(new FileWriter(fileName, false));
            for(int i=1; i<l_rsmd.getColumnCount(); i++) {
                col_name = l_rsmd.getColumnName(i);
                col_type = l_rsmd.getColumnTypeName(i);
                l_bw.write(col_name+"\t"+col_type+"\n");
            }
         l_bw.close(); 
        }catch(Exception e) {e.printStackTrace();}// {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
    }
        static public void addRow(int row_index, DefaultTableModel md, String table_name, Object ob) {
        l_row_index = ++row_index;
        md.addRow(new Object[] {l_row_index}); 
             switch(table_name) {
               case "money_tran" : Money_Tran mt = (Money_Tran)ob; mt.is_clicked = false; Money_Tran.row_index = l_row_index; break;
               case "emp_sew" : Sewing sw = (Sewing)ob; sw.is_clicked = false; Sewing.row_index = l_row_index; break;
               case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; swd.is_clicked = false; SewingWorkerDetails.row_index = l_row_index; break;
               case "emp_raw" : RawWorker rw = (RawWorker)ob; rw.is_clicked = false; RawWorker.row_index = l_row_index; break;
               case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob; rwd.is_clicked = false; RawWorkerDetails.row_index = l_row_index; break;
               case "merchant" : Merchants m = (Merchants)ob; m.is_clicked = false; Merchants.row_index = l_row_index; break;
               case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob; mdd.is_clicked = false; MerchantDetails.row_index = l_row_index; break;
               case "raw_material" : RawMaterial rm = (RawMaterial)ob; rm.is_clicked = false; RawMaterial.row_index = l_row_index; break;
               case "ready_material" : Ready r = (Ready)ob; r.is_clicked = false; Ready.row_index = l_row_index; break;
             }
        }
        static public void removeRow(JTable table, String table_name, DefaultTableModel md, Object ob) {
        int[] sel_rows = table.getSelectedRows();
        try { 
           for(int i: sel_rows) {  
               st.executeUpdate("delete from "+table_name+" where Sno = "+table.getValueAt(table.getSelectedRow(), 0)+";"); md.removeRow(table.getSelectedRow());
           }
        } catch(Exception e) {e.printStackTrace();}
        display(table_name, md, table, ob);
    }
        static public void display(String table_name, DefaultTableModel md, JTable table, Object ob) { 
        try {
             md.setRowCount(0);
             rs = st.executeQuery("select * from "+table_name+" order by Sno asc;"); l_rsmd = rs.getMetaData();            
             int row=1;
             while(rs.next()) { md.addRow(new Object[] {row});  
              st1.executeUpdate("update "+table_name+" set Sno = "+row+" where Sno = "+rs.getInt(1)+";");
              for(int col=2; col<l_rsmd.getColumnCount(); col++)  md.setValueAt(rs.getObject(col), row-1, col-1);
              row++;
             } int i = --row;
            cellEditingOfCol0(table);
            switch(table_name) {
               case "money_tran" : Money_Tran mt = (Money_Tran)ob; Money_Tran.row_index = i; mt.new_sn = ++row; mt.current_col= "sno"; mt.current_order = "asc"; break;
               case "emp_sew" : Sewing sw = (Sewing)ob; Sewing.row_index = i; sw.new_sn = ++row; sw.current_col= "sno"; sw.current_order = "asc"; break;
               case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; SewingWorkerDetails.row_index = i; swd.new_sn = ++row; swd.current_col= "sno"; swd.current_order = "asc"; break;
               case "emp_raw" : RawWorker rw = (RawWorker)ob; RawWorker.row_index = i; rw.new_sn = ++row; rw.current_col= "sno"; rw.current_order = "asc"; break;
               case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob; RawWorkerDetails.row_index = i; rwd.new_sn = ++row; rwd.current_col= "sno"; rwd.current_order = "asc"; break;
               case "merchant" : Merchants m = (Merchants)ob; Merchants.row_index = i; m.new_sn = ++row; m.current_col= "sno"; m.current_order = "asc"; break;
               case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob; MerchantDetails.row_index = i; mdd.new_sn = ++row; mdd.current_col= "sno"; mdd.current_order = "asc"; break;
               case "raw_material" : RawMaterial rm = (RawMaterial)ob; RawMaterial.row_index = i; rm.new_sn = ++row; rm.current_col= "sno"; rm.current_order = "asc"; break;
               case "ready_material" : Ready r = (Ready)ob; Ready.row_index = i; r.new_sn = ++row; r.current_col= "sno"; r.current_order = "asc"; break;
            }
        } catch(Exception e) {e.printStackTrace();}// {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);} 
    }
        static public void display(String table_name, DefaultTableModel md, String col_name, String order, JTable table, Object ob) { 
          try {
             md.setRowCount(0);
             rs = st.executeQuery("select * from "+table_name+" order by "+col_name+" "+order+";"); l_rsmd = rs.getMetaData();    
             int row=0;
             while(rs.next()) { 
              md.addRow(new Object[] {rs.getInt(1)});
             for(int col=2; col<l_rsmd.getColumnCount(); col++) { 
                       md.setValueAt(rs.getObject(col), row, col-1);
                  } row++;
             }
            cellEditingOfCol0(table);
            switch(table_name) {
               case "money_tran" : Money_Tran mt = (Money_Tran)ob; Money_Tran.row_index = row; mt.new_sn = ++row; mt.current_col= col_name; mt.current_order = order; break;
               case "emp_sew" : Sewing sw = (Sewing)ob; Sewing.row_index = row; sw.new_sn = ++row; sw.current_col= col_name; sw.current_order = order; break;
               case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; SewingWorkerDetails.row_index = row; swd.new_sn = ++row; swd.current_col= col_name; swd.current_order = order; break;
               case "emp_raw" : RawWorker rw = (RawWorker)ob; RawWorker.row_index = row; rw.new_sn = ++row; rw.current_col= col_name; rw.current_order = order; break;
               case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob; RawWorkerDetails.row_index = row; rwd.new_sn = ++row; rwd.current_col= col_name; rwd.current_order = order; break;
               case "merchant" : Merchants m = (Merchants)ob; Merchants.row_index = row; m.new_sn = ++row; m.current_col= col_name; m.current_order = order; break;
               case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob; MerchantDetails.row_index = row; mdd.new_sn = ++row; mdd.current_col= col_name; mdd.current_order = order; break;
               case "raw_material" : RawMaterial rm = (RawMaterial)ob; RawMaterial.row_index = row; rm.new_sn = ++row; rm.current_col= col_name; rm.current_order = order; break;
               case "ready_material" : Ready r = (Ready)ob; Ready.row_index = row; r.new_sn = ++row; r.current_col= col_name; r.current_order = order; break;
            }
        } catch(Exception e) {e.printStackTrace();}// {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);} 
    }
        static public void cellEditingOfCol0(JTable table) {
        table.getColumnModel().getColumn(0).setCellEditor(new javax.swing.table.TableCellEditor() {
                      @Override
                      public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                          throw new UnsupportedOperationException("Not supported yet.");
                      }

                      @Override
                      public Object getCellEditorValue() {
                          throw new UnsupportedOperationException("Not supported yet.");
                      }

                      @Override
                      public boolean isCellEditable(EventObject anEvent) {
                          return false;
                      }

                      @Override
                      public boolean shouldSelectCell(EventObject anEvent) {
                           return false;                         
                      }

                      @Override
                      public boolean stopCellEditing() {
                          return true;
                      }

                      @Override
                      public void cancelCellEditing() {}

                      @Override
                      public void addCellEditorListener(CellEditorListener l) {}

                      @Override
                      public void removeCellEditorListener(CellEditorListener l) {}
                  });
    }
        static public void popUpMenu(String table_name, Object ob) {
        l_sept = new JSeparator(); l_sept.setBackground(Color.gray);
        l_menu = new JPopupMenu(); l_menu.setBackground(Color.darkGray); 
        l_add = new JMenuItem("Add new Row"); l_add.setMnemonic('a'); l_add.setBackground(Color.darkGray);  l_add.setForeground(Color.white); 
        l_dlt = new JMenuItem("Delete this Row"); l_dlt.setMnemonic('d'); l_dlt.setBackground(Color.darkGray); l_dlt.setForeground(Color.white);
        l_ref = new JMenuItem("Refresh"); l_ref.setMnemonic('r'); l_ref.setBackground(Color.darkGray); l_ref.setForeground(Color.white);      
        l_add.addActionListener((java.awt.event.ActionEvent ae) -> {  
            switch(table_name) {
               case "money_tran" : Money_Tran mt = (Money_Tran)ob; mt.addRow(); break;
               case "emp_sew" : Sewing sw = (Sewing)ob; sw.addRow(); break;
               case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; swd.addRow(); break;
               case "emp_raw" : RawWorker rw = (RawWorker)ob; rw.addRow(); break;
               case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob; rwd.addRow(); break;
               case "merchant" : Merchants m = (Merchants)ob; m.addRow(); break;
               case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob; mdd.addRow(); break;
               case "raw_material" : RawMaterial rm = (RawMaterial)ob; rm.addRow(); break;
               case "ready_material" : Ready r = (Ready)ob; r.addRow(); break;
             }
        });
        l_dlt.addActionListener((java.awt.event.ActionEvent ae) -> {
            switch(table_name) {
               case "money_tran" : Money_Tran mt = (Money_Tran)ob; mt.removeRow(); break;
               case "emp_sew" : Sewing sw = (Sewing)ob; sw.removeRow(); break;
               case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; swd.removeRow(); break;
               case "emp_raw" : RawWorker rw = (RawWorker)ob; rw.removeRow(); break;
               case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob; rwd.removeRow(); break;
               case "merchant" : Merchants m = (Merchants)ob; m.removeRow(); break;
               case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob; mdd.removeRow(); break;
               case "raw_material" : RawMaterial rm = (RawMaterial)ob; rm.removeRow(); break;
               case "ready_material" : Ready r = (Ready)ob; r.removeRow(); break;
            } // end of switch
            });
        l_ref.addActionListener((java.awt.event.ActionEvent ae) -> {
           switch(table_name) {
               case "money_tran" : Money_Tran mt = (Money_Tran)ob; mt.sp.remove(mt.table); mt.prepareColumnData(); mt.createTable(); mt.cellEditingOfCol0(); mt.tableRendering(); mt.display(); break;
               case "emp_sew" : Sewing sw = (Sewing)ob; sw.sp.remove(sw.table); sw.prepareColumnData(); sw.createTable(); sw.cellEditingOfCol0(); sw.tableRendering(); sw.display(); break;
               case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; swd.sp.remove(swd.table); swd.prepareColumnData(); swd.createTable(); swd.cellEditingOfCol0(); swd.tableRendering(); swd.display(); break;
               case "emp_raw" : RawWorker rw = (RawWorker)ob; rw.sp.remove(rw.table); rw.prepareColumnData(); rw.createTable(); rw.cellEditingOfCol0(); rw.tableRendering(); rw.display(); break;
               case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob; rwd.sp.remove(rwd.table); rwd.prepareColumnData(); rwd.createTable(); rwd.cellEditingOfCol0(); rwd.tableRendering(); rwd.display(); break;
               case "merchant" : Merchants m = (Merchants)ob; m.sp.remove(m.table); m.prepareColumnData(); m.createTable(); m.cellEditingOfCol0(); m.tableRendering(); m.display(); break;
               case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob; mdd.sp.remove(mdd.table); mdd.prepareColumnData(); mdd.createTable(); mdd.cellEditingOfCol0(); mdd.tableRendering(); mdd.display(); break;
               case "raw_material" : RawMaterial rm = (RawMaterial)ob; rm.sp.remove(rm.table); rm.prepareColumnData(); rm.createTable(); rm.cellEditingOfCol0(); rm.tableRendering(); rm.display(); break;
               case "ready_material" : Ready r = (Ready)ob; r.sp.remove(r.table); r.prepareColumnData(); r.createTable(); r.cellEditingOfCol0(); r.tableRendering(); r.display(); break;
             }
        });
        switch(table_name) {
          case "money_tran" : Money_Tran mt = (Money_Tran)ob; mt.sept = l_sept; mt.menu = l_menu; mt.add = l_add; mt.dlt = l_dlt; mt.ref = l_ref; break;
          case "emp_sew" : Sewing sw = (Sewing)ob; sw.sept = l_sept; sw.menu = l_menu; sw.add = l_add; sw.dlt = l_dlt; sw.ref = l_ref; break;
          case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; swd.sept = l_sept; swd.menu = l_menu; swd.add = l_add; swd.dlt = l_dlt; swd.ref = l_ref; break;
          case "emp_raw" : RawWorker rw = (RawWorker)ob; rw.sept = l_sept; rw.menu = l_menu; rw.add = l_add; rw.dlt = l_dlt; rw.ref = l_ref; break;
          case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob; rwd.sept = l_sept; rwd.menu = l_menu; rwd.add = l_add; rwd.dlt = l_dlt; rwd.ref = l_ref; break;
          case "merchant" : Merchants m = (Merchants)ob; m.sept = l_sept; m.menu = l_menu; m.add = l_add; m.dlt = l_dlt; m.ref = l_ref; break;
          case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob; mdd.sept = l_sept; mdd.menu = l_menu; mdd.add = l_add; mdd.dlt = l_dlt; mdd.ref = l_ref; break;
          case "raw_material" : RawMaterial rm = (RawMaterial)ob; rm.sept = l_sept; rm.menu = l_menu; rm.add = l_add; rm.dlt = l_dlt; rm.ref = l_ref; break;
          case "ready_material" : Ready r = (Ready)ob; r.sept = l_sept; r.menu = l_menu; r.add = l_add; r.dlt = l_dlt; r.ref = l_ref; break;
        }
    }
        static public void tableRendering(JTable table) {
        table.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isselected, boolean hasFocus, int row, int column) {
                    Component c = super.getTableCellRendererComponent(table, value, isselected, hasFocus, row, column);
                    c.setBackground(row % 2 == 0 ? new java.awt.Color(60, 60, 60) : new java.awt.Color(100, 100, 100));
                    c.setForeground(java.awt.Color.white);
                    if(table.isCellSelected(row, column)) {
                        setBackground(new Color(35, 35, 35));
                    }
                    if(table.isRowSelected(row)) {
                        setForeground(Color.yellow);
                    }
                    return c;
                }
                
            });  table.setCellSelectionEnabled(true);
    }
        static public void createTable(ArrayList<String> al_col_name, JScrollPane sp, String table_name, Object ob) {
        l_col = al_col_name.toArray();
        l_table = new JTable(new DefaultTableModel(l_col, 0));
        l_md = (DefaultTableModel) l_table.getModel(); l_table.getTableHeader().setReorderingAllowed(false);
        l_table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        l_table.setSize(new java.awt.Dimension(858, 386));
        l_table.setFillsViewportHeight(true); sp.setViewportView(l_table);
        l_table.setBackground(new java.awt.Color(80,80,80));
        l_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        l_table.setFont(new java.awt.Font("Ebrima", 0, 16)); l_table.setForeground(new java.awt.Color(255, 255, 255));
        l_table.setGridColor(new java.awt.Color(153, 153, 153)); l_table.setRowHeight(30); l_table.setRowMargin(2);
        l_table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        popUpMenu(table_name, ob); 
        l_table.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
            public void mouseClicked(java.awt.event.MouseEvent me) {
               setPopupMenuOnTable(table_name, ob);
            }
        });
        cellEditingOfCol0(l_table);
         switch(table_name) {
           case "money_tran" : Money_Tran mt = (Money_Tran)ob; mt.table = l_table; mt.md = l_md; break;
           case "emp_sew" : Sewing sw = (Sewing)ob; sw.table = l_table; sw.md = l_md; break;
           case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; swd.table = l_table; swd.md = l_md; break;
           case "emp_raw" : RawWorker rw = (RawWorker)ob; rw.table = l_table; rw.md = l_md; break;
           case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob; rwd.table = l_table; rwd.md = l_md; break;
           case "merchant" : Merchants m = (Merchants)ob; m.table = l_table; m.md = l_md; break;
           case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob; mdd.table = l_table; mdd.md = l_md; break;
           case "raw_material" : RawMaterial rm = (RawMaterial)ob; rm.table = l_table; rm.md = l_md; break;
           case "ready_material" : Ready r = (Ready)ob; r.table = l_table; r.md = l_md; break;
         }
    }
        static private void setPopupMenuOnTable(String table_name, Object ob) {
        int j=0;
        switch(table_name) {
            case "money_tran" : Money_Tran mt = (Money_Tran)ob;
               for(int i=0; i<mt.table.getRowCount(); i++) if(mt.table.isRowSelected(i)) {j=1; break;}
               if(j==1) {mt.menu.removeAll(); mt.menu.add(mt.ref); mt.menu.add(mt.add); mt.menu.add(mt.dlt); mt.menu.add(mt.sept); mt.table.setComponentPopupMenu(mt.menu);}
               else {mt.menu.removeAll(); mt.menu.add(mt.ref); mt.menu.add(mt.add); mt.table.setComponentPopupMenu(mt.menu);} 
               if(user_perm.charAt(0) == '0') {mt.menu.remove(mt.dlt); mt.menu.remove(mt.ref);} else {mt.menu.add(mt.dlt); mt.menu.add(mt.ref);}
               if(user_perm.charAt(1) == '0') mt.menu.remove(mt.add); else mt.menu.add(mt.add);
               if(user_perm.charAt(2) == '0') mt.menu.remove(mt.dlt); else mt.menu.add(mt.dlt);
               break;
            case "emp_sew" : Sewing sw = (Sewing)ob; 
               for(int i=0; i<sw.table.getRowCount(); i++) if(sw.table.isRowSelected(i)) {j=1; break;}
               if(j==1) {sw.menu.removeAll(); sw.menu.add(sw.ref); sw.menu.add(sw.add); sw.menu.add(sw.dlt); sw.menu.add(sw.sept); sw.table.setComponentPopupMenu(sw.menu);}
               else {sw.menu.removeAll(); sw.menu.add(sw.ref); sw.menu.add(sw.add); sw.table.setComponentPopupMenu(sw.menu);} 
               if(user_perm.charAt(0) == '0') {sw.menu.remove(sw.dlt); sw.menu.remove(sw.ref);} else {sw.menu.add(sw.dlt); sw.menu.add(sw.ref);}
               if(user_perm.charAt(1) == '0') sw.menu.remove(sw.add); else sw.menu.add(sw.add);
               if(user_perm.charAt(2) == '0') sw.menu.remove(sw.dlt); else sw.menu.add(sw.dlt);
               javax.swing.JMenuItem swdd = new JMenuItem("Sewing Worker Details"); swdd.setMnemonic('s'); swdd.setBackground(Color.darkGray); swdd.setForeground(Color.white);
               sw.menu.add(swdd); swdd.addActionListener((java.awt.event.ActionEvent ae) -> {homePage.setSwd();});
               break;
            case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; swd.setPermittedComponents(user_perm);
               for(int i=0; i<swd.table.getRowCount(); i++) if(swd.table.isRowSelected(i)) {j=1; break;}
               if(j==1) {swd.menu.removeAll(); swd.menu.add(swd.ref); swd.menu.add(swd.add); swd.menu.add(swd.dlt); swd.menu.add(swd.sept); swd.table.setComponentPopupMenu(swd.menu);}
               else {swd.menu.removeAll(); swd.menu.add(swd.ref); swd.menu.add(swd.add); swd.table.setComponentPopupMenu(swd.menu);} 
               if(user_perm.charAt(0) == '0') {swd.menu.remove(swd.dlt); swd.menu.remove(swd.ref);} else {swd.menu.add(swd.dlt); swd.menu.add(swd.ref);}
               if(user_perm.charAt(1) == '0') swd.menu.remove(swd.add); else swd.menu.add(swd.add);
               if(user_perm.charAt(2) == '0') swd.menu.remove(swd.dlt); else swd.menu.add(swd.dlt);
               javax.swing.JMenuItem sww = new JMenuItem("Sewing Workers"); sww.setMnemonic('s'); sww.setBackground(Color.darkGray); sww.setForeground(Color.white);
               swd.menu.add(sww); sww.addActionListener((java.awt.event.ActionEvent ae) -> {homePage.setSw();});
               break;
            case "emp_raw" : RawWorker rw = (RawWorker)ob;
               for(int i=0; i<rw.table.getRowCount(); i++) if(rw.table.isRowSelected(i)) {j=1; break;}
               if(j==1) {rw.menu.removeAll(); rw.menu.add(rw.ref); rw.menu.add(rw.add); rw.menu.add(rw.dlt); rw.menu.add(rw.sept); rw.table.setComponentPopupMenu(rw.menu);}
               else {rw.menu.removeAll(); rw.menu.add(rw.ref); rw.menu.add(rw.add); rw.table.setComponentPopupMenu(rw.menu);} 
               if(user_perm.charAt(0) == '0') {rw.menu.remove(rw.dlt); rw.menu.remove(rw.ref);} else {rw.menu.add(rw.dlt); rw.menu.add(rw.ref);}
               if(user_perm.charAt(1) == '0') rw.menu.remove(rw.add); else rw.menu.add(rw.add);
               if(user_perm.charAt(2) == '0') rw.menu.remove(rw.dlt); else rw.menu.add(rw.dlt);
               javax.swing.JMenuItem rwdd = new JMenuItem("Raw Worker Details"); rwdd.setMnemonic('r'); rwdd.setBackground(Color.darkGray); rwdd.setForeground(Color.white);
               rw.menu.add(rwdd); rwdd.addActionListener((java.awt.event.ActionEvent ae) -> {homePage.setRwd();});
               break;
            case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob;  rwd.setPermittedComponents(user_perm);
               for(int i=0; i<rwd.table.getRowCount(); i++) if(rwd.table.isRowSelected(i)) {j=1; break;}
               if(j==1) {rwd.menu.removeAll(); rwd.menu.add(rwd.ref); rwd.menu.add(rwd.add); rwd.menu.add(rwd.dlt); rwd.menu.add(rwd.sept); rwd.table.setComponentPopupMenu(rwd.menu);}
               else {rwd.menu.removeAll(); rwd.menu.add(rwd.ref); rwd.menu.add(rwd.add); rwd.table.setComponentPopupMenu(rwd.menu);} 
               if(user_perm.charAt(0) == '0') {rwd.menu.remove(rwd.dlt); rwd.menu.remove(rwd.ref);} else {rwd.menu.add(rwd.dlt); rwd.menu.add(rwd.ref);}
               if(user_perm.charAt(1) == '0') rwd.menu.remove(rwd.add); else rwd.menu.add(rwd.add);
               if(user_perm.charAt(2) == '0') rwd.menu.remove(rwd.dlt); else rwd.menu.add(rwd.dlt);
               javax.swing.JMenuItem rww = new JMenuItem("Raw Worker"); rww.setMnemonic('r'); rww.setBackground(Color.darkGray); rww.setForeground(Color.white);
               rwd.menu.add(rww); rww.addActionListener((java.awt.event.ActionEvent ae) -> {homePage.setRw();});
               break;
            case "merchant" : Merchants m = (Merchants)ob;for(int i=0; i<m.table.getRowCount(); i++) if(m.table.isRowSelected(i)) {j=1; break;}
               if(j==1) {m.menu.removeAll(); m.menu.add(m.ref); m.menu.add(m.add); m.menu.add(m.dlt); m.menu.add(m.sept); m.table.setComponentPopupMenu(m.menu);}
               else {m.menu.removeAll(); m.menu.add(m.ref); m.menu.add(m.add); m.table.setComponentPopupMenu(m.menu);} 
               if(user_perm.charAt(0) == '0') {m.menu.remove(m.dlt); m.menu.remove(m.ref);} else {m.menu.add(m.dlt); m.menu.add(m.ref);}
               if(user_perm.charAt(1) == '0') m.menu.remove(m.add); else m.menu.add(m.add);
               if(user_perm.charAt(2) == '0') m.menu.remove(m.dlt); else m.menu.add(m.dlt);
               javax.swing.JMenuItem mddd = new JMenuItem("Merchant Details"); mddd.setMnemonic('m'); mddd.setBackground(Color.darkGray); mddd.setForeground(Color.white);
               m.menu.add(mddd); mddd.addActionListener((java.awt.event.ActionEvent ae) -> {homePage.setMerd();});
               break;
            case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob;  mdd.setPermittedComponents(user_perm);
               for(int i=0; i<mdd.table.getRowCount(); i++) if(mdd.table.isRowSelected(i)) {j=1; break;}
               if(j==1) {mdd.menu.removeAll(); mdd.menu.add(mdd.ref); mdd.menu.add(mdd.add); mdd.menu.add(mdd.dlt); mdd.menu.add(mdd.sept); mdd.table.setComponentPopupMenu(mdd.menu);}
               else {mdd.menu.removeAll(); mdd.menu.add(mdd.ref); mdd.menu.add(mdd.add); mdd.table.setComponentPopupMenu(mdd.menu);} 
               if(user_perm.charAt(0) == '0') {mdd.menu.remove(mdd.dlt); mdd.menu.remove(mdd.ref);} else {mdd.menu.add(mdd.dlt); mdd.menu.add(mdd.ref);}
               if(user_perm.charAt(1) == '0') mdd.menu.remove(mdd.add); else mdd.menu.add(mdd.add);
               if(user_perm.charAt(2) == '0') mdd.menu.remove(mdd.dlt); else mdd.menu.add(mdd.dlt);
               javax.swing.JMenuItem mm = new JMenuItem("Merchants"); mm.setMnemonic('m'); mm.setBackground(Color.darkGray); mm.setForeground(Color.white);
               mdd.menu.add(mm); mm.addActionListener((java.awt.event.ActionEvent ae) -> {homePage.setMer();});
               break;
            case "raw_material" : RawMaterial rm = (RawMaterial)ob;
               for(int i=0; i<rm.table.getRowCount(); i++) if(rm.table.isRowSelected(i)) {j=1; break;}
               if(j==1) {rm.menu.removeAll(); rm.menu.add(rm.ref); rm.menu.add(rm.add); rm.menu.add(rm.dlt); rm.menu.add(rm.sept); rm.table.setComponentPopupMenu(rm.menu);}
               else {rm.menu.removeAll(); rm.menu.add(rm.ref); rm.menu.add(rm.add); rm.table.setComponentPopupMenu(rm.menu);} 
               if(user_perm.charAt(0) == '0') {rm.menu.remove(rm.dlt); rm.menu.remove(rm.ref);} else {rm.menu.add(rm.dlt); rm.menu.add(rm.ref);} 
               if(user_perm.charAt(1) == '0') rm.menu.remove(rm.add); else rm.menu.add(rm.add);
               if(user_perm.charAt(2) == '0') rm.menu.remove(rm.dlt); else rm.menu.add(rm.dlt);
               break;
             
            case "ready_material" : Ready r = (Ready)ob;
               for(int i=0; i<r.table.getRowCount(); i++) if(r.table.isRowSelected(i)) {j=1; break;}
               if(j==1) {r.menu.removeAll(); r.menu.add(r.ref); r.menu.add(r.add); r.menu.add(r.dlt); r.menu.add(r.sept); r.table.setComponentPopupMenu(r.menu);}
               else {r.menu.removeAll(); r.menu.add(r.ref); r.menu.add(r.add); r.table.setComponentPopupMenu(r.menu);} 
               if(user_perm.charAt(0) == '0') {r.menu.remove(r.dlt); r.menu.remove(r.ref);} else {r.menu.add(r.dlt); r.menu.add(r.ref);}
               if(user_perm.charAt(1) == '0') r.menu.remove(r.add); else r.menu.add(r.add);
               if(user_perm.charAt(2) == '0') r.menu.remove(r.dlt); else r.menu.add(r.dlt);
               break;
       }
            
    }
        static public void addData(int new_sn, int row, int col, boolean is_clicked, String table_name, String file_name, DefaultTableModel md, JTable table, ArrayList<String> al_col_type, ArrayList<String> al_col_name, Object ob) {
         try { if(homePage.user_perm.charAt(0) == '0') {addData(new_sn, row, -1, table_name, is_clicked, file_name, md, table, al_col_type, al_col_name, ob); return;}
            if(is_clicked) {  homePage.pe.ta_msg.setText("Add new row to add data into Database"); homePage.pe.setVisible(true); homePage.pe.exit(false); throw new EmptyFieldException("Add new row to add data into Database");}
            prepareColumnData(table_name, file_name, ob); 
            while(row<=md.getRowCount()) {
                while(++col < md.getColumnCount()) { l_colNum = col;
                    Object o = md.getValueAt(row-1, col);  col_name = table.getColumnName(col);
                       new Thread(() -> {
                           switch(al_col_type.get(l_colNum)) {
                              case "INT":    ad_ex = "Value must be of Integer type.\nFor ex  ->  12,  0,  -4  etc.\n\n"; break;
                              case "FLOAT":  ad_ex = "Value must be of float type.\nFor ex  ->  12.03,  0,  -4.08,  92  etc.\n\n"; break;
                              case "DATE":   ad_ex = "Value must be of Date type.\nFor ex  ->  '1999-01-02'  [YYYY-MM-DD] .\n\n"; break;
                              case "BIGINT": ad_ex = "Value must be of long Integer type.\n\nFor ex  ->  Value should not Consist of :\n"
                                             + "1.  Alphabets and Special Symbols  [k,  N,  %,  (),  @]\n"
                                             + "2.  Decimal  [3.02, 2.99] as It will store value after round off (if possible) which may lead to data inconsistency.\n"
                                             + "3.  Date   [1999-02-03]"
                                             + "\nIt only consist of Integers to store long length value such as - Mobile Number.\n\n"; break;
                           }
                       }).start();
                    switch(al_col_type.get(col)) {
                         case "CHAR":   st.executeUpdate("update "+table_name+" set "+col_name+" = '"+o+"' where  Sno = "+row+";"); break;
                         case "INT":    if(al_col_name.get(col).equals("Sno")) st.executeUpdate("Insert into "+table_name+" (sno) values("+row+");"); 
                                        else st.executeUpdate("update "+table_name+" set "+col_name+" = "+o+" where  Sno = "+row+";"); break;
                         case "FLOAT":  st.executeUpdate("update "+table_name+" set "+col_name+" = "+o+" where  Sno = "+row+";"); break;
                         case "DATE":   st.executeUpdate("update "+table_name+" set "+col_name+" = '"+o+"' where  Sno = "+row+";"); break;
                         case "BIGINT": st.executeUpdate("update "+table_name+" set "+col_name+" = "+o+" where  Sno = "+row+";");  break;
                    }
                } col=-1; row++;
             }
            display(table_name, md, table, ob);
            switch(table_name) {
                case "money_tran" : Money_Tran mt = (Money_Tran)ob; mt.is_clicked = true; mt.al_col_type = l_al_col_type; break;
                case "emp_sew" : Sewing sw = (Sewing)ob;  sw.is_clicked = true; sw.al_col_type = l_al_col_type; break;
                case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob;  swd.is_clicked = true; swd.al_col_type = l_al_col_type; break;
                case "emp_raw" : RawWorker rw = (RawWorker)ob;  rw.is_clicked = true; rw.al_col_type = l_al_col_type; break;
                case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob;  rwd.is_clicked = true; rwd.al_col_type = l_al_col_type; break;
                case "merchant" : Merchants m = (Merchants)ob;  m.is_clicked = true; m.al_col_type = l_al_col_type; break;
                case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob;  mdd.is_clicked = true; mdd.al_col_type = l_al_col_type; break;
                case "raw_material" : RawMaterial rm = (RawMaterial)ob;  rm.is_clicked = true; rm.al_col_type = l_al_col_type; break;
                case "ready_material" : Ready r = (Ready)ob;  r.is_clicked = true; r.al_col_type = l_al_col_type; break;
            }
       }catch(EmptyFieldException a) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+a.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
        catch(Exception se) { se.printStackTrace(); homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+se.toString()+"."+"\n\n"+ad_ex); homePage.pe.setVisible(true); homePage.pe.exit(false); }
    }
        static public void addColumnPrompt(String table_name, JTable table, Object ob) {
        JPanel panel = new JPanel(); panel.setLayout(null);
        JLabel lb = new JLabel("Column Name : "); lb.setBounds(5, 5, 100, 30); 
        JLabel lbb = new JLabel("Column Type : "); lbb.setBounds(5, 40, 100, 30); 
        JTextField tf = new JTextField(20); tf.setBounds(110, 8, 150, 25); tf.setFont(new java.awt.Font("verdana", java.awt.Font.BOLD, 12)); tf.setForeground(java.awt.Color.darkGray);
        JComboBox cb = new JComboBox(); cb.addItem("char"); cb.addItem("int"); cb.addItem("float"); cb.addItem("date"); cb.addItem("long");
        cb.setBounds(110, 40, 150, 25);panel.setPreferredSize(new java.awt.Dimension(270, 80));
        panel.add(lb); panel.add(tf); panel.add(lbb); panel.add(cb);
        JOptionPane.showConfirmDialog(null, panel, "Enter New Column Details", 2);
        if(JOptionPane.OK_OPTION == 0) { String str=null, name; name = tf.getText(); if(name.equals("")) return;
            int i=cb.getSelectedIndex();
            switch(i) {
                case 0: str = "char (100) default ''"; break;
                case 1: str = "int default 0"; break;
                case 2: str = "float default 0.0"; break;
                case 3: str = "date default '1999-01-02'"; break;
                case 4: str = "bigint default 0"; break;
            }
           addColumn(name, str, table_name, table, ob);
        }
    }
        static private void addColumn(String name, String type, String table_name, JTable table, Object ob) {
        try {
        ArrayList<Integer> sno= new ArrayList(); Object[] o;
        st.executeUpdate("alter table "+table_name+" add column "+name+" "+type+" ;");
        rs = st.executeQuery("select last_upd from "+table_name+" order by Sno asc;");
        while(rs.next()) sno.add(rs.getInt(1));
        st.executeUpdate("alter table "+table_name+" drop last_upd;");
        st.executeUpdate("alter table "+table_name+" add Column last_upd int;");
        o = sno.toArray(); for(int i=0; i<table.getRowCount(); i++) setLastUpdToLastCol(Integer.parseInt(o[i].toString()), i, table_name);
        switch(table_name) {
               case "money_tran" : Money_Tran mt = (Money_Tran)ob; mt.prepareColumnData(); mt.createTable(); mt.cellEditingOfCol0(); mt.tableRendering(); mt.display(); break;
               case "emp_sew" : Sewing sw = (Sewing)ob; sw.prepareColumnData(); sw.createTable(); sw.cellEditingOfCol0(); sw.tableRendering(); sw.display(); break;
               case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; swd.prepareColumnData(); swd.createTable(); swd.cellEditingOfCol0(); swd.tableRendering(); swd.display(); break;
               case "emp_raw" : RawWorker rw = (RawWorker)ob; rw.prepareColumnData(); rw.createTable(); rw.cellEditingOfCol0(); rw.tableRendering(); rw.display(); break;
               case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob; rwd.prepareColumnData(); rwd.createTable(); rwd.cellEditingOfCol0(); rwd.tableRendering(); rwd.display(); break;
               case "merchant" : Merchants m = (Merchants)ob; m.prepareColumnData(); m.createTable(); m.cellEditingOfCol0(); m.tableRendering(); m.display(); break;
               case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob; mdd.prepareColumnData(); mdd.createTable(); mdd.cellEditingOfCol0(); mdd.tableRendering(); mdd.display(); break;
               case "raw_material" : RawMaterial rm = (RawMaterial)ob; rm.prepareColumnData(); rm.createTable(); rm.cellEditingOfCol0(); rm.tableRendering(); rm.display(); break;
               case "ready_material" : Ready r = (Ready)ob; r.prepareColumnData(); r.createTable(); r.cellEditingOfCol0(); r.tableRendering(); r.display(); break;
           }
        }catch(Exception e) {e.printStackTrace();}// {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
    }
        static private void setLastUpdToLastCol(int num, int i, String table_name) {
        try { 
        rs = st.executeQuery("select Sno from "+table_name+" order by Sno asc;");
        for(int j=0; j<=i; j++)  rs.next();
        st.executeUpdate("update "+table_name+" set last_upd = "+num+" where Sno = "+rs.getInt(1)); 
        }catch(Exception e) {e.printStackTrace();}// {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
   }
        static public void updateRow(JTable table, String table_name, DefaultTableModel md, String col, String order, String current_col, String current_order, Object ob) {
        try { int[] rows = table.getSelectedRows();
              for(int i=0; i<rows.length; i++)  setLastUpdatedRow(Integer.parseInt(table.getValueAt(rows[i], 0).toString()), rows[i], table_name, current_col, current_order, table, md, ob);
              lastUpd(table_name, md, col, order, table, ob);
         } catch(Exception e) {e.printStackTrace();}// {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
    }
        static public void lastUpd(String table_name, DefaultTableModel md, String col, String order, JTable table, Object ob) {
        display(table_name, md, col, order, table, ob);
    }
        static private boolean isAmountInDecimal(Object o) {
        char[] c = o.toString().toCharArray();
        int i=0;
        while(i < o.toString().length()) {
            if(c[i] == '.') return true;
            ++i;
        } return false;
    }
        static public void getMaxLastUpdNum(String table_name, Object ob) {
        try {
            rs = st.executeQuery("select last_upd from "+table_name+" order by last_upd desc;"); if(!rs.next()) return;
            rs.absolute(1);
             switch(table_name) {
               case "money_tran" : Money_Tran mt = (Money_Tran)ob; mt.last_upd = rs.getInt(1); break;
               case "emp_sew" : Sewing sw = (Sewing)ob; sw.last_upd = rs.getInt(1); break;
               case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; swd.last_upd = rs.getInt(1); break;
               case "emp_raw" : RawWorker rw = (RawWorker)ob; rw.last_upd = rs.getInt(1); break;
               case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob; rwd.last_upd = rs.getInt(1); break;
               case "merchant" : Merchants m = (Merchants)ob; m.last_upd = rs.getInt(1); break;
               case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob; mdd.last_upd = rs.getInt(1); break;
               case "raw_material" : RawMaterial rm = (RawMaterial)ob; rm.last_upd = rs.getInt(1); break;
               case "ready_material" : Ready r = (Ready)ob; r.last_upd = rs.getInt(1); break;
                }
        } catch(Exception e) {e.printStackTrace();}// {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
    }
        static private void setLastUpdatedRow(int sno, int index, String table_name, String current_col, String current_order, JTable table, DefaultTableModel md, Object ob) {
        String col_name, col_type; Object o; int l_last_upd = 0;
        try {
            switch(table_name) {
               case "money_tran" : Money_Tran mt = (Money_Tran)ob; l_last_upd = mt.last_upd; break;
               case "emp_sew" : Sewing sw = (Sewing)ob; l_last_upd = sw.last_upd; break;
               case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; l_last_upd = swd.last_upd; break;
               case "emp_raw" : RawWorker rw = (RawWorker)ob; l_last_upd = rw.last_upd; break;
               case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob; l_last_upd = rwd.last_upd; break;
               case "merchant" : Merchants m = (Merchants)ob; l_last_upd = m.last_upd; break;
               case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob; l_last_upd = mdd.last_upd; break;
               case "raw_material" : RawMaterial rm = (RawMaterial)ob; l_last_upd = rm.last_upd; break;
               case "ready_material" : Ready r = (Ready)ob; l_last_upd = r.last_upd; break;
           }
            rs = st.executeQuery("select * from "+table_name+" order by "+current_col+" "+current_order+" ;");  l_rsmd = rs.getMetaData();
            while(rs.next()) { if(rs.getInt(1) == sno)
                 for(int col=1; col<md.getColumnCount(); col++) { l_colNum = col;
                     new Thread(() -> {
                         try { 
                         switch(l_rsmd.getColumnTypeName(l_colNum+1)) {
                              case "INT":    ad_ex = "Value must be of Integer type.\nFor ex  ->  12,  0,  -4  etc.\n\n"; break;
                              case "FLOAT":  ad_ex = "Value must be of float type.\nFor ex  ->  12.03,  0,  -4.08,  92  etc.\n\n"; break;
                              case "DATE":   ad_ex = "Value must be of Date type.\nFor ex  ->  '1999-01-02'  [YYYY-MM-DD] .\n\n"; break;
                              case "BIGINT": ad_ex = "Value must be of long Integer type.\n\nFor ex  ->  Value should not Consist of :\n"
                                             + "1.  Alphabets and Special Symbols  [k,  N,  %,  (),  @]\n"
                                             + "2.  Decimal  [3.02, 2.99] as It will store value after round off (if possible) which may lead to data inconsistency.\n"
                                             + "3.  Date   [1999-02-03]"
                                             + "\nIt only consist of Integers to store long length value such as - Mobile Number.\n\n"; break;
                           }
                         }catch(Exception e) {e.printStackTrace();}
                       }).start();
                     o = table.getValueAt(index, col); col_name = table.getColumnName(col); col_type = l_rsmd.getColumnTypeName(col+1);
                     // System.err.println("sno = "+sno+" index = "+index+" o = "+o+"  rs = "+rs.getObject(col+1)+" getInt(1)"+rs.getInt(1));
                     if(!(o.toString().equals(rs.getObject(col+1).toString()))){
                         switch (col_type) {
                            case "CHAR": try {
                                            st.executeUpdate("update "+table_name+" set "+col_name+" = '"+o+"' where Sno = "+sno+";");
                                            st.executeUpdate("update "+table_name+" set last_upd = "+(l_last_upd+1)+" where Sno = "+sno+";"); 
                                          } catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."+"\n\n"+ad_ex); homePage.pe.setVisible(true); homePage.pe.exit(false); return;}
                                          break;
                            case "INT": try {
                                            st.executeUpdate("update "+table_name+" set "+col_name+" = "+o+" where Sno = "+sno+";");
                                            st.executeUpdate("update "+table_name+" set last_upd = "+(l_last_upd+1)+" where Sno = "+sno+";"); 
                                          } catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."+"\n\n"+ad_ex); homePage.pe.setVisible(true); homePage.pe.exit(false);return;}
                                          break;
                            case "FLOAT": if(!isAmountInDecimal(o)) md.setValueAt(o+".0", index, col);
                                         try {
                                            st.executeUpdate("update "+table_name+" set "+col_name+" = "+o+" where Sno = "+sno+";");
                                            st.executeUpdate("update "+table_name+" set last_upd = "+(l_last_upd+1)+" where Sno = "+sno+";"); 
                                          } catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."+"\n\n"+ad_ex); homePage.pe.setVisible(true); homePage.pe.exit(false);return;}
                                          break;
                            case "DATE": try {
                                            st.executeUpdate("update "+table_name+" set "+col_name+" = '"+o+"' where Sno = "+sno+";");
                                            st.executeUpdate("update "+table_name+" set last_upd = "+(l_last_upd+1)+" where Sno = "+sno+";"); 
                                          } catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."+"\n\n"+ad_ex); homePage.pe.setVisible(true); homePage.pe.exit(false);return;}
                                          break;
                            case "BIGINT":  try {
                                            st.executeUpdate("update "+table_name+" set "+col_name+" = '"+o+"' where Sno = "+sno+";");
                                            st.executeUpdate("update "+table_name+" set last_upd = "+(l_last_upd+1)+" where Sno = "+sno+";"); 
                                          } catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."+"\n\n"+ad_ex); homePage.pe.setVisible(true); homePage.pe.exit(false);return;}
                                          break;
                            default:  break;
                         }
                    }  
                }
            }
            switch(table_name) {
               case "money_tran" : Money_Tran mt = (Money_Tran)ob; mt.last_upd = ++l_last_upd; break;
               case "emp_sew" : Sewing sw = (Sewing)ob; sw.last_upd = ++l_last_upd; break;
               case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; swd.last_upd = ++l_last_upd; break;
               case "emp_raw" : RawWorker rw = (RawWorker)ob; rw.last_upd = ++l_last_upd; break;
               case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob; rwd.last_upd = ++l_last_upd; break;
               case "merchant" : Merchants m = (Merchants)ob; m.last_upd = ++l_last_upd; break;
               case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob; mdd.last_upd = ++l_last_upd; break;
               case "raw_material" : RawMaterial rm = (RawMaterial)ob; rm.last_upd = ++l_last_upd; break;
               case "ready_material" : Ready r = (Ready)ob; r.last_upd = ++l_last_upd; break;
           }            
        }catch(Exception e){setLastUpdatedRow(sno, index, table_name, current_col, current_order, table, md, ob);}
    }
        static public void rem_col(ArrayList<String> al_col_name, JTable table, String table_name, Object ob) {
        try {
        JPanel panel = new JPanel(); panel.setLayout(null);
        JLabel lbb = new JLabel("selectColumn : "); lbb.setBounds(5, 5, 100, 30); 
        JComboBox cb = new JComboBox(); cb.setBounds(110, 5, 150, 25);
        Object col[] = al_col_name.toArray();
        for(int i=1; i<table.getColumnCount(); i++) cb.addItem(col[i]); 
        panel.setPreferredSize(new java.awt.Dimension(270, 40)); panel.add(lbb); panel.add(cb);
        JOptionPane.showConfirmDialog(null, panel, "selectColumn to Remove", 2);
        if(JOptionPane.OK_OPTION == 0) { 
            st.executeUpdate("alter table "+table_name+" drop "+cb.getSelectedItem()+";");
            switch(table_name) {
               case "money_tran" : Money_Tran mt = (Money_Tran)ob; mt.prepareColumnData(); mt.createTable(); mt.tableRendering(); mt.display(); break;
               case "emp_sew" : Sewing sw = (Sewing)ob; sw.prepareColumnData(); sw.createTable(); sw.tableRendering(); sw.display(); break;
               case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; swd.prepareColumnData(); swd.createTable(); swd.tableRendering(); swd.display(); break;
               case "emp_raw" : RawWorker rw = (RawWorker)ob; rw.prepareColumnData(); rw.createTable(); rw.tableRendering(); rw.display(); break;
               case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob; rwd.prepareColumnData(); rwd.createTable(); rwd.tableRendering(); rwd.display(); break;
               case "merchant" : Merchants m = (Merchants)ob; m.prepareColumnData(); m.createTable(); m.tableRendering(); m.display(); break;
               case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob; mdd.prepareColumnData(); mdd.createTable(); mdd.tableRendering(); mdd.display(); break;
               case "raw_material" : RawMaterial rm = (RawMaterial)ob; rm.prepareColumnData(); rm.createTable(); rm.tableRendering(); rm.display(); break;
               case "ready_material" : Ready r = (Ready)ob; r.prepareColumnData(); r.createTable(); r.tableRendering(); r.display(); break;
           }
        }
        } catch(Exception e) {e.printStackTrace();}// {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);} 
    }
        static public void searchInTable(String str, DefaultTableModel md, String table_name, JTable table, Object ob) {if(str.equals("")) {l_display_row=0; md.setRowCount(0); display(table_name, md, table, ob); return;}
        try { if(!((str.charAt(0) > 96 && str.charAt(0)<123) || (str.charAt(0) > 47 && str.charAt(0)<58)) || (str.charAt(0) > 64 && str.charAt(0)<91)) {l_display_row=0;md.setRowCount(0);return;}
          md.setRowCount(0); l_display_row=0;
          rs = st.executeQuery("select * from "+table_name+";");
          while(rs.next()){
               for(int col=0; col<md.getColumnCount(); col++) {
                  if(rs.getObject(col+1).toString().length() >= str.length()) {
                      if(str.equalsIgnoreCase(rs.getObject(col+1).toString().substring(0, str.length()))){
                          display(rs.getString(1), table, md, table_name); break; 
                      }
                  }
              } 
          }
        }catch(Exception e) {e.printStackTrace();}// {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
    }
        static private void display(String str, JTable table, DefaultTableModel md, String table_name) { 
        try { 
              for(int i=0; i<table.getRowCount(); i++) if(str.equalsIgnoreCase(table.getValueAt(i, 0).toString())) return; 
              ResultSet rs1 = st1.executeQuery("select * from "+table_name+" where Sno = "+str+";");  rs1.next();
              md.addRow(new Object[] {str});
              for(int col=1; col<md.getColumnCount(); col++)  md.setValueAt(rs1.getObject(col+1), l_display_row, col);
              cellEditingOfCol0(table); ++l_display_row;
       } catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);} 
    }
        static public void setPermittedComponents(String perm, String table_name, DefaultTableModel md, JTable table, Object ob) {
    //   homePage.lb_edit.setVisible(true); homePage.lb_delete.setVisible(true);
        if(perm.charAt(0) == '0') {homePage.lb_sort.setEnabled(false); display(ob, table_name, md, table); homePage.lb_edit.setEnabled(false); homePage.lb_delete.setEnabled(false);} else {display(table_name, md, table, ob); homePage.lb_sort.setEnabled(true); homePage.lb_edit.setEnabled(true); homePage.lb_delete.setEnabled(true);}
        if(perm.charAt(1) == '0') {homePage.lb_add.setEnabled(false); homePage.pmt.ad.setEnabled(false); homePage.psw.ad.setEnabled(false); homePage.pswd.ad.setEnabled(false); homePage.prw.ad.setEnabled(false); homePage.prwd.ad.setEnabled(false); homePage.pm.ad.setEnabled(false); homePage.pmd.ad.setEnabled(false); homePage.pr.ad.setEnabled(false); homePage.prm.ad.setEnabled(false);} else {homePage.lb_add.setEnabled(true); homePage.pmt.ad.setEnabled(true); homePage.psw.ad.setEnabled(true); homePage.pswd.ad.setEnabled(true); homePage.prw.ad.setEnabled(true); homePage.prwd.ad.setEnabled(true); homePage.pm.ad.setEnabled(true); homePage.pmd.ad.setEnabled(true); homePage.pr.ad.setEnabled(true); homePage.prm.ad.setEnabled(true);}
        if(perm.charAt(2) == '0') homePage.lb_delete.setEnabled(false); else homePage.lb_delete.setEnabled(true);
        if(perm.charAt(3) == '0') homePage.lb_edit.setEnabled(false); else homePage.lb_edit.setEnabled(true);
    }
        public static void display(Object ob, String table_name, DefaultTableModel md, JTable table) {
        try {
             md.setRowCount(0);
             rs = st.executeQuery("select * from "+table_name+" order by Sno asc;"); l_rsmd = rs.getMetaData();            
             int row=1;
             while(rs.next()) {
                st1.executeUpdate("update "+table_name+" set Sno = "+row+" where Sno = "+rs.getInt(1)+";"); ++row;
             }
             cellEditingOfCol0(table);
             switch(table_name) {
               case "money_tran" : Money_Tran mt = (Money_Tran)ob; mt.new_sn = row; Money_Tran.row_index = 0; break;
               case "emp_sew" : Sewing sw = (Sewing)ob; sw.new_sn = row; Sewing.row_index = 0; break;
               case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob; swd.new_sn = row; SewingWorkerDetails.row_index = 0; break;
               case "emp_raw" : RawWorker rw = (RawWorker)ob; rw.new_sn = row; RawWorker.row_index = 0; break;
               case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob; rwd.new_sn = row; RawWorkerDetails.row_index = 0; break;
               case "merchant" : Merchants m = (Merchants)ob; m.new_sn = row; Merchants.row_index = 0; break;
               case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob; mdd.new_sn = row; MerchantDetails.row_index = 0; break;
               case "raw_material" : RawMaterial rm = (RawMaterial)ob; rm.new_sn = row; RawMaterial.row_index = 0; break;
               case "ready_material" : Ready r = (Ready)ob; r.new_sn = row; Ready.row_index = 0; break;
            }
        } catch(Exception e) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
    }
        private static void addData(int new_sn, int row, int col, String table_name, boolean is_clicked, String file_name, DefaultTableModel md, JTable table, ArrayList<String> al_col_type, ArrayList<String> al_col_name, Object ob) {
         try {
            if(is_clicked) { homePage.pe.ta_msg.setText("Add new row to add data into Database"); homePage.pe.setVisible(true); homePage.pe.exit(false);
                             throw new EmptyFieldException("Add new row to add data into Database");}
            String col_name;  prepareColumnData(table_name, file_name, ob);
            while(row<=(new_sn+md.getRowCount()-1)) {
                  while(++col < md.getColumnCount()) {
                  Object o = md.getValueAt(row1, col);  col_name = table.getColumnName(col);
                      new Thread(() -> {
                           switch(al_col_type.get(l_colNum)) {
                              case "INT":    ad_ex = "Value must be of Integer type.\nFor ex  ->  12,  0,  -4  etc.\n\n"; break;
                              case "FLOAT":  ad_ex = "Value must be of float type.\nFor ex  ->  12.03,  0,  -4.08,  92  etc.\n\n"; break;
                              case "DATE":   ad_ex = "Value must be of Date type.\nFor ex  ->  '1999-01-02'  [YYYY-MM-DD] .\n\n"; break;
                              case "BIGINT": ad_ex = "Value must be of long Integer type.\n\nFor ex  ->  Value should not Consist of :\n"
                                             + "1.  Alphabets and Special Symbols  [k,  N,  %,  (),  @]\n"
                                             + "2.  Decimal  [3.02,  2.99] as It will store value after round off (if possible) which may lead to data inconsistency."
                                             + "\n3.  Date  [1999-02-03]"
                                             + "\n\nIt only consist of Integers to store long length value such as - Mobile Number.\n\n"; break;
                           }
                       }).start();   
                  switch(al_col_type.get(col)) {
                         case "CHAR":   st.executeUpdate("update "+table_name+" set "+col_name+" = '"+o+"' where  Sno = "+row+";"); break;
                         case "INT":    if(al_col_name.get(col).equals("Sno")) st.executeUpdate("Insert into "+table_name+" (sno) values("+row+");");
                                        else st.executeUpdate("update "+table_name+" set "+col_name+" = "+o+" where  Sno = "+row+";"); break;
                         case "FLOAT":  st.executeUpdate("update "+table_name+" set "+col_name+" = "+o+" where  Sno = "+row+";"); break;
                         case "DATE":   st.executeUpdate("update "+table_name+" set "+col_name+" = '"+o+"' where  Sno = "+row+";"); break;
                         case "BIGINT": st.executeUpdate("update "+table_name+" set "+col_name+" = '"+o+"' where  Sno = "+row+";");  break;
                     }
               } row++; col=-1;  ++row1;
            } row1=0;
            display(ob, table_name, md, table);
                switch(table_name) {
                  case "money_tran" : Money_Tran mt = (Money_Tran)ob; mt.is_clicked = true; mt.al_col_type = l_al_col_type; break;
                  case "emp_sew" : Sewing sw = (Sewing)ob;  sw.is_clicked = true; sw.al_col_type = l_al_col_type; break;
                  case "emp_sewdetails" : SewingWorkerDetails swd = (SewingWorkerDetails)ob;  swd.is_clicked = true; swd.al_col_type = l_al_col_type; break;
                  case "emp_raw" : RawWorker rw = (RawWorker)ob;  rw.is_clicked = true; rw.al_col_type = l_al_col_type; break;
                  case "emp_rawdetails" : RawWorkerDetails rwd = (RawWorkerDetails)ob;  rwd.is_clicked = true; rwd.al_col_type = l_al_col_type; break;
                  case "merchant" : Merchants m = (Merchants)ob;  m.is_clicked = true; m.al_col_type = l_al_col_type; break;
                  case "merchant_details" : MerchantDetails mdd = (MerchantDetails)ob;  mdd.is_clicked = true; mdd.al_col_type = l_al_col_type; break;
                  case "raw_material" : RawMaterial rm = (RawMaterial)ob;  rm.is_clicked = true; rm.al_col_type = l_al_col_type; break;
                  case "ready_material" : Ready r = (Ready)ob;  r.is_clicked = true; r.al_col_type = l_al_col_type; break;
                }
       } catch(EmptyFieldException a) {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+a.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);} 
        catch(Exception se) { se.printStackTrace(); homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+se.toString()+"."+"\n\n"+ad_ex); homePage.pe.setVisible(true); homePage.pe.exit(false); }
    }
        private static String getCurrentDateTime() {
        LocalDateTime ldt = LocalDateTime.now();
        String day = ldt.getDayOfWeek().name();
        return (day.charAt(0)+""+day.charAt(1)+""+day.charAt(2)+" "+ldt.format(DateTimeFormatter.ofPattern("MMM dd, yyy hh.mm.ss")));

    }
        public static void takeBackup() {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(homePage.PATH+"/backup/"+getCurrentDateTime()+".txt", false));
                rs1 = st1.executeQuery("select tables from table_buttons order by Sno asc;");  // table Buttons name in gui
                rs2 = st2.executeQuery("select table_name from table_name order by Sno asc;"); // db table's name
                
                // money_tran 
                rs1.next(); bw.write("\n          << "+rs1.getString(1)+" [table] >>\n\n");
                rs2.next(); rs = st.executeQuery("select * from "+rs2.getObject(1)+" order by Sno asc;"); l_rsmd = rs.getMetaData();
                for(byte b=1; b<=l_rsmd.getColumnCount(); ++b) bw.write(String.format("%-20s", l_rsmd.getColumnName(b))); bw.write("\n");
                while(rs.next()) {
                    for(byte b=1; b<=l_rsmd.getColumnCount(); b++) bw.write(String.format("%-20s", rs.getObject(b)));
                    bw.write("\n");
                }
                
                // emp_sew
                rs1.next(); bw.write("\n\n\n          << "+rs1.getString(1)+" [table] >>\n\n");
                rs2.next(); rs = st.executeQuery("select * from "+rs2.getObject(1)+" order by Sno asc;"); l_rsmd = rs.getMetaData();
                for(byte b=1; b<=l_rsmd.getColumnCount(); ++b) bw.write(String.format("%-20s", l_rsmd.getColumnName(b))); bw.write("\n");
                while(rs.next()) {
                    for(byte b=1; b<=l_rsmd.getColumnCount(); b++) bw.write(String.format("%-20s", rs.getObject(b)));
                    bw.write("\n");
                }
                
                // sew worker details
                rs1.next(); bw.write("\n\n\n          << "+rs1.getString(1)+" [table] >>\n\n");
                rs2.next(); rs = st.executeQuery("select * from "+rs2.getObject(1)+" order by Sno asc;"); l_rsmd = rs.getMetaData();
                for(byte b=1; b<=l_rsmd.getColumnCount(); ++b) bw.write(String.format("%-20s", l_rsmd.getColumnName(b))); bw.write("\n");
                while(rs.next()) {
                    for(byte b=1; b<=l_rsmd.getColumnCount(); b++) bw.write(String.format("%-20s", rs.getObject(b)));
                    bw.write("\n");
                }
                
                // raw worker
                rs1.next(); bw.write("\n\n\n          << "+rs1.getString(1)+" [table] >>\n\n");
                rs2.next(); rs = st.executeQuery("select * from "+rs2.getObject(1)+" order by Sno asc;"); l_rsmd = rs.getMetaData();
                for(byte b=1; b<=l_rsmd.getColumnCount(); ++b) bw.write(String.format("%-20s", l_rsmd.getColumnName(b))); bw.write("\n");
                while(rs.next()) {
                    for(byte b=1; b<=l_rsmd.getColumnCount(); b++) bw.write(String.format("%-20s", rs.getObject(b)));
                    bw.write("\n");
                }
                
                // raw worker details
                rs1.next(); bw.write("\n\n\n          << "+rs1.getString(1)+" [table] >>\n\n");
                rs2.next(); rs = st.executeQuery("select * from "+rs2.getObject(1)+" order by Sno asc;"); l_rsmd = rs.getMetaData();
                for(byte b=1; b<=l_rsmd.getColumnCount(); ++b) bw.write(String.format("%-20s", l_rsmd.getColumnName(b))); bw.write("\n");
                while(rs.next()) {
                    for(byte b=1; b<=l_rsmd.getColumnCount(); b++) bw.write(String.format("%-20s", rs.getObject(b)));
                    bw.write("\n");
                }
                
                // merchants
                rs1.next(); bw.write("\n\n\n          << "+rs1.getString(1)+" [table] >>\n\n");
                rs2.next(); rs = st.executeQuery("select * from "+rs2.getObject(1)+" order by Sno asc;"); l_rsmd = rs.getMetaData();
                for(byte b=1; b<=l_rsmd.getColumnCount(); ++b) bw.write(String.format("%-20s", l_rsmd.getColumnName(b))); bw.write("\n");
                while(rs.next()) {
                    for(byte b=1; b<=l_rsmd.getColumnCount(); b++) bw.write(String.format("%-20s", rs.getObject(b)));
                    bw.write("\n");
                }
                
                // merchant details
                rs1.next(); bw.write("\n\n\n          << "+rs1.getString(1)+" [table] >>\n\n");
                rs2.next(); rs = st.executeQuery("select * from "+rs2.getObject(1)+" order by Sno asc;"); l_rsmd = rs.getMetaData();
                for(byte b=1; b<=l_rsmd.getColumnCount(); ++b) bw.write(String.format("%-20s", l_rsmd.getColumnName(b))); bw.write("\n");
                while(rs.next()) {
                    for(byte b=1; b<=l_rsmd.getColumnCount(); b++) bw.write(String.format("%-20s", rs.getObject(b)));
                    bw.write("\n");
                }
                
                // raw material
                rs1.next(); bw.write("\n\n\n          << "+rs1.getString(1)+" [table] >>\n\n");
                rs2.next(); rs = st.executeQuery("select * from "+rs2.getObject(1)+" order by Sno asc;"); l_rsmd = rs.getMetaData();
                for(byte b=1; b<=l_rsmd.getColumnCount(); ++b) bw.write(String.format("%-20s", l_rsmd.getColumnName(b))); bw.write("\n");
                while(rs.next()) {
                    for(byte b=1; b<=l_rsmd.getColumnCount(); b++) bw.write(String.format("%-20s", rs.getObject(b)));
                    bw.write("\n");
                }
                
                // ready material
                rs1.next(); bw.write("\n\n\n          << "+rs1.getString(1)+" [table] >>\n\n");
                rs2.next(); rs = st.executeQuery("select * from "+rs2.getObject(1)+" order by Sno asc;"); l_rsmd = rs.getMetaData();
                for(byte b=1; b<=l_rsmd.getColumnCount(); ++b) bw.write(String.format("%-20s", l_rsmd.getColumnName(b))); bw.write("\n");
                while(rs.next()) {
                    for(byte b=1; b<=l_rsmd.getColumnCount(); b++) bw.write(String.format("%-20s", rs.getObject(b)));
                    bw.write("\n");
                }
                bw.write("\n\n// End of Tables Data");
                bw.close();
            }catch(Exception e) {e.printStackTrace();}// {homePage.pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); homePage.pe.setVisible(true); homePage.pe.exit(false);}
        }
        private static void unZipFile(String source, String dest_folder) {
        try {
            File dest = new File(dest_folder);
            if(!dest.exists()) dest.mkdir();
            fis = new FileInputStream(new File(source));
            zis = new ZipInputStream(fis);
            ze = zis.getNextEntry();
            byte[] b = new byte[1024];  int data;
            while(ze != null) {
                File file = new File(dest.getAbsoluteFile()+File.separator+ze.getName());
                if(ze.isDirectory()) {file.mkdir();} // From here
                else {
                System.out.println("Extracting : "+file.getAbsolutePath());
                fos = new FileOutputStream(file);
                while((data = zis.read(b)) > 0) fos.write(b, 0, data); 
                fos.close(); zis.closeEntry();
                }
                ze = zis.getNextEntry();
            }
            fis.close(); zis.close();
            f_ex = true;
       }catch(Exception e) {e.printStackTrace(); f_ex=false;}
    }
        private static boolean validateUpdate() {
            try {
               File file = null, tmp=null;
               tmp = new File(homePage.PATH+"/update"); if(tmp == null) return false;
               File[] upd_files = tmp.listFiles();
               if(upd_files.length > 0) {
                   for(byte b=0; b<upd_files.length; b++) { if(upd_files[b].getName().length() < 14) continue;
                   if(checkVersion(upd_files[b].getName().split("_")[1].substring(0, 5))) {file = new File(upd_files[b].getAbsolutePath()); break;}
                    }
               } if(file == null) return false;
                unZipFile(file.getAbsolutePath(), homePage.PATH+"/tmp");
                String[] files = new File(homePage.PATH+"/tmp").list();
                boolean cls=false, src=false, build=false;
                if(files.length == 3) {
                    if(files[0].equals("builder.txt") || files[0].equals("class") || files[0].equals("src")) cls=true;
                    if(files[1].equals("builder.txt") || files[1].equals("class") || files[1].equals("src")) src=true;
                    if(files[2].equals("builder.txt") || files[2].equals("class") || files[2].equals("src")) build=true;
                    if(cls && src && build) return true;
                    else { homePage.pe.ta_msg.setText("There is a problem in this update !!"); homePage.pe.exit(false); homePage.pe.setVisible(true); if(f_ex) deleteTmpFiles(); return false;}
                } else { homePage.pe.ta_msg.setText("There is a problem in this update !!"); homePage.pe.exit(false); homePage.pe.setVisible(true); if(f_ex) deleteTmpFiles(); return false;}
            }catch(Exception e) {e.printStackTrace();} 
            return false;
        }
        private static void doUpdate() {
          try {
            BufferedReader br = new BufferedReader(new FileReader(homePage.PATH+"/tmp/builder.txt"));
                    String[] s = br.readLine().split("_"); byte a=0, b=0;
                    if(checkVersion(s[1])) {
                        String data;
                        while((data = br.readLine()) != null) { ++a;
                            String[] loc = data.split(" -> ");
                            if(replaceFile(homePage.PATH+loc[0], homePage.PATH+loc[1])) {System.out.println(loc[1]+" replaced"); ++b;}
                            else System.out.println(loc[1]+" !replaced");
                        } br.close();
                        try { if(a == b) {
                                 st.executeUpdate("update properties set const = '"+s[1]+"' where id = 'soft_version';"); u=true;
                                 TableEngine.prev_ver = homePage.SOFTWARE_VERSION; homePage.SOFTWARE_VERSION = soft_ver = s[1]; homePage.fa.lb_version.setText(s[1]);
                              } else {homePage.pe.ta_msg.setText("Something went wrong!!\nNot Updated !\nCurrent Version : "+soft_ver); homePage.pe.exit(false); homePage.pe.setVisible(true); u=false;}
                              
                        }catch(Exception e) { e.printStackTrace();}
                    }
                    if(f_ex) deleteTmpFiles();
          } catch(Exception e) {e.printStackTrace(); homePage.pe.ta_msg.setText("Something went wrong\nSoftware Version is not updated.\nCurrent Version : "+soft_ver+"\nRequested Version : "+req_ver); homePage.pe.setVisible(true); homePage.pe.exit(false); return;}
        }
        private static void deleteTmpFiles() {
         try {
           File file = new File(homePage.PATH+"/tmp/class");
           File[] files = file.listFiles();
           for(byte b=0; b<files.length; b++) new File(files[b].getAbsolutePath()).delete();
           new File(homePage.PATH+"/tmp/class").delete();
           file = new File(homePage.PATH+"/tmp/src");
           files = file.listFiles();
           for(byte b=0; b<files.length; b++) new File(files[b].getAbsolutePath()).delete();
           new File(homePage.PATH+"/tmp/src").delete();
           new File(homePage.PATH+"/tmp/builder.txt").delete();
           file = new File(homePage.PATH+"/Updates");
           files = file.listFiles(); for(byte bb=0; bb<files.length; bb++) new File(files[bb].getAbsolutePath()).delete();
           f_ex=false;
         } catch(Exception e) {e.printStackTrace();}
        }
        private static boolean checkVersion(String ver) {
            TableEngine.req_ver = ver;  System.out.println("From TableEngine: checkVersion(), softver: "+soft_ver+"req_ver: "+req_ver);
            if(ver.equals(soft_ver)) {homePage.pe.ta_msg.setText("Current Version : "+soft_ver+"\n"+ver+" == "+soft_ver+"\nalready updated !!"); homePage.pe.exit(false); homePage.pe.setVisible(true); return false;}
            if((ver.charAt(4) > soft_ver.charAt(4) || ver.charAt(2) > soft_ver.charAt(2)) && ver.charAt(0) >= soft_ver.charAt(0)) return true;
            else { homePage.pe.ta_msg.setText("Obsolete update !!\nCurrent Version : "+soft_ver+"\n"+ver+" < "+soft_ver); homePage.pe.exit(false); homePage.pe.setVisible(true); u=false; return false;}
        }
        private static boolean replaceFile(String source, String dest) {
            try {
                fis = new FileInputStream(new File(source));
                fos = new FileOutputStream(new File(dest));
                byte[] b = new byte[1024]; int len;
                while((len = fis.read(b)) > 0) fos.write(b, 0, len);
                fis.close(); fos.close();                
            }catch(Exception e) {e.printStackTrace(); return false;}
            return true;
        }
        public static void checkForUpdates() {
            TableEngine.soft_ver = homePage.SOFTWARE_VERSION;
            if(validateUpdate()) {doUpdate(); if(f_ex) deleteTmpFiles(); if(u) homePage.pe.ta_msg.setText("Trade Manager Utility is successfully updated !!\nPrevious Version : "+prev_ver+"\nCurrent Version : "+soft_ver); homePage.pe.setVisible(true); homePage.pe.exit(false);}
            if(f_ex) deleteTmpFiles();
        }
        public static void checkForUpdates(File file) { System.out.println("Version : "+file.getName().split("_")[1].substring(0, 5));
            TableEngine.soft_ver = homePage.SOFTWARE_VERSION;
            if(checkVersion(file.getName().split("_")[1].substring(0, 5))) {
                unZipFile(file.getAbsolutePath(), homePage.PATH+"/tmp"); System.out.println("After extracting Files");
                String[] files = new File(homePage.PATH+"/tmp").list();  System.out.println(files[0]+" "+files[1]+" "+files[2]+" and length : "+files.length);
                boolean cls=false, src=false, build=false;
                if(files.length == 3) {
                    if(files[0].equals("builder.txt") || files[0].equals("class") || files[0].equals("src")) cls=true;
                    if(files[1].equals("builder.txt") || files[1].equals("class") || files[1].equals("src")) src=true;
                    if(files[2].equals("builder.txt") || files[2].equals("class") || files[2].equals("src")) build=true;
                    System.out.println(cls+" "+src+" "+build);
                    if(cls && src && build) {
                        try {
                          if(checkVersion(new BufferedReader(new FileReader(homePage.PATH+"/tmp/builder.txt")).readLine().split("_")[1]))  {
                            doUpdate(); if(f_ex) deleteTmpFiles(); if(u) homePage.pe.ta_msg.setText("Trade Manager Utility is successfully updated !!\nPrevious Version : "+prev_ver+"\nCurrent Version : "+soft_ver); homePage.pe.setVisible(true); homePage.pe.exit(false);
                          }
                       }catch(Exception e) {e.printStackTrace();}
                    } else { homePage.pe.ta_msg.setText("There is a problem in this update !!"); homePage.pe.setVisible(true); homePage.pe.exit(false);}
                } else { homePage.pe.ta_msg.setText("There is a problem in this update !!"); homePage.pe.setVisible(true); homePage.pe.exit(false);}
         } if(f_ex) deleteTmpFiles();
      }
   }    
}