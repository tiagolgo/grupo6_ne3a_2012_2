/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visão.Turma;

import Hibernate_Daos.Dao_Curso;
import Hibernate_Daos.Dao_Turma;
import Sessão.Sessão;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.curricular.Curso;
import modelo.curricular.Disciplina;
import modelo.curricular.Turma;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Inserir_Disciplina extends javax.swing.JFrame {

    private Session sessão;
    private List<Turma> listTurmas;
    private Turma turma;

    public Inserir_Disciplina() {
        initComponents();
        this.sessão = new Sessão().retornaSession();
        preencheComboCurso();
        this.listTurmas = new ArrayList();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPopup = new javax.swing.JPopupMenu();
        Editar = new javax.swing.JMenuItem();
        Excluir = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Grade = new javax.swing.JTable();
        sair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        select_Turma = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        select_Curso = new javax.swing.JComboBox();
        Salvar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        código = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        disciplina = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comp_Curricular = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        carga_Horária = new javax.swing.JTextField();
        insere_Disciplina = new javax.swing.JButton();

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        menuPopup.add(Editar);

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        menuPopup.add(Excluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INSERIR DISCIPLINA");

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
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tabela_Grade.setAutoCreateRowSorter(true);
        tabela_Grade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Disciplina", "Comp. Curricular", "Carga Horária"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_Grade.setRowHeight(20);
        tabela_Grade.setRowMargin(2);
        tabela_Grade.setSurrendersFocusOnKeystroke(true);
        tabela_Grade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabela_GradeMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_Grade);

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Disciplinas da Série");
        jLabel6.setAlignmentX(0.5F);
        jLabel6.setAutoscrolls(true);
        jLabel6.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("Obs: Selecione a grade e clique com botão direito do mouse para Editá-la ou Excluí-la.");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Turma:");

        select_Turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_TurmaActionPerformed(evt);
            }
        });

        jLabel3.setText("Curso:");

        select_Curso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        select_Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_CursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(select_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(select_Turma, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(select_Turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        jLabel8.setText("Código:");

        jLabel9.setText("Disciplina:");

        jLabel10.setText("Comp. Curricular:");

        comp_Curricular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "BNC", "PD" }));

        jLabel11.setText("CH:");

        insere_Disciplina.setBackground(new java.awt.Color(0, 153, 51));
        insere_Disciplina.setText("Adicionar");
        insere_Disciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insere_DisciplinaActionPerformed(evt);
            }
        });
        insere_Disciplina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                insere_DisciplinaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(código, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comp_Curricular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carga_Horária, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(insere_Disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(código, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(comp_Curricular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(carga_Horária, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insere_Disciplina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addGap(18, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Salvar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //adiciona preenche a tabela de disciplina
    private void insere_DisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insere_DisciplinaActionPerformed
        DefaultTableModel model;
        if (verificaCampos()) {
            int cod = Integer.parseInt(this.código.getText());
            String disc = this.disciplina.getText();
            String comp_Curric = this.comp_Curricular.getSelectedItem().toString();
            int cargaHoraria = Integer.parseInt(this.carga_Horária.getText());

            model = (DefaultTableModel) this.tabela_Grade.getModel();

            model.addRow(new Object[]{
                cod,
                disc,
                comp_Curric,
                cargaHoraria});

            novaDisciplina(cod, disc, comp_Curric, cargaHoraria);
            limpaCampos();
            this.código.requestFocusInWindow();
        }
    }//GEN-LAST:event_insere_DisciplinaActionPerformed

    private void removeLinhasTabela() {
        DefaultTableModel model = (DefaultTableModel) this.tabela_Grade.getModel();
        int linhas = this.tabela_Grade.getRowCount();

        for (int i = 0; i < linhas; i++) {
            model.removeRow(0);
        }
    }

    private void novaDisciplina(int cod, String disc, String compCur, int ch) {
        int linhas = this.tabela_Grade.getRowCount();

        Disciplina aux = new Disciplina();

        aux.setCodigo(cod);
        aux.setNome(disc);
        aux.setCompCurricular(compCur);
        aux.setCargaHorária(ch);

        aux.setTurma(turma);
        this.turma.setDisciplina(aux);
    }

    private void preencheComboCurso() {
        List<Curso> cursos;

        Dao_Curso dc = new Dao_Curso(this.sessão);
        cursos = dc.todos();

        if (!(cursos.isEmpty())) {
            for (Curso c : cursos) {
                this.select_Curso.addItem(c.getNome());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há Cursos cadastrados!\nCadastrar Curso?");
        }
    }

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.sessão.close();
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void insere_DisciplinaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insere_DisciplinaKeyReleased
        insere_DisciplinaActionPerformed(null);
    }//GEN-LAST:event_insere_DisciplinaKeyReleased
    int x = 0, y = 0;//coordenadas para mostrar o menu popup na linha selecionada com botão direito
    private void tabela_GradeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_GradeMouseReleased
        if (evt.getButton() == 1) {
            x = evt.getX();
            y = evt.getY();
        } else if (this.tabela_Grade.getSelectedRow() != -1 & evt.getButton() == 3) {
            this.menuPopup.show(this.tabela_Grade, x, y);
        }
    }//GEN-LAST:event_tabela_GradeMouseReleased

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        desmarcaTabela();
    }//GEN-LAST:event_EditarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        desmarcaTabela();
    }//GEN-LAST:event_ExcluirActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        if (validaInserçãoDeTurma()) {
            Dao_Turma dt = new Dao_Turma(this.sessão);

            try {
                Transaction tr = this.sessão.beginTransaction();
                dt.persiste(this.turma);
                tr.commit();
                confirma_NovoAfastamento();
            } catch (HibernateException | HeadlessException ex) {
                this.sessão.beginTransaction().rollback();
                Logger.getLogger(Inserir_Disciplina.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                removeLinhasTabela();
            }
        }
    }//GEN-LAST:event_SalvarActionPerformed

    private void confirma_NovoAfastamento() {
        int opção = JOptionPane.showConfirmDialog(
                null, "Disciplina(s) Inserido!\nDeseja realizar nova Inserção?", "Confirmação", 0);
        if (opção == 0) {
        } else {//fecha se o usuário não quiser realizar novo cancelamento
            this.dispose();
        }
    }
    //preenche o combo de turmas após seleção do curso
    private void select_CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_CursoActionPerformed
        Dao_Turma dt = new Dao_Turma(this.sessão);
        List<Turma> turmas = dt.turma_NomeCurso(this.select_Curso.getSelectedItem().toString());

        this.select_Turma.removeAllItems();

        if (!turmas.isEmpty()) {
            this.listTurmas = turmas;
            this.select_Turma.addItem(" ");

            for (Turma t : turmas) {
                this.select_Turma.addItem(t.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há turmas cadastradas para o Curso!");
        }
    }//GEN-LAST:event_select_CursoActionPerformed

    private void select_TurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_TurmaActionPerformed
        // TODO add your handling code here:
        String turmaCombo = this.select_Turma.getSelectedItem().toString();

        for (Turma t : this.listTurmas) {
            if (t.toString().equals(turmaCombo)) {
                this.turma = t;
                break;
            }
        }
    }//GEN-LAST:event_select_TurmaActionPerformed

    private boolean validaInserçãoDeTurma() {
        String Turma = this.select_Turma.getSelectedItem().toString();
        String curso = this.select_Curso.getSelectedItem().toString();

        if (Turma.equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione a Turma!");
        } else if (curso.equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione o Curso!");
        } else {
            int confirma = JOptionPane.showConfirmDialog(
                    null, "Confirma a inclusão da Disciplina para:\n"
                    + "Serie: " + Turma
                    + "\nCurso: " + curso);
            if (confirma == 0) {
                return true;
            }
        }
        return false;
    }

    private void desmarcaTabela() {
        int l = this.tabela_Grade.getSelectedRow();
        this.tabela_Grade.removeRowSelectionInterval(l, l);
        this.tabela_Grade.setFocusable(false);
    }

    private void limpaCampos() {
        this.código.setText(null);
        this.disciplina.setText(null);
        this.comp_Curricular.setSelectedIndex(0);
        this.carga_Horária.setText(null);
    }

    private boolean verificaCampos() {
        String d = this.código.getText();
        String s = this.disciplina.getText();
        Object sItem = this.comp_Curricular.getSelectedItem();
        String c = this.carga_Horária.getText();

        if (d.equals("") || d.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Informe o Código da Disciplina!");
            return false;
        } else if (s.equals("") || s.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Informe o Nome da Disciplina!");
            return false;
        } else if (sItem == null) {
            JOptionPane.showMessageDialog(null, "Selecione a Complementação Curricular!");
        } else if (c.equals("") || c.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Informe a Carga Horária!");
//            this.insere_Disciplina.transferFocus();
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(Inserir_Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inserir_Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inserir_Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inserir_Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inserir_Disciplina().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Editar;
    private javax.swing.JMenuItem Excluir;
    private javax.swing.JButton Salvar;
    private javax.swing.JTextField carga_Horária;
    private javax.swing.JComboBox comp_Curricular;
    private javax.swing.JTextField código;
    private javax.swing.JTextField disciplina;
    private javax.swing.JButton insere_Disciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu menuPopup;
    private javax.swing.JButton sair;
    private javax.swing.JComboBox select_Curso;
    private javax.swing.JComboBox select_Turma;
    private javax.swing.JTable tabela_Grade;
    // End of variables declaration//GEN-END:variables
}
