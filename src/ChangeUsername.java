
import java.sql.*;
import javax.swing.JOptionPane;

public class ChangeUsername extends javax.swing.JInternalFrame {

    Connection con=null;
   Statement st=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
   String u1,u2,u3,u4;
    public ChangeUsername() {
        initComponents();
            try
            {
                con=re.getCon();
          st= (Statement) con.createStatement();
          eou.requestFocusInWindow();
            }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        eou = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CANCLE = new javax.swing.JButton();
        OK = new javax.swing.JButton();
        enu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enu1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setName("jPanel3"); // NOI18N

        jLabel5.setName("jLabel5"); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change username.jpg"))); // NOI18N
        jLabel4.setText("CHANGE USERNAME");
        jLabel4.setName("jLabel4"); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setName("jPanel4"); // NOI18N

        eou.setBackground(new java.awt.Color(255, 255, 153));
        eou.setName("eou"); // NOI18N
        eou.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eouKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Old Username");
        jLabel1.setName("jLabel1"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setName("jPanel2"); // NOI18N

        CANCLE.setBackground(java.awt.SystemColor.activeCaption);
        CANCLE.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        CANCLE.setForeground(new java.awt.Color(0, 102, 204));
        CANCLE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APPLICATION ICONS/24x24-free-button-icons/gif/24x24/114.gif"))); // NOI18N
        CANCLE.setText("CANCEL");
        CANCLE.setName("CANCLE"); // NOI18N
        CANCLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCLEActionPerformed(evt);
            }
        });

        OK.setBackground(java.awt.SystemColor.activeCaption);
        OK.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        OK.setForeground(new java.awt.Color(0, 102, 204));
        OK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SAVE.png"))); // NOI18N
        OK.setText("SAVE");
        OK.setName("OK"); // NOI18N
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(OK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(CANCLE)
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CANCLE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        enu.setName("enu"); // NOI18N
        enu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enuActionPerformed(evt);
            }
        });
        enu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enuKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter new Username");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Re-Enter New Username");
        jLabel3.setName("jLabel3"); // NOI18N

        enu1.setName("enu1"); // NOI18N
        enu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enu1ActionPerformed(evt);
            }
        });
        enu1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enu1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enu1)
                            .addComponent(enu)
                            .addComponent(eou, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eou, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enu1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel6.setName("jLabel6"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel5))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 11, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enuActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_enuActionPerformed

private void CANCLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCLEActionPerformed
    this.dispose();
}//GEN-LAST:event_CANCLEActionPerformed

private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
      
     try
    {
       rs = st.executeQuery("select * from Login where username='"+eou.getText()+"'");
        rs.next();
      u1=rs.getString(1);
      
       u2=eou.getText();
       u3=enu.getText();
       u4=enu1.getText();
       
       u2=u2.trim();
        u3=u3.trim();
        u4=u4.trim();
       if(  u1.equals(u2) && u3.equals(u4))
       {
      
      st.executeUpdate("update Login set username='"+u3+"' where password='"+rs.getString(2) +"'");
      JOptionPane.showMessageDialog(null,"username successfully changed");
     
       }
       
       else if(  u1.equals(u2) || u3.equals(u4))
       {
      
          JOptionPane.showMessageDialog(null,"username mismatch");
     
          enu1.setText("");
       }
    }
    catch(Exception e)
    {}

}//GEN-LAST:event_OKActionPerformed

private void enu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enu1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_enu1ActionPerformed

    private void eouKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eouKeyPressed
        int key=evt.getKeyCode();
    if(key==10)
    {
     enu.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_eouKeyPressed

    private void enuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enuKeyPressed
         int key=evt.getKeyCode();
    if(key==38)
    {
     eou.requestFocus();
    }
    if(key==10)
    {
     enu1.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_enuKeyPressed

    private void enu1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enu1KeyPressed
        int key=evt.getKeyCode();
    if(key==38)
    {
     enu.requestFocus();
    }
    if(key==10)
    {
       try
    {
       rs = st.executeQuery("select * from Login where username='"+eou.getText()+"'");
        rs.next();
      u1=rs.getString(1);
      
       u2=eou.getText();
       u3=enu.getText();
       u4=enu1.getText();
       
       u2=u2.trim();
        u3=u3.trim();
        u4=u4.trim();
       if(  u1.equals(u2) && u3.equals(u4))
       {
      
      st.executeUpdate("update Login set username='"+u3+"' where password='"+rs.getString(2) +"'");
      JOptionPane.showMessageDialog(null,"username successfully changed");
     
       }
       
       else if(  u1.equals(u2) || u3.equals(u4))
       {
      
          JOptionPane.showMessageDialog(null,"username mismatch");
     
          enu1.setText("");
       }
    }
    catch(Exception e)
    {}

    }
    if(key==27)
    {
      this.dispose();
    }
    }//GEN-LAST:event_enu1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CANCLE;
    private javax.swing.JButton OK;
    private javax.swing.JTextField enu;
    private javax.swing.JTextField enu1;
    private javax.swing.JTextField eou;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

}
