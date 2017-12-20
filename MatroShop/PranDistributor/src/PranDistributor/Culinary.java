/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PranDistributor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rakib
 */
public class Culinary extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DefaultTableModel tbModel;
    public Culinary() {
        
        initComponents();
        fillcombo();
       
    }

    // Calculate grand total from jtabel...
    
    public void getSum(){
        double sum = 0;
        for(int i = 0; i<jtableProduct.getRowCount();i++)
        {
            sum = sum + Double.parseDouble(jtableProduct.getValueAt(i, 3).toString());
            txtGrand.setText(Double.toString(sum));
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCulInsert = new javax.swing.JPanel();
        lblC_DeliveryProduct = new java.awt.Label();
        cmbC_ProductName = new javax.swing.JComboBox<>();
        lblC_ProductName = new java.awt.Label();
        txtC_ProductPrice = new javax.swing.JTextField();
        txtC_DeliveryProduct = new javax.swing.JTextField();
        lblC_ProductPrice = new java.awt.Label();
        txtC_ReturnProduct = new javax.swing.JTextField();
        lblProductName3 = new java.awt.Label();
        btnC_ProductCategory = new javax.swing.JButton();
        btnC_Submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProduct = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtGrand = new javax.swing.JTextField();
        btndeleterow = new javax.swing.JButton();
        btngrandtotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlCulInsert.setBackground(new java.awt.Color(204, 204, 204));

        lblC_DeliveryProduct.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblC_DeliveryProduct.setText("Delivery Product");

        cmbC_ProductName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbC_ProductName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose your product" }));
        cmbC_ProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbC_ProductNameActionPerformed(evt);
            }
        });

        lblC_ProductName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblC_ProductName.setText("Product Name");

        txtC_ProductPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC_ProductPriceActionPerformed(evt);
            }
        });

        lblC_ProductPrice.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblC_ProductPrice.setText("Product Price");

        lblProductName3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblProductName3.setText("Return Product");

        btnC_ProductCategory.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnC_ProductCategory.setText("BACK");
        btnC_ProductCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC_ProductCategoryActionPerformed(evt);
            }
        });

        btnC_Submit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnC_Submit.setText("Submit");
        btnC_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC_SubmitActionPerformed(evt);
            }
        });

        jLabel1.setText("BDT");

        javax.swing.GroupLayout pnlCulInsertLayout = new javax.swing.GroupLayout(pnlCulInsert);
        pnlCulInsert.setLayout(pnlCulInsertLayout);
        pnlCulInsertLayout.setHorizontalGroup(
            pnlCulInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCulInsertLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCulInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCulInsertLayout.createSequentialGroup()
                        .addGroup(pnlCulInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCulInsertLayout.createSequentialGroup()
                                .addComponent(lblC_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCulInsertLayout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addGroup(pnlCulInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProductName3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblC_DeliveryProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblC_ProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(pnlCulInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtC_ReturnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtC_DeliveryProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlCulInsertLayout.createSequentialGroup()
                                        .addComponent(txtC_ProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1))
                                    .addComponent(cmbC_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlCulInsertLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(btnC_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(43, 43, 43))
                    .addGroup(pnlCulInsertLayout.createSequentialGroup()
                        .addComponent(btnC_ProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlCulInsertLayout.setVerticalGroup(
            pnlCulInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCulInsertLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlCulInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbC_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnlCulInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblC_ProductPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCulInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtC_ProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(pnlCulInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtC_DeliveryProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC_DeliveryProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(pnlCulInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC_ReturnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductName3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnC_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnC_ProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jtableProduct.setBackground(new java.awt.Color(204, 204, 255));
        jtableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product name", "Unit  Price", "Num of Product sell", "Total amount"
            }
        ));
        jScrollPane1.setViewportView(jtableProduct);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        txtGrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrandActionPerformed(evt);
            }
        });

        btndeleterow.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btndeleterow.setText("Remove Product");
        btndeleterow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleterowActionPerformed(evt);
            }
        });

        btngrandtotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btngrandtotal.setText("Grand Total");
        btngrandtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrandtotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btndeleterow, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btngrandtotal)
                .addGap(18, 18, 18)
                .addComponent(txtGrand, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngrandtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndeleterow))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCulInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCulInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnC_ProductCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC_ProductCategoryActionPerformed
        ProductGroup pg = new ProductGroup();
        pg.setTitle("Product Category");
       this.setVisible(false);
       pg.setVisible(true);
    }//GEN-LAST:event_btnC_ProductCategoryActionPerformed

    private void cmbC_ProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbC_ProductNameActionPerformed
                conn = MysqlConnect.ConnectDB();
                 String tmp = (String)cmbC_ProductName.getSelectedItem();
                 String Sql = "Select * from productdetails where productname =?";
                 try {
                     pst = conn.prepareStatement(Sql);
                     pst.setString(1, tmp);
                     rs = pst.executeQuery();
               while (rs.next())
               {
                  String addprice = rs.getString("productprice");
                  txtC_ProductPrice.setText(addprice);
                  
                 
               }
               rs.close();
               pst.close();
                     
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!");
        }
                 
    }//GEN-LAST:event_cmbC_ProductNameActionPerformed

    private void txtC_ProductPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC_ProductPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC_ProductPriceActionPerformed

    private void btnC_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC_SubmitActionPerformed
      
        // validation of fields ...........
        int delivery =  Integer.parseInt(txtC_DeliveryProduct.getText());
        int preturn = Integer.parseInt(txtC_ReturnProduct.getText());
        
         if(("".equals(txtC_ProductPrice.getText())) ||  ("".equals(txtC_DeliveryProduct.getText())) || ("".equals(txtC_ReturnProduct.getText())))
        {
            JOptionPane.showMessageDialog(null,"Fill all the fields");
        }
         // condition checking ...........
          if (delivery<0 || preturn<0)
          {
              JOptionPane.showMessageDialog(null, "Please, Enter number larger than 0");
          }
             
         else if(delivery>=preturn){
               int sell =delivery -preturn;
         double price = Double.parseDouble(txtC_ProductPrice.getText());
         
        
        tbModel = (DefaultTableModel) jtableProduct.getModel();
        tbModel.addRow(new Object[] {cmbC_ProductName.getSelectedItem(), price,sell, price * sell});
        }
        
        else 
        {
             JOptionPane.showMessageDialog(null,"Enter return product number less than delivery product number");
        }
       
       
        
      
            
       
        
        
        
    };//GEN-LAST:event_btnC_SubmitActionPerformed

    private void txtGrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrandActionPerformed

    private void btndeleterowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleterowActionPerformed
       
        
        int i = jtableProduct.getSelectedRow();
        if(i>=0)
        {
            tbModel.removeRow(i);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Unable to remove");
        }
         
    }//GEN-LAST:event_btndeleterowActionPerformed

    private void btngrandtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrandtotalActionPerformed
                 getSum();
    }//GEN-LAST:event_btngrandtotalActionPerformed
    // Connect comobo & database and fatch values from combo box 
    public void fillcombo(){
        try {
                conn = MysqlConnect.ConnectDB();
               String Sql = "Select * from productdetails";
               pst = conn.prepareStatement(Sql);
               rs = pst.executeQuery();
               while (rs.next())
               {
                  String pname = rs.getString("productname");
                  cmbC_ProductName.addItem(pname);
                  
                 
               }
               rs.close();
               pst.close();
                
             //  JOptionPane.showMessageDialog(null,"Inserted sucessfully");
               
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error!");
        }
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(Culinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Culinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Culinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Culinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Culinary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC_ProductCategory;
    private javax.swing.JButton btnC_Submit;
    private javax.swing.JButton btndeleterow;
    private javax.swing.JButton btngrandtotal;
    private javax.swing.JComboBox<String> cmbC_ProductName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableProduct;
    private java.awt.Label lblC_DeliveryProduct;
    private java.awt.Label lblC_ProductName;
    private java.awt.Label lblC_ProductPrice;
    private java.awt.Label lblProductName3;
    private javax.swing.JPanel pnlCulInsert;
    private javax.swing.JTextField txtC_DeliveryProduct;
    private javax.swing.JTextField txtC_ProductPrice;
    private javax.swing.JTextField txtC_ReturnProduct;
    private javax.swing.JTextField txtGrand;
    // End of variables declaration//GEN-END:variables
}
