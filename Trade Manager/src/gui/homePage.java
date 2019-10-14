package gui;

import static gui.Init.rs;
import static gui.Init.st;
import static gui.Init.ps1;
import static gui.Init.con;
import admin.gui.Panel_Gen_Settings;
import admin.gui.Panel_root;
import java.awt.Color;
import db_client.Money_Tran;
import db_client.Sewing;
import db_client.SewingWorkerDetails;
import db_client.RawWorker;
import db_client.RawWorkerDetails;
import db_client.Ready;
import db_client.Merchants;
import db_client.MerchantDetails;
import db_client.RawMaterial;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.io.File;
import java.awt.image.BufferedImage;

public class homePage extends javax.swing.JFrame implements java.awt.event.ActionListener {

    static public JPanel jp;
    private JPanel panel;
    public static boolean isSw = false, isSwd = false, isRw = false, isRwd = false, isMer = false, isMerd = false;
    static public java.awt.Container c;
    public static Money_Tran mt;
    public static Sewing sw;
    public static SewingWorkerDetails swd;
    public static RawWorker rw;
    public static RawWorkerDetails rwd;
    public static Ready r;
    public static Merchants m;
    public static MerchantDetails md;
    public static RawMaterial rm;
    private JPopupMenu menu;
    private JMenuItem name, last_upd, def;
    private JRadioButton asc, dsc, rb_temp;
    private ButtonGroup bg, col_bg;
    private JSeparator sept;
    private String order = "asc";
    private static Integer col_index = 0, rb_Y = 0;
    public static Panel_money pmt;
    public static Panel_Sewing psw;
    public static Panel_SewingWorkerDetails pswd;
    public static Panel_Raw prw;
    public static Panel_RawWorkerDetails prwd;
    public static Panel_merchants pm;
    public static Panel_MerchantDetails pmd;
    public static Panel_Ready pr;
    public static Panel_RawMaterial prm;
    public static homePage hp;
    public static Panel_root panel_root;
    public static boolean isadminclicked = true;
    public static String user_perm;
    public static Panel_admin pad;
    private static JFileChooser jfc = new JFileChooser(javax.swing.filechooser.FileSystemView.getFileSystemView().getDefaultDirectory());
    private static File f;
    private static BufferedImage image;
    static byte sec = 0, min = 0, hour = 0;
    public static Panel_Error pe = new Panel_Error();
    public static Frame_Delete fr = new Frame_Delete();
    public static String PATH;
    private static String username = "";
    private static boolean rd = false, ad = false, dl = false, mod = false;
    public static String SOFTWARE_VERSION;
    public static Frame_About fa = new Frame_About();

    public homePage() {
        initComponents();
        getDefaultPath(); getSoftwareVersion(); 
        checkForCoreTablesData();  setTableButtonNames();
        this.popUpMenu();  init();
        logInAsGuest();  setCheckbox();
        c = this.getContentPane(); c.setBackground(new java.awt.Color(60, 60, 60));        
        createPanel();
        hp = this;
        
        if(Panel_Gen_Settings.lb_timer.getText().equals("Disabled")) runTimer(); else {lb_timer.setVisible(false); lb_time.setVisible(false);}
        pe.setVisible(false);  lb_logout.setVisible(false);
        new Thread(() -> {try {if(Panel_Gen_Settings.lb_update.getText().equals("Enabled")) Thread.sleep(5000); db_client.TableEngine.Inner.checkForUpdates();}catch(Exception e) {e.printStackTrace();}}).start();
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        button_admin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        button_up = new javax.swing.JButton();
        button_home = new javax.swing.JButton();
        button_rw = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        button_sw = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        button_m = new javax.swing.JButton();
        button_rm = new javax.swing.JButton();
        label_rw = new javax.swing.JLabel();
        label_rw.setVisible(false);
        label_up = new javax.swing.JLabel();
        label_up.setVisible(false);
        label_mt = new javax.swing.JLabel();
        label_mt.setVisible(false);
        label_rm = new javax.swing.JLabel();
        label_rm.setVisible(false);
        label_m = new javax.swing.JLabel();
        label_m.setVisible(false);
        label_sw = new javax.swing.JLabel();
        label_sw.setVisible(false);
        bt_raw = new javax.swing.JButton();
        label_raw = new javax.swing.JLabel();
        label_raw.setVisible(false);
        lb_timer = new javax.swing.JLabel();
        lb_time = new javax.swing.JLabel();
        button_mt = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lb_user = new javax.swing.JLabel();
        lb_username = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tf_search = new javax.swing.JTextField();
        lb_search = new javax.swing.JLabel();
        lb_add = new javax.swing.JLabel();
        lb_delete = new javax.swing.JLabel();
        lb_sort = new javax.swing.JLabel();
        lb_sort.setVisible(false);
        lb_edit = new javax.swing.JLabel();
        lb_logout = new javax.swing.JLabel();
        cb_read = new javax.swing.JCheckBox();
        cb_add = new javax.swing.JCheckBox();
        cb_delete = new javax.swing.JCheckBox();
        cb_modify = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_goto = new javax.swing.JMenu();
        m_backup = new javax.swing.JMenuItem();
        m_table = new javax.swing.JMenu();
        m_mt = new javax.swing.JMenuItem();
        m_sw = new javax.swing.JMenuItem();
        m_swd = new javax.swing.JMenuItem();
        m_rw = new javax.swing.JMenuItem();
        m_rwd = new javax.swing.JMenuItem();
        m_m = new javax.swing.JMenuItem();
        m_md = new javax.swing.JMenuItem();
        m_rm = new javax.swing.JMenuItem();
        m_rd = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        m_exit = new javax.swing.JMenuItem();
        menu_nav = new javax.swing.JMenu();
        m_note = new javax.swing.JMenuItem();
        m_matrix = new javax.swing.JMenuItem();
        menu_help = new javax.swing.JMenu();
        m_update = new javax.swing.JMenuItem();
        m_about = new javax.swing.JMenuItem();
        m_support = new javax.swing.JMenuItem();

        jButton5.setFont(new java.awt.Font("Ebrima", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Money Transaction");
        jButton5.setToolTipText("HomePage");
        jButton5.setBorderPainted(false);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton5.setIconTextGap(10);
        jButton5.setMargin(new java.awt.Insets(2, 7, 2, 14));
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Trade Manager");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        button_admin.setBackground(new java.awt.Color(255, 51, 0));
        button_admin.setFont(new java.awt.Font("Ebrima", 1, 15)); // NOI18N
        button_admin.setForeground(new java.awt.Color(255, 255, 255));
        button_admin.setText("Log in as Administrator");
        button_admin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        button_admin.setBorderPainted(false);
        button_admin.setFocusPainted(false);
        button_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_adminActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(10, 10, 10));

        button_up.setBackground(new java.awt.Color(153, 255, 153));
        button_up.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_up.setForeground(new java.awt.Color(245, 245, 245));
        button_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user1.png"))); // NOI18N
        button_up.setText("User Control");
        button_up.setToolTipText("To add / delete / modify users");
        button_up.setBorderPainted(false);
        button_up.setContentAreaFilled(false);
        button_up.setFocusPainted(false);
        button_up.setFocusable(false);
        button_up.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        button_up.setIconTextGap(10);
        button_up.setMargin(new java.awt.Insets(2, 7, 2, 14));
        button_up.setRequestFocusEnabled(false);
        button_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_upActionPerformed(evt);
            }
        });

        button_home.setBackground(new java.awt.Color(204, 255, 0));
        button_home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_home.setForeground(new java.awt.Color(245, 245, 245));
        button_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/home.jpg"))); // NOI18N
        button_home.setText("Home Page");
        button_home.setToolTipText("HomePage");
        button_home.setBorderPainted(false);
        button_home.setContentAreaFilled(false);
        button_home.setFocusPainted(false);
        button_home.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        button_home.setIconTextGap(10);
        button_home.setMargin(new java.awt.Insets(2, 3, 2, 14));
        button_home.setRequestFocusEnabled(false);
        button_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_homeActionPerformed(evt);
            }
        });

        button_rw.setBackground(new java.awt.Color(51, 255, 51));
        button_rw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_rw.setForeground(new java.awt.Color(245, 245, 245));
        button_rw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/product-30.png"))); // NOI18N
        button_rw.setText("Raw Workers");
        button_rw.setToolTipText("See Details of workers who do raw material related works");
        button_rw.setBorderPainted(false);
        button_rw.setContentAreaFilled(false);
        button_rw.setFocusPainted(false);
        button_rw.setFocusable(false);
        button_rw.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        button_rw.setIconTextGap(10);
        button_rw.setMargin(new java.awt.Insets(2, 7, 2, 14));
        button_rw.setRequestFocusEnabled(false);
        button_rw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_rwActionPerformed(evt);
            }
        });

        button_sw.setBackground(new java.awt.Color(102, 255, 51));
        button_sw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_sw.setForeground(new java.awt.Color(245, 245, 245));
        button_sw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/mac.jpg"))); // NOI18N
        button_sw.setText("Sewing Workers");
        button_sw.setToolTipText("See details of Sewing Workers");
        button_sw.setBorderPainted(false);
        button_sw.setContentAreaFilled(false);
        button_sw.setFocusPainted(false);
        button_sw.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        button_sw.setIconTextGap(10);
        button_sw.setMargin(new java.awt.Insets(2, 7, 2, 14));
        button_sw.setRequestFocusEnabled(false);
        button_sw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_swActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 245, 245));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/worker-30.png"))); // NOI18N
        jLabel3.setText("Workers");
        jLabel3.setIconTextGap(11);

        button_m.setBackground(new java.awt.Color(255, 102, 153));
        button_m.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_m.setForeground(new java.awt.Color(245, 245, 245));
        button_m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/supplier-30.png"))); // NOI18N
        button_m.setText("Merchant");
        button_m.setToolTipText("To Know about the dealers you deal with");
        button_m.setBorderPainted(false);
        button_m.setContentAreaFilled(false);
        button_m.setFocusPainted(false);
        button_m.setFocusable(false);
        button_m.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        button_m.setIconTextGap(10);
        button_m.setMargin(new java.awt.Insets(2, 7, 2, 14));
        button_m.setRequestFocusEnabled(false);
        button_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_mActionPerformed(evt);
            }
        });

        button_rm.setBackground(new java.awt.Color(255, 0, 51));
        button_rm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_rm.setForeground(new java.awt.Color(245, 245, 245));
        button_rm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ok-30.png"))); // NOI18N
        button_rm.setText("Ready Material");
        button_rm.setToolTipText("To keep track of ready material");
        button_rm.setBorderPainted(false);
        button_rm.setContentAreaFilled(false);
        button_rm.setFocusPainted(false);
        button_rm.setFocusable(false);
        button_rm.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        button_rm.setIconTextGap(10);
        button_rm.setMargin(new java.awt.Insets(2, 7, 2, 14));
        button_rm.setRequestFocusEnabled(false);
        button_rm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_rmActionPerformed(evt);
            }
        });

        label_rw.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_rw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/left1.jpg"))); // NOI18N

        label_up.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/left1.jpg"))); // NOI18N

        label_mt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_mt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/left1.jpg"))); // NOI18N

        label_rm.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_rm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/left1.jpg"))); // NOI18N

        label_m.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/left1.jpg"))); // NOI18N

        label_sw.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_sw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/left1.jpg"))); // NOI18N

        bt_raw.setBackground(new java.awt.Color(255, 102, 153));
        bt_raw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_raw.setForeground(new java.awt.Color(245, 245, 245));
        bt_raw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/fork lift-30.png"))); // NOI18N
        bt_raw.setText("Raw Material");
        bt_raw.setToolTipText("keep track of Raw Material");
        bt_raw.setBorderPainted(false);
        bt_raw.setContentAreaFilled(false);
        bt_raw.setFocusPainted(false);
        bt_raw.setFocusable(false);
        bt_raw.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bt_raw.setIconTextGap(10);
        bt_raw.setMargin(new java.awt.Insets(2, 7, 2, 14));
        bt_raw.setRequestFocusEnabled(false);
        bt_raw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_rawActionPerformed(evt);
            }
        });

        label_raw.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_raw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/left1.jpg"))); // NOI18N

        lb_timer.setFont(new java.awt.Font("Trebuchet MS", 0, 23)); // NOI18N
        lb_timer.setForeground(new java.awt.Color(255, 255, 102));
        lb_timer.setText("00:00:00");

        lb_time.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        lb_time.setForeground(new java.awt.Color(255, 255, 102));
        lb_time.setText("Time Elapsed :");

        button_mt.setBackground(new java.awt.Color(153, 255, 153));
        button_mt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_mt.setForeground(new java.awt.Color(245, 245, 245));
        button_mt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cash-30.png"))); // NOI18N
        button_mt.setText("Money Transaction");
        button_mt.setToolTipText("To add / delete / modify users");
        button_mt.setBorderPainted(false);
        button_mt.setContentAreaFilled(false);
        button_mt.setFocusPainted(false);
        button_mt.setFocusable(false);
        button_mt.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        button_mt.setIconTextGap(10);
        button_mt.setMargin(new java.awt.Insets(2, 7, 2, 14));
        button_mt.setRequestFocusEnabled(false);
        button_mt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_mtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(button_up, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(label_up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bt_raw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button_rm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button_sw, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button_rw, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator2))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(button_mt, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_rw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_rm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_sw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_mt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_raw, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_home, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_time, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_timer, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(button_home, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_up, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_up, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_mt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_mt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button_sw, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(button_rw, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_sw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45)
                        .addComponent(label_rw, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(button_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(button_m, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_rm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40)
                        .addComponent(label_m, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_raw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_raw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(lb_time)
                .addGap(5, 5, 5)
                .addComponent(lb_timer)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setOpaque(false);

        lb_user.setBackground(new java.awt.Color(255, 255, 255));
        lb_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user.png"))); // NOI18N
        lb_user.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_userMouseClicked(evt);
            }
        });

        lb_username.setBackground(new java.awt.Color(77, 77, 77));
        lb_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_username.setForeground(new java.awt.Color(255, 255, 255));
        lb_username.setText("Guest");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_user, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_username, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 51));

        tf_search.setBackground(new java.awt.Color(102, 102, 102));
        tf_search.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        tf_search.setForeground(new java.awt.Color(255, 255, 255));
        tf_search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_search.setToolTipText("");
        tf_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        tf_search.setCaretColor(new java.awt.Color(255, 255, 255));
        tf_search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf_search.setMargin(new java.awt.Insets(1, 10, 1, 10));
        tf_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_searchActionPerformed(evt);
            }
        });
        tf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_searchKeyTyped(evt);
            }
        });

        lb_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/search.jpg"))); // NOI18N
        lb_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_searchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lb_search)
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tf_search)
        );

        lb_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/pluss.png"))); // NOI18N
        lb_add.setToolTipText("Add Worker's information");
        lb_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_addMouseClicked(evt);
            }
        });

        lb_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/trash.png"))); // NOI18N
        lb_delete.setToolTipText("Delete Worker's detail");
        lb_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_deleteMouseClicked(evt);
            }
        });

        lb_sort.setBackground(new java.awt.Color(45, 45, 45));
        lb_sort.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lb_sort.setForeground(new java.awt.Color(255, 255, 255));
        lb_sort.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lb_sort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/sort.jpg"))); // NOI18N
        lb_sort.setText("Sort By");
        lb_sort.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lb_sort.setIconTextGap(7);
        lb_sort.setOpaque(true);
        lb_sort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_sortMouseClicked(evt);
            }
        });

        lb_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/pen.png"))); // NOI18N
        lb_edit.setToolTipText("Modify Worker's Detail(s)");
        lb_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_editMouseClicked(evt);
            }
        });

        lb_logout.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lb_logout.setForeground(new java.awt.Color(255, 51, 51));
        lb_logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_logout.setText("Logout");
        lb_logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        lb_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_logoutMouseExited(evt);
            }
        });

        cb_read.setBackground(new java.awt.Color(0, 0, 0));
        cb_read.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cb_read.setForeground(new java.awt.Color(255, 255, 255));
        cb_read.setText("Read");
        cb_read.setBorder(null);
        cb_read.setBorderPaintedFlat(true);
        cb_read.setEnabled(false);
        cb_read.setOpaque(false);

        cb_add.setBackground(new java.awt.Color(0, 0, 0));
        cb_add.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cb_add.setForeground(new java.awt.Color(255, 255, 255));
        cb_add.setText("Add");
        cb_add.setBorder(null);
        cb_add.setBorderPaintedFlat(true);
        cb_add.setEnabled(false);
        cb_add.setOpaque(false);

        cb_delete.setBackground(new java.awt.Color(0, 0, 0));
        cb_delete.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cb_delete.setForeground(new java.awt.Color(255, 255, 255));
        cb_delete.setText("Delete");
        cb_delete.setBorder(null);
        cb_delete.setBorderPaintedFlat(true);
        cb_delete.setEnabled(false);
        cb_delete.setOpaque(false);

        cb_modify.setBackground(new java.awt.Color(0, 0, 0));
        cb_modify.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cb_modify.setForeground(new java.awt.Color(255, 255, 255));
        cb_modify.setText("Modify");
        cb_modify.setBorder(null);
        cb_modify.setBorderPaintedFlat(true);
        cb_modify.setEnabled(false);
        cb_modify.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 102));
        jLabel1.setText("You Can :");

        jMenuBar1.setBackground(java.awt.Color.darkGray);
        jMenuBar1.setBorder(null);

        menu_goto.setBackground(java.awt.Color.darkGray);
        menu_goto.setBorder(null);
        menu_goto.setForeground(new java.awt.Color(255, 255, 255));
        menu_goto.setMnemonic('g');
        menu_goto.setText("  Go to  ");
        menu_goto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        m_backup.setBackground(java.awt.Color.darkGray);
        m_backup.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_backup.setForeground(new java.awt.Color(255, 255, 255));
        m_backup.setText("Backup");
        m_backup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m_backup.setBorderPainted(true);
        m_backup.setFocusPainted(true);
        menu_goto.add(m_backup);

        m_table.setBackground(java.awt.Color.darkGray);
        m_table.setBorder(null);
        m_table.setForeground(new java.awt.Color(255, 255, 255));
        m_table.setText("Tables");
        m_table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        m_mt.addActionListener(this);
        m_mt.setBackground(java.awt.Color.darkGray);
        m_mt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_mt.setForeground(new java.awt.Color(255, 255, 255));
        m_mt.setText("Money Transaction");
        m_mt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m_table.add(m_mt);

        m_sw.addActionListener(this);
        m_sw.setBackground(java.awt.Color.darkGray);
        m_sw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_sw.setForeground(new java.awt.Color(255, 255, 255));
        m_sw.setText("Sewing Workers");
        m_sw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m_table.add(m_sw);

        m_swd.addActionListener(this);
        m_swd.setBackground(java.awt.Color.darkGray);
        m_swd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_swd.setForeground(new java.awt.Color(255, 255, 255));
        m_swd.setText("Sewing Worker Details");
        m_swd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m_table.add(m_swd);

        m_rw.addActionListener(this);
        m_rw.setBackground(java.awt.Color.darkGray);
        m_rw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_rw.setForeground(new java.awt.Color(255, 255, 255));
        m_rw.setText("Raw Workers");
        m_rw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m_table.add(m_rw);

        m_rwd.addActionListener(this);
        m_rwd.setBackground(java.awt.Color.darkGray);
        m_rwd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_rwd.setForeground(new java.awt.Color(255, 255, 255));
        m_rwd.setText("Raw Worker Details");
        m_rwd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m_table.add(m_rwd);

        m_m.addActionListener(this);
        m_m.setBackground(java.awt.Color.darkGray);
        m_m.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_m.setForeground(new java.awt.Color(255, 255, 255));
        m_m.setText("Merchants");
        m_m.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m_table.add(m_m);

        m_md.addActionListener(this);
        m_md.setBackground(java.awt.Color.darkGray);
        m_md.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_md.setForeground(new java.awt.Color(255, 255, 255));
        m_md.setText("Merchant Details");
        m_md.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m_table.add(m_md);

        m_rm.addActionListener(this);
        m_rm.setBackground(java.awt.Color.darkGray);
        m_rm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_rm.setForeground(new java.awt.Color(255, 255, 255));
        m_rm.setText("Raw Material");
        m_rm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m_table.add(m_rm);

        m_rd.addActionListener(this);
        m_rd.setBackground(java.awt.Color.darkGray);
        m_rd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_rd.setForeground(new java.awt.Color(255, 255, 255));
        m_rd.setText("Ready Material");
        m_rd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m_table.add(m_rd);

        menu_goto.add(m_table);

        jSeparator5.setBackground(java.awt.Color.darkGray);
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setOpaque(true);
        menu_goto.add(jSeparator5);

        m_exit.addActionListener(this);
        m_exit.setBackground(java.awt.Color.darkGray);
        m_exit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_exit.setForeground(new java.awt.Color(255, 255, 255));
        m_exit.setText("Exit");
        m_exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menu_goto.add(m_exit);

        jMenuBar1.add(menu_goto);

        menu_nav.setBackground(java.awt.Color.darkGray);
        menu_nav.setBorder(null);
        menu_nav.setForeground(new java.awt.Color(255, 255, 255));
        menu_nav.setMnemonic('n');
        menu_nav.setText("Navigate  ");
        menu_nav.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        m_note.addActionListener(this);
        m_note.setBackground(java.awt.Color.darkGray);
        m_note.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_note.setForeground(new java.awt.Color(255, 255, 255));
        m_note.setText("Open file");
        m_note.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menu_nav.add(m_note);

        m_matrix.addActionListener(this);
        m_matrix.setBackground(java.awt.Color.darkGray);
        m_matrix.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_matrix.setForeground(new java.awt.Color(255, 255, 255));
        m_matrix.setText("Matrix Effect");
        m_matrix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menu_nav.add(m_matrix);

        jMenuBar1.add(menu_nav);

        menu_help.setBackground(java.awt.Color.darkGray);
        menu_help.setBorder(null);
        menu_help.setForeground(new java.awt.Color(255, 255, 255));
        menu_help.setMnemonic('h');
        menu_help.setText("Help  ");
        menu_help.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        m_update.addActionListener(this);
        m_update.setBackground(java.awt.Color.darkGray);
        m_update.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_update.setForeground(new java.awt.Color(255, 255, 255));
        m_update.setText("Check for Updates");
        m_update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m_update.setContentAreaFilled(false);
        menu_help.add(m_update);

        m_about.addActionListener(this);
        m_about.setBackground(java.awt.Color.darkGray);
        m_about.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_about.setForeground(new java.awt.Color(255, 255, 255));
        m_about.setText("About");
        m_about.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m_about.setContentAreaFilled(false);
        menu_help.add(m_about);

        m_support.addActionListener(this);
        m_support.setBackground(java.awt.Color.darkGray);
        m_support.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_support.setForeground(new java.awt.Color(255, 255, 255));
        m_support.setText("Support");
        m_support.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m_support.setContentAreaFilled(false);
        menu_help.add(m_support);

        jMenuBar1.add(menu_help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lb_sort, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lb_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_read)
                            .addComponent(cb_add)
                            .addComponent(cb_delete)
                            .addComponent(cb_modify))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_delete)
                        .addGap(10, 10, 10)
                        .addComponent(lb_edit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb_sort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_edit)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cb_read, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGap(4, 4, 4)
                                        .addComponent(cb_add, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4)
                                .addComponent(cb_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addComponent(cb_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        setSize(new java.awt.Dimension(1207, 744));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void actionPerformed(java.awt.event.ActionEvent ae) {
        if (m_backup.isArmed()) {
            db_client.TableEngine.Inner.takeBackup();
            pe.ta_msg.setText("Backup created successfully at :\n" + PATH + "/Backup");
            pe.setVisible(true);
            pe.exit(false);
        } else if (m_exit.isArmed()) {
            if (Panel_Gen_Settings.lb_backup.getText().equals("Enabled")) {
                db_client.TableEngine.Inner.takeBackup();
            }
            System.exit(0);
        } else if (m_mt.isArmed()) {
            setMtButton();
        } else if (m_sw.isArmed()) {
            setSwButton();
        } else if (m_swd.isArmed()) {
            label_raw.setVisible(false);
            label_mt.setVisible(false);
            label_up.setVisible(false);
            label_rw.setVisible(false);
            label_sw.setVisible(true);
            label_rm.setVisible(false);
            label_m.setVisible(false);
            setSwd();
        } else if (m_rw.isArmed()) {
            setRwButton();
        } else if (m_rwd.isArmed()) {
            label_raw.setVisible(false);
            label_mt.setVisible(false);
            label_up.setVisible(false);
            label_rw.setVisible(true);
            label_sw.setVisible(false);
            label_rm.setVisible(false);
            label_m.setVisible(false);
            setRwd();
        } else if (m_m.isArmed()) {
            setMButton();
        } else if (m_md.isArmed()) {
            label_raw.setVisible(false);
            label_mt.setVisible(false);
            label_up.setVisible(false);
            label_rw.setVisible(false);
            label_sw.setVisible(false);
            label_rm.setVisible(false);
            label_m.setVisible(true);
            setMerd();
        } else if (m_rm.isArmed()) {
            setRawButton();
        } else if (m_rd.isArmed()) {
            setRmButton();
        } else if (m_note.isArmed()) {
            new notepad();
        } else if (m_matrix.isArmed()) {
            new MatrixMagic();
        } else if (m_update.isArmed()) {
            panel_root.pgenset.manualUpdate();
        } else if (m_about.isArmed()) {
            fa.setVisible(true);
        } else if (m_support.isArmed()) {
            new Frame_Support();
        }
    }

    private void getSoftwareVersion() {
        try {
            rs = st.executeQuery("select const from properties where id = 'soft_version';");
            rs.next();
            this.SOFTWARE_VERSION = rs.getString(1);
            fa.lb_version.setText(rs.getString(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void checkForCoreTablesData() {
        try {
            rs = st.executeQuery("select * from table_buttons;");
            if (!rs.next()) {
                st.executeUpdate("insert into table_buttons values(1, 'Money Transaction');");
                st.executeUpdate("insert into table_buttons values(2, 'Sew Workers');");
                st.executeUpdate("insert into table_buttons values(3, 'Sew Worker Details');");
                st.executeUpdate("insert into table_buttons values(4, 'Raw Workers');");
                st.executeUpdate("insert into table_buttons values(5, 'Raw Worker Details');");
                st.executeUpdate("insert into table_buttons values(6, 'Merchants');");
                st.executeUpdate("insert into table_buttons values(7, 'Merchant Details');");
                st.executeUpdate("insert into table_buttons values(8, 'Raw Material');");
                st.executeUpdate("insert into table_buttons values(9, 'Ready Material');");
            }
            rs = st.executeQuery("select * from table_name;");
            if (!rs.next()) {
                st.executeUpdate("insert into table_name values(1, 'money_tran');");
                st.executeUpdate("insert into table_name values(2, 'emp_sew');");
                st.executeUpdate("insert into table_name values(3, 'emp_sewdetails');");
                st.executeUpdate("insert into table_name values(4, 'emp_raw');");
                st.executeUpdate("insert into table_name values(5, 'emp_rawdetails');");
                st.executeUpdate("insert into table_name values(6, 'merchant');");
                st.executeUpdate("insert into table_name values(7, 'merchant_details');");
                st.executeUpdate("insert into table_name values(8, 'raw_material');");
                st.executeUpdate("insert into table_name values(9, 'ready_material');");

            }
        } catch (Exception e) {
            homePage.pe.ta_msg.setText("Exception in : " + Thread.currentThread().getName().toUpperCase() + " " + e.toString() + ".");
            homePage.pe.setVisible(true);
            homePage.pe.exit(false);
        }
    }

    static void setCheckbox() {
        try {
            System.out.println("apendStatus() " + user_perm);
            rd = (user_perm.charAt(0) == '1');
            ad = (user_perm.charAt(1) == '1');
            dl = (user_perm.charAt(2) == '1');
            mod = (user_perm.charAt(3) == '1');
            if (rd) {
                cb_read.setSelected(true);
            } else {
                cb_read.setSelected(false);
            }
            if (ad) {
                cb_add.setSelected(true);
            } else {
                cb_add.setSelected(false);
            }
            if (dl) {
                cb_delete.setSelected(true);
            } else {
                cb_delete.setSelected(false);
            }
            if (mod) {
                cb_modify.setSelected(true);
            } else {
                cb_modify.setSelected(false);
            }

        } catch (Exception e) {
            homePage.pe.ta_msg.setText("Exception in : " + Thread.currentThread().getName().toUpperCase() + " " + e.toString() + ".");
            homePage.pe.setVisible(true);
            homePage.pe.exit(false);
        }
    }

    private void logInAsGuest() {
        if (Panel_Gen_Settings.lb_guest.getText().equals("Enabled")) {
            user_perm = "1100";
        } else {
            user_perm = "1000";
        }
        if (user_perm.charAt(1) == '1') {
            lb_add.setVisible(true);
            lb_delete.setVisible(false);
            lb_edit.setVisible(false);
        } else {
            lb_add.setVisible(false);
            lb_delete.setVisible(false);
            lb_edit.setVisible(false);
        }
    }

    private void getDefaultPath() {
        try {
            rs = st.executeQuery("select * from properties");
            while (rs.next()) {
                if (rs.getString(1).equals("path")) {
                    this.PATH = rs.getString(2);
                    break;
                }
            }
        } catch (Exception e) {
            homePage.pe.ta_msg.setText("Exception in : " + Thread.currentThread().getName().toUpperCase() + " " + e.toString() + ".");
            homePage.pe.setVisible(true);
            homePage.pe.exit(false);
        }
    }

    public static void runTimer() {
        new Thread(() -> {
            lb_timer.setVisible(true);
            lb_time.setVisible(true);
            while (++sec < 61) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (sec == 60) {
                    ++min;
                    sec = 0;
                    continue;
                }
                if (min == 60) {
                    ++hour;
                    min = 0;
                }
                if (hour < 10 && min < 10 && sec < 10) {
                    lb_timer.setText("0" + hour + ":0" + min + ":0" + sec);
                } else if (hour < 10 && min < 10 && sec > 9) {
                    lb_timer.setText("0" + hour + ":0" + min + ":" + sec);
                } else if (hour < 10 && min > 10 && sec > 9) {
                    lb_timer.setText("0" + hour + ":" + min + ":" + sec);
                } else {
                    lb_timer.setText(hour + ":" + min + ":" + sec);
                }
            }
        }).start();
    }

    public static void setTableButtonNames() {
        try {
            rs = st.executeQuery("select * from table_buttons order by sno asc;");
            rs.absolute(1);
            button_mt.setText(rs.getString(2));
            rs.absolute(2);
            button_sw.setText(rs.getString(2));
            rs.absolute(4);
            button_rw.setText(rs.getString(2));
            rs.absolute(9);
            button_rm.setText(rs.getString(2));
            rs.absolute(6);
            button_m.setText(rs.getString(2));
            rs.absolute(8);
            bt_raw.setText(rs.getString(2));
        } catch (Exception e) {
            homePage.pe.ta_msg.setText("Exception in : " + Thread.currentThread().getName().toUpperCase() + " " + e.toString() + ".");
            homePage.pe.setVisible(true);
            homePage.pe.exit(false);
        }
    }

    void setDialogBoxPanel(String str) {
        rb_temp = new JRadioButton(str);
        rb_temp.setActionCommand(col_index.toString());
        rb_temp.setBounds(0, rb_Y, 200, 13);
        if (col_index == 0) {
            rb_temp.setSelected(true);
        }
        panel.setPreferredSize(new java.awt.Dimension(200, rb_Y));
        panel.add(rb_temp);
        col_bg.add(rb_temp);
        ++col_index;
        rb_Y += 18;
    }

    void showDialogBox() {
        JOptionPane.showConfirmDialog(rootPane, panel, "Sort By Name of", JOptionPane.OK_CANCEL_OPTION);
    }

    void defActionListener() {
        def.addActionListener((ActionEvent ae) -> {
            if (label_mt.isVisible()) {
                mt.display();
            } else if (label_sw.isVisible()) {
                if (isSw) {
                    sw.display();
                } else {
                    swd.display();
                }
            } else if (label_rw.isVisible()) {
                if (isRw) {
                    rw.display();
                } else {
                    rwd.display();
                }
            } else if (label_rm.isVisible()) {
                r.display();
            } else if (label_m.isVisible()) {
                if (isMer) {
                    m.display();
                } else {
                    md.display();
                }
            } else if (label_raw.isVisible()) {
                rm.display();
            }

        });
    }

    void nameActionListener() {
        name.addActionListener((ActionEvent ae) -> {
            if (label_mt.isVisible()) {
                col_bg = new ButtonGroup();
                for (int i = 1; i < mt.table.getColumnCount(); i++) {
                    setDialogBoxPanel(mt.table.getColumnName(i));
                }
                setDialogBoxPanel("none");
                showDialogBox();
                panel.removeAll();
                col_index = 0;
                rb_Y = 0;
                mt.display(mt.table.getColumnName(Integer.parseInt(col_bg.getSelection().getActionCommand()) + 1), order);
            } else if (label_sw.isVisible()) {
                col_bg = new ButtonGroup();
                if (isSw) {
                    for (int i = 1; i < sw.table.getColumnCount(); i++) {
                        setDialogBoxPanel(sw.table.getColumnName(i));
                    }
                    setDialogBoxPanel("none");
                    showDialogBox();
                    panel.removeAll();
                    col_index = 0;
                    rb_Y = 0;
                    sw.display(sw.table.getColumnName(Integer.parseInt(col_bg.getSelection().getActionCommand()) + 1), order);
                } else {
                    for (int i = 1; i < swd.table.getColumnCount(); i++) {
                        setDialogBoxPanel(swd.table.getColumnName(i));
                    }
                    setDialogBoxPanel("none");
                    showDialogBox();
                    panel.removeAll();
                    col_index = 0;
                    rb_Y = 0;
                    swd.display(swd.table.getColumnName(Integer.parseInt(col_bg.getSelection().getActionCommand()) + 1), order);
                }
            } else if (label_rw.isVisible()) {
                col_bg = new ButtonGroup();
                if (isRw) {
                    for (int i = 1; i < rw.table.getColumnCount(); i++) {
                        setDialogBoxPanel(rw.table.getColumnName(i));
                    }
                    setDialogBoxPanel("none");
                    showDialogBox();
                    panel.removeAll();
                    col_index = 0;
                    rb_Y = 0;
                    rw.display(rw.table.getColumnName(Integer.parseInt(col_bg.getSelection().getActionCommand()) + 1), order);
                } else {
                    for (int i = 1; i < rwd.table.getColumnCount(); i++) {
                        setDialogBoxPanel(rwd.table.getColumnName(i));
                    }
                    setDialogBoxPanel("none");
                    showDialogBox();
                    panel.removeAll();
                    col_index = 0;
                    rb_Y = 0;
                    rwd.display(rwd.table.getColumnName(Integer.parseInt(col_bg.getSelection().getActionCommand()) + 1), order);
                }
            } else if (label_rm.isVisible()) {
                col_bg = new ButtonGroup();
                for (int i = 1; i < r.table.getColumnCount(); i++) {
                    setDialogBoxPanel(r.table.getColumnName(i));
                }
                setDialogBoxPanel("none");
                showDialogBox();
                panel.removeAll();
                col_index = 0;
                rb_Y = 0;
                r.display(r.table.getColumnName(Integer.parseInt(col_bg.getSelection().getActionCommand()) + 1), order);
            } else if (label_m.isVisible()) {
                col_bg = new ButtonGroup();
                if (isMer) {
                    for (int i = 1; i < m.table.getColumnCount(); i++) {
                        setDialogBoxPanel(m.table.getColumnName(i));
                    }
                    setDialogBoxPanel("none");
                    showDialogBox();
                    panel.removeAll();
                    col_index = 0;
                    rb_Y = 0;
                    m.display(m.table.getColumnName(Integer.parseInt(col_bg.getSelection().getActionCommand()) + 1), order);
                } else {
                    for (int i = 1; i < md.table.getColumnCount(); i++) {
                        setDialogBoxPanel(md.table.getColumnName(i));
                    }
                    setDialogBoxPanel("none");
                    showDialogBox();
                    panel.removeAll();
                    col_index = 0;
                    rb_Y = 0;
                    md.display(md.table.getColumnName(Integer.parseInt(col_bg.getSelection().getActionCommand()) + 1), order);
                }
            } else if (label_raw.isVisible()) {
                col_bg = new ButtonGroup();
                for (int i = 1; i < rm.table.getColumnCount(); i++) {
                    setDialogBoxPanel(rm.table.getColumnName(i));
                }
                setDialogBoxPanel("none");
                showDialogBox();
                panel.removeAll();
                col_index = 0;
                rb_Y = 0;
                rm.display(rm.table.getColumnName(Integer.parseInt(col_bg.getSelection().getActionCommand()) + 1), order);
            }
        });
    }

    void last_updActionListener() {
        last_upd.addActionListener((ActionEvent ae) -> {
            if (label_mt.isVisible()) {
                mt.display("last_upd", order);
            } else if (label_sw.isVisible()) {
                if (isSw) {
                    sw.display("last_upd", order);
                } else {
                    swd.display("last_upd", order);
                }
            } else if (label_rw.isVisible()) {
                if (isRw) {
                    rw.display("last_upd", order);
                } else {
                    rwd.display("last_upd", order);
                }
            } else if (label_rm.isVisible()) {
                r.display("last_upd", order);
            } else if (label_m.isVisible()) {
                if (isMer) {
                    m.display("last_upd", order);
                } else {
                    md.display("last_upd", order);
                }
            } else if (label_raw.isVisible()) {
                rm.display("last_upd", order);
            }

        });
    }

    void setOrder() {
        asc.addActionListener((ActionEvent ae) -> {
            if (asc.isSelected()) {
                order = "asc";
            }
        });
        dsc.addActionListener((ActionEvent ae) -> {
            if (dsc.isSelected()) {
                order = "desc";
            }
        });
    }

    public void popUpMenu() {
        sept = new JSeparator(0);
        sept.setBackground(Color.white);
        bg = new ButtonGroup();
        asc = new JRadioButton("ascending");
        asc.setSelected(true);
        dsc = new JRadioButton("descending");
        asc.setFocusPainted(false);
        dsc.setFocusPainted(false);
        asc.setBackground(new Color(45, 45, 45));
        dsc.setBackground(new Color(45, 45, 45));
        asc.setForeground(new Color(255, 255, 255));
        dsc.setForeground(new Color(255, 255, 255));
        bg.add(asc);
        bg.add(dsc);
        menu = new JPopupMenu();
        menu.setBackground(new Color(45, 45, 45));
        menu.setPopupSize(96, 120);
        name = new JMenuItem("Name");
        last_upd = new JMenuItem("Last Update");
        def = new JMenuItem("Default");
        name.setBackground(new Color(45, 45, 45));
        last_upd.setBackground(new Color(45, 45, 45));
        name.setForeground(new Color(255, 255, 255));
        last_upd.setForeground(new Color(255, 255, 255));
        def.setBackground(new Color(45, 45, 45));
        def.setForeground(new Color(255, 255, 255));
        menu.add(def);
        menu.add(name);
        menu.add(last_upd);
        menu.add(sept);
        menu.add(asc);
        menu.add(dsc);
        defActionListener();
        nameActionListener();
        last_updActionListener();
        setOrder();
        panel = new JPanel();
        panel.setLayout(null);
    }

    public static void createPanel() {
        javax.swing.JPanel pn = pad;// pn.setBounds(0, 0, 953, 550);
        jp = new javax.swing.JPanel();
        jp.add(pn);
        jp.setBounds(238, 157, 953, 552);
        jp.setBackground(new java.awt.Color(120, 120, 120));
        jp.setOpaque(true);
        jp.setVisible(true);
        c.add(jp);
    }

    private void init() {
        pmt = new Panel_money();
        mt = pmt.get();
        psw = new Panel_Sewing();
        sw = psw.get();
        pswd = new Panel_SewingWorkerDetails();
        swd = pswd.get();
        prw = new Panel_Raw();
        rw = prw.get();
        prwd = new Panel_RawWorkerDetails();
        rwd = prwd.get();
        pm = new Panel_merchants();
        m = pm.get();
        pmd = new Panel_MerchantDetails();
        md = pmd.get();
        pr = new Panel_Ready();
        r = pr.get();
        prm = new Panel_RawMaterial();
        rm = prm.get();
        panel_root = new Panel_root();
        panel_root.setVisible(false);
        pad = new Panel_admin();
        if (Panel_Gen_Settings.lb_login.getText().equals("Enabled")) {
            pad.lb_create.setVisible(false);
        } else {
            pad.lb_create.setVisible(true);
        }
    }

    public static void setSw() {
        isSwd = false;
        isSw = true;
        jp.removeAll();
        jp.setVisible(false);
        jp.add(psw);
        jp.setVisible(true);
    }

    public static void setSwd() {
        isSwd = true;
        isSw = false;
        jp.removeAll();
        jp.setVisible(false);
        jp.add(pswd);
        jp.setVisible(true);
    }

    public static void setRw() {
        isRw = true;
        isRwd = false;
        jp.removeAll();
        jp.add(prw);
        jp.setVisible(false);
        jp.setVisible(true);
    }

    public static void setRwd() {
        isRw = false;
        isRwd = true;
        jp.removeAll();
        jp.add(prwd);
        jp.setVisible(false);
        jp.setVisible(true);
    }

    public static void setMer() {
        isMer = true;
        isMerd = false;
        jp.removeAll();
        jp.add(pm);
        jp.setVisible(false);
        jp.setVisible(true);
    }

    public static void setMerd() {
        isMerd = true;
        isMer = false;
        jp.removeAll();
        jp.add(pmd);
        jp.setVisible(false);
        jp.setVisible(true);
    }

    private void button_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_upActionPerformed
        if (!label_up.isVisible()) {
            isadminclicked = true;
            jp.removeAll();
            lb_sort.setVisible(false);
            lb_add.setVisible(false);
            lb_delete.setVisible(false);
            lb_edit.setVisible(false);
            label_raw.setVisible(false);
            label_up.setVisible(true);
            label_mt.setVisible(false);
            label_rw.setVisible(false);
            label_sw.setVisible(false);
            label_rm.setVisible(false);
            label_m.setVisible(false);
            Panel_user pn = new Panel_user();
            pn.setBounds(0, 0, 953, 550);
            pn.sp_user.setViewportView(panel_root.pp.pn_base);
            panel_root.pp.setUserNames();
            panel_root.pp.pn_perm.setBackground(new Color(80, 80, 80));
            panel_root.pp.pn_base.setBackground(new Color(80, 80, 80));
            panel_root.pp.bt_create.setVisible(false);
            panel_root.pp.cb_read.setEnabled(false);
            panel_root.pp.cb_add.setEnabled(false);
            panel_root.pp.delete_cb.setEnabled(false);
            panel_root.pp.cb_modify.setEnabled(false);
            jp.add(pn);
        }
    }//GEN-LAST:event_button_upActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton5ActionPerformed

    private void button_rwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_rwActionPerformed
        setRwButton();
    }//GEN-LAST:event_button_rwActionPerformed
    private void setRwButton() {
        if (!label_rw.isVisible()) {
            isadminclicked = true;
            lb_add.setVisible(true);
            lb_delete.setVisible(true);
            lb_edit.setVisible(true);
            rw.setPermittedComponents(user_perm);
            jp.removeAll();
            lb_sort.setVisible(true);
            isRw = true;
            isRwd = false;
            label_raw.setVisible(false);
            label_rw.setVisible(true);
            label_up.setVisible(false);
            label_mt.setVisible(false);
            label_sw.setVisible(false);
            label_rm.setVisible(false);
            label_m.setVisible(false);
            javax.swing.JPanel pn = prw;
            pn.setBounds(0, 0, 953, 550);
            jp.add(pn);
        }
    }

    private void setMtButton() {
        if (!label_mt.isVisible()) {
            isadminclicked = true;
            lb_add.setVisible(true);
            lb_delete.setVisible(true);
            lb_edit.setVisible(true);
            mt.setPermittedComponents(user_perm);
            jp.removeAll();
            lb_sort.setVisible(true);
            label_raw.setVisible(false);
            label_mt.setVisible(true);
            label_up.setVisible(false);
            label_rw.setVisible(false);
            label_sw.setVisible(false);
            label_rm.setVisible(false);
            label_m.setVisible(false);
            javax.swing.JPanel pn = pmt; //mt.cellEditingOfCol0(); mt.tableRendering();
            pn.setBounds(0, 0, 953, 550);
            jp.add(pn);
        }
    }
    private void button_swActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_swActionPerformed
        setSwButton();
    }//GEN-LAST:event_button_swActionPerformed
    private void setSwButton() {
        if (!label_sw.isVisible()) {
            isadminclicked = true;
            lb_add.setVisible(true);
            lb_delete.setVisible(true);
            lb_edit.setVisible(true);
            sw.setPermittedComponents(user_perm);
            jp.removeAll();
            lb_sort.setVisible(true);
            isSw = true;
            isSwd = false;
            label_raw.setVisible(false);
            label_sw.setVisible(true);
            label_up.setVisible(false);
            label_mt.setVisible(false);
            label_rw.setVisible(false);
            label_rm.setVisible(false);
            label_m.setVisible(false);
            javax.swing.JPanel pn = psw;
            pn.setBounds(0, 0, 953, 550);
            jp.add(pn);
        }
    }
    private void button_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_mActionPerformed
        setMButton();
    }//GEN-LAST:event_button_mActionPerformed
    private void setMButton() {
        if (!label_m.isVisible()) {
            isadminclicked = true;
            lb_add.setVisible(true);
            lb_delete.setVisible(true);
            lb_edit.setVisible(true);
            m.setPermittedComponents(user_perm);
            jp.removeAll();
            lb_sort.setVisible(true);
            isMer = true;
            isMerd = false;
            label_raw.setVisible(false);
            label_m.setVisible(true);
            label_up.setVisible(false);
            label_mt.setVisible(false);
            label_rw.setVisible(false);
            label_sw.setVisible(false);
            label_rm.setVisible(false);
            javax.swing.JPanel pn = pm;
            pn.setBounds(0, 0, 953, 550);
            jp.add(pn);
        }
    }
    private void button_rmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_rmActionPerformed
        setRmButton();
    }//GEN-LAST:event_button_rmActionPerformed
    private void setRmButton() {
        if (!label_rm.isVisible()) {
            isadminclicked = true;
            lb_add.setVisible(true);
            lb_delete.setVisible(true);
            lb_edit.setVisible(true);
            r.setPermittedComponents(user_perm);
            jp.removeAll();
            lb_sort.setVisible(true);
            label_raw.setVisible(false);
            label_rm.setVisible(true);
            label_up.setVisible(false);
            label_mt.setVisible(false);
            label_rw.setVisible(false);
            label_sw.setVisible(false);
            label_m.setVisible(false);
            javax.swing.JPanel pn = pr;
            pn.setBounds(0, 0, 953, 550);
            jp.add(pn);
        }
    }
    private void lb_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_searchMouseClicked
        switch (tf_search.getText()) {
            case ":create":
                pad.createUserAccount();
                break;
            case ":forget":
                pad.forgetAccount();
                break;
            case ":matrix":
                new MatrixMagic();
                break;
            case ":notepad":
                new notepad();
                break;
            case ":exit":
                System.exit(0);
                break;
            case ":update":
                panel_root.pgenset.manualUpdate();
                break;
            case ":backup":
                db_client.TableEngine.Inner.takeBackup();
                pe.ta_msg.setText("Backup created successfully at :\n" + PATH + "/Backup");
                pe.setVisible(true);
                pe.exit(false);
                break;
        }
    }//GEN-LAST:event_lb_searchMouseClicked

    private void tf_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_searchActionPerformed

    }//GEN-LAST:event_tf_searchActionPerformed

    private void button_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_adminActionPerformed
        if (button_admin.getText().equals("Log in as Administrator")) {
            pad.tf_user.requestFocus();
            setButtonAdmin();
        } else {
            this.setVisible(false);
            panel_root.setVisible(true);
        }
    }//GEN-LAST:event_button_adminActionPerformed
    static void setButtonAdmin() {
        isadminclicked = false;
        lb_add.setEnabled(true);
        lb_add.setVisible(true);
        lb_delete.setVisible(false);
        lb_edit.setVisible(false);
        jp.removeAll();
        jp.setVisible(false);
        lb_sort.setVisible(false);
        pad.lb_err.setVisible(false);
        if (Panel_Gen_Settings.lb_login.getText().equals("Enabled")) {
            pad.lb_create.setVisible(false);
        } else {
            pad.lb_create.setVisible(true);
        }
        label_up.setVisible(false);
        label_mt.setVisible(false);
        label_rw.setVisible(false);
        label_sw.setVisible(false);
        label_rm.setVisible(false);
        label_m.setVisible(false);
        javax.swing.JPanel pn = pad;
        pn.setBounds(0, 0, 953, 550);// pn.setBackground(new java.awt.Color(255, 0, 0));
        jp.add(pn);
        jp.setVisible(true);
    }
    private void button_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_homeActionPerformed
        pad.tf_user.requestFocus();
        setButtonAdmin();
    }//GEN-LAST:event_button_homeActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        pad.tf_user.requestFocus();
        pad.tf_user.setVisible(false);
        pad.tf_user.setVisible(true);
    }//GEN-LAST:event_formWindowGainedFocus

    private void bt_rawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_rawActionPerformed
        setRawButton();
    }//GEN-LAST:event_bt_rawActionPerformed
    private void setRawButton() {
        if (!label_raw.isVisible()) {
            isadminclicked = true;
            lb_add.setVisible(true);
            lb_delete.setVisible(true);
            lb_edit.setVisible(true);
            rm.setPermittedComponents(user_perm);
            jp.removeAll();
            lb_sort.setVisible(true);
            label_up.setVisible(false);
            label_mt.setVisible(false);
            label_rw.setVisible(false);
            label_sw.setVisible(false);
            label_rm.setVisible(false);
            label_m.setVisible(false);
            label_raw.setVisible(true);
            javax.swing.JPanel pn = prm;
            pn.setBounds(0, 0, 953, 550);
            jp.add(pn);
            jp.setVisible(true);
        }
    }
    private void lb_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_addMouseClicked
        if (!lb_add.isEnabled()) {
            return;
        }
        if (label_up.isVisible()) {
            setButtonAdmin();
        } else if (!isadminclicked) {
            pad.createUserAccount();
        } else if (label_mt.isVisible()) {
            mt.addRow();
        } else if (label_rw.isVisible()) {
            if (isRw) {
                rw.addRow();
            } else {
                rwd.addRow();
            }
        } else if (label_sw.isVisible()) {
            if (isSw) {
                sw.addRow();
            } else {
                swd.addRow();
            }
        } else if (label_rm.isVisible()) {
            r.addRow();
        } else if (label_m.isVisible()) {
            if (isMer) {
                m.addRow();
            } else {
                md.addRow();
            }
        } else if (label_raw.isVisible()) {
            rm.addRow();
        }
        isadminclicked = true;
    }//GEN-LAST:event_lb_addMouseClicked

    private void lb_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_deleteMouseClicked
        isadminclicked = true;
        if (!lb_delete.isEnabled()) {
            return;
        }
        if (label_up.isVisible()) {
        } else if (label_mt.isVisible()) {
            mt.removeRow();
        } else if (label_rw.isVisible()) {
            if (isRw) {
                rw.removeRow();
            } else {
                rwd.removeRow();
            }
        } else if (label_sw.isVisible()) {
            if (isSw) {
                sw.removeRow();
            } else {
                swd.removeRow();
            }
        } else if (label_rm.isVisible()) {
            r.removeRow();
        } else if (label_m.isVisible()) {
            if (isMer) {
                m.removeRow();
            } else {
                md.removeRow();
            }
        } else if (label_raw.isVisible()) {
            rm.removeRow();
        }
    }//GEN-LAST:event_lb_deleteMouseClicked

    private void lb_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_editMouseClicked
        isadminclicked = true;
        if (!lb_edit.isEnabled()) {
            return;
        }
        if (label_up.isVisible()) {
        } else if (label_mt.isVisible()) {
            mt.updateRow();
        } else if (label_rw.isVisible()) {
            if (isRw) {
                rw.updateRow();
            } else {
                rwd.updateRow();
            }
        } else if (label_sw.isVisible()) {
            if (isSw) {
                sw.updateRow();
            } else {
                swd.updateRow();
            }
        } else if (label_rm.isVisible()) {
            r.updateRow();
        } else if (label_m.isVisible()) {
            if (isMer) {
                m.updateRow();
            } else {
                md.updateRow();
            }
        } else if (label_raw.isVisible()) {
            rm.updateRow();
        }
    }//GEN-LAST:event_lb_editMouseClicked

    private void lb_sortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_sortMouseClicked
        if (!lb_sort.isEnabled()) {
            return;
        }
        isadminclicked = true;
        menu.show(c, 1094, 58);
    }//GEN-LAST:event_lb_sortMouseClicked

    private void tf_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyPressed

    }//GEN-LAST:event_tf_searchKeyPressed

    private void tf_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyTyped

    }//GEN-LAST:event_tf_searchKeyTyped

    private void tf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyReleased
        isadminclicked = true;
        if (label_mt.isVisible()) {
            mt.searchInTable(tf_search.getText());
        } else if (label_rw.isVisible()) {
            if (isRw) {
                rw.searchInTable(tf_search.getText());
            } else {
                rwd.searchInTable(tf_search.getText());
            }
        } else if (label_sw.isVisible()) {
            if (isSw) {
                sw.searchInTable(tf_search.getText());
            } else {
                swd.searchInTable(tf_search.getText());
            }
        } else if (label_rm.isVisible()) {
            r.searchInTable(tf_search.getText());
        } else if (label_m.isVisible()) {
            if (isMer) {
                m.searchInTable(tf_search.getText());
            } else {
                md.searchInTable(tf_search.getText());
            }
        } else if (label_raw.isVisible()) {
            rm.searchInTable(tf_search.getText());
        }
    }//GEN-LAST:event_tf_searchKeyReleased

    private void lb_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_userMouseClicked
        isadminclicked = true;
        if (lb_username.getText().equals("[Guest]")) {
            return;
        }
        if (admin.gui.Panel_Gen_Settings.lb_image.getText().equals("Enabled")) {
            setUserImage();
        }
    }//GEN-LAST:event_lb_userMouseClicked

    private void lb_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_logoutMouseClicked
        setLogOutButton();
    }//GEN-LAST:event_lb_logoutMouseClicked
    public void setLogOutButton() {
        lb_logout.setVisible(false);
        button_admin.setText("Log in as Administrator");
        isadminclicked = true;
        logInAsGuest();
        lb_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user.png")));
        lb_username.setText("[Guest]");
        setButtonAdmin();
        logInAsGuest();
        setCheckbox();
    }
    private void lb_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_logoutMouseEntered
        lb_logout.setForeground(Color.white);
        lb_logout.setBorder(new javax.swing.border.LineBorder(Color.white, 1));
    }//GEN-LAST:event_lb_logoutMouseEntered

    private void lb_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_logoutMouseExited
        lb_logout.setForeground(Color.red);
        lb_logout.setBorder(new javax.swing.border.LineBorder(Color.red, 1));
    }//GEN-LAST:event_lb_logoutMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (Panel_Gen_Settings.lb_backup.getText().equals("Enabled")) {
            db_client.TableEngine.Inner.takeBackup();
        }
        if (Panel_Gen_Settings.lb_exit.getText().equals("Disabled")) {
            new Frame_Exit();
        } else {
            System.exit(0);
        }

    }//GEN-LAST:event_formWindowClosing

    private void button_mt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_up1ActionPerformed

    }//GEN-LAST:event_button_up1ActionPerformed

    private void button_mtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_mtActionPerformed
        setMtButton();
    }//GEN-LAST:event_button_mtActionPerformed

    static public void setUserImage() {
        try {
            username = "";
            for (byte b = 0; lb_username.getText().charAt(b) != '['; b++) {
                username += lb_username.getText().charAt(b);
            }
            username = username.substring(0, username.length() - 3);
            rs = st.executeQuery("select * from user_images;");
            while (rs.next()) {
                if (rs.getString(1).equals(username) || rs.getString(1).equals("root")) {
                    if (rs.getString(1).equals("root")) {
                        username = "root";
                    }
                    java.sql.Blob blob = rs.getBlob(2);
                    byte[] b = blob.getBytes(1, (int) blob.length());
                    lb_user.setIcon(new javax.swing.ImageIcon(b));
                    admin.gui.Panel_UserDetails.lb_user.setIcon(new javax.swing.ImageIcon(b));
                    break;
                }
            }
        } catch (Exception e) {
            try {
                jfc.setDialogTitle("select an Image");
                if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    f = jfc.getSelectedFile();
                    image = ImageIO.read(f);
                    lb_user.setIcon(new javax.swing.ImageIcon(image));
                    ps1 = con.prepareStatement("update user_images set image = ? where username = '" + username + "';");
                    ps1.setBinaryStream(1, new java.io.FileInputStream(f), (int) f.length());
                    //  ps1.setString(2, rs.getString(1));
                    ps1.executeUpdate();
                }

            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
    }

    public static void main(String args[]) throws Exception {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            try {
                hp = new homePage();
                hp.setVisible(true);
            } catch (Exception e) {
                homePage.pe.ta_msg.setText("Exception in : " + Thread.currentThread().getName().toUpperCase() + " " + e.toString() + ".");
                homePage.pe.setVisible(true);
                homePage.pe.exit(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton bt_raw;
    static javax.swing.JButton button_admin;
    private javax.swing.JButton button_home;
    public static javax.swing.JButton button_m;
    public static javax.swing.JButton button_mt;
    public static javax.swing.JButton button_rm;
    public static javax.swing.JButton button_rw;
    public static javax.swing.JButton button_sw;
    private javax.swing.JButton button_up;
    private static javax.swing.JCheckBox cb_add;
    private static javax.swing.JCheckBox cb_delete;
    private static javax.swing.JCheckBox cb_modify;
    private static javax.swing.JCheckBox cb_read;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    static javax.swing.JLabel label_m;
    static javax.swing.JLabel label_mt;
    static javax.swing.JLabel label_raw;
    static javax.swing.JLabel label_rm;
    static javax.swing.JLabel label_rw;
    static javax.swing.JLabel label_sw;
    static javax.swing.JLabel label_up;
    public static javax.swing.JLabel lb_add;
    public static javax.swing.JLabel lb_delete;
    public static javax.swing.JLabel lb_edit;
    static javax.swing.JLabel lb_logout;
    private javax.swing.JLabel lb_search;
    public static javax.swing.JLabel lb_sort;
    public static javax.swing.JLabel lb_time;
    public static javax.swing.JLabel lb_timer;
    public static javax.swing.JLabel lb_user;
    static javax.swing.JLabel lb_username;
    private javax.swing.JMenuItem m_about;
    private javax.swing.JMenuItem m_backup;
    private javax.swing.JMenuItem m_exit;
    private javax.swing.JMenuItem m_m;
    private javax.swing.JMenuItem m_matrix;
    private javax.swing.JMenuItem m_md;
    private javax.swing.JMenuItem m_mt;
    private javax.swing.JMenuItem m_note;
    private javax.swing.JMenuItem m_rd;
    private javax.swing.JMenuItem m_rm;
    private javax.swing.JMenuItem m_rw;
    private javax.swing.JMenuItem m_rwd;
    private javax.swing.JMenuItem m_support;
    private javax.swing.JMenuItem m_sw;
    private javax.swing.JMenuItem m_swd;
    private javax.swing.JMenu m_table;
    private javax.swing.JMenuItem m_update;
    private javax.swing.JMenu menu_goto;
    private javax.swing.JMenu menu_help;
    private javax.swing.JMenu menu_nav;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables
}
