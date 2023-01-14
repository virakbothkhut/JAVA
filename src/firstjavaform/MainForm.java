
package firstjavaform;

import Menu.MenuItem;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MainForm extends javax.swing.JFrame {

   
    public MainForm() {
        initComponents();
        
    }
    private void AddSubForm(Component NewPage)
    {
//        if (PanelBody.getComponentCount() >0){
//            Main_jPanel.remove(0);
//        }        
//        NewPage.setSize(Main_jPanel.getSize());
//        Main_jPanel.add(NewPage);
//        Main_jPanel.revalidate();
//        Main_jPanel.repaint();
        
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Main_jPanel = new javax.swing.JPanel();
        Product_jButton = new javax.swing.JButton();
        Stock_jButton = new javax.swing.JButton();
        About_jButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Selling_jButton = new javax.swing.JButton();
        Back_jButton = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Main_jPanel.setBackground(new java.awt.Color(153, 153, 153));
        Main_jPanel.setPreferredSize(new java.awt.Dimension(1095, 750));

        Product_jButton.setBackground(new java.awt.Color(51, 153, 255));
        Product_jButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Product_jButton.setForeground(new java.awt.Color(255, 255, 255));
        Product_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/new-product.png"))); // NOI18N
        Product_jButton.setText("Product");
        Product_jButton.setBorder(null);
        Product_jButton.setPreferredSize(new java.awt.Dimension(139, 51));
        Product_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_jButtonActionPerformed(evt);
            }
        });

        Stock_jButton.setBackground(new java.awt.Color(51, 153, 255));
        Stock_jButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Stock_jButton.setForeground(new java.awt.Color(255, 255, 255));
        Stock_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/product-development.png"))); // NOI18N
        Stock_jButton.setText("Stock Management");
        Stock_jButton.setBorder(null);
        Stock_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_jButtonActionPerformed(evt);
            }
        });

        About_jButton.setBackground(new java.awt.Color(51, 153, 255));
        About_jButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        About_jButton.setForeground(new java.awt.Color(255, 255, 255));
        About_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/info.png"))); // NOI18N
        About_jButton.setText("About");
        About_jButton.setBorder(null);
        About_jButton.setPreferredSize(new java.awt.Dimension(139, 51));
        About_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                About_jButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("POS SYSTEM");

        Selling_jButton.setBackground(new java.awt.Color(51, 153, 255));
        Selling_jButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Selling_jButton.setForeground(new java.awt.Color(255, 255, 255));
        Selling_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sell.png"))); // NOI18N
        Selling_jButton.setText("Selling ");
        Selling_jButton.setBorder(null);
        Selling_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selling_jButtonActionPerformed(evt);
            }
        });

        Back_jButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Back_jButton.setText("<< Back>>  ");
        Back_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Main_jPanelLayout = new javax.swing.GroupLayout(Main_jPanel);
        Main_jPanel.setLayout(Main_jPanelLayout);
        Main_jPanelLayout.setHorizontalGroup(
            Main_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Main_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Main_jPanelLayout.createSequentialGroup()
                        .addGroup(Main_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Selling_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                            .addComponent(Product_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Main_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Stock_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                            .addComponent(About_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Main_jPanelLayout.createSequentialGroup()
                        .addComponent(Back_jButton)
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 395, Short.MAX_VALUE))))
        );
        Main_jPanelLayout.setVerticalGroup(
            Main_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Main_jPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(Main_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Main_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Stock_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Selling_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Main_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(About_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addComponent(Product_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Back_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_jButtonActionPerformed
        //       Main_jPanel.remove(0);
        //       Main_jPanel.add(Stock_jButton);
        //       Main_jPanel.add(Selling_jButton);
        //       Main_jPanel.add(Product_jButton);
        //       Main_jPanel.add(About_jButton);
        //       Main_jPanel.revalidate();
        //       Main_jPanel.repaint();
    }//GEN-LAST:event_Back_jButtonActionPerformed

//  
//     private void ClearComponent()
//    {
//        while(Main_jPanel.countComponents ()>0)
//        {
//            Main_jPanel.remove(0);
//        }
//        Main_jPanel.revalidate();
//        Main_jPanel.repaint();
//    }
//          
    private void Selling_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selling_jButtonActionPerformed
        //        ClearComponent();
        //        Component NewForm = new Test_jPanelForm("Selling");
        //        NewForm.setSize(Main_jPanel.getSize());
        //        Main_jPanel.add(NewForm);
        //        Main_jPanel.revalidate();
        //        Main_jPanel.repaint();
        //           AddSubForm(new Test_jPanelForm ("Selling"));
    }//GEN-LAST:event_Selling_jButtonActionPerformed

    private void Product_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_jButtonActionPerformed
        //        ClearComponent();
        //        Component NewForm = new Test_jPanelForm("Product");
        //        NewForm.setSize(Main_jPanel.getSize());
        //        Main_jPanel.add(NewForm);
        //        Main_jPanel.revalidate();
        //        Main_jPanel.repaint();
    }//GEN-LAST:event_Product_jButtonActionPerformed

    private void About_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_About_jButtonActionPerformed
        //        ClearComponent();
        //        Component NewForm = new Test_jPanelForm("About");
        //        NewForm.setSize(Main_jPanel.getSize());
        //        Main_jPanel.add(NewForm);
        //        Main_jPanel.revalidate();
        //        Main_jPanel.repaint();
    }//GEN-LAST:event_About_jButtonActionPerformed

    private void Stock_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_jButtonActionPerformed
        //        ClearComponent();
        //        Component NewForm = new Test_jPanelForm("Stock");
        //        NewForm.setSize(Main_jPanel.getSize());
        //        Main_jPanel.add(NewForm);
        //        Main_jPanel.revalidate();
        //        Main_jPanel.repaint();
    }//GEN-LAST:event_Stock_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About_jButton;
    private javax.swing.JButton Back_jButton;
    private javax.swing.JPanel Main_jPanel;
    private javax.swing.JButton Product_jButton;
    private javax.swing.JButton Selling_jButton;
    private javax.swing.JButton Stock_jButton;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
