package gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public class Init {
    public static Connection con; public static ResultSet rs, rs1, rs2; public static Statement st, st1, st2; public static PreparedStatement ps1;
    Panel_Splash ps;
    private admin.gui.Panel_Gen_Settings sett;
    Panel_Error pe = new Panel_Error();
    
    public Init() {
        try {
            turnOnDB("localhost", "3306", "tradeDB", "root", "");
            rs = st.executeQuery("Show tables;");
            if(!rs.next()) createBaseTables();
            rs = st1.executeQuery("Select const from properties where id = 'path';"); rs.next();
            if(rs.getString(1).equals("")) {new Panel_inst();}
            else {
                ps = new Panel_Splash();
                sett = new admin.gui.Panel_Gen_Settings();
                if(sett.lb_auto.getText().equals("Enabled")) {
                   if(sett.lb_splash.getText().equals("Enabled")) {ps.isVisible = true; ps.setSecurity();} else {ps.setVisible(false); ps.setSecurity();}
                 } else new Panel_DbCred(this);
            } 
        }catch(java.sql.SQLSyntaxErrorException s) {new Panel_DbCred(this);}
         catch(Exception e) {pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."+"\n\nCannot connect to DataBase !!\nMake sure MySQL DataBase is On and tradeDB database is created."); pe.setVisible(true); pe.exit(true);}
    }
    public void turnOnDB(String address, String port, String db, String user, String pass) {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://"+address+":"+port+"/"+db, user, pass);
        st = con.createStatement(); st1 = con.createStatement(); st2 = con.createStatement();
        } catch(Exception e) {e.printStackTrace();}
    }
    private void createBaseTables() {
        try {
            st.executeUpdate("Create table properties(id char(20) primary key, const char(30) default '');");
            st.executeUpdate("Insert into properties values ('path', '');");
            st.executeUpdate("Insert into properties values ('pass', '');");
            st.executeUpdate("Insert into properties values ('root_cred', 'root toor');");
            st.executeUpdate("Insert into properties values ('soft_version', '1.0.1');");
            st.executeUpdate("Create table gen_settings(Sno int primary key, Options char(20), Status char(8));");
            st.executeUpdate("Insert into gen_settings values (1, 'backup', 'Disabled');");
            st.executeUpdate("Insert into gen_settings values (2, 'user creation', 'Disabled');");
            st.executeUpdate("Insert into gen_settings values (3, 'timer', 'Enabled');");
            st.executeUpdate("Insert into gen_settings values (4, 'images', 'Enabled');");
            st.executeUpdate("Insert into gen_settings values (5, 'guest user', 'Disabled');");
            st.executeUpdate("Insert into gen_settings values (6, 'delete', 'Diabled');");
            st.executeUpdate("Insert into gen_settings values (7, 'exit', 'Disabled');");
            st.executeUpdate("Insert into gen_settings values (9, 'super user', 'Enabled');");
            st.executeUpdate("Insert into gen_settings values (8, 'update', 'Enabled');");
            st.executeUpdate("Insert into gen_settings values (10, 'splash screen', 'Enabled');");
            st.executeUpdate("Insert into gen_settings values (11, 'security', 'Disabled');");
            st.executeUpdate("Insert into gen_settings values (12, 'auto', 'Disabled');");
        }catch(Exception e) {pe.ta_msg.setText("Exception in : "+Thread.currentThread().getName().toUpperCase()+" "+e.toString()+"."); pe.setVisible(true); pe.exit(true);}
    }
    
    public static void main(String ... args) { new Init(); }
}
