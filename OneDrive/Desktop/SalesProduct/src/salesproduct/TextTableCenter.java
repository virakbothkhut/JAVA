/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesproduct;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author virak
 */
public class TextTableCenter extends DefaultTableCellRenderer {
    public Component getTableRendererComponent(JTable table, Object value, boolean isSelected,boolean hasFocus, int row, int column){
    super.getTableCellRendererComponent(table, table, isSelected, hasFocus, row, column);
        setHorizontalAlignment(SwingConstants.CENTER);
 return this;
  }
}
