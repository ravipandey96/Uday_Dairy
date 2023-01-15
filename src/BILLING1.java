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
import java.security.CodeSource;
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
public class BILLING1 extends javax.swing.JInternalFrame {
    Connection con=null;
    PreparedStatement pst=null;
    PreparedStatement pst1=null;
    Statement st=null,stDelete=null,st3;
   ResultSet rs = null;
   ResultSet rs1 = null;
   ResultSet rs2 = null;
   ResultSet rs3 = null;
   private Vector<Vector<String>> data;
        private Vector<String> header;
   JScrollPane s; 
    int i_no=0;
     public BILLING1() throws Exception
    {
   con=re.getCon();
   initComponents();
   billto.requestFocus();
   billto.requestFocusInWindow();
   billto.setFocusable(true);
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
   
       bill dce = new bill("select * from billing");
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
   billto.requestFocus();
   billto.requestFocusInWindow();
   billto.setFocusable(true);     
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
        CWM = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        BFM = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        PCM = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        PB = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        tt = new javax.swing.JTextField();

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
        jLabel1.setText("DIRECT BILLING");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 16, 210, 34));

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

        billto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Customer Name" }));
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
        jScrollPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane4MouseClicked(evt);
            }
        });

        sbin.setModel(new javax.swing.table.DefaultTableModel(
            data,header
        ));
        sbin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sbinMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(sbin);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 318, 872, 470));

        jButton1.setBackground(java.awt.SystemColor.activeCaption);
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detail item.gif"))); // NOI18N
        jButton1.setText("DISPLAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, -1, -1));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 810, -1, -1));

        jButton3.setBackground(java.awt.SystemColor.activeCaption);
        jButton3.setForeground(new java.awt.Color(0, 51, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APPLICATION ICONS/24x24-free-button-icons/gif/24x24/114.gif"))); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, -1, -1));

        jLabel11.setText("COW MILK");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        CWM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CWMKeyPressed(evt);
            }
        });
        getContentPane().add(CWM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 110, -1));

        jLabel12.setText("BUFFALO MILK");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        BFM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BFMKeyPressed(evt);
            }
        });
        getContentPane().add(BFM, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 90, -1));

        jLabel13.setText("PANEER");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, -1, -1));

        PCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCMActionPerformed(evt);
            }
        });
        PCM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PCMKeyPressed(evt);
            }
        });
        getContentPane().add(PCM, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 90, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("PREVIOUS BALANCE");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 187, 160, 30));

        PB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PBKeyPressed(evt);
            }
        });
        getContentPane().add(PB, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 70, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APPLICATION ICONS/Refresh.gif"))); // NOI18N
        jButton4.setText("RESET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APPLICATION ICONS/24x24-free-button-icons/gif/24x24/22.gif"))); // NOI18N
        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 320, -1, -1));

        jButton6.setText("BACKUP");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 370, -1, -1));
        getContentPane().add(tt, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 0, 10));

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
       try {     System.out.println("step1");
                 String date1=((JTextField)jdc1.getDateEditor().getUiComponent()).getText();
                String date2=((JTextField)jdc2.getDateEditor().getUiComponent()).getText();
                String sbi=(String) billto.getSelectedItem();
                System.out.println("step2");
                if(sbi.equals("Select Customer Name"))
                        {
                 DBEngine dce = new DBEngine("select * from billing where bill_from='"+date1+"' and bill_to='"+date2+"'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Bill_No");
       header.add("Cust_No");
       header.add("Customer Name");
       header.add("Address");
       header.add("Bill_From");
       header.add("Bill_To");
       header.add("Bill_Amt");
       System.out.println("step3");
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header));  
                        }
                else 
                {  System.out.println("step4");
                    DCEngin dce = new DCEngin("select * from billing where customer_name like '"+sbi+"%' and bill_from='"+date1+"' and bill_to='"+date2+"'");
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
        JOptionPane.showMessageDialog(null,""+e);
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
         //     rs = st.executeQuery("select sum(quantity) from delievery where item='"+cm+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");                
        //while(rs.next()){ b1 = rs.getFloat("sum(quantity)");}
                 b1=Float.parseFloat(CWM.getText());
          //rs1 = st.executeQuery("select sum(quantity) from delievery where item='"+bm+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");
          //while(rs1.next()){ b2 = rs1.getFloat("sum(quantity)");}
          b2=Float.parseFloat(BFM.getText());
    //             rs2 = st.executeQuery("select sum(quantity) from delievery where item='"+bp+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");
    //    while(rs2.next()){ b3 = rs2.getFloat("sum(quantity)");}
          b3=Float.parseFloat(PCM.getText());
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
            if(rb!=0)
            {myDocument.add((new Paragraph("REMAINING BALANCE                                          :                    "+rb+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));}
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
           myDocument.add((new Paragraph("GRAND TOTAL                                                    :                    "+(b1*r1+b2*r2+b3*r3+rb)+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
//           myDocument.add((new Paragraph("GRAND TOTAL                                                    :                    "+(b1*r1+b2*r2+b3*r3+rb)+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.newPage();
           myDocument.close();
           rs.close();
           rs1.close();
           rs2.close();
           billto.requestFocusInWindow();
           gt.setText("");
           CWM.setText("");
           PCM.setText("");
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
    if(key==10)
    {
     PB.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }
    if(key==39)
    {       try {
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
            if(rb!=0)
            {myDocument.add((new Paragraph("REMAINING BALANCE                                          :                    "+rb+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));}
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
        {     
            String cm="cow milk";
              String bm="buffalo milk";
              String bp="paneer";
              float b1=0,b2=0,b3=0,r1=0,r2=0,r3=0;              
               rs3=st.executeQuery("select * from item_master where Item_name='"+cm+"'");
               if(rs3.next())
               {
                   r1=rs3.getInt("Item_Rate");
               }
               
               rs3=st.executeQuery("select * from item_master where Item_name='"+bm+"'");
                if(rs3.next())
               {
                   r2=rs3.getInt("Item_Rate");
               }
               
               rs3=st.executeQuery("select * from item_master where Item_name='"+bp+"'");                
                 if(rs3.next())
               {
                   r3=rs3.getInt("Item_Rate");
               }
              rs = st.executeQuery("select sum(quantity) from delievery where item='"+cm+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");                
        while(rs.next()){ b1 = rs.getFloat("sum(quantity)");}
        System.out.println(b1);
          rs1 = st.executeQuery("select sum(quantity) from delievery where item='"+bm+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");
        while(rs1.next()){ b2 = rs1.getFloat("sum(quantity)");}
          rs2 = st.executeQuery("select sum(quantity) from delievery where item='"+bp+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");
        while(rs2.next()){ b3 = rs2.getFloat("sum(quantity)");}
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

    private void CWMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CWMKeyPressed
      int key=evt.getKeyCode();
    if(key==10)
    {
     BFM.requestFocus();
     if(CWM.getText().equals(""))
     {
         CWM.setText("0");
     }
    }
    if(key==27)
    {
      this.dispose();
    }
    if(key==38)
    {
     PB.requestFocus();
    }
    }//GEN-LAST:event_CWMKeyPressed

    private void BFMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BFMKeyPressed
         int key=evt.getKeyCode();
    if(key==10)
    {
     PCM.requestFocus();
     if(BFM.getText().equals(""))
     {
         BFM.setText("0");
     }
    }
    if(key==27)
    {
      this.dispose();
    }
    if(key==37)
    {
     CWM.requestFocus();
    }
    }//GEN-LAST:event_BFMKeyPressed

    private void PCMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PCMKeyPressed
         int key=evt.getKeyCode();
    if(key==10)
    {
        if(PCM.getText().equals(""))
        {
            PCM.setText("0");
        }
   /*  try {
      
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
     /*           if(sbi.equals(""))
                        {
                 DCEngin dce = new DCEngin("select * from billing where curr_date between '"+date1+"' and '"+date2+"'");
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
                        }*/
             //   else 
      /*                  DCEngin dce = new DCEngin("select * from billing where  bill_from='"+date1+"' and bill_to='"+date2+"'");
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
        
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"Please provide above missing details");
    }   */                                                
/*    try {
                 // pst=con.prepareStatement("update delievery  set  cust_name=?, contact=?,curr_date=?,item=?,quantity=? ,total=?  where cust_no="+rs.getInt(1)+" and curr_date='"+rs.getString(2)+"' and item='"+rs.getString(3)+"'");   
  // pst.setString(1,""+c_no.getText());
   //String gnt=cno.getText();
 //  pst=con.prepareStatement("select sum(total) from delievery where cust_name="+gnt);
    //rs = st.executeQuery("select sum(total)from delievery where cust_no="+gnt);
      //  float b=0;
        //while(rs.next()){ b = rs.getFloat("sum(total)");}
        //gt.setText(""+ b);
         //  rs.close();   

    //pst.setString(9,""+cstex.getText());
   
    JOptionPane.showMessageDialog(null, "Report Generated");
    billto.requestFocusInWindow(); 
    }
    catch(Exception ex)
    {
        System.out.println(ex);
    }*/
           String value = bn.getText();
            String value0 = (String)billto.getSelectedItem();
            String add=cstno.getText();
            String con1=cno.getText();
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
         //     rs = st.executeQuery("select sum(quantity) from delievery where item='"+cm+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");                
        //while(rs.next()){ b1 = rs.getFloat("sum(quantity)");}
                 b1=Float.parseFloat(CWM.getText());
          //rs1 = st.executeQuery("select sum(quantity) from delievery where item='"+bm+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");
          //while(rs1.next()){ b2 = rs1.getFloat("sum(quantity)");}
          b2=Float.parseFloat(BFM.getText());
    //             rs2 = st.executeQuery("select sum(quantity) from delievery where item='"+bp+"' and cust_name='"+value0+"' and curr_date between '"+date1+"' and '"+date2+"'");
    //    while(rs2.next()){ b3 = rs2.getFloat("sum(quantity)");}
          b3=Float.parseFloat(PCM.getText());
          
      float GT=Float.parseFloat(CWM.getText())*r1+Float.parseFloat(BFM.getText())*r2+Float.parseFloat(PCM.getText())*r3+rb;
      gt.setText(""+GT);
      //           String date1=((JTextField)jdc1.getDateEditor().getUiComponent()).getText();
      //          String date2=((JTextField)jdc2.getDateEditor().getUiComponent()).getText();
     System.out.println("no problem5 ");
      String sbi=(String) billto.getSelectedItem();
         pst1=con.prepareStatement("insert into billing values(?,?,?,?,?,?,?)");         
         System.out.println("no problem6 ");   
         pst1.setString(1,""+bn.getText());
         System.out.println("no problem7 ");   
         pst1.setString(3,""+billto.getSelectedItem());
         System.out.println("no problem8 ");
         pst1.setString(2,""+cno.getText());
         System.out.println("no problem9 ");
         pst1.setString(4,""+cstno.getText());
         System.out.println("no problem10 ");
         pst1.setString(5,""+((JTextField)jdc1.getDateEditor().getUiComponent()).getText());
         System.out.println("no problem11");
         pst1.setString(6,((JTextField)jdc2.getDateEditor().getUiComponent()).getText());
         System.out.println("no problem12");
         pst1.setString(7,""+gt.getText());
         System.out.println("no problem13");
         jButton1.setEnabled(true);  
         System.out.println("no problem14 ");
            pst1.executeUpdate();
            System.out.println("no problem15 ");
     /*           if(sbi.equals(""))
                        {
                 DCEngin dce = new DCEngin("select * from billing where curr_date between '"+date1+"' and '"+date2+"'");
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
                        }*/
             //   else
            System.out.println("no problem16 ");
                      DBEngine dce = new DBEngine("select * from billing where  bill_from='"+date1+"' and bill_to='"+date2+"'");
                 //       DBEngine dce = new DBEngine("select * from billing ");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Bill_No");
       header.add("Cust_No");
       header.add("Customer Name");
       header.add("Address");
       header.add("Bill_From");
       header.add("Bill_To");
       header.add("Bill_Amt");
       System.out.println("no problem17 ");
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header));
              PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
              PdfPTable table=new PdfPTable(3);
           myDocument.open();           
           myDocument.add(new Paragraph("-----------------------------------------UDAY DAIRY------------------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,16,Font.BOLD )));
       //  myDocument.add(new Paragraph("                                              "+new Date().toString()));
          myDocument.add(new Paragraph("                                                 ADDRESS  :  NEW SHANTI NAGAR                ",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.PLAIN )));
          myDocument.add(new Paragraph("                                                   CONTACT_NO  :  9993221000                 ",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.PLAIN )));
          myDocument.add(new Paragraph("------------------------------------------------------------------------------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,16,Font.BOLD )));
         myDocument.add((new Paragraph("BILL NO.                                                                :                    "+value+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("CUSTOMER NO.                                                   :                    "+con1+ " ",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("CUSTOMER NAME                                              :                    "+value0+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("ADDRESS                                                              :                    "+add+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("Bill From                                                                 :                    "+date1+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           myDocument.add((new Paragraph("Bill To                                                                     :                    "+date2+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
         if(rb!=0)
         {     myDocument.add((new Paragraph("REMAINING BALANCE                                      :                    "+rb+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));}
            if(b1!=0)
            {myDocument.add((new Paragraph("COW MILK                                                            :                    "+b1+"L X "+r1+"="+(b1*r1),FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
            }
           if(b2!=0)
           {myDocument.add((new Paragraph("BUFFALO MILK                                                   :                    "+b2+"L X "+r2+"="+(b2*r2),FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           }
           if(b3!=0)
           {myDocument.add((new Paragraph("PANEER                                                                 :                    "+b3+"kg X "+r3+"="+(b3*r3),FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
           }            
           System.out.println("no problem18 ");
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
           myDocument.add((new Paragraph("GRAND TOTAL                                                    :                    "+GT+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
 //        myDocument.add((new Paragraph("सूचना:",FontFactory.getFont(FontFactory.COURIER,14))));
 //        myDocument.add((new Paragraph("सभी ग्राहक को सूचित किया जाता है कि बिल पेमेंट करने के बाद ऊपर दिये गए नंबर पर कृपया सूचित करे|",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));
//         myDocument.add((new Paragraph("सभी ग्राहक को सूचित किया जाता है कि दूध जिस दिन न लेना हो उसके 1 दिन पहले कृपया सूचित करे|",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.PLAIN))));  
//         System.out.println("सूचना:");
//         System.out.println("सभी ग्राहक को सूचित किया जाता है कि बिल पेमेंट करने के बाद ऊपर दिये गए नंबर पर कृपया सूचित करे|");
//         System.out.println("सभी ग्राहक को सूचित किया जाता है कि दूध जिस दिन न लेना हो उसके 1 दिन पहले कृपया सूचित करे|");
           myDocument.add((new Paragraph("--------------------------------------------------------INSTRUCTION----------------------------------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,12))));
           myDocument.add((new Paragraph("All the customers are informed that after making the bill payment, please inform us.",FontFactory.getFont(FontFactory.TIMES_ROMAN,12))));
           //myDocument.add((new Paragraph("All customers are requested to inform 24 hours in advance of the day the milk is not to be taken.",FontFactory.getFont(FontFactory.TIMES_BOLD,12))));
//           myDocument.add((new Paragraph("सूचना:",FontFactory.getFont(FontFactory.SYMBOL,12))));
           myDocument.add((new Paragraph("You can make payment through following ways:",FontFactory.getFont(FontFactory.TIMES_ROMAN,12))));
           myDocument.add((new Paragraph("1.BANK TRANSFER:- NAME: UDAY PANDEY,A/C:-20156902831,IFSC:-SBIN0017728",FontFactory.getFont(FontFactory.TIMES_ROMAN,12))));
           myDocument.add((new Paragraph("2.UPI DETAILS:-GOOGLE PAY/PHONEPE->9993221000",FontFactory.getFont(FontFactory.TIMES_ROMAN,12))));
           myDocument.newPage();
           myDocument.close();
           billto.requestFocusInWindow();
           gt.setText("");
           CWM.setText("");
           PCM.setText("");
           BFM.setText("");
           PB.setText("");
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
    if(key==27)
    {
      this.dispose();
    }
    if(key==38)
    {
     BFM.requestFocus();
    }
     
    }//GEN-LAST:event_PCMKeyPressed

    private void PCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PCMActionPerformed

    private void PBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PBKeyPressed
            int key=evt.getKeyCode();
    if(key==10)
    {
     if(PB.getText().equals(""))
     {
         PB.setText("0");
     }
     CWM.requestFocus();
    }
    if(key==27)
    {
      this.dispose();
    }
    if(key==38)
    {
     billto.requestFocus();
    }
    }//GEN-LAST:event_PBKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      try
    {       
    //    con= re.getCon();      
    //    st=con.createStatement();
      st.executeUpdate("delete from billing");
      JOptionPane.showMessageDialog(null,"Record Erased");
      //billto.setFocusable(true);
      rs1=st3.executeQuery("select max(Bill_no) from Billing");
           
              rs1.next();
              if(rs1!=null)
              {
                  i_no=rs1.getInt(1);
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    try
    {             String date1=((JTextField)jdc1.getDateEditor().getUiComponent()).getText();
            String date2=((JTextField)jdc2.getDateEditor().getUiComponent()).getText();
        System.out.println("step1");
        int a=Integer.parseInt(tt.getText());
        System.out.println("step2");
     st.executeUpdate("Delete from Billing where Bill_no="+a);
     System.out.println("step3");
     //billto.setFocusable(true);
DBEngine dce = new DBEngine("select * from billing where  bill_from='"+date1+"' and bill_to='"+date2+"'");
                 //       DBEngine dce = new DBEngine("select * from billing ");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Bill_No");
       header.add("Cust_No");
       header.add("Customer Name");
       header.add("Address");
       header.add("Bill_From");
       header.add("Bill_To");
       header.add("Bill_Amt");
       System.out.println("no problem17 ");
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header));
     
              }
         catch(Exception e)
    {   System.out.println("step4");
        JOptionPane.showMessageDialog(null,""+e);
     }      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jScrollPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane4MouseClicked
   /*  try {System.out.println("step1");
      int r= sbin.getSelectedRow();
      System.out.println("step2");
            int c=sbin.getSelectedColumn();
      System.out.println("step3");      
                     Object s=sbin.getValueAt(r, 0);
            System.out.println("step4");
                     String NameVal = s.toString();
                     System.out.println("step5");
            rs = st.executeQuery("select * from billing where bill_no='"+NameVal+"'");                
      //       rs.next();
            System.out.println("step6");
             tt.setText(""+rs.getInt(1));
             System.out.println("step7");
    }
     catch(Exception ex)
     {
         System.out.println(""+ex);
     }*/
    }//GEN-LAST:event_jScrollPane4MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    try {

        /*NOTE: Getting path to the Jar file being executed*/
        /*NOTE: YourImplementingClass-> replace with the class executing the code*/
        CodeSource codeSource = re.class.getProtectionDomain().getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI().getPath());
        String jarDir = jarFile.getParentFile().getPath();
        System.out.println("step 1");
        String dbName = "billing_system";
        String dbUser = "root";
        String dbPass = "123";
        System.out.println("step 2");
        /*NOTE: Creating Path Constraints for folder saving*/
        /*NOTE: Here the backup folder is created for saving inside it*/
        String folderPath = jarDir + "\\backup";

        /*NOTE: Creating Folder if it does not exist*/
        File f1 = new File(folderPath);
        f1.mkdir();

        /*NOTE: Creating Path Constraints for backup saving*/
        /*NOTE: Here the backup is saved in a folder called backup with the name backup.sql*/
        String date1=((JTextField)jdc2.getDateEditor().getUiComponent()).getText(); 
         String savePath = "\"" + jarDir + "\\backup\\" + "backup.sql\"";
         System.out.println("step 3");
        /*NOTE: Used to create a cmd command*/
        String executeCmd = "C:\\Program Files (x86)\\MySQL\\MySQL Server 5.5\\bin>mysqldump -uroot -p123 billing_system billing>d:\\software_backup\\"+date1+".sql";
        System.out.println("step 4");
        /*NOTE: Executing the command here*/
        Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
        System.out.println("step 5");
        int processComplete = runtimeProcess.waitFor();
        System.out.println("step 6");
        /*NOTE: processComplete=0 if correctly executed, will contain other values if not*/
        if (processComplete == 0) {
            System.out.println("Backup Complete");
        } else {
            System.out.println("Backup Failure");
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error at Backuprestore" + ex.getMessage());
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void sbinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbinMouseClicked
         try {
             re.getCon();
             System.out.println("step1");
      int r= sbin.getSelectedRow();
      System.out.println("step2");
            int c=sbin.getSelectedColumn();
      System.out.println("step3");      
                     Object s=sbin.getValueAt(r, 0);
            System.out.println("step4");
                     String NameVal = s.toString();
                     System.out.println("step5");
            rs = st.executeQuery("select * from billing where Bill_no='"+NameVal+"'");                
            rs.next();
            System.out.println("step6");
             tt.setText(""+rs.getInt(1));
             System.out.println("step7");
    }
     catch(Exception ex)
     {
         JOptionPane.showMessageDialog(null,"Error->"+ex);
     }
    }//GEN-LAST:event_sbinMouseClicked

    
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
    private javax.swing.JTextField BFM;
    private javax.swing.JTextField CWM;
    private javax.swing.JTextField PB;
    private javax.swing.JTextField PCM;
    private javax.swing.JComboBox billto;
    private javax.swing.JTextField bn;
    private javax.swing.JTextField cno;
    private javax.swing.JTextField cstno;
    private javax.swing.JTextField datetxt;
    private javax.swing.JTextField gt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField tt;
    // End of variables declaration//GEN-END:variables
}
