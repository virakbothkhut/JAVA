
package firstjavaform;

import Menu.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test_jPanelForm extends javax.swing.JFrame implements ActionListener{
        

    public Test_jPanelForm() {
        initComponents();
        executed();
    }
//      public Test_jPanelForm(String PageName, String Name) {
//        initComponents();
//        Text_jLabel.setText(PageName);
//        super.setName(Name);
//    }

        private void executed ()
    {
        ImageIcon iconSell = new ImageIcon(getClass().getResource("/Logo/Sell.png"));
        ImageIcon iconStock = new ImageIcon(getClass().getResource("/Logo/Stock.png"));
        ImageIcon iconOrder= new ImageIcon(getClass().getResource("/Logo/order.png"));
        ImageIcon iconManage = new ImageIcon(getClass().getResource("/Logo/manage.png"));
        ImageIcon iconAbout = new ImageIcon(getClass().getResource("/Logo/about.png"));
        ImageIcon iconNavi = new  ImageIcon(getClass().getResource("/Logo/navi.png"));
        ImageIcon iconPlus= new ImageIcon(getClass().getResource("/logo/plus.png"));
        
        // create subMenu sell
        
        MenuItem menuSell1 = new MenuItem(iconNavi, "Lorem ipsum dolor sit amet", null);
        MenuItem menuSell2 = new MenuItem(iconNavi, "Lorem ipsum dolor sit amet", null);
        MenuItem menuSell3 = new MenuItem(iconNavi, "Lorem ipsum dolor sit amet", null);

        
        // create subMenu Product
        
        MenuItem menuProduct1= new MenuItem(iconNavi, "Ut ac nibh nibh. Vestibulum ", null);
        MenuItem menuProduct2 = new MenuItem(iconNavi, "Ut ac nibh nibh. Vestibulum ",null);
        MenuItem menuProduct3= new MenuItem(iconNavi, "Ut ac nibh nibh. Vestibulum ", null);
        
        
        // create subMenu Order
        MenuItem menuOrder1= new MenuItem(iconNavi, "Aliquam ut aliquam urna",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               PanelBody_JPaneForm.add(new NewJPanel());
               PanelBody_JPaneForm.repaint();
               PanelBody_JPaneForm.revalidate();
            }
        });
        MenuItem menuOrder2 = new MenuItem(iconNavi, "Aliquam ut aliquam urna",null);
        MenuItem menuOrder3= new MenuItem(iconNavi, "Aliquam ut aliquam urna",null);
        
        // create subMenu About
        MenuItem menuManage1= new MenuItem(iconNavi, "Donec ut elit vitae nibh commodo",null);
        MenuItem menuManage2 = new MenuItem(iconNavi, "Donec ut elit vitae nibh commodo",null);
        MenuItem menuManage3= new MenuItem(iconNavi, "Donec ut elit vitae nibh commodo",null);
        
        
       // create subMenu About q    
        MenuItem menuAbout1 = new MenuItem(iconNavi, "Decision Status",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               PanelBody_JPaneForm.add(new NewJPanel());
               PanelBody_JPaneForm.repaint();
               PanelBody_JPaneForm.revalidate();
            }
        });
        MenuItem menuAbout2 = new MenuItem(iconNavi, "How is the business?",null);
        MenuItem menuAbout4 = new MenuItem(iconNavi, "Who are we?",null);
        MenuItem menuAbout5 = new MenuItem(iconNavi, "Contacts",null);
        MenuItem menuAbout6 = new MenuItem(iconNavi, "Events",null);
        
        MenuItem menuAddit = new MenuItem(iconPlus, "Additional Information",null, menuAbout4,menuAbout5,menuAbout6);
        
        
    
        MenuItem menuSell= new MenuItem(iconSell, "Selling",null, menuSell1, menuSell2, menuSell3);
        MenuItem menuStock = new MenuItem(iconStock, "Stock",null, menuProduct1, menuProduct2, menuProduct3);
        MenuItem menuOrder = new MenuItem(iconOrder, "Order", null, menuOrder1, menuOrder2, menuOrder3);
        MenuItem menuManage= new MenuItem(iconManage, "System Management",null,menuManage1, menuManage2, menuManage3);
        MenuItem menuAbout= new MenuItem(iconAbout, "About",null, menuAbout1,menuAbout2, menuAddit);
        
           addMenu(menuSell,menuStock,menuOrder, menuManage, menuAbout);
    }
        
      
      private void addMenu(MenuItem...menu)
      {
         for (int i = 0; i < menu.length; i++){
             menus.add(menu[i]);
             ArrayList<MenuItem>subMenu = menu[i].getSubMenu();
             
             for (MenuItem m: subMenu) {
                 addMenu(m);
             }
         }
         menus.revalidate();
      }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        PanelHeader = new javax.swing.JPanel();
        Show_jLabel = new javax.swing.JLabel();
        PanelMenu_jPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        PanelBody_JPaneForm = new javax.swing.JPanel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelHeader.setBackground(new java.awt.Color(0, 153, 255));

        Show_jLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Show_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Show_jLabel.setText("POINT OF SALES - SYSTEM");

        javax.swing.GroupLayout PanelHeaderLayout = new javax.swing.GroupLayout(PanelHeader);
        PanelHeader.setLayout(PanelHeaderLayout);
        PanelHeaderLayout.setHorizontalGroup(
            PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHeaderLayout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(Show_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(414, Short.MAX_VALUE))
        );
        PanelHeaderLayout.setVerticalGroup(
            PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHeaderLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(Show_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(PanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 70));

        PanelMenu_jPanel.setBackground(new java.awt.Color(204, 204, 204));

        menus.setBackground(new java.awt.Color(255, 255, 255));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout PanelMenu_jPanelLayout = new javax.swing.GroupLayout(PanelMenu_jPanel);
        PanelMenu_jPanel.setLayout(PanelMenu_jPanelLayout);
        PanelMenu_jPanelLayout.setHorizontalGroup(
            PanelMenu_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        PanelMenu_jPanelLayout.setVerticalGroup(
            PanelMenu_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        getContentPane().add(PanelMenu_jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 340, 680));

        PanelBody_JPaneForm.setBackground(new java.awt.Color(255, 255, 255));
        PanelBody_JPaneForm.setLayout(new javax.swing.BoxLayout(PanelBody_JPaneForm, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(PanelBody_JPaneForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 750, 680));

        setSize(new java.awt.Dimension(1107, 789));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test_jPanelForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBody_JPaneForm;
    private javax.swing.JPanel PanelHeader;
    private javax.swing.JPanel PanelMenu_jPanel;
    private javax.swing.JLabel Show_jLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menus;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");
    }
}
