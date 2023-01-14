
package firstjavaform;

import java.awt.Component;
import javax.swing.JFrame;


public class Mid_Form extends javax.swing.JFrame {

   
    public Mid_Form() {
        initComponents();
        super.setExtendedState(JFrame.MAXIMIZED_BOTH);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ClosePanel_jPopupMenu = new javax.swing.JPopupMenu();
        Close_jMenuItem = new javax.swing.JMenuItem();
        CloseAll_jMenuItem = new javax.swing.JMenuItem();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        MultiForm_jTabbedPane = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        EmployeesInformation_jMenu = new javax.swing.JMenu();
        EmployeesInformation_jMenuItem = new javax.swing.JMenuItem();
        UserAccountManagement_jMenuItem = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        Close_jMenuItem.setText("Close");
        Close_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_jMenuItemActionPerformed(evt);
            }
        });
        ClosePanel_jPopupMenu.add(Close_jMenuItem);

        CloseAll_jMenuItem.setText("Edit");
        CloseAll_jMenuItem.setActionCommand("Close all");
        ClosePanel_jPopupMenu.add(CloseAll_jMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MDI_Form");

        MultiForm_jTabbedPane.setComponentPopupMenu(ClosePanel_jPopupMenu);
        jTabbedPane2.addTab("Employees", MultiForm_jTabbedPane);

        jMenuBar1.setFocusable(false);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu1.setText("File");

        jMenuItem14.setText("New file");
        jMenu1.add(jMenuItem14);

        jMenuItem15.setText("Open file");
        jMenu1.add(jMenuItem15);

        jMenuBar1.add(jMenu1);

        EmployeesInformation_jMenu.setText("HRM");

        EmployeesInformation_jMenuItem.setText("Employees Information");
        EmployeesInformation_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeesInformation_jMenuItemActionPerformed(evt);
            }
        });
        EmployeesInformation_jMenu.add(EmployeesInformation_jMenuItem);

        UserAccountManagement_jMenuItem.setText("User Accountant Managment");
        UserAccountManagement_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserAccountManagement_jMenuItemActionPerformed(evt);
            }
        });
        EmployeesInformation_jMenu.add(UserAccountManagement_jMenuItem);

        jMenuItem3.setText("Student Information");
        EmployeesInformation_jMenu.add(jMenuItem3);

        jMenuBar1.add(EmployeesInformation_jMenu);

        jMenu3.setText("Study");

        jMenuItem4.setText("Student Information");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Class Management");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Class Exam");
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Report");

        jMenuItem7.setText("Employee");
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Class");
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Student");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Exam ");
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("About");

        jMenuItem11.setText("System Development");
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Project ");
        jMenu5.add(jMenuItem12);

        jMenuItem13.setText("Help");
        jMenu5.add(jMenuItem13);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeesInformation_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeesInformation_jMenuItemActionPerformed
        MultiForm_jTabbedPane.add("Employee Information",
                new New_Test_JPanelForm ("Employees Information", "Employees Information"));
    }//GEN-LAST:event_EmployeesInformation_jMenuItemActionPerformed

    private void UserAccountManagement_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserAccountManagement_jMenuItemActionPerformed
         MultiForm_jTabbedPane.add("User Account Management",
                new New_Test_JPanelForm ("User Account Managemen", "User Account Managemen"));
      
    }//GEN-LAST:event_UserAccountManagement_jMenuItemActionPerformed

    private void Close_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_jMenuItemActionPerformed
    
      if (MultiForm_jTabbedPane.getComponentCount()>0)
      {
            MultiForm_jTabbedPane.remove(MultiForm_jTabbedPane.getSelectedIndex());
      }
    }//GEN-LAST:event_Close_jMenuItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CloseAll_jMenuItem;
    private javax.swing.JPopupMenu ClosePanel_jPopupMenu;
    private javax.swing.JMenuItem Close_jMenuItem;
    private javax.swing.JMenu EmployeesInformation_jMenu;
    private javax.swing.JMenuItem EmployeesInformation_jMenuItem;
    private javax.swing.JTabbedPane MultiForm_jTabbedPane;
    private javax.swing.JMenuItem UserAccountManagement_jMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
