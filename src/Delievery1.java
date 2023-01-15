import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Delievery1 extends javax.swing.JInternalFrame {
        
        Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel  dml;
    Statement st;
     
     private Vector<String> data;
        private Vector<String> header;
   
    public Delievery1()throws SQLException, Exception {
        con= re.getCon();          
         //   Date d = new Date();
         //      String curDate = "";
         //     dc1.setDate(d);                 
            //  j1.setDate(d);
            //  j2.setDate(d);
       Delievery dce = new Delievery("select * from delievery");
       data = dce.getData();
       
       header = new Vector<String>();
       header.add("Cust_No");
       header.add("Cust_Name");
       header.add("Contact");
       header.add("Date");
       header.add("Item");
       header.add("Quantity");
       header.add("Total");
       initComponents();
       jc1.requestFocus();
       jc1.requestFocusInWindow();
       jc1.requestFocus(true);
       try {  
             
              st=con.createStatement();
              rs=st.executeQuery("select * from Customer_Master ORDER BY Customer_name");
              while(rs.next())
              {
                  jc1.addItem(""+rs.getString(2));                   
              }
                  } catch (Exception ex) {
            System.out.println(ex);
        }
          try {      // con= re.getCon(); 
              st=con.createStatement();
              rs=st.executeQuery("select * from Item_Master order by Item_name");
              while(rs.next())
              {
                  jc2.addItem(""+rs.getString(2));
                   
              }
                  } catch (Exception ex) {
          System.out.println(ex);
                    //  System.out.println(ex);
        }
        //c_no.requestFocusInWindow();         
    }
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sbin = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        sbi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        c_no = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cont = new javax.swing.JTextField();
        jc1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dc1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jc2 = new javax.swing.JComboBox();
        in = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        rate = new javax.swing.JTextField();
        nt = new javax.swing.JTextField();
        j1 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        j2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        d1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "item_no", "item_name", "item_make", "item_rate", "item_ratio", "item_unit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setForeground(new java.awt.Color(51, 0, 51));
        jPanel1.setName("jPanel1"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        sbin.setBackground(new java.awt.Color(204, 255, 204));
        sbin.setBorder(new javax.swing.border.MatteBorder(null));
        sbin.setForeground(new java.awt.Color(0, 51, 204));
        sbin.setModel(new javax.swing.table.DefaultTableModel(
            data,header
        ));
        sbin.setName("sbin"); // NOI18N
        sbin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sbinMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(sbin);

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delivery Note");
        jLabel1.setName("jLabel1"); // NOI18N

        sbi.setText(" ");
        sbi.setName("sbi"); // NOI18N
        sbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbiActionPerformed(evt);
            }
        });
        sbi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sbiKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sbiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sbiKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Date From");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search by Customer Name");
        jLabel2.setName("jLabel2"); // NOI18N

        ok.setBackground(java.awt.SystemColor.activeCaption);
        ok.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ok.setForeground(new java.awt.Color(0, 51, 204));
        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APPLICATION ICONS/24x24-free-button-icons/gif/24x24/114.gif"))); // NOI18N
        ok.setText("EXIT");
        ok.setName("ok"); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer No.");
        jLabel5.setName("jLabel5"); // NOI18N

        c_no.setName("c_no"); // NOI18N
        c_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c_noKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                c_noKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");
        jLabel6.setName("jLabel6"); // NOI18N

        cont.setEditable(false);
        cont.setToolTipText("");
        cont.setName("cont"); // NOI18N

        jc1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Customer" }));
        jc1.setToolTipText("");
        jc1.setName("jc1"); // NOI18N
        jc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc1ActionPerformed(evt);
            }
        });
        jc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jc1KeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Current Date");
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact");
        jLabel4.setName("jLabel4"); // NOI18N

        dc1.setDateFormatString("yyyy-MM-dd");
        dc1.setName("dc1"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Item");
        jLabel8.setName("jLabel8"); // NOI18N

        jc2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Item" }));
        jc2.setName("jc2"); // NOI18N
        jc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc2ActionPerformed(evt);
            }
        });
        jc2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jc2KeyPressed(evt);
            }
        });

        in.setEditable(false);
        in.setName("in"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Item No");
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Rate");
        jLabel10.setName("jLabel10"); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quantity");
        jLabel11.setName("jLabel11"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total");
        jLabel12.setName("jLabel12"); // NOI18N

        qty.setName("qty"); // NOI18N
        qty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                qtyFocusLost(evt);
            }
        });
        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qtyKeyPressed(evt);
            }
        });

        rate.setEditable(false);
        rate.setName("rate"); // NOI18N
        rate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rateKeyPressed(evt);
            }
        });

        nt.setName("nt"); // NOI18N
        nt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ntFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ntFocusLost(evt);
            }
        });

        j1.setDateFormatString("yyyy-MM-dd");
        j1.setName("j1"); // NOI18N
        j1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j1KeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("To");
        jLabel13.setName("jLabel13"); // NOI18N

        j2.setDateFormatString("yyyy-MM-dd");
        j2.setName("j2"); // NOI18N
        j2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                j2MouseMoved(evt);
            }
        });
        j2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                j2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                j2FocusLost(evt);
            }
        });
        j2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j2MousePressed(evt);
            }
        });
        j2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                j2KeyTyped(evt);
            }
        });

        jButton1.setBackground(java.awt.SystemColor.activeCaption);
        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SAVE.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.SystemColor.activeCaption);
        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APPLICATION ICONS/24x24-free-button-icons/gif/24x24/100.gif"))); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        d1.setName("d1"); // NOI18N

        jButton3.setBackground(java.awt.SystemColor.activeCaption);
        jButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detail item.gif"))); // NOI18N
        jButton3.setText("DISPLAY");
        jButton3.setHideActionText(true);
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(java.awt.SystemColor.activeCaption);
        jButton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prints.png"))); // NOI18N
        jButton4.setText("PRINT");
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(java.awt.SystemColor.activeCaption);
        jButton5.setForeground(new java.awt.Color(0, 51, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APPLICATION ICONS/24x24-free-button-icons/gif/24x24/170.gif"))); // NOI18N
        jButton5.setText("DELETE");
        jButton5.setName("jButton5"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(sbi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton3))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(186, 186, 186)
                                                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(25, 25, 25)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jc2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGap(48, 48, 48)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel12)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(32, 32, 32)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(in)
                                                    .addComponent(nt)
                                                    .addComponent(cont, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))))
                                    .addComponent(c_no, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(64, 64, 64)
                        .addComponent(ok)
                        .addGap(41, 41, 41)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(26, 26, 26)
                        .addComponent(jButton5)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_no)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dc1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sbi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbiActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_sbiActionPerformed

private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
   this.dispose();

}//GEN-LAST:event_okActionPerformed

private void sbiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sbiKeyTyped
    
}//GEN-LAST:event_sbiKeyTyped

private void sbiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sbiKeyReleased

 /*   int f=0; 
    
   String s=sbi.getText();
    String s1=null;
        
    for(int i=0;i<s.length();i++)
    {
    
      char a=s.charAt(i);  
       Character chr=new Character(a);
       
      if(chr.isDigit(a))
      {
           f=1;
        s1=s.substring(0, i);   
      }
    }
    if(f==1)
    {
        JOptionPane.showMessageDialog(null,"number not allowed");
     sbi.setText(s1);
    
    }*/

    /*try {
                
           
                 DCEngin dce = new DCEngin("select * from delievery where cust_name like '"+sbi.getText().trim()+"%'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Cust_No");
       header.add("Cust_Name");
       header.add("Contact");
       header.add("Date");
       header.add("Item");
       header.add("Quantity");
       header.add("Total");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header));           
        } catch (Exception ex) {
            Logger.getLogger(Search_customer.class.getName()).log(Level.SEVERE, null, ex);
        }*/
try {
                String date1=((JTextField)j1.getDateEditor().getUiComponent()).getText(); 
                String date2=((JTextField)j2.getDateEditor().getUiComponent()).getText();
                if(sbi.equals(""))
                        {
                 DCEngin dce = new DCEngin("select * from delievery where curr_date between '"+date1+"' and '"+date2+"'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Cust_No");
       header.add("Cust_Name");
       header.add("Contact");
       header.add("Date");
       header.add("Item");
       header.add("Quantity");
       header.add("Total");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header));  
                        }
                else 
                {        DCEngin dce = new DCEngin("select * from delievery where cust_name like '"+sbi.getText().trim()+"%' and curr_date between '"+date1+"' and '"+date2+"'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Cust_No");
       header.add("Cust_Name");
       header.add("Contact");
       header.add("Date");
       header.add("Item");
       header.add("Quantity");
       header.add("Total");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header)); 
                }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Please Enter Date");
        }

}//GEN-LAST:event_sbiKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try
        {

            pst=con.prepareStatement("insert into delievery values(?,?,?,?,?,?,?)");
            pst.setString(1,""+c_no.getText());
            pst.setString(2,""+jc1.getSelectedItem());
            pst.setString(3,""+cont.getText());
             pst.setString(4, ((JTextField)dc1.getDateEditor().getUiComponent()).getText());
            pst.setString(5,""+jc2.getSelectedItem());
              pst.setString(6,""+qty.getText());
            pst.setString(7,""+nt.getText());
            jButton1.setEnabled(true);  
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Inserted Sucessfully....");
            qty.setText("");
             }
        catch(Exception ex)
        {
            System.out.print(ex);
        }    
         try
        {   
             con= re.getCon(); 
              DCEngin dce = new DCEngin("select * from delievery");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Cust_No");
       header.add("Cust_Name");
       header.add("Contact");
       header.add("Date");
       header.add("Item");
       header.add("Quantity");
       header.add("Total");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header)); 

        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
         jc1.requestFocusInWindow();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void qtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qtyFocusLost
        float rr=Float.parseFloat(rate.getText());
        float qtyy=Float.parseFloat(qty.getText());
        float ntt=rr*qtyy;
        nt.setText(""+ntt);
    }//GEN-LAST:event_qtyFocusLost

    private void jc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc2ActionPerformed
        Date d = new Date();
               String curDate = "";
              dc1.setDate(d);                 
              j1.setDate(d);
              j2.setDate(d);
        String s1=(String)jc2.getSelectedItem();
        String sql="select * from Item_Master where Item_name=?";
        try
        {
            pst=con.prepareStatement(sql);
            pst.setString(1,s1);
            rs=pst.executeQuery();
            while(rs.next())
            {
                String i_n=rs.getString("Item_no");
                in.setText(i_n);
                String R=rs.getString("Item_Rate");
                rate.setText(R);

            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jc2ActionPerformed

    private void jc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc1ActionPerformed
         String s1=(String)jc1.getSelectedItem();
        String sql="select * from Customer_Master where Customer_name=?";
        try
        {
            pst=con.prepareStatement(sql);
            pst.setString(1,s1);
            rs=pst.executeQuery();
            while(rs.next()) {
                String cno=rs.getString("Customer_no");
                c_no.setText(cno);
                String con_no=rs.getString("Customer_add3");
                cont.setText(con_no);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jc1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{   
     rs = st.executeQuery("select * from temp");
            
                rs.last();
                System.out.println(""+rs.getInt(1));
                 System.out.println(""+rs.getString(2));
                 System.out.println(""+rs.getString(3));

          pst=con.prepareStatement("update delievery  set  cust_name=?, contact=?,curr_date=?,item=?,quantity=? ,total=?  where cust_no="+rs.getInt(1)+" and curr_date='"+rs.getString(2)+"' and item='"+rs.getString(3)+"'");   
  // pst.setString(1,""+c_no.getText());
    pst.setString(1,""+jc1.getSelectedItem());
     pst.setString(2,""+cont.getText());
    
       //     dc1.setName(dat);
             pst.setString(3, ((JTextField)dc1.getDateEditor().getUiComponent()).getText());
  
            pst.setString(4,""+jc2.getSelectedItem());
       
             // pst.setString(5,""+qty.getText());
            pst.setFloat(5,Float.parseFloat(qty.getText()));
           
            //pst.setString(6,""+nt.getText());
            pst.setFloat(6,Float.parseFloat(nt.getText()));
            jButton1.setEnabled(true);  

    //pst.setString(9,""+cstex.getText());
    pst.executeUpdate();
   
    JOptionPane.showMessageDialog(null, "Record UPDATED Sucessfully....");
     try
        {    
             con= re.getCon(); 
              DCEngin dce = new DCEngin("select * from delievery");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Cust_No");
       header.add("Cust_Name");
       header.add("Contact");
       header.add("Date");
       header.add("Item");
       header.add("Quantity");
       header.add("Total");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header)); 

        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
  //  pst=con.prepareStatement("DELETE FROM TEMP");
 //   pst.executeUpdate();
    
    
    
   //con.close();
  
 /*      con= re.getCon();      
        st=con.createStatement();
       Delievery dbe = new Delievery("select * from delievery");
                 data = dbe.getData();
      
       
       header = new Vector<String>();
       header.add("customer no   ");
       header.add("Customer Name   ");
       header.add("Address     ");
       header.add("Email-ID         ");
       header.add("Contact      ");
      // header.add("Cont. No");
       //header.add("Mail ID");
       header.add("State        ");
       header.add("tin no       ");
       //header.add("stex no");
                jTable1.setModel(new DefaultTableModel(data,header));
  
c_no.setText("");
 cont.setText("");
 rate.setText("");
 qty.setText("");
 in.setText("");
// cd.setText("");
 nt.setText("");
 //ctel.setText("");
 //ctin.setText("");
 //cstex.setText("");
 */
}                                   
catch(Exception e)
{
    System.out.println(e);
}        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void sbinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbinMouseClicked
   
      /*  try {
              
       
            int r= sbin.getSelectedRow();
             
            int c=sbin.getSelectedColumn();
              
                     Object s=sbin.getValueAt(r, 0);
                     
            String NameVal = s.toString();
            
            rs = st.executeQuery("select * from delievery where cust_no='"+NameVal+"'");
            System.out.println("showing before rs.next");
                 rs.next();
                 System.out.println("showing after rs.next");
                     c_no.setText(""+rs.getInt(1));
                   //  cn.setText(""+rs.getString(2));
                     System.out.println("showing before jc1");
                     String combo1=sbin.getValueAt(r, 1).toString();
                     for(int i=0;i<jc1.getItemCount();i++)
                     {
                         if(jc1.getItemAt(i).toString().equalsIgnoreCase(combo1))
                         {
                             jc1.setSelectedIndex(i);
                              
                         }    
                         
                     }      System.out.println("shOWING BEFORE CONT");
                       cont.setText(""+rs.getString(3));
                       System.out.println("shOWING AFTER CONT");
                        d1.setText(""+rs.getString(4));
                     String combo2=sbin.getValueAt(r, 1).toString();
                     for(int i=0;i<jc2.getItemCount();i++)
                     {
                         if(jc2.getItemAt(i).toString().equalsIgnoreCase(combo2))
                         {
                             jc2.setSelectedIndex(i);
                         }    
                     }
                       System.out.println("shOWING BEFORE QTY,NT");
                     qty.setText(""+rs.getFloat(6));
       //              cd.setText(""+rs.getString(6));
                     nt.setText(""+rs.getFloat(7));
                     System.out.println("shOWING BEFORE CATTCH");
              //       ctin.setText(""+rs.getString(7));
     //                ctel.setText(""+rs.getString(9));
   //                  cstex.setText(""+rs.getString(10));
       
        } catch (Exception ex) {
                      ex.printStackTrace();
        }*/
          try {          
            int r= sbin.getSelectedRow();
            int c=sbin.getSelectedColumn();
                     Object s=sbin.getValueAt(r, 0);
            String NameVal = s.toString();
            rs = st.executeQuery("select * from delievery where cust_no='"+NameVal+"'");                
                rs.next();
                c_no.setText(""+rs.getInt(1));
                 d1.setText(""+rs.getString(4));
                        qty.setText(""+rs.getFloat(6));
                     nt.setText(""+rs.getFloat(7));
                       cont.setText(""+rs.getString(3));
                       String combo2=sbin.getValueAt(r, 4).toString();
                      jc2.setSelectedItem(combo2);
                    String combo1=sbin.getValueAt(r, 1).toString();
                    jc1.setSelectedItem(combo1); 
                         pst=con.prepareStatement("insert into temp values(?,?,?)");
               pst.setString(1,""+c_no.getText());
 pst.setString(2,""+d1.getText());
 pst.setString(3,""+jc2.getSelectedItem());
 pst.executeUpdate();                  
        } catch (Exception ex) {
                    //  ex.printStackTrace();
            System.out.println("Error Caugt:"+ex);
        }
    }//GEN-LAST:event_sbinMouseClicked

    private void ntFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ntFocusLost
      
    }//GEN-LAST:event_ntFocusLost

    private void ntFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ntFocusGained
     
    }//GEN-LAST:event_ntFocusGained

    private void j2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j2KeyPressed
        int key=evt.getKeyCode();
    if(key==10)
    {
            try {
                String date1=((JTextField)j1.getDateEditor().getUiComponent()).getText(); 
                String date2=((JTextField)j2.getDateEditor().getUiComponent()).getText();
                if(sbi.equals(""))
                        {
                 DCEngin dce = new DCEngin("select * from delievery where curr_date between '"+date1+"' and '"+date2+"'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Cust_No");
       header.add("Cust_Name");
       header.add("Contact");
       header.add("Date");
       header.add("Item");
       header.add("Quantity");
       header.add("Total");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header));  
                        }
                else 
                {        DCEngin dce = new DCEngin("select * from delievery where cust_name like '"+sbi.getText().trim()+"%' and curr_date between '"+date1+"' and '"+date2+"'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Cust_No");
       header.add("Cust_Name");
       header.add("Contact");
       header.add("Date");
       header.add("Item");
       header.add("Quantity");
       header.add("Total");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header)); 
                }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

     sbi.requestFocus();
    }   
    if(key==27)
    {
     this.dispose();
    }    
    if(key==38)
    {
     j1.requestFocus();
    }
    if(key==112)
    {
        MessageFormat header=new MessageFormat("Uday Dairy");
        MessageFormat footer=new MessageFormat("page{0,number,integer}");
        try
        {
            sbin.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }    
    }
    }//GEN-LAST:event_j2KeyPressed

    private void j2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j2KeyReleased
   
    }//GEN-LAST:event_j2KeyReleased

    private void j2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2MousePressed
     
    }//GEN-LAST:event_j2MousePressed

    private void j2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_j2FocusLost
        
    }//GEN-LAST:event_j2FocusLost

    private void j2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_j2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_j2FocusGained

    private void j2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2MouseMoved
     
    }//GEN-LAST:event_j2MouseMoved

    private void j2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j2KeyTyped
       
    }//GEN-LAST:event_j2KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    /*      int f=0; 
    
   String s=sbi.getText();
    String s1=null;
        
    for(int i=0;i<s.length();i++)
    {
    
      char a=s.charAt(i);  
       Character chr=new Character(a);
       
      if(chr.isDigit(a))
      {
           f=1;
        s1=s.substring(0, i);   
      }
    }
    if(f==1)
    {
        JOptionPane.showMessageDialog(null,"number not allowed");
     sbi.setText(s1);
    
    } */

    try {
                String date1=((JTextField)j1.getDateEditor().getUiComponent()).getText(); 
                String date2=((JTextField)j2.getDateEditor().getUiComponent()).getText();
                if(sbi.equals(""))
                        {
                 DCEngin dce = new DCEngin("select * from delievery where curr_date between '"+date1+"' and '"+date2+"'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Cust_No");
       header.add("Cust_Name");
       header.add("Contact");
       header.add("Date");
       header.add("Item");
       header.add("Quantity");
       header.add("Total");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header));  
                        }
                else 
                {        DCEngin dce = new DCEngin("select * from delievery where cust_name like '"+sbi.getText().trim()+"%' and curr_date between '"+date1+"' and '"+date2+"'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Cust_No");
       header.add("Cust_Name");
       header.add("Contact");
       header.add("Date");
       header.add("Item");
       header.add("Quantity");
       header.add("Total");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header)); 
                }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Please Enter Date");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MessageFormat header=new MessageFormat("Uday Dairy");
        MessageFormat footer=new MessageFormat("page{0,number,integer}");
        try
        {
            sbin.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jc1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jc1KeyPressed
             int key=evt.getKeyCode();
    if(key==10)
    {
      String s1=(String)jc1.getSelectedItem();
        String sql="select * from Customer_Master where Customer_name=?";
        try
        {
            pst=con.prepareStatement(sql);
            pst.setString(1,s1);
            rs=pst.executeQuery();
            while(rs.next()) {
                String cno=rs.getString("Customer_no");
                c_no.setText(cno);
                String con_no=rs.getString("Customer_add3");
                cont.setText(con_no);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
     jc2.requestFocus();
    }   
    if(key==27)
    {
     this.dispose();
    }
    if(key==37)
    {
    c_no.requestFocus();
    }
    }//GEN-LAST:event_jc1KeyPressed

    private void jc2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jc2KeyPressed
      int key=evt.getKeyCode();
    if(key==10)
    {
     qty.requestFocus();
    }   
    if(key==27)
    {
     this.dispose();
    }    
    if(key==38)
    {
     jc1.requestFocus();
    }
    }//GEN-LAST:event_jc2KeyPressed

    private void qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyPressed
       int key=evt.getKeyCode();
    if(key==10)
    {
     rate.requestFocus();
    }   
    if(key==27)
    {
     this.dispose();
    }    
    if(key==38)
    {
     jc2.requestFocus();
    }
    }//GEN-LAST:event_qtyKeyPressed

    private void rateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rateKeyPressed
        int key=evt.getKeyCode();
         if(key==27)
    {
     this.dispose();
    }    
   
      if(key==10){
          try
        {

            pst=con.prepareStatement("insert into delievery values(?,?,?,?,?,?,?)");
            pst.setString(1,""+c_no.getText());
            pst.setString(2,""+jc1.getSelectedItem());
            pst.setString(3,""+cont.getText());
             pst.setString(4, ((JTextField)dc1.getDateEditor().getUiComponent()).getText());
            pst.setString(5,""+jc2.getSelectedItem());
              pst.setString(6,""+qty.getText());
            pst.setString(7,""+nt.getText());
            jButton1.setEnabled(true);  
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Inserted Sucessfully....");
            qty.setText("");
             }
        catch(Exception ex)
        {
            System.out.print(ex);
        }    
         try
        {   
             con= re.getCon(); 
              DCEngin dce = new DCEngin("select * from delievery");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Cust_No");
       header.add("Cust_Name");
       header.add("Contact");
       header.add("Date");
       header.add("Item");
       header.add("Quantity");
       header.add("Total");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header)); 
        jc1.requestFocus();       
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
         jc1.requestFocusInWindow();
      }
    }//GEN-LAST:event_rateKeyPressed

    private void j1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j1KeyPressed
        int key=evt.getKeyCode();
    if(key==10)
    {
     j2.requestFocus();
    }   
    if(key==27)
    {
     this.dispose();
    }    
    if(key==38)
    {
     sbi.requestFocus();
    }
    }//GEN-LAST:event_j1KeyPressed

    private void sbiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sbiKeyPressed
        int key=evt.getKeyCode();
    if(key==10)
    {
     j1.requestFocus();
     
    }   
    if(key==27)
    {
     this.dispose();
    }    
    if(key==38)
    {
     jc1.requestFocus();
    }
   
    }//GEN-LAST:event_sbiKeyPressed

    private void c_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_noKeyReleased
   String s1=c_no.getText();
        String sql="select * from Customer_Master where Customer_no=?";
        try
        {
            pst=con.prepareStatement(sql);
            pst.setString(1,s1);
            rs=pst.executeQuery();
            if(rs!=null)
            {while(rs.next()) {
                String cno=rs.getString("customer_name");
                jc1.setSelectedItem(cno);
          //      String con_no=rs.getString("Customer_add3");
           //     cont.setText(con_no);
            }            
            }
            else { JOptionPane.showMessageDialog(null,"No Record Found...! Please Try Again");
            c_no.setText("");
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }        
    }//GEN-LAST:event_c_noKeyReleased

    private void c_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_noKeyPressed
            int key=evt.getKeyCode();
    if(key==10)
    {                 
     jc1.requestFocus();
    }   
    if(key==27)
    {
     this.dispose();
    }    
    }//GEN-LAST:event_c_noKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    try{   
     rs = st.executeQuery("select * from temp");
            
                rs.last();
                System.out.println(""+rs.getInt(1));
                 System.out.println(""+rs.getString(2));
                 System.out.println(""+rs.getString(3));

          pst=con.prepareStatement("delete from delievery  where cust_no="+rs.getInt(1)+" and curr_date='"+rs.getString(2)+"' and item='"+rs.getString(3)+"'");   
 /* // pst.setString(1,""+c_no.getText());
    pst.setString(1,""+jc1.getSelectedItem());
     pst.setString(2,""+cont.getText());
    
       //     dc1.setName(dat);
             pst.setString(3, ((JTextField)dc1.getDateEditor().getUiComponent()).getText());
  
            pst.setString(4,""+jc2.getSelectedItem());
       
             // pst.setString(5,""+qty.getText());
            pst.setFloat(5,Float.parseFloat(qty.getText()));
           
            //pst.setString(6,""+nt.getText());
            pst.setFloat(6,Float.parseFloat(nt.getText()));
            jButton1.setEnabled(true);  

    //pst.setString(9,""+cstex.getText());     */
    pst.executeUpdate();
   
    JOptionPane.showMessageDialog(null, "RecorD DELETED Sucessfully....");
     try
        {    
             con= re.getCon(); 
              DCEngin dce = new DCEngin("select * from delievery");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Cust_No");
       header.add("Cust_Name");
       header.add("Contact");
       header.add("Date");
       header.add("Item");
       header.add("Quantity");
       header.add("Total");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header)); 

        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
  //  pst=con.prepareStatement("DELETE FROM TEMP");
 //   pst.executeUpdate();
    
    
    
   //con.close();
  
 /*      con= re.getCon();      
        st=con.createStatement();
       Delievery dbe = new Delievery("select * from delievery");
                 data = dbe.getData();
      
       
       header = new Vector<String>();
       header.add("customer no   ");
       header.add("Customer Name   ");
       header.add("Address     ");
       header.add("Email-ID         ");
       header.add("Contact      ");
      // header.add("Cont. No");
       //header.add("Mail ID");
       header.add("State        ");
       header.add("tin no       ");
       //header.add("stex no");
                jTable1.setModel(new DefaultTableModel(data,header));
  
c_no.setText("");
 cont.setText("");
 rate.setText("");
 qty.setText("");
 in.setText("");
// cd.setText("");
 nt.setText("");
 //ctel.setText("");
 //ctin.setText("");
 //cstex.setText("");
 */
}                                   
catch(Exception e)
{
    System.out.println(e);
}    
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c_no;
    private javax.swing.JTextField cont;
    private javax.swing.JTextField d1;
    private com.toedter.calendar.JDateChooser dc1;
    private javax.swing.JTextField in;
    private com.toedter.calendar.JDateChooser j1;
    private com.toedter.calendar.JDateChooser j2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox jc1;
    private javax.swing.JComboBox jc2;
    private javax.swing.JTextField nt;
    private javax.swing.JButton ok;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField rate;
    private javax.swing.JTextField sbi;
    private javax.swing.JTable sbin;
    // End of variables declaration//GEN-END:variables

}
