import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class NewClass extends javax.swing.JFrame{

  public static void main(String args[]) {
    Object rows[][] = { { "one", "ichi - \u4E00" },
        { "two", "ni - \u4E8C" }, { "three", "san - \u4E09" },
        { "four", "shi - \u56DB" }, { "five", "go - \u4E94" },
        { "six", "roku - \u516D" }, { "seven", "shichi - \u4E03" },
        { "eight", "hachi - \u516B" }, { "nine", "kyu - \u4E5D" },
        { "ten", "ju - \u5341" } };
    Object headers[] = { "English", "Japanese" };
    JFrame frame = new JFrame("Renderer Sample");
    JTable table = new JTable(rows, headers);
    EvenOddRenderer renderer = new EvenOddRenderer();
    table.setDefaultRenderer(Object.class, renderer);
    JScrollPane scrollPane = new JScrollPane(table);
    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    frame.setSize(300, 150);
    frame.setVisible(true);
  }
}

