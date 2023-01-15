
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class AddCustomer extends javax.swing.JInternalFrame {
   Statement st;
   Connection con=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
    int i_no=0;
  
    public AddCustomer() {
  
        con =  re.getCon();
        initComponents();
        name.requestFocus();
   name.requestFocusInWindow();
   name.setFocusable(true);
        setSize(650, 600);           
        try {
              st=con.createStatement();
              rs=st.executeQuery("select max(Customer_no)from Customer_Master");
           
              rs.next();
              if(rs!=null)
              {
                  i_no=rs.getInt(1);
              i_no++;
              name.requestFocusInWindow();
              } 
           else
                    i_no=1;
              
              id.setText(""+i_no);
                name.setFocusable(true);        
        } catch (Exception ex) {
            Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        id.setEditable(false);
         name.requestFocusInWindow();
   }
    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        add1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        add2 = new javax.swing.JTextField();
        add3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cst = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel7.setName("jPanel7"); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel8.setName("jPanel8"); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel9.setName("jPanel9"); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(700, 750));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setName("jPanel10"); // NOI18N

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ADD CUSTOMER DETAILS");
        jLabel11.setName("jLabel11"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("jPanel1"); // NOI18N

        name.setName("name"); // NOI18N
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Customer Name");
        jLabel6.setName("jLabel6"); // NOI18N

        id.setEditable(false);
        id.setBackground(new java.awt.Color(255, 255, 153));
        id.setName("id"); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 1, 0));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer ID");
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(34, 34, 34)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setName("jPanel2"); // NOI18N

        add1.setName("add1"); // NOI18N
        add1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                add1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                add1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer ADD1");
        jLabel2.setName("jLabel2"); // NOI18N

        add2.setName("add2"); // NOI18N
        add2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                add2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                add2KeyReleased(evt);
            }
        });

        add3.setName("add3"); // NOI18N
        add3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                add3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                add3KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Email-ID");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact Number");
        jLabel4.setName("jLabel4"); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setName("jPanel4"); // NOI18N

        tin.setName("tin"); // NOI18N
        tin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinActionPerformed(evt);
            }
        });
        tin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tinKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tinKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("City");
        jLabel8.setName("jLabel8"); // NOI18N

        cst.setName("cst"); // NOI18N
        cst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cstKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cstKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(cst, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jLabel8)
                .addGap(66, 66, 66)
                .addComponent(tin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("State");
        jLabel5.setName("jLabel5"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add2)
                            .addComponent(add3)
                            .addComponent(add1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change username.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setName("jLabel7"); // NOI18N

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setName("jPanel5"); // NOI18N

        exit.setBackground(java.awt.SystemColor.activeCaption);
        exit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 204));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APPLICATION ICONS/24x24-free-button-icons/gif/24x24/114.gif"))); // NOI18N
        exit.setText("EXIT");
        exit.setName("exit"); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        save.setBackground(java.awt.SystemColor.activeCaption);
        save.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        save.setForeground(new java.awt.Color(0, 0, 204));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SAVE.png"))); // NOI18N
        save.setText("SAVE");
        save.setName("save"); // NOI18N
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        save.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                saveKeyPressed(evt);
            }
        });

        jButton1.setBackground(java.awt.SystemColor.activeCaption);
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APPLICATION ICONS/24x24-free-button-icons/gif/24x24/100.gif"))); // NOI18N
        jButton1.setText("EDIT");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(104, 104, 104)
                .addComponent(exit)
                .addGap(73, 73, 73))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 796, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
name.setFocusable(true);
        con=re.getCon();
        String a;
        try
{ 
    
 pst=con.prepareStatement("insert into Customer_Master values(?,?,?,?,?,?,?)");
 pst.setString(1,""+id.getText());
 pst.setString(2,""+name.getText());
if(add1.getText().equals(""))
{  a="Raipur"; 
 pst.setString(3,""+a);
}
else
{
    pst.setString(3,""+add1.getText());
}
if(add2.getText().equals(""))
{
    a="Not Available";
 pst.setString(4,""+a);
}
else
{pst.setString(4,""+add2.getText());
}
if(add3.getText().equals(""))
{   a="Not Available";
     pst.setString(5,""+a);
}
else
{  pst.setString(5,""+add3.getText());}
// pst.setString(6,""+tel.getText());
 //pst.setString(7,""+eid.getText());
if(cst.getText().equals(""))
{   a="Chhattisagarh";
    pst.setString(6,""+a);
}
else
{pst.setString(6,""+cst.getText());}
if(tin.getText().equals(""))
{   a="Raipur";
    pst.setString(7,""+a);
}
else
{
    pst.setString(7,""+tin.getText());
}
// pst.setString(10,""+stex.getText());
  save.setEnabled(true);
 pst.executeUpdate();
  
JOptionPane.showMessageDialog(null, "Record Inserted Sucessfully....");
 
 
 id.setText("");
 name.setText("");
 add1.setText("");
 add2.setText("");
 add3.setText("");
// eid.setText("");
 cst.setText("");
 
 //tel.setText("");
 tin.setText("");
 //stex.setText("");
 //con.close();
 
 //con=re.getCon();
 
 rs=st.executeQuery("select max(Customer_no)from Customer_Master");
           
              rs.next();
              if(rs!=null)
              {
                  i_no=rs.getInt("customer_no");
              i_no++;
              } 
           else
                    i_no=1;
              
              id.setText(""+i_no);
         
 
  name.setFocusable(true);
 con.close();
 
 
}//GEN-LAST:event_saveActionPerformed
catch(Exception ex)
{
    JOptionPane.showMessageDialog(null, "Please Enter Any Name");
}
    }
    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_idActionPerformed

private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
   this.dispose();
}//GEN-LAST:event_exitActionPerformed

private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_nameActionPerformed

private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
 
}//GEN-LAST:event_idKeyTyped

private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped

}//GEN-LAST:event_nameKeyTyped

private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
 /*String s=name.getText();
 if(name.equals(null))
 {
     JOptionPane.showMessageDialog(null,"character not allowed");
     name.setFocusable(true);
 }*/
}//GEN-LAST:event_nameFocusLost

private void add1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add1KeyReleased

}//GEN-LAST:event_add1KeyReleased

private void add2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add2KeyReleased

}//GEN-LAST:event_add2KeyReleased

private void add3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add3KeyReleased
int f=0; 
    
   String s=add3 .getText();
    String s1=null;
        
    for(int i=0;i<s.length();i++)
    {
    
      char a=s.charAt(i);  
       Character chr=new Character(a);
       
      if(chr.isLetter(a))
      {
           f=1;
        s1=s.substring(0, i);   
      }
    }
    if(f==1)
    {
        JOptionPane.showMessageDialog(null,"character not allowed");
     add3.setText(null);
    }
}//GEN-LAST:event_add3KeyReleased

private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
/*int f=0; 


String s=name.getText();
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
     name.setText(s1);
    }*/
    
}//GEN-LAST:event_nameKeyReleased

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        EditCustomer ec;
        try {
            ec = new EditCustomer();
            JDesktopPane p=getDesktopPane();
            p.add(ec);
             ec.setVisible(true);
             this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }

}//GEN-LAST:event_jButton1ActionPerformed

private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
   
    
}//GEN-LAST:event_jButton1MouseClicked

private void cstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cstKeyReleased
   
    
}//GEN-LAST:event_cstKeyReleased

private void tinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tinKeyReleased
/*
    int f=0; 
    String s=tin.getText();
    String s1=null;
    for(int i=0;i<s.length();i++)
    {
    
      char a=s.charAt(i);  
       Character chr=new Character(a);
       
      if(chr.isLetter(a))
      {
           f=1;
        s1=s.substring(0, i);   
      }
    }
    if(f==1)
    {
        JOptionPane.showMessageDialog(null,"character not allowed");
     tin.setText(s1);
    }*/
}//GEN-LAST:event_tinKeyReleased

    private void tinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinActionPerformed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
      int key=evt.getKeyCode();
    if(key==10)
    {
     add1.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }
    JOptionPane.showMessageDialog(null,key);
    }//GEN-LAST:event_nameKeyPressed

    private void add1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add1KeyPressed
        int key=evt.getKeyCode();
    if(key==38)
    {
     name.requestFocus();
    }
    if(key==10)
    {
     add2.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_add1KeyPressed

    private void add2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add2KeyPressed
           int key=evt.getKeyCode();
    if(key==38)
    {
     add1.requestFocus();
    }
    if(key==10)
    {
     add3.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_add2KeyPressed

    private void add3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add3KeyPressed
             int key=evt.getKeyCode();
    if(key==38)
    {
     add2.requestFocus();
    }
    if(key==10)
    {
     cst.requestFocus();
    }
         
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_add3KeyPressed

    private void cstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cstKeyPressed
          int key=evt.getKeyCode();
    if(key==38)
    {
     add3.requestFocus();
    }
    if(key==10)
    {
     tin.requestFocus();
    }     
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_cstKeyPressed

    private void tinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tinKeyPressed
       
        int key=evt.getKeyCode();
    if(key==38)
    {
     cst.requestFocus();
    }    
    if(key==27)
    {
      this.dispose();
    }
    if(key==10)
    {
    con=re.getCon();
        try
{ 
 String a;   
 pst=con.prepareStatement("insert into Customer_Master values(?,?,?,?,?,?,?)");
 pst.setString(1,""+id.getText());
 pst.setString(2,""+name.getText());
if(add1.getText().equals(""))
{  a="Raipur"; 
 pst.setString(3,""+a);
}
else
{
    pst.setString(3,""+add1.getText());
}
if(add2.getText().equals(""))
{
    a="Not Available";
 pst.setString(4,""+a);
}
else
{pst.setString(4,""+add2.getText());
}
if(add3.getText().equals(""))
{   a="Not Available";
     pst.setString(5,""+a);
}
else
{  pst.setString(5,""+add3.getText());}
// pst.setString(6,""+tel.getText());
 //pst.setString(7,""+eid.getText());
if(cst.getText().equals(""))
{   a="Chhattisagarh";
    pst.setString(6,""+a);
}
else
{pst.setString(6,""+cst.getText());}
if(tin.getText().equals(""))
{   a="Raipur";
    pst.setString(7,""+a);
}
else
{
    pst.setString(7,""+tin.getText());
}// pst.setString(10,""+stex.getText());
  save.setEnabled(true);
 pst.executeUpdate();
  
JOptionPane.showMessageDialog(null, "Record Inserted Sucessfully....");
 
 
 id.setText("");
 name.setText("");
 add1.setText("");
 add2.setText("");
 add3.setText("");
// eid.setText("");
 cst.setText("");
 
 //tel.setText("");
 tin.setText("");
 //stex.setText("");
 //con.close();
 
 //con=re.getCon();
 
 rs=st.executeQuery("select max(Customer_no)from Customer_Master");
           
              rs.next();
              if(rs!=null)
              {
                  i_no=rs.getInt(1);
              i_no++;
               id.setText(""+i_no);
              } 
           else
                    i_no=1;
              
              id.setText(""+i_no);
              con.close();
               name.requestFocusInWindow();
}
 catch(Exception ex)
{
    JOptionPane.showMessageDialog(null, "Please Enter Any Name");
}
    }
    }//GEN-LAST:event_tinKeyPressed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
name.requestFocusInWindow();
    }//GEN-LAST:event_formFocusGained

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
         int key=evt.getKeyCode();
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_idKeyPressed

    private void saveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saveKeyPressed
              int key=evt.getKeyCode();
    if(key==38)
    {
     tin.requestFocus();
    }
    }//GEN-LAST:event_saveKeyPressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add1;
    private javax.swing.JTextField add2;
    private javax.swing.JTextField add3;
    private javax.swing.JTextField cst;
    private javax.swing.JButton exit;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField name;
    private javax.swing.JButton save;
    private javax.swing.JTextField tin;
    // End of variables declaration//GEN-END:variables

}
