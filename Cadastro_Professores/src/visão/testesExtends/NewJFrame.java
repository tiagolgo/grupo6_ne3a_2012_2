/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visão.testesExtends;

import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Meus Documentos
 */
public class NewJFrame extends javax.swing.JFrame {

    private int linhaEditar;
    private boolean edita;
    private String tipoDoObj;
    private JTable tabela;
    private JPopupMenu menuPopup;
    private ArrayList<Object> jt;
    int x = 0, y = 0;

    public NewJFrame() {
        initComponents();
        jt = new ArrayList();
    }

    public void setJt(ArrayList<Object> jt) {
        this.jt = jt;
        String tipoObj = this.jt.get(0).getClass().toString();
        if (tipoObj.contains("JTextField")) {
            this.tipoDoObj = "field";
        } else if (tipoObj.contains("JComboBox")) {
            this.tipoDoObj = "combo";
        }
    }

    public void setLinhaEditar(int linhaEditar) {
        this.linhaEditar = linhaEditar;
    }

    public void setEdita(boolean edita) {
        this.edita = edita;
    }

    public void setTabela(JTable tabela) {
        this.tabela = tabela;
    }

    public void setMenuPopup(JPopupMenu menuPopup) {
        this.menuPopup = menuPopup;
    }

//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    protected void tabelaTurmaMouseReleased(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        if (evt.getButton() == 1) {
            x = evt.getX();
            y = evt.getY();
        }
        if (this.tabela.getSelectedRow() != -1 & evt.getButton() == 3) {
            this.menuPopup.show(this.tabela, x, y);
        }
    }

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    protected void okActionPerformed() {
        //        if (verificaCombos()) {
        //            if (edita) {
        //                insereAlteração();
        //            } else {
        //                preencheTabela();
        //            }
        //        }
        //        this.tabela.setFocusable(false);
        //        this.série.setSelectedIndex(0);
        //        javax.swing.table.DefaultTableModel model;
        //        model = (javax.swing.table.DefaultTableModel) this.tabela.getModel();//pegar modelo da tabela
        //        model.addRow(new Object[]{"", "", ""});//adicionar linha na tabela
        System.out.println(this.jt.get(0).getClass());
//        for (Field d: declaredFields) {
//            System.out.println(d);
//        }
        
    }

    protected void EditarActionPerformed(java.awt.event.ActionEvent evt) {
        int linha = this.tabela.getSelectedRow();
//        this.série.setSelectedItem(this.tabela.getValueAt(linha, 0));
//        this.turma.setSelectedItem(this.tabela.getValueAt(linha, 1));
//        this.turno.setSelectedItem(this.tabela.getValueAt(linha, 2));
//        this.curso.setSelectedItem(this.tabela.getValueAt(linha, 3));

        this.edita = true;
        this.linhaEditar = linha;
    }

    protected void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        javax.swing.table.DefaultTableModel model;
        model = (DefaultTableModel) this.tabela.getModel();

        model.removeRow(this.tabela.getSelectedRow());
    }

    private void okKeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
//        okActionPerformed(null);

    }

    private void preencheTabela() {
        javax.swing.table.DefaultTableModel model;
        model = (DefaultTableModel) this.tabela.getModel();//pegar modelo da tabela
        if (this.tipoDoObj.equals("combo")) {
//            model.addRow(new Object[]{this.série.getSelectedItem(), this.turma.getSelectedItem(), this.turno.getSelectedItem(), this.curso.getSelectedItem()});//adicionar linha na tabela
        } else {
        }

        limparCombos();
    }

    private void insereAlteração() {
//        this.tabela.setValueAt(this.série.getSelectedItem(), this.linhaEditar, 0);
//        this.tabela.setValueAt(this.turma.getSelectedItem(), this.linhaEditar, 1);
//        this.tabela.setValueAt(this.turno.getSelectedItem(), this.linhaEditar, 2);
//        this.tabela.setValueAt(this.curso.getSelectedItem(), this.linhaEditar, 3);

        this.edita = false;
        limparCombos();
    }

    private void limparCombos() {//por padrão os ComboBoxes devem possuir a posição 0 vazia
        for (int i = 0; i < this.jt.size(); i++) {
            switch (this.tipoDoObj) {
                case "text":
                    break;
                case "combo":
//                    this.série.setSelectedIndex(0);
                    break;
            }
        }
    }

    private boolean verificaCombos() {
//        boolean ser = this.série.getSelectedItem().equals("");
//        boolean tur = this.turma.getSelectedItem().equals("");
//        boolean turn = this.turno.getSelectedItem().equals("");
//        boolean cur = this.curso.getSelectedItem().equals("");

//        if (ser || tur || turn || cur) {
//            JOptionPane.showMessageDialog(null, "Operação não executada, há campos em branco!");
//            this.ok.transferFocus();
            return false;
//        }
//        return true;
    }

    private void desmarcaTabela() {
        int s = this.tabela.getSelectedRow();
        this.tabela.removeRowSelectionInterval(s, s);
        this.tabela.setFocusable(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
