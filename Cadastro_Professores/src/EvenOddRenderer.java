
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

class EvenOddRenderer implements TableCellRenderer {

    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,boolean isSelected, boolean hasFocus, int row, int column) {
        Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//        ((JLabel) renderer).setOpaque(true);
        Color foreground, background;
        if (table.getValueAt(0,0)==" ") {
            background=Color.blue;
            foreground=Color.PINK;
        }else{
            background=Color.yellow;
            foreground=Color.LIGHT_GRAY;
            }
        //        if(isSelected) {
//            foreground = Color.black;
//            background = Color.green;
//        } 
//        else {
//            if (row % 2 != 0) {
//                foreground = Color.white;
//                background = Color.green;
//            } else {
//                foreground = Color.blue;
//                background = Color.white;
//            }
//        }
        renderer.setForeground(foreground);
        renderer.setBackground(background);
        return renderer;
    }

  
}