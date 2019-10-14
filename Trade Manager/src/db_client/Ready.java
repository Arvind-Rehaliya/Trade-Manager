package db_client;

import gui.Panel_Ready;
import gui.homePage;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;

public class Ready {
    int new_sn = 0, pop=0; static int row_index = 0, last_upd=0; boolean is_clicked = true; String current_col, current_order;
    public JTable table;  public DefaultTableModel md;
    ArrayList<String> al, al_col_name, al_col_type; ListIterator<String> li;
    JPopupMenu menu; JMenuItem add, dlt, ref; JSeparator sept;
    Object[] col; public String table_name = "ready_material"; String file_name = "Ready_Material.config"; JScrollPane sp = Panel_Ready.sp;
   
    public Ready() {
        prepareColumnData();
        createTable();
        tableRendering();
        getMaxLastUpdNum();
    }
    
    public void searchInTable(String data) {
        TableEngine.Inner.searchInTable(data, md, table_name, table, this);  
    }
    public void rem_col() {
         TableEngine.Inner.rem_col(al_col_name, table, table_name, this);  
    }
    public void updateRow() {
         TableEngine.Inner.updateRow(table, table_name, md, "last_upd", "desc", current_col, current_order, this);  
    }
    public void lastUpd() {
         TableEngine.Inner.display(table_name, md, "last_upd", "desc", table, this);  
    }
    private void getMaxLastUpdNum() {
         TableEngine.Inner.getMaxLastUpdNum(table_name, this);  
    }
    public void addColumnPrompt() {
         TableEngine.Inner.addColumnPrompt(table_name, table, this);  
    }
    public void addData() {
         TableEngine.Inner.addData(this.new_sn, this.new_sn, -1, is_clicked, table_name, file_name, md, table, al_col_type, al_col_name, this);  
    }
    public void tableRendering() {
         TableEngine.Inner.tableRendering(this.table);  
    }
    public void createTable() {
         TableEngine.Inner.createTable(al_col_name, sp, table_name, this);
        table.getColumnModel().getColumn(0).setPreferredWidth(60); for(byte i=1; i<md.getColumnCount(); i++) table.getColumnModel().getColumn(i).setPreferredWidth(200);  
    }
    public void cellEditingOfCol0() {
         TableEngine.Inner.cellEditingOfCol0(this.table);  
    }
    public void prepareColumnData() {
         TableEngine.Inner.prepareColumnData(table_name, file_name, this);  
    }
    public void removeRow() {
        if(admin.gui.Panel_Gen_Settings.lb_delete.getText().equals("Disabled") && table.getSelectedRowCount()>0) { homePage.fr.setText(table.getSelectedRowCount()+" Row(s) are going to be delete Permanently .");
        if(homePage.fr.getStatus() == 0)  TableEngine.Inner.removeRow(this.table, this.table_name, this.md, this);  
        }
    }
    public void addRow() {
         TableEngine.Inner.addRow(row_index, md, this.table_name, this);  
    }
    public void display() {
         TableEngine.Inner.display(this.table_name, this.md, this.table, this);  
    }
    public void display(String col_name, String order) {
         TableEngine.Inner.display(this.table_name, this.md,col_name, order, this.table, this);  
    }
    public void setPermittedComponents(String perm) {
         TableEngine.Inner.setPermittedComponents(perm, this.table_name, this.md, this.table, this);  
    }
    public void noRowDisplay() {
         TableEngine.Inner.display(this, this.table_name, this.md, this.table);  
    }
}