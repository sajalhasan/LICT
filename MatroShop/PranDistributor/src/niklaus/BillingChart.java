/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niklaus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import niklaus.Connectection.DbConnection;

/**
 *
 * @author root
 */
public class BillingChart extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form BillingChart
     */
    public BillingChart() {
        initComponents();
        con=new DbConnection().condb();
    }
String dateTime(){
    Date d=new Date();
    SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
    //jLabel1.setText(f.format(d));
    return f.format(d);
}
String TimeFormate(){
    Date d=new Date();
    SimpleDateFormat f=new SimpleDateFormat("hh-mm-ss");
    return f.format(d);
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btn_Delete = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        txt_itemNo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_Save = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_gross_amount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_Total_amount = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_result = new javax.swing.JTextField();
        txt_receive = new javax.swing.JTextField();
        txt_NoOfItem = new javax.swing.JTextField();
        txt_rest = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_tax = new javax.swing.JTextField();
        btn_Finish = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "product Name", "Category", "Size", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Product Code", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Bright", 0, 12))); // NOI18N

        btn_Delete.setFont(new java.awt.Font("Linux Libertine O", 2, 20)); // NOI18N
        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        btn_Add.setFont(new java.awt.Font("Linux Libertine O", 2, 20)); // NOI18N
        btn_Add.setText("Add");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_itemNo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(txt_itemNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        btn_Save.setFont(new java.awt.Font("Linux Libertine O", 2, 24)); // NOI18N
        btn_Save.setText("Save");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        btn_print.setFont(new java.awt.Font("Linux Libertine O", 2, 24)); // NOI18N
        btn_print.setText("Print");

        btn_clear.setFont(new java.awt.Font("Linux Libertine O", 2, 24)); // NOI18N
        btn_clear.setText("Clear All");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Save, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_print)
                    .addComponent(btn_clear)
                    .addComponent(btn_Save, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jLabel10.setFont(new java.awt.Font("LM Roman Slanted 9", 2, 18)); // NOI18N
        jLabel10.setText("Total Amount:");

        txt_gross_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gross_amountActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("LM Roman Slanted 9", 2, 18)); // NOI18N
        jLabel8.setText("No of Item :");

        jLabel7.setFont(new java.awt.Font("Gentium", 3, 18)); // NOI18N
        jLabel7.setText("Net Sales Amount");

        jLabel12.setFont(new java.awt.Font("LM Roman Slanted 9", 2, 18)); // NOI18N
        jLabel12.setText("Gross Amount :");

        jLabel11.setFont(new java.awt.Font("LM Roman Slanted 9", 2, 18)); // NOI18N
        jLabel11.setText("Tax %:");

        txt_rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_restActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("LM Roman Slanted 9", 2, 18)); // NOI18N
        jLabel15.setText("Rest Of The Money :");

        jLabel14.setFont(new java.awt.Font("LM Roman Slanted 9", 2, 18)); // NOI18N
        jLabel14.setText("Receive :");

        txt_tax.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_taxInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txt_taxCaretPositionChanged(evt);
            }
        });
        txt_tax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_taxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(txt_result, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(jLabel11)
                                                .addGap(6, 6, 6)))
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_rest, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_Total_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_NoOfItem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_tax, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_receive, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_gross_amount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_NoOfItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txt_Total_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_gross_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_receive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_result, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_Finish.setFont(new java.awt.Font("Linux Libertine O", 2, 24)); // NOI18N
        btn_Finish.setText("Finish");
        btn_Finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FinishActionPerformed(evt);
            }
        });

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("LM Roman Slanted 9", 3, 24))); // NOI18N
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu1.setText(" File  ");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("New Product");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Delete Product");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Update Product");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu2.setText("   Summary  ");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Today ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Weakly");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem6.setText("Monthly");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Finish, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Finish))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_taxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_taxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_taxActionPerformed

    private void txt_gross_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gross_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_gross_amountActionPerformed
    int j=0;
    double sum=0;
    public void priceCalculation()
    {
     double a=0;
     
          for(int j=0;j<jTable1.getRowCount();j++)
            {
             a=Double.parseDouble(jTable1.getValueAt(j,4).toString()) ;
             sum=a+sum;
            
            }
          txt_Total_amount.setText(String.valueOf(sum));
           sum=0;
    }
 
 //double amount=0;
 //double sum;
    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
      DefaultTableModel defaultTableModel=(DefaultTableModel) jTable1.getModel();
        String sql="SELECT products.p_id, products.name, category.name, size.name,products.price FROM products "
               + "INNER JOIN category ON products.category_Id=category.id INNER JOIN size ON "
               + "products.size_Id=size.id where products.p_id=?" ;
      if(txt_tax.getText()!=null && txt_tax.getText()!=""){
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1, txt_itemNo.getText());
            rs=pst.executeQuery();
            if(rs.next())
            {
                String item_no=rs.getString(1);
                String name=rs.getString(2);
                String cat_name=rs.getString(3);
                String size_name=rs.getString(4);
                String price=rs.getString(5);
                
              //  float price2=Float.parseFloat(price);
                
             defaultTableModel.addRow(new Object[]{item_no,name,cat_name,size_name,price});
             
             priceCalculation();
            // vatCal();
            }
            txt_NoOfItem.setText("");
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e,"Error Message",JOptionPane.ERROR_MESSAGE);
        }
        
      }else{
          JOptionPane.showMessageDialog(null, "Input tax Value","Error Message",JOptionPane.ERROR_MESSAGE);
      }
         int i=jTable1.getRowCount();
        txt_NoOfItem.setText(String.valueOf(i));
        //double a=0;
       // amount=Double.parseDouble(txt_mrp.getText())*Double.parseDouble(txt_qty.getText());
        
        
        
      //  defaultTableModel.addRow(new Object[]{txt_itemNo.getText(),txt_itemName.getText(),txt_mrp.getText(),txt_tax.getText(),txt_qty.getText(),amount});
        
       // txt_tax1.setText(txt_tax.getText());
       /* 
       
        
        double a=0;
          for(int j=0;j<i;j++)
        {
             a=Double.parseDouble(jTable1.getValueAt(j,2).toString()) ;
             sum=a+sum;
            
        }
          txt_Total_amount.setText(String.valueOf(sum));
          int t=Integer.parseInt(txt_tax1.getText());
          double gross=(sum*t)/100;
          txt_gross_amount.setText(String.valueOf(gross));
          sum=0;
*/
          
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
       
        jTable1.setModel(new DefaultTableModel(null,new String [] {"Item Code","Product Name","Category","Size","Price"}));
        txt_NoOfItem.setText("");
        txt_Total_amount.setText("");
        txt_gross_amount.setText("");
        //txt_tax.setText("");
        txt_result.setText("");
        txt_receive.setText("");
        txt_rest.setText("");
        txt_itemNo.setText("");
        //defaultTableModel.addRow(new Object[]{});
      
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_taxCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_taxCaretPositionChanged
        
    }//GEN-LAST:event_txt_taxCaretPositionChanged

    private void txt_taxInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_taxInputMethodTextChanged
       
    }//GEN-LAST:event_txt_taxInputMethodTextChanged

    private void txt_restActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_restActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_restActionPerformed
    void vatCal()
    {
        double grossAmount;
        double totalAmount= Double.parseDouble(txt_Total_amount.getText());
                double vat= Double.parseDouble(txt_tax.getText());
               // double sum;
           try {
                // Integer.parseInt(txt_tax.getText());
                 grossAmount=(vat*totalAmount)/100;
               //  sum=totalAmount+grossAmount;
                 txt_gross_amount.setText(String.valueOf(grossAmount));
                 
                 
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Tax Field Worng Input","Error",JOptionPane.ERROR_MESSAGE);
            }
           catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Tax Field Worng Input","Error",JOptionPane.ERROR_MESSAGE);
            }
    }
    private void btn_FinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FinishActionPerformed
      //  String taxquery="INSERT INTO `taxDetails`(`date`, `time`, `tax`,`totalAmount`) VALUES (?,?,?,?)";
        //String tax=txt_tax.getText();
       // double  grossAmount=Double.parseDouble(txt_gross_amount.getText());
       
        vatCal();
        double totalAmount=Double.parseDouble(txt_Total_amount.getText());
        double grossamount=Double.parseDouble(txt_gross_amount.getText());
        double receive=Double.parseDouble(txt_receive.getText());
         double sum= (totalAmount+grossamount);
       
        double back=(receive-sum);
        
       txt_result.setText(String.valueOf(sum));
       txt_rest.setText(String.valueOf(back));
       
       //--------------------------------------------------- 
      //  double a=0;
        String itemid=null;
        
        double price;
        //double price2;
        //double grossAmount;
        
        float tax=Float.parseFloat(txt_tax.getText());
        String date=String.valueOf(dateTime());
        String time=String.valueOf(TimeFormate());
               
        String sql="INSERT INTO `sellsDetails`(`itemCode`, `Date`, `Time`, `tax`, `price`) "
                + "VALUES (?,?,?,?,?)";
          for(int j=0;j<jTable1.getRowCount();j++)
            {
//             a=Double.parseDouble(jTable1.getValueAt(j,4).toString()) ;
//             sum=a+sum;
               itemid=String.valueOf(jTable1.getValueAt(j,0));
               
               price=Double.parseDouble(jTable1.getValueAt(j, 4).toString());
              // price2=price+grossAmount;
              // ----------------------------------------
               try{
                    pst=con.prepareStatement(sql);
                    pst.setString(1,itemid);
                    pst.setString(2,date);
                    pst.setString(3,time);
                    pst.setFloat(4,tax);
                    pst.setDouble(5,price);
                    
                    pst.executeUpdate();
                    itemid=null;
                    price=0;
                    
                    //JOptionPane.showMessageDialog(null, "OK","Message",JOptionPane.PLAIN_MESSAGE);
               }catch(Exception e){
                   JOptionPane.showMessageDialog(null, "Something Missing"+e,"Warning",JOptionPane.ERROR_MESSAGE);
               }
              // price2=0;
            }
          btn_Save.doClick();
           jTable1.setModel(new DefaultTableModel(null,new String [] {"Item Code","Product Name","Category","Size","Price"}));
        txt_NoOfItem.setText("");
         txt_Total_amount.setText("");
          txt_itemNo.setText("");
           txt_receive.setText("");
            txt_rest.setText("");
             txt_result.setText("");
             txt_gross_amount.setText("");
          
//        }else{
//            JOptionPane.showMessageDialog(null, "Input Tax Percentage","Warning",JOptionPane.ERROR_MESSAGE);
//        }
        
          //txt_Total_amount.setText(String.valueOf(sum));
          // sum=0;
        //----------------------------------------------------
    }//GEN-LAST:event_btn_FinishActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      Product_insert insert=new Product_insert();
      insert.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
          String taxquery="INSERT INTO `taxDetails`(`date`, `time`, `tax`,`totalAmount`) VALUES (?,?,?,?)";
        double grossamount=Double.parseDouble(txt_gross_amount.getText());
         double totalPrice=Double.parseDouble(txt_result.getText());
        try{
            pst=con.prepareStatement(taxquery);
            pst.setString(1,dateTime());
            pst.setString(2, TimeFormate());
            pst.setDouble(3, grossamount);
            pst.setDouble(4,totalPrice);
            pst.executeUpdate();
         JOptionPane.showMessageDialog(null,"Sucessful","Message",JOptionPane.PLAIN_MESSAGE);
       }catch(Exception e)
       {
            JOptionPane.showMessageDialog(null, "InValide:"+e,"Warning",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        
        if(jTable1.getSelectedRow()==-1){
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"Empty Table Data","Warning Message",JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Select The Row","Warning Message",JOptionPane.WARNING_MESSAGE);
            }
        }else{
        model.removeRow(jTable1.getSelectedRow());
        JOptionPane.showMessageDialog(null, "Deleted");
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new TodaysReport().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillingChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingChart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Finish;
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_print;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_NoOfItem;
    private javax.swing.JTextField txt_Total_amount;
    private javax.swing.JTextField txt_gross_amount;
    private javax.swing.JTextField txt_itemNo;
    private javax.swing.JTextField txt_receive;
    private javax.swing.JTextField txt_rest;
    private javax.swing.JTextField txt_result;
    private javax.swing.JTextField txt_tax;
    // End of variables declaration//GEN-END:variables
}
