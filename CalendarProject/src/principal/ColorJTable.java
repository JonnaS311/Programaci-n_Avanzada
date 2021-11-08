package principal;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorJTable extends DefaultTableCellRenderer
{   
    
    @Override
   public Component getTableCellRendererComponent(JTable table,
      Object value,
      boolean isSelected,
      boolean hasFocus,
      int row,
      int column)
   {
      JLabel cell = (JLabel) super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
      //colorear columna domingo
      if (column==0 ){
        
         cell.setOpaque(true);
         cell.setBackground(new Color(121,162,242));
         cell.setFont(new Font("Dialog", Font.BOLD, 14));
         cell.setVerticalAlignment(SwingConstants.CENTER);
         cell.setHorizontalAlignment(SwingConstants.CENTER);
         cell.setForeground(Color.WHITE);                
      } else {
         cell.setOpaque(true);
         cell.setBackground(Color.WHITE);
         cell.setForeground(Color.BLACK);
      }
      return cell;
   }
}
