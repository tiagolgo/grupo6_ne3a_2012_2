
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meus Documentos
 */
public class teste extends JFrame {

    public static void main(String[] args) {
        new teste().setVisible(true);

    }

    public teste() {
       
        dados();
    }

    private void dados() {
         JPanel p = new JPanel();
        
        String[] colunas = new String[]{"Nome", "Cadastro"};
        String d="222222";
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yy/MM/dd");
        String[][] dados = new String[][]{
            {"Frodo", sdf.format(d)},
            {"Sam", sdf2.format(new Date())},};
        JTable jtable = new JTable(dados, colunas);
        this.add(jtable);
        
    }
}
