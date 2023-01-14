
package firstjavaform;

import java.awt.Font;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class ProductSelling extends javax.swing.JFrame {
    public static double Payment;
    public static double Price;
    public static double QTY;
    public static double Discount;
    
    private ArrayList <ProductInfo> ProductList = new ArrayList<>();
    
    public ProductSelling() {
        initComponents();
      
        ProductList.add(new ProductInfo("001","Mojito",10.5 ));
        ProductList.add(new ProductInfo("002","Whisky Sour",5.6 ));
        ProductList.add(new ProductInfo("003","Daiguiri",7.2));
        ProductList.add(new ProductInfo("004","Margarita",8.7 ));
        ProductList.add(new ProductInfo("005","Mai tai",9.8 ));
        ProductList.add(new ProductInfo("006","Bloody Mary",12.2 ));
        ProductList.add(new ProductInfo("007","Manhattan",20.9 ));
        ProductList.add(new ProductInfo("008","Vodka",14.5 ));
        ProductList.add(new ProductInfo("009","Tequilla",15.2 ));
        ProductList.add(new ProductInfo("010","Champagn",18.9));
        ProductList.add(new ProductInfo("011","Prosecco",5.5 ));
        ProductList.add(new ProductInfo("012","Asahi",6.5 ));
        
        for (ProductInfo productInfo : ProductList) {
            ProductID_jComboBox.addItem(productInfo.getCode());   
        }
        ClearInput();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Product_jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ProductID_jComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        QTY_jSpinner = new javax.swing.JSpinner();
        Payment_jTextField = new javax.swing.JTextField();
        Add_jButton = new javax.swing.JButton();
        Remove_jButton = new javax.swing.JButton();
        Clear_jButton = new javax.swing.JButton();
        Update_jButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Price_jTextField = new javax.swing.JTextField();
        ProductName_jTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Discount_jSpinner = new javax.swing.JSpinner();
        Amount_jTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setEnabled(false);

        Product_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID ", "Product Name", "QTY", "Unit Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Product_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Product_jTable);
        if (Product_jTable.getColumnModel().getColumnCount() > 0) {
            Product_jTable.getColumnModel().getColumn(0).setResizable(false);
            Product_jTable.getColumnModel().getColumn(1).setResizable(false);
            Product_jTable.getColumnModel().getColumn(2).setResizable(false);
            Product_jTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("ProductID");

        ProductID_jComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ProductID_jComboBox.setEnabled(false);
        ProductID_jComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ProductID_jComboBoxItemStateChanged(evt);
            }
        });
        ProductID_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductID_jComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Product Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("QTY");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Price");

        QTY_jSpinner.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        QTY_jSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 0, 100, 1));
        QTY_jSpinner.setToolTipText("");
        QTY_jSpinner.setName(""); // NOI18N

        Payment_jTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Payment_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Payment_jTextField.setText("0");

        Add_jButton.setText("Add");
        Add_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_jButtonActionPerformed(evt);
            }
        });

        Remove_jButton.setText("Remove");
        Remove_jButton.setEnabled(false);
        Remove_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_jButtonActionPerformed(evt);
            }
        });

        Clear_jButton.setText("Clear");

        Update_jButton.setText("Update");
        Update_jButton.setEnabled(false);
        Update_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_jButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Payment");

        Price_jTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Price_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        ProductName_jTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Discount");

        Discount_jSpinner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Discount_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        Discount_jSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Discount_jSpinnerStateChanged(evt);
            }
        });

        Amount_jTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Amount");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProductID_jComboBox, 0, 226, Short.MAX_VALUE)
                    .addComponent(ProductName_jTextField))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(QTY_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(Price_jTextField))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Payment_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(Amount_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Discount_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Remove_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Update_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Clear_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ProductID_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(Add_jButton)
                        .addComponent(Update_jButton)
                        .addComponent(jLabel4)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Payment_jTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Amount_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(QTY_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(ProductName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(Remove_jButton)
                        .addComponent(Clear_jButton)
                        .addComponent(Price_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(Discount_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1218, 839));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt){
        super.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
   
    private void Add_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_jButtonActionPerformed
        int spinner = Integer.valueOf(QTY_jSpinner.getValue().toString());
        
        if (spinner == 0 || spinner < 0)
       {
           UIManager.put("OptionPane.messageFont",new Font("Times New Roman", Font.BOLD, 15));
           JOptionPane.showMessageDialog(null, "Quantity can not be Zero or Negative values.  Please select the QTY number", "Message", JOptionPane.WARNING_MESSAGE);
           return;
       }
        
        DecimalFormat nf = new DecimalFormat("0.00");
        DefaultTableModel model = ( DefaultTableModel) Product_jTable.getModel();
        model.addRow(new Object[]
                
        {
            ProductID_jComboBox.getSelectedItem().toString(), 
            ProductName_jTextField.getText(),
            QTY_jSpinner.getValue().toString(),
            Price_jTextField.getText()
        });
        
      
        Payment = Double.parseDouble(Payment_jTextField.getText());
        QTY = Double.parseDouble(QTY_jSpinner.getValue().toString());
        Price = Double.parseDouble(Price_jTextField.getText());
        Payment += QTY * Price;
        Payment_jTextField.setText(nf.format(Payment )+ "");
        Amount_jTextField.setText(nf.format(Payment)+ "");
      
        ClearInput(); 
    }//GEN-LAST:event_Add_jButtonActionPerformed
    
    
    private void ClearInput(){
        ProductID_jComboBox.setSelectedIndex(-1);
        ProductName_jTextField.setText("");
        QTY_jSpinner.setValue(0);
        Price_jTextField.setText("");
        Update_jButton.setEnabled(false);
        Remove_jButton.setEnabled(false);
        Add_jButton.setEnabled(true);
        ProductID_jComboBox.setEnabled(true);
    }
    
    
    private void ProductID_jComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ProductID_jComboBoxItemStateChanged
        if (ProductID_jComboBox.getSelectedIndex() >= 0)
        {
            ProductName_jTextField.setText(ProductList.get(ProductID_jComboBox.getSelectedIndex()).getName());
            Price_jTextField.setText(ProductList.get(ProductID_jComboBox.getSelectedIndex()).getPrice() + "");
        }
    }//GEN-LAST:event_ProductID_jComboBoxItemStateChanged

    private void Discount_jSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Discount_jSpinnerStateChanged
  
       Double Amount = Double.parseDouble(Amount_jTextField.getText());
       Discount = Double.parseDouble(Discount_jSpinner.getValue().toString());
       Amount = Amount - (Amount * Discount / 100);
       DecimalFormat nf = new DecimalFormat("0.00");
       Payment_jTextField.setText(nf.format(Amount )+ "");
      
    }//GEN-LAST:event_Discount_jSpinnerStateChanged
    
    
    private void Product_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_jTableMouseClicked
        DefaultTableModel model = ( DefaultTableModel) Product_jTable.getModel();
        
        
        ProductID_jComboBox.setSelectedItem(
        model.getValueAt(Product_jTable.getSelectedRow(),0));
        
        ProductName_jTextField.setText(
        model.getValueAt(Product_jTable.getSelectedRow(),1) + "");
        
        QTY_jSpinner.setValue(new Integer(model.getValueAt(Product_jTable.getSelectedRow(),2)+ ""));
        Price_jTextField.setText(
        model.getValueAt(Product_jTable.getSelectedRow(),3) + "");
        
        Update_jButton.setEnabled(true);
        Remove_jButton.setEnabled(true);
        Add_jButton.setEnabled(false);
        ProductID_jComboBox.setEnabled(false);
        
        QTY = Double.parseDouble(QTY_jSpinner.getValue().toString());
        Price = Double.parseDouble(Price_jTextField.getText());
        
    }//GEN-LAST:event_Product_jTableMouseClicked

    private void Update_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_jButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) Product_jTable.getModel();
        double Amount = Double.parseDouble(Amount_jTextField.getText());
        double OldTotal = this.QTY * this.Price;
        
        QTY = Double.parseDouble(QTY_jSpinner.getValue().toString());
        Price = Double.parseDouble(Price_jTextField.getText());
        
        if (OldTotal > (QTY * Price))
        {
          Amount -= OldTotal;
          Amount += (QTY * Price);
        }else if (OldTotal > (QTY * Price))
        {
         Amount  -= (OldTotal - (QTY * Price));         
        }
        Amount_jTextField.setText(Amount + "");
        Discount = Double.parseDouble(Discount_jSpinner.getValue().toString());
        Amount = (Amount * Discount /100);
        DecimalFormat nf  = new DecimalFormat("0.00");
        Payment_jTextField.setText(nf.format(Amount) + "");
        model.setValueAt(QTY, Product_jTable.getSelectedRow(),2);
        ClearInput();
    }//GEN-LAST:event_Update_jButtonActionPerformed

    private void Remove_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_jButtonActionPerformed
        double Amount = Double.parseDouble(Amount_jTextField.getText());
        double OldTotal = this.QTY * this.Price;
        Amount -= OldTotal;
        Amount_jTextField.setText(Amount + "");
        
        double Discount = Double.parseDouble(Discount_jSpinner.getValue().toString());
        Amount = Amount - (Amount * Discount / 100);
        DecimalFormat  nf = new DecimalFormat("0.00");
        Payment_jTextField.setText(nf.format(Amount) + "");
        ClearInput();
        
        DefaultTableModel model = (DefaultTableModel)Product_jTable.getModel();
        model.removeRow(Product_jTable.getSelectedRow());   
    }//GEN-LAST:event_Remove_jButtonActionPerformed

    private void ProductID_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductID_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductID_jComboBoxActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductSelling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_jButton;
    private javax.swing.JTextField Amount_jTextField;
    private javax.swing.JButton Clear_jButton;
    private javax.swing.JSpinner Discount_jSpinner;
    private javax.swing.JTextField Payment_jTextField;
    private javax.swing.JTextField Price_jTextField;
    private javax.swing.JComboBox<String> ProductID_jComboBox;
    private javax.swing.JTextField ProductName_jTextField;
    private javax.swing.JTable Product_jTable;
    private javax.swing.JSpinner QTY_jSpinner;
    private javax.swing.JButton Remove_jButton;
    private javax.swing.JButton Update_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
