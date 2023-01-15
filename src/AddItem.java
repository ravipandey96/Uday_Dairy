
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class AddItem extends javax.swing.JInternalFrame {
 Connection con=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
   Statement st; 
   int i_no=0;
   
    public AddItem() {
        
        con =  re.getCon();
        initComponents();
        try {
              st=con.createStatement();
              rs=st.executeQuery("select max(item_no)from Item_Master");
           
              rs.next();
              if(rs!=null)
              {
                  i_no=rs.getInt(1);
              i_no++;
              } 
           else
                    i_no=1;
              
              ino.setText(""+i_no);
        
        } catch (Exception ex) {
             System.out.println("unable to open"+ex);
        }
       iname.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        irate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        imake = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        iunit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        iname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(500, 576));
        setVisible(true);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setName("jPanel5"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setName("jPanel2"); // NOI18N

        irate.setName("irate"); // NOI18N
        irate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                irateKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                irateKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Item Rate");
        jLabel5.setName("jLabel5"); // NOI18N

        imake.setName("imake"); // NOI18N
        imake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imakeActionPerformed(evt);
            }
        });
        imake.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imakeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                imakeKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item Make");
        jLabel2.setName("jLabel2"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imake, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(irate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(imake, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(irate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/item.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADD ITEM DETAILS");
        jLabel7.setName("jLabel7"); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setName("jPanel3"); // NOI18N

        iunit.setName("iunit"); // NOI18N
        iunit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iunitActionPerformed(evt);
            }
        });
        iunit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iunitKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iunitKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Item Unit");
        jLabel6.setName("jLabel6"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(iunit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(iunit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        iname.setName("iname"); // NOI18N
        iname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inameKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Item Name");
        jLabel4.setName("jLabel4"); // NOI18N

        ino.setEditable(false);
        ino.setBackground(new java.awt.Color(255, 255, 153));
        ino.setName("ino"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Item No");
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(ino, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(iname, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(iname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setName("jPanel4"); // NOI18N

        exit.setBackground(java.awt.SystemColor.activeCaption);
        exit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 51, 255));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APPLICATION ICONS/24x24-free-button-icons/gif/24x24/114.gif"))); // NOI18N
        exit.setText("EXIT");
        exit.setName("exit"); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        save.setBackground(java.awt.SystemColor.activeCaption);
        save.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(0, 51, 255));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SAVE.png"))); // NOI18N
        save.setText("SAVE");
        save.setName("save"); // NOI18N
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(exit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iunitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iunitActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_iunitActionPerformed

    private void imakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imakeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_imakeActionPerformed

private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
this.dispose();
}//GEN-LAST:event_exitActionPerformed

private void inameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inameKeyReleased
int f=0; 
    String s=iname.getText();
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
     iname.setText(null);
    }
}//GEN-LAST:event_inameKeyReleased

private void iunitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iunitKeyReleased
int f=0; 
    String s=iunit.getText();
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
     iunit.setText(null);
    }
}//GEN-LAST:event_iunitKeyReleased

private void imakeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imakeKeyReleased
int f=0; 
    String s=imake.getText();
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
     imake.setText(null);
    }
}//GEN-LAST:event_imakeKeyReleased

private void irateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_irateKeyReleased
int f=0; 
    String s=irate.getText();
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
     irate.setText(null);
    }

}//GEN-LAST:event_irateKeyReleased

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
    try {
            String SQL = "SELECT * FROM Item_Master";
              

            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);

            int Mno = Integer.parseInt(ino.getText());
            String MName = iname.getText();
            String MAdd = imake.getText();
            int MPh1 = Integer.parseInt(irate.getText());
//            int MDate = Integer.parseInt(iratio.getText());
            //String city = city.getText();   // This is temporarily assigned same as membership date
            String cust_ity = iunit.getText();
            //char MStatus = 'Y'; // Member status is Y
            //char MIssue = 'N'; // Book issue status is N

            int code = JOptionPane.showConfirmDialog(this, "Are you sure to add?", "Confirmation Dialog Box", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (code == JOptionPane.YES_OPTION) {
                String strSQL = "INSERT INTO Item_Master(Item_no,Item_name,Item_Make,Item_Rate,Item_Unit) VALUES ('"+(Mno)+"', '"+(MName)+"', '"+(MAdd)+"', '"+(MPh1)+"','"+(cust_ity)+"')";
//                String SQL = "INSERT INTO availability(item_name, item_id,qty_added,qty_sold,stock_available) VALUES ('"+(i1)+"','"+(i2)+"','"+(i3)+"','"+(i4)+"','"+(i6)+"')";
                int rowsEffected = stmt.executeUpdate(strSQL);
                JOptionPane.showMessageDialog(this, "Record added successfully into Item table");
            }
            ino.setText("");
            iname.setText("");
            imake.setText("");
            irate.setText("");
            // iratio.setText("");
            iunit.setText("");
           // con.close();
            con=re.getCon();
            rs=st.executeQuery("select max(item_no)from Item_Master");

            rs.next();
            if(rs!=null)
            {
                i_no=rs.getInt(1);
                i_no++;
            }
            else
            i_no=1;

            ino.setText(""+i_no);
       //     save.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_saveActionPerformed

    private void inameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inameKeyPressed
          int key=evt.getKeyCode();
    if(key==10)
    {
     imake.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_inameKeyPressed

    private void imakeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imakeKeyPressed
              int key=evt.getKeyCode();
        if(key==38)
    {
     iname.requestFocus();
    }
    if(key==10)
    {
     irate.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_imakeKeyPressed

    private void irateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_irateKeyPressed
              int key=evt.getKeyCode();
              if(key==38)
    {
     imake.requestFocus();
    }
    if(key==10)
    {
     iunit.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_irateKeyPressed

    private void iunitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iunitKeyPressed
              int key=evt.getKeyCode();
              if(key==38)
    {
     irate.requestFocus();
    }
    if(key==10)
    {
      try {
            String SQL = "SELECT * FROM Item_Master";
              

            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);

            int Mno = Integer.parseInt(ino.getText());
            String MName = iname.getText();
            String MAdd = imake.getText();
            int MPh1 = Integer.parseInt(irate.getText());
//            int MDate = Integer.parseInt(iratio.getText());
            //String city = city.getText();   // This is temporarily assigned same as membership date
            String cust_ity = iunit.getText();
            //char MStatus = 'Y'; // Member status is Y
            //char MIssue = 'N'; // Book issue status is N

            int code = JOptionPane.showConfirmDialog(this, "Are you sure to add?", "Confirmation Dialog Box", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (code == JOptionPane.YES_OPTION) {
                String strSQL = "INSERT INTO Item_Master(Item_no,Item_name,Item_Make,Item_Rate,Item_Unit) VALUES ('"+(Mno)+"', '"+(MName)+"', '"+(MAdd)+"', '"+(MPh1)+"','"+(cust_ity)+"')";
//                String SQL = "INSERT INTO availability(item_name, item_id,qty_added,qty_sold,stock_available) VALUES ('"+(i1)+"','"+(i2)+"','"+(i3)+"','"+(i4)+"','"+(i6)+"')";
                int rowsEffected = stmt.executeUpdate(strSQL);
                JOptionPane.showMessageDialog(this, "Record added successfully into Item table");
            }
            ino.setText("");
            iname.setText("");
            imake.setText("");
            irate.setText("");
            // iratio.setText("");
            iunit.setText("");
           // con.close();
            con=re.getCon();
            rs=st.executeQuery("select max(item_no)from Item_Master");

            rs.next();
            if(rs!=null)
            {
                i_no=rs.getInt(1);
                i_no++;
            }
            else
            i_no=1;

            ino.setText(""+i_no);
            iname.requestFocusInWindow();
       //     save.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_iunitKeyPressed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JTextField imake;
    private javax.swing.JTextField iname;
    private javax.swing.JTextField ino;
    private javax.swing.JTextField irate;
    private javax.swing.JTextField iunit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables

}

