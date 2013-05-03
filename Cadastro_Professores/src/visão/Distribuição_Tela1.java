/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import Hibernate_Daos.Dao_Disciplina;
import Hibernate_Daos.Dao_Professor;
import Hibernate_Daos.Dao_Suprimento;
import Sessão.Sessão;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import modelo.Pessoa.Professor;
import modelo.Suprimento;
import modelo.curricular.Disciplina;
import org.hibernate.Session;

/**
 *
 * @author Meus Documentos
 */
public class Distribuição_Tela1 extends javax.swing.JFrame {

    private Professor professor;
    private List<Disciplina> disc_Suprimento;
    private Session sessão;
    private Suprimento supri;
    private List<Disciplina> disciplinas;

    public Distribuição_Tela1() {
        initComponents();
        this.sessão = new Sessão().retornaSession();
        configuraTabela();
        carregarTabela();
        this.disc_Suprimento = new ArrayList();
        this.professor = new Professor();
        carrega_NomeProfessores();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Distribuição = new javax.swing.JTable();
        cancelar = new javax.swing.JButton();
        inserir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        combo_Professor = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        data_Início = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setToolTipText("Grade");
        jPanel1.setName("Grade"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("DISTRIBUIÇÃO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tabela_Distribuição.setAutoCreateRowSorter(true);
        tabela_Distribuição.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Disciplina", "CH", "Turma", "Curso", "Turno", "Atribuir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_Distribuição.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabela_Distribuição.setRowHeight(25);
        jScrollPane1.setViewportView(tabela_Distribuição);

        cancelar.setBackground(new java.awt.Color(255, 255, 102));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        inserir.setBackground(new java.awt.Color(1, 176, 14));
        inserir.setText("Inserir");
        inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirActionPerformed(evt);
            }
        });

        jLabel2.setText("* Professor:");

        combo_Professor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        combo_Professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_ProfessorActionPerformed(evt);
            }
        });

        jLabel3.setText("* Data de início:");

        try {
            data_Início.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_Professor, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(data_Início, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo_Professor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(data_Início, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Grade");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirActionPerformed

        this.supri = new Suprimento();

        atribuirDisciplinas();

//        supri.setData();
        this.supri.setDataAssumiu(this.data_Início.getText().replaceAll("/", ""));
        this.supri.setProfessor(this.professor);

        Dao_Suprimento ds = new Dao_Suprimento(this.sessão);
        try {
            ds.persiste(this.supri);
            excluiLinhas();
        } catch (Exception ex) {
            Logger.getLogger(Distribuição_Tela1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
    }//GEN-LAST:event_inserirActionPerformed

    private boolean verificaDisciplinas(List<Disciplina> d) {
        if (d.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Suprimento Inválido!\nNão há disciplinas selecionadas!");
            return false;
        }
        return true;
    }

     private void excluiLinhas() {
        DefaultTableModel model = (DefaultTableModel) this.tabela_Distribuição.getModel();

        int rowCount = this.tabela_Distribuição.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Object valueAt = this.tabela_Distribuição.getValueAt(i, 6);
            if (valueAt == true) {
                model.removeRow(i);
                i = 0;
                rowCount -= 1;
            }
        }
    }

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void combo_ProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_ProfessorActionPerformed
        Dao_Professor dp = new Dao_Professor(this.sessão);
        String prof = this.combo_Professor.getSelectedItem().toString();
        Professor p = dp.consultaNome(prof);
        if (p != null) {
            this.professor = p;
        }
    }//GEN-LAST:event_combo_ProfessorActionPerformed

    private void atribuirDisciplinas() {
        int linhas = this.tabela_Distribuição.getRowCount();

        for (int i = 0; i < linhas; i++) {
            if (this.tabela_Distribuição.getValueAt(i, 6) == true) {
                int id = Integer.parseInt(this.tabela_Distribuição.getValueAt(i, 0).toString());
                for (Disciplina d : this.disciplinas) {//percorrer vetor de disciplinas
                    if (d.getId() == id) {
                        this.professor.setDisciplina(d);
                        this.supri.setDisciplina(d);
                        d.setAtribuida(true);
//                        removeLinha();
                        break;
                    }
                }
            }
        }
    }

    private void carregarTabela() {//carregar tabela com disciplinas não distribuídas
        Dao_Disciplina dd = new Dao_Disciplina(this.sessão);
        this.disciplinas = dd.get_DisciplinaAtribuida(false);

        if (!this.disciplinas.isEmpty()) {
            for (Disciplina d : this.disciplinas) {
                int id = d.getId();
                String disciplina = d.getCodigo() + " - " + d.getNome();
                int cargaHorária = d.getCargaHorária();
                String turma = d.getTurma().getSerie() + "º" + d.getTurma().getSeriacao();
                String curso = d.getTurma().getCurso().getNome();
                String turno = d.getTurma().getTurno();

                DefaultTableModel model = (javax.swing.table.DefaultTableModel) this.tabela_Distribuição.getModel();
                model.addRow(new Object[]{id, disciplina, cargaHorária, turma, curso, turno, false});
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há disciplinas a serem distribuidas!");
        }
    }

    private void carrega_NomeProfessores() {
        Dao_Professor dp = new Dao_Professor(this.sessão); //arrumar sessão "null"
        List retornaObjetos = dp.listaNomes();//retornar nomes de professores

        if (!retornaObjetos.isEmpty()) {
            this.disc_Suprimento = retornaObjetos;
            for (Object p : retornaObjetos) {
                this.combo_Professor.addItem(p);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Atenção!!!\nNão há Professores cadastrados!\n");
        }
    }

    private void configuraTabela() {
        TableColumnModel columnModel = this.tabela_Distribuição.getColumnModel();
        columnModel.getColumn(0).setMinWidth(80);
        columnModel.getColumn(1).setMinWidth(190);
        columnModel.getColumn(2).setMaxWidth(50);
        columnModel.getColumn(3).setMinWidth(40);
        columnModel.getColumn(4).setMinWidth(70);
        columnModel.getColumn(5).setMinWidth(70);
        columnModel.getColumn(6).setMinWidth(80);
    }

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
            java.util.logging.Logger.getLogger(Distribuição_Tela1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Distribuição_Tela1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Distribuição_Tela1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Distribuição_Tela1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Distribuição_Tela1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox combo_Professor;
    private javax.swing.JFormattedTextField data_Início;
    private javax.swing.JButton inserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_Distribuição;
    // End of variables declaration//GEN-END:variables
}
