package visão;

import Hibernate_Daos.Dao_Afastamento;
import Sessão.Sessão;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import modelo.Afastamento;
import modelo.Pessoa.Professor;
import modelo.curricular.Disciplina;
import org.hibernate.Session;

/**
 *
 * @author Meus Documentos
 */
public class Inserir_Afastamento extends javax.swing.JFrame {

    private Professor professor;
    private Session sessao;
    private Afastamento afastamento;

    public Inserir_Afastamento() {
        super.setTitle("Afastamento");
        initComponents();
        configuraTabela();
        this.sessao = new Sessão().retornaSession();
//        flag(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    //
    public void setProfessor(Professor professor) {
        this.professor = professor;
        if (professor != null) {
            preencheCombos();
        }
    }

    private void preencheCombos() {
        this.afastado.setText(this.professor.getNome());

        DefaultTableModel model = (DefaultTableModel) this.tabelaDisciplinas.getModel();

        List<Disciplina> s = this.professor.getDisciplina();

        if (!s.isEmpty()) {
            for (Disciplina n : s) {
                model.addRow(new Object[]{n.getCodigo(), n.getNome(), n.getTurma().getSerie(), n.getTurma().getSeriacao(), n.getTurma().getCurso(), false});
            }
        } else {
            JOptionPane.showMessageDialog(null, "Professor não possui Disciplinas para Afastar");
        }
    }

    private void flag(Boolean f) {
        this.dataAfastamento.setEnabled(f);
        this.inicioAfastamento.setEnabled(f);
        this.fimAfastamento.setEnabled(f);
        this.motivo.setEnabled(f);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inserir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dataAfastamento = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        inicioAfastamento = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        fimAfastamento = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        motivo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDisciplinas = new javax.swing.JTable();
        buscar = new javax.swing.JButton();
        afastado = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AFASTAMENTO");

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
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        inserir.setText("Salvar");
        inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Data do Afastamento:");

        try {
            dataAfastamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Início do Afastamento:");

        try {
            inicioAfastamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("Fim do Afastamento:");

        try {
            fimAfastamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Motivo:");

        jLabel6.setText("Afastado:");

        tabelaDisciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Disciplina", "Série", "Turma", "Ensino", "Afastar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaDisciplinas);

        buscar.setText("Buscar...");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        afastado.setBackground(new java.awt.Color(255, 153, 153));
        afastado.setText(" ");
        afastado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        afastado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                afastadoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(motivo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(afastado, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataAfastamento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inicioAfastamento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fimAfastamento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(afastado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar)
                    .addComponent(jLabel6))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dataAfastamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(inicioAfastamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(fimAfastamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        Consulta_Prof consulta = new Consulta_Prof(this, this.sessao);
        consulta.setVisible(true);
    }//GEN-LAST:event_buscarActionPerformed

    private boolean criaAfastamento() {
        int linhas = this.tabelaDisciplinas.getRowCount();

        if (verificaCampos()) {
            for (int i = 0; i < linhas; i++) {
                Object selecionado = this.tabelaDisciplinas.getValueAt(i, 5);
                if (selecionado == true) {
                    Integer codigo = (Integer) this.tabelaDisciplinas.getValueAt(i, 0);

                    for (Disciplina d : this.professor.getDisciplina()) {
                        if (d.getCodigo() == codigo) {
                            this.professor.getDisciplina().remove(d);
                            this.afastamento.setDisciplina(d);
                            d.setAtribuida(false);
                            break;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    private boolean verificaCampos() {
        String data = this.dataAfastamento.getText();
        String inicio = this.inicioAfastamento.getText();
        String fim = this.fimAfastamento.getText();
        String mo = this.motivo.getText();

        if (data.equals(" ") || data.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe a data do Afastamento!");
        } else if (inicio.equals(" ") || data.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe a data de início do Afastamento!");
        } else if (fim.equals(" ") || fim.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe a data de fim do Afastamento!");
        } else if (mo.equals(" ") || mo.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o motivo do Afastamento!");
        } else {
            afastamento.setDataAfastamento(data.replaceAll("/", ""));
            afastamento.setInicioAfastamento(inicio.replaceAll("/", ""));
            afastamento.setFimAfastamento(fim.replaceAll("/", ""));
            afastamento.setMotivo(mo);
            afastamento.setSuprido(false);
            return true;
        }
        return false;
    }

    private void inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirActionPerformed
        // TODO add your handling code here:
        Dao_Afastamento dp = new Dao_Afastamento(this.sessao);
        this.afastamento = new Afastamento();
        if (criaAfastamento()) {
            try {
                this.afastamento.setAfastado(this.professor);
                dp.persiste(this.afastamento);
                JOptionPane.showMessageDialog(null, "Afastamento Inserido!");
                excluiLinhas();
                limpaCampos();
            } catch (Exception ex) {
                Logger.getLogger(Inserir_Afastamento.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("erro ao gravar alteração");
            }
        }
    }//GEN-LAST:event_inserirActionPerformed

    private void afastadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_afastadoKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyChar() == 10) {
            buscarActionPerformed(null);
        }
    }//GEN-LAST:event_afastadoKeyReleased

    private void configuraTabela() {
        TableColumnModel model = this.tabelaDisciplinas.getColumnModel();
        model.getColumn(0).setMinWidth(100);
        model.getColumn(1).setMinWidth(250);
        model.getColumn(2).setMinWidth(80);
        model.getColumn(3).setMinWidth(80);
        model.getColumn(4).setMinWidth(200);
        model.getColumn(5).setMinWidth(60);
    }

    private void limpaCampos() {
//        DefaultTableModel model = (DefaultTableModel) this.tabelaDisciplinas.getModel();
//        for (int i = 0; i < this.tabelaDisciplinas.getRowCount(); i++) {
//            model.removeRow(0);
//        }
        this.dataAfastamento.setText(null);
        this.inicioAfastamento.setText(null);
        this.fimAfastamento.setText(null);
        this.motivo.setText(null);
    }

    private void excluiLinhas() {
        DefaultTableModel model = (DefaultTableModel) this.tabelaDisciplinas.getModel();

        int rowCount = this.tabelaDisciplinas.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Object valueAt = this.tabelaDisciplinas.getValueAt(i, 5);
            if (valueAt == true) {
                model.removeRow(i);
                i = 0;
                rowCount -= 1;
            }
        }
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
            java.util.logging.Logger.getLogger(Inserir_Afastamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inserir_Afastamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inserir_Afastamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inserir_Afastamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Inserir_Afastamento().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel afastado;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JFormattedTextField dataAfastamento;
    private javax.swing.JFormattedTextField fimAfastamento;
    private javax.swing.JFormattedTextField inicioAfastamento;
    private javax.swing.JButton inserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField motivo;
    private javax.swing.JTable tabelaDisciplinas;
    // End of variables declaration//GEN-END:variables
}
