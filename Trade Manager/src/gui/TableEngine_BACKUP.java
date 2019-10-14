package gui;

import db_client.EmptyFieldException;
import static gui.Panel_money.sp;
import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.EventObject;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.ListIterator;

public class TableEngine_BACKUP {
    private int new_sn = 0; static int row_index = 0; private boolean is_clicked = true;
    private JTable table;  private DefaultTableModel md;
    private Connection con; private Statement st; private ResultSet rs; private ResultSetMetaData rsmd;
    private FileReader fr;  private FileWriter fw; private BufferedReader br; private BufferedWriter bw;
    private ArrayList<String> al; private ListIterator<String> li; private ArrayList<String> al_col_name; private ArrayList<String> al_col_type;
    
    public TableEngine_BACKUP() {
        DBKernel();
        prepareColumnData();
        createTable();
        tableRendering();
        display();
    }
    void addRow() {
         is_clicked = false; md.addRow(new Object[] {++row_index}); 
    }
    void addColumn() {
        try { md.addColumn("New_Column");  st.executeUpdate("alter table money_tran add column New_Column char(10);"); getTableDetails();
            prepareColumnData(); cellEditingOfCol0();
        }catch(Exception e) {}
    }
    private void prepareColumnData() {
        try {
            String str; String[] st_arr; fr = new FileReader("Money_Tran.config"); br = new BufferedReader(fr); al = new ArrayList<>(); al_col_name = new ArrayList<>(); al_col_type = new ArrayList<>();
            getTableDetails();  while((str = br.readLine()) != null) al.add(str); li = al.listIterator();// System.out.println(al);
            while(li.hasNext()) {
                st_arr = li.next().split("\t");
                al_col_name.add(st_arr[0].trim()); al_col_type.add(st_arr[1].trim());
            }
            // System.out.println("\n"+al_col_name+"\t"+al_col_type);
        }catch(Exception e) {}
    }
    void display() { 
        try {
             md.setRowCount(0);
             rs = st.executeQuery("Select * from money_tran order by sno asc;"); rsmd = rs.getMetaData();
             int row=0;
             while(rs.next()) {      
              md.addRow(new Object[] {rs.getInt(1)});              
              for(int col=2; col<=rsmd.getColumnCount(); col++) { 
                      md.setValueAt(rs.getObject(col), row, col-1);
                  } row++;
             } 
            new_sn = row_index = row; cellEditingOfCol0();
        } catch(Exception e) {e.printStackTrace();} 
    }
    void removeRow() {
        int[] sel_rows = table.getSelectedRows();
        try { 
           for(int i: sel_rows) {  
               st.executeUpdate("delete from money_tran where sno = "+table.getValueAt(table.getSelectedRow(), 0)+";"); md.removeRow(table.getSelectedRow());
           }
        } catch(Exception e) {e.printStackTrace();}
        display();
    }
    void updateRow() {
        try { 
         String col_name, col_type; Object o; 
         rs = st.executeQuery("Select * from Money_tran;"); rsmd = rs.getMetaData();
         for(int row=0; row<md.getRowCount(); row++){
             for(int col=1; col<md.getColumnCount(); col++) {
                  o = md.getValueAt(row, col); col_name = table.getColumnName(col); col_type = rsmd.getColumnTypeName(col+1);
                       
                  if(col_type.equals("CHAR")) {
                  st.executeUpdate("Update money_tran set "+col_name+" = '"+o+"' where sno = "+(row+1)+";");                      
                  } else if(col_type.equals("INT")) {
                  st.executeUpdate("Update money_tran set "+col_name+" = "+o+" where sno = "+(row+1)+";");                      
                  } else if(col_type.equals("FLOAT")) {
                  st.executeUpdate("Update money_tran set "+col_name+" = "+o+" where sno = "+(row+1)+";");                      
                  } else if(col_type.equals("Date")) {
                  st.executeUpdate("Update money_tran set "+col_name+" = '"+o+"' where sno = "+(row+1)+";");                      
                  }
                  
            }
         }
         } catch(Exception e) {e.printStackTrace();}
         display();
    }
    private void DBKernel() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tradeDB", "root", "");
            st = con.createStatement();            
        }catch(Exception e) {e.printStackTrace();}
    }  
    private void tableRendering() {
        table.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isselected, boolean hasFocus, int row, int column) {
                    Component c = super.getTableCellRendererComponent(table, value, isselected, hasFocus, row, column);
                    c.setBackground(row % 2 == 0 ? new java.awt.Color(70, 70, 70) : new java.awt.Color(120, 120, 120));
                    c.setForeground(java.awt.Color.white);
                    if(table.isCellSelected(row, column)) {
                        setBackground(new Color(60, 60, 60));
                    }
                    if(table.isRowSelected(row)) {
                        setForeground(Color.yellow);
                    }
                    if(table.isColumnSelected(column)) {
                        setBackground(new Color(60, 60, 60));
                    }
                    return c; 
                }
                
            }); table.setCellSelectionEnabled(true);
    }
    private void createTable() {
        Object col[] = al_col_name.toArray();
        table = new JTable(new DefaultTableModel(col, 0));  
        md = (DefaultTableModel) table.getModel(); table.getTableHeader().setReorderingAllowed(false);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setSize(new java.awt.Dimension(858, 386));
        table.setFillsViewportHeight(true); sp.setViewportView(table);
        table.setBackground(new java.awt.Color(102, 102, 102));
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        table.setFont(new java.awt.Font("Ebrima", 0, 16)); table.setForeground(new java.awt.Color(255, 255, 255));
        table.setGridColor(new java.awt.Color(153, 153, 153)); table.setRowHeight(30); table.setRowMargin(2);
        table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        cellEditingOfCol0();
    }
    private void cellEditingOfCol0() {
        table.getColumnModel().getColumn(0).setCellEditor(new javax.swing.table.TableCellEditor() {
                      @Override
                      public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                      }

                      @Override
                      public Object getCellEditorValue() {
                          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                      }

                      @Override
                      public boolean isCellEditable(EventObject anEvent) {
                          return false;
                        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                      }

                      @Override
                      public boolean shouldSelectCell(EventObject anEvent) {
                           return false;                         
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                      }

                      @Override
                      public boolean stopCellEditing() {
                          return true;
                          //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                      }

                      @Override
                      public void cancelCellEditing() {
                          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                      }

                      @Override
                      public void addCellEditorListener(CellEditorListener l) {
                          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                      }

                      @Override
                      public void removeCellEditorListener(CellEditorListener l) {
                          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                      }
                  });
    }
    private void getTableDetails() {
        String col_name, col_type;
        try {
            rs = st.executeQuery("Select * from money_tran;");  rsmd = rs.getMetaData();
            fw = new FileWriter("Money_Tran.config", false);
            bw = new BufferedWriter(fw);
            for(int i=1; i<=rsmd.getColumnCount(); i++) { 
                col_name = rsmd.getColumnName(i);
                col_type = rsmd.getColumnTypeName(i); 
                bw.write(col_name+"\t"+col_type+"\n");
            }
         bw.close(); 
        }catch(Exception e) {e.printStackTrace();}
    } 
    void addData() {
         try {
            if(is_clicked) throw new EmptyFieldException("Create new Row to enter new data to be add into Database");
            String col_name;  prepareColumnData();
            for(int row = new_sn; row<md.getRowCount(); row++) { 
                for(int col=0; col<md.getColumnCount(); col++) {
                  Object o = md.getValueAt(row, col); 
                     col_name = table.getColumnName(col);
                         if(al_col_type.get(col).equalsIgnoreCase("Char")) {  
                               st.executeUpdate("update money_tran set "+col_name+" = '"+o.toString()+"' where  sno = "+(row+1)+";");
                         } else if(al_col_type.get(col).equalsIgnoreCase("Int")) { 
                             if(al_col_name.get(col).equalsIgnoreCase("sno")) { st.executeUpdate("Insert into money_tran(sno) values("+(row+1)+");"); }
                             else{ st.executeUpdate("update money_tran set "+col_name+" = "+o.toString()+" where  sno = "+(row+1)+";"); }
                         } else if(al_col_type.get(col).equalsIgnoreCase("Float")) { 
                               st.executeUpdate("update money_tran set "+col_name+" = "+o.toString()+" where  sno = "+(row+1)+";"); 
                         } else if(al_col_type.get(col).equalsIgnoreCase("Date")) {  
                               st.executeUpdate("update money_tran set "+col_name+" = '"+o.toString()+"' where  sno = "+(row+1)+";"); 
                         } else if(al_col_type.get(col).equalsIgnoreCase("Bit")) { 
                               st.executeUpdate("update money_tran set "+col_name+" = '"+o.toString()+"' where  sno = "+(row+1)+";"); 
                         }
              } // end of inner loop 
            } // end of outer loop 
         display();
       }catch(EmptyFieldException a) {a.printStackTrace();} 
        catch(Exception se) {se.printStackTrace();}
    } 
    void rem_col() {
        try {
       md.setColumnCount(md.getColumnCount()-1);   st.executeUpdate("alter table money_tran drop new_Column;");
        } catch(Exception e) {} 
    }
    public static void main(String ... args) {
    }
}
