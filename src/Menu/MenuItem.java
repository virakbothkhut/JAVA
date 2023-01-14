package Menu;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MenuItem extends javax.swing.JPanel {

    public ArrayList<MenuItem> getSubMenu() {
        return subMenu;
    }

    public boolean isShowing(){
        return showing;
    }
            
    
    private final ArrayList<MenuItem> subMenu = new ArrayList<>();
    private ActionListener act;
    
    public MenuItem(Icon icon, String menuName, ActionListener act, MenuItem... subMenu) {
        initComponents();
        IbIcon.setIcon(icon);
        IbName.setText(menuName);
        if (act != null) {
            this.act = act;
        }
        
        this.setSize(new Dimension(Integer.MAX_VALUE, 55));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 55));
        this.setMinimumSize(new Dimension(Integer.MIN_VALUE, 55));

        for (int i = 0; i < subMenu.length; i++) {
            this.subMenu.add(subMenu[i]);
            subMenu[i].setVisible(false);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        IbIcon = new javax.swing.JLabel();
        IbName = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        IbName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IbName.setText("Menu name here......");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IbName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IbName, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(IbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean showing = false;

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (isShowing()) {
            hideMenu();
            setShowing(false);
        } else {
            showMenu();
        }
        if(act != null) {
            act.actionPerformed(null);
        }
    }//GEN-LAST:event_formMousePressed

    private void showMenu() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < subMenu.size(); i++) {
                    subMenu.get(i).setVisible(true);
                }
                showing= true;
                getParent().repaint();
                getParent().revalidate();
            }

        }).start();
    }

    private void hideMenu() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                
                for (int i = subMenu.size()-1; i >= 0; i--) {
                    sleep();
                    subMenu.get(i).setVisible(false);
                    subMenu.get(i).hideMenu();
                   
                }
                showing = false;
                getParent().repaint();
                getParent().revalidate();
            }
        }).start();
    }

    private void sleep() {
        try {
            Thread.sleep(20);
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IbIcon;
    private javax.swing.JLabel IbName;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public void setShowing(boolean showing) {
        this.showing = showing;
    }
}
