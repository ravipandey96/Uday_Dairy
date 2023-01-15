/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.ScrollPane;
import java.sql.*;
import java.text.DateFormat;
import java.util.Vector;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.text.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.glass.events.KeyEvent;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.text.MessageFormat;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;
/**
 *
 * @author RAVI
 */
public class BILLING extends javax.swing.JInternalFrame {
       Connection con=null;
    PreparedStatement pst=null;
  Statement st=null,stDelete=null;
   ResultSet rs = null;
   ResultSet rs1 = null;
   ResultSet rs2 = null;
   ResultSet rs3 = null;
     private Vector<Vector<String>> data;
        private Vector<String> header;
   JScrollPane s; 
    int i_no=0;
     public BILLING() throws Exception
    {
   con=re.getCon();
   initComponents();
    //setSize(2000,2000);
        try
    {       
        con= re.getCon();      
        st=con.createStatement();
       initComponents();
      rs=st.executeQuery("select max(Bill_no) from Billing");
           
              rs.next();
              if(rs!=null)
              {
                  i_no=rs.getInt(1);
              i_no++;
              } 
           else
                    i_no=1;
              
              bn.setText(""+i_no);
              bn.setEditable(false);
              }
         catch(Exception e)
    {
        System.out.println(e);
     }
             try {
              st=con.createStatement();
              rs=st.executeQuery("select * from Customer_Master order by Customer_name");
              while(rs.next())
              {
                  billto.addItem(""+rs.getString(2));
                   
              }
                  } catch (Exception ex) {
            Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
        }
              try { 
                   
        } catch (Exception e) {
            System.out.println(e);
        } 
                  Date d = new Date();
               String curDate = "";
              jdc1.setDate(d);
              jdc2.setDate(d);

     
       DateFormat df=null;
      
       df=DateFormat.getDateInstance(DateFormat.SHORT);
         String s1= df.format(d);
                
       datetxt.setText(""+s1);
         con= re.getCon(); 
   
       bill dce = new bill("select * from delievery");
       data = dce.getData();
       
       header = new Vector<String>();
  //        header = new Vector<String>();
       header.add("Bill_No");
       header.add("Cust_No");
       header.add("Customer Name");
       header.add("Address");
       header.add("Bill_From");
       header.add("Bill_To");
       header.add("Bill_Amt");
      // initComponents();
         billto.requestFocusInWindow(); 
     //    String='p';
     // jButton2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_DOWN_MASK),Key);
        
}
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        datetxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        billto = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cstno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tinno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jdc1 = new com.toedter.calendar.JDateChooser();
        jdc2 = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        sbin = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        gt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        PB = new javax.swing.JTextField();

        setBackground(java.awt.Color.lightGray);
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.pink, java.awt.Color.black));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(1000, 10000));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BILLING");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 16, 165, 34));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("BILL NO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 85, 69, 26));

        bn.setEditable(false);
        bn.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(bn, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 84, 34, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("CUSTOMER NO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 90, -1, -1));

        cno.setEditable(false);
        cno.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(cno, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 84, 36, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("DATE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 90, -1, -1));
        getContentPane().add(datetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 84, 96, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("BILL TO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 141, -1, 22));

        billto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT CUSTOMER NAME" }));
        billto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billtoActionPerformed(evt);
            }
        });
        billto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                billtoKeyPressed(evt);
            }
        });
        getContentPane().add(billto, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 138, 234, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("ADDRESS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 87, -1, 22));

        cstno.setEditable(false);
        cstno.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(cstno, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 86, 125, 22));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("CONTACT");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 141, -1, 22));

        tinno.setEditable(false);
        tinno.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(tinno, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 138, 96, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("FROM DATE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 204, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("TO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 204, -1, -1));

        jdc1.setDateFormatString("yyyy-MM-dd");
        jdc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jdc1KeyPressed(evt);
            }
        });
        getContentPane().add(jdc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 195, -1, -1));

        jdc2.setDateFormatString("yyyy-MM-dd");
        jdc2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jdc2KeyPressed(evt);
            }
        });
        getContentPane().add(jdc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 198, -1, -1));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 51));
        jScrollPane4.setForeground(new java.awt.Color(153, 255, 255));

        sbin.setModel(new javax.swing.table.DefaultTableModel(
            data,header
        ));
        jScrollPane4.setViewportView(sbin);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 267, 872, 521));

        jButton1.setBackground(java.awt.SystemColor.activeCaption);
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detail item.gif"))); // NOI18N
        jButton1.setText("DISPLAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 816, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GRAND TOTAL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 141, -1, 23));

        gt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gtActionPerformed(evt);
            }
        });
        getContentPane().add(gt, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 138, 95, -1));

        jButton2.setBackground(java.awt.SystemColor.activeCaption);
        jButton2.setForeground(new java.awt.Color(0, 51, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.gif"))); // NOI18N
        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 816, -1, -1));

        jButton3.setBackground(java.awt.SystemColor.activeCaption);
        jButton3.setForeground(new java.awt.Color(0, 51, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APPLICATION ICONS/24x24-free-button-icons/gif/24x24/114.gif"))); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 816, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("REMAINING BALANCE");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        PB.setText("0");
        getContentPane().add(PB, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 50, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void billtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billtoActionPerformed
          String s1=(String)billto.getSelectedItem();
        String sql="select * from Customer_Master where Customer_name=?";
        try
        {
            pst=con.prepareStatement(sql);
            pst.setString(1,s1);
            rs=pst.executeQuery();
            while(rs.next()) {
                String cna=rs.getString("Customer_no");
                cno.setText(cna);
                String cnoo=rs.getString("Customer_add1");
                cstno.setText(cnoo);
                String con_no=rs.getString("Customer_add3");
                tinno.setText(con_no);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         con= re.getCon(); 
   
       bill dce = new bill("select * from delievery");
           try {
               data = dce.getData();
           } catch (Exception ex) {
               Logger.getLogger(BILLING.class.getName()).log(Level.SEVERE, null, ex);
           }
       
       header = new Vector<String>();
       header.add("Bill_No");
       header.add("Cust_No");
       header.add("Customer Name");
       header.add("Address");
       header.add("Bill_From");
       header.add("Bill_To");
       header.add("Bill_Amt");
    }//GEN-LAST:event_billtoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
                 String date1=((JTextField)jdc1.getDateEditor().getUiComponent()).getText();
                String date2=((JTextField)jdc2.getDateEditor().getUiComponent()).getText();
                String sbi=(String) billto.getSelectedItem();
                  pst=con.prepareStatement("insert into billing values(?,?,?,?,?,?,?)");
            pst.setString(1,""+bn.getText());
            pst.setString(3,""+billto.getSelectedItem());
            pst.setString(2,""+cno.getText());
            pst.setString(4,""+cstno.getText());
            pst.setString(5,""+((JTextField)jdc1.getDateEditor().getUiComponent()).getText());
            pst.setString(6,((JTextField)jdc2.getDateEditor().getUiComponent()).getText());
            pst.setString(7,""+gt.getText());
            jButton1.setEnabled(true);  
            pst.executeUpdate();
                if(sbi.equals(""))
                        {
                 DCEngin dce = new DCEngin("select * from delievery where curr_date between '"+date1+"' and '"+date2+"'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Bill_No");
       header.add("Cust_No");
       header.add("Customer Name");
       header.add("Address");
       header.add("Bill_From");
       header.add("Bill_To");
       header.add("Bill_Amt");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header));  
                        }
                else 
                {        DCEngin dce = new DCEngin("select * from delievery where cust_name like '"+sbi+"%' and curr_date between '"+date1+"' and '"+date2+"'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Bill_No");
       header.add("Cust_No");
       header.add("Customer Name");
       header.add("Address");
       header.add("Bill_From");
       header.add("Bill_To");
       header.add("Bill_Amt");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header));  
                        }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"Please provide above missing details");
    }                                        
    try {
                 // pst=con.prepareStatement("update delievery  set  cust_name=?, contact=?,curr_date=?,item=?,quantity=? ,total=?  where cust_no="+rs.getInt(1)+" and curr_date='"+rs.getString(2)+"' and item='"+rs.getString(3)+"'");   
  // pst.setString(1,""+c_no.getText());
   String gnt=cno.getText();
 //  pst=con.prepareStatement("select sum(total) from delievery where cust_name="+gnt);
    rs = st.executeQuery("select sum(total)from delievery where cust_no="+gnt);
        float b=0;
        while(rs.next()){ b = rs.getFloat("sum(total)");}
        gt.setText(""+ b);
           rs.close();   

    //pst.setString(9,""+cstex.getText());
   
    JOptionPane.showMessageDialog(null, "Report Generated");
    billto.requestFocusInWindow(); 
    }
    catch(Exception ex)
    {
        System.out.println(ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            String value = bn.getText();
            String value0 = (String)billto.getSelectedItem();
            String add=cstno.getText();
            String con=cno.getText();
            String date1=((JTextField)jdc1.getDateEditor().getUiComponent()).getText();
            String date2=((JTextField)jdc2.getDateEditor().getUiComponent()).getText();
            String gnt=gt.getText();    
            
            JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File(value +" "+ value0+"BILL"+".pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
            Document myDocument = new Document();
            
        try
        {     System.out.println("no problem1");
            String cm="cow milk";
              String bm="buffalo milk";
              String bp="paneer";
              float b1=0,b2=0,b3=0,r1=0,r2=0,r3=0;
                 float rb=Float.parseFloat(PB.getText());
              System.out.println("no problem2");
               rs3=st.executeQuery("select * from item_master where Item_name='"+cm+"'");
               if(rs3.next())
               {
                   r1=rs3.getInt("Item_Rate");
               }
               System.out.println("no problem3");
               rs3=st.executeQuery("select * from item_master where Item_name='"+bm+"'");
                if(rs3.next())
               {
                   r2=rs3.getInt("Item_Rate");
               }
                System.out.println("no problem4");
               rs3=st.executeQuery("select * from item_master where Item_name='"+bp+"'"); 
                 System.out.println("no problem4 ");
                 if(rs3.next())
               {
                   r3=rs3.getInt("Item_Rate");
               }
              rs = st.executeQuery("select sum(quantity) from delievery where item='"+cm+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");                
        while(rs.next()){ b1 = rs.getFloat("sum(quantity)");}
        System.out.println(b1);
          rs1 = st.executeQuery("select sum(quantity) from delievery where item='"+bm+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");
                System.out.println("no problem5 ");
        while(rs1.next()){ b2 = rs1.getFloat("sum(quantity)");}
          rs2 = st.executeQuery("select sum(quantity) from delievery where item='"+bp+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");
                System.out.println("no problem6 ");
        while(rs2.next()){ b3 = rs2.getFloat("sum(quantity)");}
         System.out.println("no problem7 ");
              PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
              PdfPTable table=new PdfPTable(3);
           myDocument.open();           
           myDocument.add(new Paragraph("------------------------UDAY DAIRY-----------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
//           myDocument.add(new Paragraph("                                              "+new Date().toString()));
           myDocument.add(new Paragraph("ADDRESS->NEW SHANTI NAGAR               CONTACT_NO->9993221000",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN)));
           myDocument.add(new Paragraph("-------------------------------------------------------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
           myDocument.add((new Paragraph("BILL NO.                                                                :                    "+value+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           //       myDocument.add(new Paragraph(new Date().toString()));
       //    myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
//           myDocument.add((new Paragraph("CUSTOMER NAME",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD))));
           myDocument.add((new Paragraph("BILL NO.                                                                :                    "+value+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("CUSTOMER NO.                                                   :                    "+con+ " ",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("CUSTOMER NAME                                              :                    "+value0+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("ADDRESS                                                              :                    "+add+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("Bill From                                                                 :                    "+date1+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("Bill To                                                                     :                    "+date2+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
            if(rb!=0)
            {myDocument.add((new Paragraph("REMAINING BALANCE                                    :                    "+rb+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));}
            if(b1!=0)
            {myDocument.add((new Paragraph("COW MILK                                                            :                    "+b1+"L X "+r1+"="+(b1*r1),FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
            }
           if(b2!=0)
           {myDocument.add((new Paragraph("BUFFALO MILK                                                   :                    "+b2+"L X "+r2+"="+(b2*r2),FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           }
           if(b3!=0)
           {myDocument.add((new Paragraph("PANEER                                                                 :                    "+b3+"kg X "+r3+"="+(b3*r3),FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           }            
           /*   String a[] = null;
              int b=0,j=0;   
                float d=0;
            rs= st.executeQuery("select count(*)from Item_master");
              while(rs.next())
              {
                  ++b;                               
             rs=st.executeQuery("select * from item_master where item_no="+b);
             a[j]=rs.getString(2);
            rs2 = st.executeQuery("select sum(total)from delievery where cust_no="+b+"and item='"+a[j]+"'");
            rs1=st.executeQuery("select * from item_master="+b);     
         d = rs2.getFloat("sum(total)")*rs1.getInt("Item_Rate");
         j++;
          myDocument.add((new Paragraph("GRAND"+a[j]+"="                                                +d+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
              }*/
           myDocument.add((new Paragraph("GRAND TOTAL                                                    :                    "+(gnt+rb)+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.newPage();
           myDocument.close();
           rs.close();
           rs1.close();
           rs2.close();
           billto.requestFocusInWindow(); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
         
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void gtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gtActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
billto.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void billtoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_billtoKeyPressed
      int key=evt.getKeyCode();
    if(key==27)
    {
      this.dispose();
    }
    if(key==10)
    { 
             
        try {
                 String date1=((JTextField)jdc1.getDateEditor().getUiComponent()).getText();
                String date2=((JTextField)jdc2.getDateEditor().getUiComponent()).getText();
                String sbi=(String) billto.getSelectedItem();
                  pst=con.prepareStatement("insert into billing values(?,?,?,?,?,?,?)");
            pst.setString(1,""+bn.getText());
            pst.setString(3,""+billto.getSelectedItem());
            pst.setString(2,""+cno.getText());
            pst.setString(4,""+cstno.getText());
            pst.setString(5,""+((JTextField)jdc1.getDateEditor().getUiComponent()).getText());
            pst.setString(6,((JTextField)jdc2.getDateEditor().getUiComponent()).getText());
            pst.setString(7,""+gt.getText());
            jButton1.setEnabled(true);  
            pst.executeUpdate();
                if(sbi.equals(""))
                        {
                 DCEngin dce = new DCEngin("select * from delievery where curr_date between '"+date1+"' and '"+date2+"'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Bill_No");
       header.add("Cust_No");
       header.add("Customer Name");
       header.add("Address");
       header.add("Bill_From");
       header.add("Bill_To");
       header.add("Bill_Amt");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header));  
                        }
                else 
                {        DCEngin dce = new DCEngin("select * from delievery where cust_name like '"+sbi+"%' and curr_date between '"+date1+"' and '"+date2+"'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Bill_No");
       header.add("Cust_No");
       header.add("Customer Name");
       header.add("Address");
       header.add("Bill_From");
       header.add("Bill_To");
       header.add("Bill_Amt");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header));  
                        }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"Please provide above missing details");
    }                                        
    try {
                 // pst=con.prepareStatement("update delievery  set  cust_name=?, contact=?,curr_date=?,item=?,quantity=? ,total=?  where cust_no="+rs.getInt(1)+" and curr_date='"+rs.getString(2)+"' and item='"+rs.getString(3)+"'");   
  // pst.setString(1,""+c_no.getText());
   String gnt=cno.getText();
 //  pst=con.prepareStatement("select sum(total) from delievery where cust_name="+gnt);
    rs = st.executeQuery("select sum(total)from delievery where cust_no="+gnt);
        float b=0;
        while(rs.next()){ b = rs.getFloat("sum(total)");}
        gt.setText(""+ b);
           rs.close();   

    //pst.setString(9,""+cstex.getText());
   
    JOptionPane.showMessageDialog(null, "Report Generated");
    billto.requestFocusInWindow(); 
    }
    catch(Exception ex)
    {
        System.out.println(ex);
    }
    
    
            String value = bn.getText();
            String value0 = (String)billto.getSelectedItem();
            String add=cstno.getText();
            String con=cno.getText();
            String date1=((JTextField)jdc1.getDateEditor().getUiComponent()).getText();
            String date2=((JTextField)jdc2.getDateEditor().getUiComponent()).getText();
            String gnt=gt.getText();    
            
            JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File(value +" "+ value0+"BILL"+".pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
            Document myDocument = new Document();
            
        try
        {     System.out.println("no problem1");
            String cm="cow milk";
              String bm="buffalo milk";
              String bp="paneer";
              float b1=0,b2=0,b3=0,r1=0,r2=0,r3=0;
              System.out.println("no problem2");
               rs3=st.executeQuery("select * from item_master where Item_name='"+cm+"'");
               if(rs3.next())
               {
                   r1=rs3.getInt("Item_Rate");
               }
               System.out.println("no problem3");
               rs3=st.executeQuery("select * from item_master where Item_name='"+bm+"'");
                if(rs3.next())
               {
                   r2=rs3.getInt("Item_Rate");
               }
                System.out.println("no problem4");
               rs3=st.executeQuery("select * from item_master where Item_name='"+bp+"'"); 
                 System.out.println("no problem4 ");
                 if(rs3.next())
               {
                   r3=rs3.getInt("Item_Rate");
               }
              rs = st.executeQuery("select sum(quantity) from delievery where item='"+cm+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");                
        while(rs.next()){ b1 = rs.getFloat("sum(quantity)");}
        System.out.println(b1);
          rs1 = st.executeQuery("select sum(quantity) from delievery where item='"+bm+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");
                System.out.println("no problem5 ");
        while(rs1.next()){ b2 = rs1.getFloat("sum(quantity)");}
          rs2 = st.executeQuery("select sum(quantity) from delievery where item='"+bp+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");
                System.out.println("no problem6 ");
        while(rs2.next()){ b3 = rs2.getFloat("sum(quantity)");}
         System.out.println("no problem7 ");
              PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
              PdfPTable table=new PdfPTable(3);
           myDocument.open();           
           myDocument.add(new Paragraph("------------------------UDAY DAIRY-----------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
           myDocument.add(new Paragraph("                                              "+new Date().toString()));
           myDocument.add(new Paragraph("-------------------------------------------------------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
    //       myDocument.add(new Paragraph(new Date().toString()));
       //    myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
//           myDocument.add((new Paragraph("CUSTOMER NAME",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD))));
           myDocument.add((new Paragraph("BILL NO.                                                                :                    "+value+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("CUSTOMER NO.                                                   :                    "+con+ " ",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("CUSTOMER NAME                                              :                    "+value0+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("ADDRESS                                                              :                    "+add+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("Bill From                                                                 :                    "+date1+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("Bill To                                                                     :                    "+date2+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
            System.out.println("no problem8 ");
            if(b1!=0)
            {myDocument.add((new Paragraph("COW MILK                                                            :                    "+b1+"L X "+r1+"="+(b1*r1),FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
            }
           if(b2!=0)
           {myDocument.add((new Paragraph("BUFFALO MILK                                                   :                    "+b2+"L X "+r2+"="+(b2*r2),FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           }
           if(b3!=0)
           {myDocument.add((new Paragraph("PANEER                                                                 :                    "+b3+"kg X "+r3+"="+(b3*r3),FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           }            
           /*   String a[] = null;
              int b=0,j=0;   
                float d=0;
            rs= st.executeQuery("select count(*)from Item_master");
              while(rs.next())
              {
                  ++b;                               
             rs=st.executeQuery("select * from item_master where item_no="+b);
             a[j]=rs.getString(2);
            rs2 = st.executeQuery("select sum(total)from delievery where cust_no="+b+"and item='"+a[j]+"'");
            rs1=st.executeQuery("select * from item_master="+b);     
         d = rs2.getFloat("sum(total)")*rs1.getInt("Item_Rate");
         j++;
          myDocument.add((new Paragraph("GRAND"+a[j]+"="                                                +d+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
              }*/
           myDocument.add((new Paragraph("GRAND TOTAL                                                    :                    "+gnt+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.newPage();
           myDocument.close();
           rs.close();
           rs1.close();
           rs2.close();
           billto.requestFocusInWindow(); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
         
            }
     try
    {       
    //    con= re.getCon();      
    //    st=con.createStatement();
      rs=st.executeQuery("select max(Bill_no) from Billing");
           
              rs.next();
              if(rs!=null)
              {
                  i_no=rs.getInt(1);
              i_no++;
              } 
           else
                    i_no=1;
              
              bn.setText(""+i_no);
              bn.setEditable(false);
              }
         catch(Exception e)
    {
        System.out.println(e);
     }
    }  
         
    }//GEN-LAST:event_billtoKeyPressed

    private void jdc1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdc1KeyPressed
      int key=evt.getKeyCode();
    if(key==10)
    {
     jdc2.requestFocus();
    }
    if(key==38)
    {
     jdc1.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }   // TODO add your handling code here:
    }//GEN-LAST:event_jdc1KeyPressed

    private void jdc2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdc2KeyPressed
      int key=evt.getKeyCode();
    if(key==38)
    {
     jdc2.requestFocus();
    }    
     if(key==10)
    {
     try {
                 String date1=((JTextField)jdc1.getDateEditor().getUiComponent()).getText();
                String date2=((JTextField)jdc2.getDateEditor().getUiComponent()).getText();
                String sbi=(String) billto.getSelectedItem();
                  pst=con.prepareStatement("insert into billing values(?,?,?,?,?,?,?)");
            pst.setString(1,""+bn.getText());
            pst.setString(3,""+billto.getSelectedItem());
            pst.setString(2,""+cno.getText());
            pst.setString(4,""+cstno.getText());
            pst.setString(5,""+((JTextField)jdc1.getDateEditor().getUiComponent()).getText());
            pst.setString(6,((JTextField)jdc2.getDateEditor().getUiComponent()).getText());
            pst.setString(7,""+gt.getText());
            jButton1.setEnabled(true);  
            pst.executeUpdate();
                if(sbi.equals(""))
                        {
                 DCEngin dce = new DCEngin("select * from delievery where curr_date between '"+date1+"' and '"+date2+"'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Bill_No");
       header.add("Cust_No");
       header.add("Customer Name");
       header.add("Address");
       header.add("Bill_From");
       header.add("Bill_To");
       header.add("Bill_Amt");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header));  
                        }
                else 
                {        DCEngin dce = new DCEngin("select * from delievery where cust_name like '"+sbi+"%' and curr_date between '"+date1+"' and '"+date2+"'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Bill_No");
       header.add("Cust_No");
       header.add("Customer Name");
       header.add("Address");
       header.add("Bill_From");
       header.add("Bill_To");
       header.add("Bill_Amt");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header));  
                        }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"Please provide above missing details");
    }                                        
    try {
                 // pst=con.prepareStatement("update delievery  set  cust_name=?, contact=?,curr_date=?,item=?,quantity=? ,total=?  where cust_no="+rs.getInt(1)+" and curr_date='"+rs.getString(2)+"' and item='"+rs.getString(3)+"'");   
  // pst.setString(1,""+c_no.getText());
   String gnt=cno.getText();
 //  pst=con.prepareStatement("select sum(total) from delievery where cust_name="+gnt);
    rs = st.executeQuery("select sum(total)from delievery where cust_no="+gnt);
        float b=0;
        while(rs.next()){ b = rs.getFloat("sum(total)");}
        gt.setText(""+ b);
           rs.close();   

    //pst.setString(9,""+cstex.getText());
   
    JOptionPane.showMessageDialog(null, "Report Generated");
    billto.requestFocusInWindow(); 
    }
    catch(Exception ex)
    {
        System.out.println(ex);
    }
    }
      String value = bn.getText();
            String value0 = (String)billto.getSelectedItem();
            String add=cstno.getText();
            String con=cno.getText();
            String date1=((JTextField)jdc1.getDateEditor().getUiComponent()).getText();
            String date2=((JTextField)jdc2.getDateEditor().getUiComponent()).getText();
            String gnt=gt.getText();    
            
            JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File(value +" "+ value0+"BILL"+".pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
            Document myDocument = new Document();
            
        try
        {     System.out.println("no problem1");
            String cm="cow milk";
              String bm="buffalo milk";
              String bp="paneer";
              float b1=0,b2=0,b3=0,r1=0,r2=0,r3=0;
              System.out.println("no problem2");
               rs3=st.executeQuery("select * from item_master where Item_name='"+cm+"'");
               if(rs3.next())
               {
                   r1=rs3.getInt("Item_Rate");
               }
               System.out.println("no problem3");
               rs3=st.executeQuery("select * from item_master where Item_name='"+bm+"'");
                if(rs3.next())
               {
                   r2=rs3.getInt("Item_Rate");
               }
                System.out.println("no problem4");
               rs3=st.executeQuery("select * from item_master where Item_name='"+bp+"'"); 
                 System.out.println("no problem4 ");
                 if(rs3.next())
               {
                   r3=rs3.getInt("Item_Rate");
               }
              rs = st.executeQuery("select sum(quantity) from delievery where item='"+cm+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");                
        while(rs.next()){ b1 = rs.getFloat("sum(quantity)");}
        System.out.println(b1);
          rs1 = st.executeQuery("select sum(quantity) from delievery where item='"+bm+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");
                System.out.println("no problem5 ");
        while(rs1.next()){ b2 = rs1.getFloat("sum(quantity)");}
          rs2 = st.executeQuery("select sum(quantity) from delievery where item='"+bp+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");
                System.out.println("no problem6 ");
        while(rs2.next()){ b3 = rs2.getFloat("sum(quantity)");}
         System.out.println("no problem7 ");
              PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
              PdfPTable table=new PdfPTable(3);
           myDocument.open();           
           myDocument.add(new Paragraph("------------------------UDAY DAIRY-----------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
           myDocument.add(new Paragraph("                                              "+new Date().toString()));
           myDocument.add(new Paragraph("-------------------------------------------------------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
    //       myDocument.add(new Paragraph(new Date().toString()));
       //    myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
//           myDocument.add((new Paragraph("CUSTOMER NAME",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD))));
           myDocument.add((new Paragraph("BILL NO.                                                                :                    "+value+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("CUSTOMER NO.                                                   :                    "+con+ " ",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("CUSTOMER NAME                                              :                    "+value0+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("ADDRESS                                                              :                    "+add+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("Bill From                                                                 :                    "+date1+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("Bill To                                                                     :                    "+date2+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
            System.out.println("no problem8 ");
            if(b1==0)
            {myDocument.add((new Paragraph("COW MILK                                                            :                    "+b1+"L X "+r1+"="+(b1*r1),FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
            }
           if(b2==0)
           {myDocument.add((new Paragraph("BUFFALO MILK                                                   :                    "+b2+"L X "+r2+"="+(b2*r2),FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           }
           if(b3==0)
           {myDocument.add((new Paragraph("PANEER                                                                 :                    "+b3+"kg X "+r3+"="+(b3*r3),FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           }            
           /*   String a[] = null;
              int b=0,j=0;   
                float d=0;
            rs= st.executeQuery("select count(*)from Item_master");
              while(rs.next())
              {
                  ++b;                               
             rs=st.executeQuery("select * from item_master where item_no="+b);
             a[j]=rs.getString(2);
            rs2 = st.executeQuery("select sum(total)from delievery where cust_no="+b+"and item='"+a[j]+"'");
            rs1=st.executeQuery("select * from item_master="+b);     
         d = rs2.getFloat("sum(total)")*rs1.getInt("Item_Rate");
         j++;
          myDocument.add((new Paragraph("GRAND"+a[j]+"="                                                +d+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
              }*/
           myDocument.add((new Paragraph("GRAND TOTAL                                                    :                    "+gnt+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.newPage();
           myDocument.close();
           rs.close();
           rs1.close();
           rs2.close();
           billto.requestFocusInWindow(); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
         
            }
    }//GEN-LAST:event_jdc2KeyPressed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BILLING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BILLING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BILLING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BILLING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BILLING().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(BILLING.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PB;
    private javax.swing.JComboBox billto;
    private javax.swing.JTextField bn;
    private javax.swing.JTextField cno;
    private javax.swing.JTextField cstno;
    private javax.swing.JTextField datetxt;
    private javax.swing.JTextField gt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private com.toedter.calendar.JDateChooser jdc1;
    private com.toedter.calendar.JDateChooser jdc2;
    private javax.swing.JTable sbin;
    private javax.swing.JTextField tinno;
    // End of variables declaration//GEN-END:variables
}
