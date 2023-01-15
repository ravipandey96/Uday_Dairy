
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public class EditCustomer extends javax.swing.JInternalFrame {
   private Vector<Vector<String>> data;
   private Vector<String> header;
   
   Connection con=null;
    PreparedStatement pst=null;
  Statement st=null;
   ResultSet rs = null;
     String NameVal;
   public EditCustomer() throws SQLException, Exception {
   
       
       
               con= re.getCon();      
        st=con.createStatement();
       DBEngine dbe = new DBEngine("select * from Customer_Master");
                 data = dbe.getData();
      
       
       header = new Vector<String>();
       header.add("customer no");
       header.add("Customer Name    ");
       header.add("Address  ");
       header.add("Email-ID     ");
       header.add("Contact Number");
       //header.add("Cont. No");
   //    header.add("Mail ID");
       header.add("State    ");
       header.add("City     ");
     //  header.add("stex no");
       
        initComponents();   
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        UPDATE = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        cn = new javax.swing.JTextField();
        cadd3 = new javax.swing.JTextField();
        ctin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cadd2 = new javax.swing.JTextField();
        cid = new javax.swing.JTextField();
        cadd1 = new javax.swing.JTextField();
        ccst = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setName("jPanel3"); // NOI18N

        jLabel12.setName("jLabel12"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDIT CUSTOMER");
        jLabel1.setName("jLabel1"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setName("jPanel1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            data,header
        ));
        jTable1.setName("editc"); // NOI18N
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        new JScrollPane(jTable1,jScrollPane1.VERTICAL_SCROLLBAR_ALWAYS,jScrollPane1.HORIZONTAL_SCROLLBAR_ALWAYS);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setName("jPanel2"); // NOI18N

        UPDATE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UPDATE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APPLICATION ICONS/24x24-free-button-icons/gif/24x24/102.gif"))); // NOI18N
        UPDATE.setText("UPDATE");
        UPDATE.setName("UPDATE"); // NOI18N
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        EXIT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APPLICATION ICONS/24x24-free-button-icons/gif/24x24/114.gif"))); // NOI18N
        EXIT.setText("EXIT");
        EXIT.setName("EXIT"); // NOI18N
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(UPDATE)
                .addGap(78, 78, 78)
                .addComponent(EXIT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UPDATE)
                    .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        cn.setText(" ");
        cn.setName("cn"); // NOI18N
        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        cn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cnKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cnKeyReleased(evt);
            }
        });

        cadd3.setText(" ");
        cadd3.setName("cadd3"); // NOI18N
        cadd3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadd3KeyPressed(evt);
            }
        });

        ctin.setText(" ");
        ctin.setName("ctin"); // NOI18N
        ctin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ctinKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ctinKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Customer Name");
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email-ID");
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("City");
        jLabel10.setName("jLabel10"); // NOI18N

        cadd2.setText(" ");
        cadd2.setName("cadd2"); // NOI18N
        cadd2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadd2KeyPressed(evt);
            }
        });

        cid.setBackground(new java.awt.Color(255, 255, 153));
        cid.setText(" ");
        cid.setName("cid"); // NOI18N
        cid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cidKeyReleased(evt);
            }
        });

        cadd1.setText(" ");
        cadd1.setName("cadd1"); // NOI18N
        cadd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadd1KeyPressed(evt);
            }
        });

        ccst.setText(" ");
        ccst.setName("ccst"); // NOI18N
        ccst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ccstKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ccstKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer ID");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer address");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact Number");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("State");
        jLabel5.setName("jLabel5"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(98, 98, 98))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadd1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(cadd2)
                    .addComponent(ccst))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ctin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cn, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(cadd3))
                .addGap(106, 223, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadd3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cadd2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(20, 20, 20)
                                .addComponent(ccst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addComponent(ctin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
      this.dispose();
}//GEN-LAST:event_EXITActionPerformed

private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
 
        try {       
            int r= jTable1.getSelectedRow();
            int c=jTable1.getSelectedColumn();
                     Object s=jTable1.getValueAt(r, 1);
            String NameVal = s.toString();
            rs = st.executeQuery("select * from Customer_Master where Customer_name='"+NameVal+"'");
                
                 rs.next();
                     cid.setText(""+rs.getInt(1));
                     cn.setText(""+rs.getString(2));
                     cadd1.setText(""+rs.getString(3));
                     cadd2.setText(""+rs.getString(4));
                     cadd3.setText(""+rs.getString(5));   
                     ccst.setText(""+rs.getString(6));
                     ctin.setText(""+rs.getString(7));      
        } catch (Exception ex) {
                      ex.printStackTrace();
        }

}//GEN-LAST:event_jTable1MouseClicked

private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
try{
   
    int noval=Integer.parseInt(cid.getText());    
   pst=con.prepareStatement("update Customer_Master  set  Customer_name=?, Customer_add1=?,Customer_add2=?,Customer_add3=?,Customer_cstno=? ,Customer_tinno=?  where Customer_no="+noval+"");
    
   pst.setString(1,""+cn.getText());
    pst.setString(2,""+cadd1.getText());
    pst.setString(3,""+cadd2.getText());
    pst.setString(4,""+cadd3.getText());
  //  pst.setString(5,""+ctel.getText());
    //pst.setString(6,""+cd.getText());
    pst.setString(5,""+ccst.getText());
    pst.setString(6,""+ctin.getText());
    //pst.setString(9,""+cstex.getText());
    pst.executeUpdate();
   con.close();
  
       con= re.getCon();      
        st=con.createStatement();
       DBEngine dbe = new DBEngine("select * from Customer_Master");
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
  
cid.setText("");
 cn.setText("");
 cadd1.setText("");
 cadd2.setText("");
 cadd3.setText("");
// cd.setText("");
 ccst.setText("");
 //ctel.setText("");
 ctin.setText("");
 //cstex.setText("");
 
}                                   
catch(Exception e)
{
    e.printStackTrace();
}//GEN-LAST:event_UPDATEActionPerformed
}
private void cnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnKeyReleased
int f=0; 
    String s=cn.getText();
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
     cn.setText(s1);
    }

}//GEN-LAST:event_cnKeyReleased

private void ccstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccstKeyReleased
int f=0; 
    String s=ccst.getText();
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
     ccst.setText(s1);
    }

}//GEN-LAST:event_ccstKeyReleased

private void ctinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ctinKeyReleased
int f=0; 
    String s=ctin.getText();
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
     ctin.setText(s1);
    }

}//GEN-LAST:event_ctinKeyReleased

private void cidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cidKeyReleased
int f=0; 
    String s=cid.getText();
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
cid.setText(s1);
    }

}//GEN-LAST:event_cidKeyReleased

private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_cnActionPerformed

    private void cnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnKeyPressed
            int key=evt.getKeyCode();    
      if(key==10)
    {
     cadd1.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_cnKeyPressed

    private void cadd1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadd1KeyPressed
             int key=evt.getKeyCode();
      if(key==38)
    {
     cn.requestFocus();
    }        
      if(key==10)
    {
     cadd3.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_cadd1KeyPressed

    private void cadd3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadd3KeyPressed
             int key=evt.getKeyCode();
      if(key==38)
    {
     cadd1.requestFocus();
    }        
      if(key==10)
    {
     cadd2.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_cadd3KeyPressed

    private void cadd2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadd2KeyPressed
             int key=evt.getKeyCode();
      if(key==38)
    {
     cadd3.requestFocus();
    }        
      if(key==10)
    {
     ctin.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_cadd2KeyPressed

    private void ctinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ctinKeyPressed
             int key=evt.getKeyCode();
      if(key==38)
    {
     cadd2.requestFocus();
    }        
      if(key==10)
    {
     ccst.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_ctinKeyPressed

    private void ccstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccstKeyPressed
             int key=evt.getKeyCode();
             if(key==10)
             {
                 try{
   
    int noval=Integer.parseInt(cid.getText());    
   pst=con.prepareStatement("update Customer_Master  set  Customer_name=?, Customer_add1=?,Customer_add2=?,Customer_add3=?,Customer_cstno=? ,Customer_tinno=?  where Customer_no="+noval+"");
    
   pst.setString(1,""+cn.getText());
    pst.setString(2,""+cadd1.getText());
    pst.setString(3,""+cadd2.getText());
    pst.setString(4,""+cadd3.getText());
  //  pst.setString(5,""+ctel.getText());
    //pst.setString(6,""+cd.getText());
    pst.setString(5,""+ccst.getText());
    pst.setString(6,""+ctin.getText());
    //pst.setString(9,""+cstex.getText());
    pst.executeUpdate();
   con.close();
  
       con= re.getCon();      
        st=con.createStatement();
       DBEngine dbe = new DBEngine("select * from Customer_Master");
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
  
cid.setText("");
 cn.setText("");
 cadd1.setText("");
 cadd2.setText("");
 cadd3.setText("");
// cd.setText("");
 ccst.setText("");
 //ctel.setText("");
 ctin.setText("");
 //cstex.setText("");
 
}                                   
catch(Exception e)
{
    e.printStackTrace();
}
             }
      if(key==38)
    {
     ctin.requestFocus();
    }            
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_ccstKeyPressed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTextField cadd1;
    private javax.swing.JTextField cadd2;
    private javax.swing.JTextField cadd3;
    private javax.swing.JTextField ccst;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cn;
    private javax.swing.JTextField ctin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
