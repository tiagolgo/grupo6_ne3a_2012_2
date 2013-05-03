/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import Hibernate_Daos.Dao_Cancelamento;
import Sessão.Sessão;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import modelo.Cancelamento;
import modelo.Pessoa.Professor;
import modelo.curricular.Disciplina;
import org.hibernate.Session;

/**
 *
 * @author Meus Documentos
 */
public class Cancelamento_Tela extends javax.swing.JFrame {

    private Professor cancelado;
    private Session sessão;
    private Cancelamento cancelamento;

    public Cancelamento_Tela() {
        super.setTitle("Cancelamento");
        initComponents();
        configuraTabela();
        this.sessão=new Sessão().retornaSession();
        this.cancelamento = new Cancelamento();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void setProfessor(Professor prof) {
        this.cancelado = prof;
        preencheTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inserir = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();
        professor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        motivo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inscrição = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCancelamento = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        Remover = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CANCELAMENTO");

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
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setText("Professor(RG):");

        inserir.setText("Salvar");
        inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Data:");

        try {
            data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data.setText(" dd /mm /aaaa    ");

        professor.setBackground(new java.awt.Color(102, 255, 102));
        professor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Motivo:");

        jLabel8.setText("Inscrição:");

        tabelaCancelamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº", "Disciplina", "Série", "Curso", "Turno", "CH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCancelamento.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabelaCancelamento.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tabelaCancelamento.setRowHeight(20);
        jScrollPane2.setViewportView(tabelaCancelamento);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Atenção: Selecione as disciplinas a serem canceladas.");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        Remover.setText("Remove");
        Remover.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(professor, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(motivo, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inscrição))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(professor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(motivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(inscrição, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //
    private void preencheTabela() {//preencher a tabela com os dados do professor

        if (!this.cancelado.getDisciplina().isEmpty()) {
            DefaultTableModel model = (DefaultTableModel) this.tabelaCancelamento.getModel();

            this.professor.setText(this.cancelado.getNome());

            for (Disciplina d : this.cancelado.getDisciplina()) {
                model.addRow(new Object[]{d.getId(), d.getCodigo() + "-" + d.getNome(),
                    d.getTurma().getSerie(), d.getTurma().getCurso(),
                    d.getTurma().getTurno(), d.getCargaHorária()});
            }
        } else {
            JOptionPane.showMessageDialog(null, "Professor não possui disciplinas a serem Canceladas!");
        }
    }

    //
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        Consulta_Prof prof = new Consulta_Prof(this, this.sessão);
        prof.setVisible(true);

    }//GEN-LAST:event_buscarActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed

        int cancelada = this.tabelaCancelamento.getSelectedRow();
        int idTabela = Integer.parseInt(this.tabelaCancelamento.getValueAt(cancelada, 0).toString());

        if (cancelada < 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma Disciplina!");
        } else {
            for (Disciplina d : this.cancelado.getDisciplina()) {
                if (d.getId() == idTabela) {
                    this.cancelado.getDisciplina().remove(d);
                    d.setAtribuida(false);
                    this.cancelamento.setDisciplina(d);
                    removeLinha(cancelada);
                    break;
                }
            }
        }
    }//GEN-LAST:event_RemoverActionPerformed

    private void inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirActionPerformed
        // TODO add your handling code here:
        criaCancelamento();

        Dao_Cancelamento dc = new Dao_Cancelamento(this.sessão);
        try {
            dc.persiste(this.cancelamento);
            limparCampos();
            pergunta();
        } catch (Exception ex) {
            Logger.getLogger(Cancelamento_Tela.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_inserirActionPerformed

    private void removeLinha(int linha) {
        DefaultTableModel model = (DefaultTableModel) this.tabelaCancelamento.getModel();
        model.removeRow(linha);
    }

    private void configuraTabela() {
        TableColumnModel cm = this.tabelaCancelamento.getColumnModel();
        cm.getColumn(0).setMinWidth(60);
        cm.getColumn(1).setMinWidth(250);
        cm.getColumn(2).setMinWidth(100);
        cm.getColumn(3).setMinWidth(110);
        cm.getColumn(4).setMinWidth(110);
        cm.getColumn(5).setMinWidth(70);
    }

    private void limparCampos() {

        DefaultTableModel model = (DefaultTableModel) this.tabelaCancelamento.getModel();

        for (int i = 0; i < this.tabelaCancelamento.getRowCount(); i++) {
            model.removeRow(0);
        }

        this.professor.setText(null);
        this.data.setText(null);
        this.motivo.setText(null);
        this.inscrição.setText(null);
    }

    private void pergunta() {
        int opção = JOptionPane.showConfirmDialog(
                null, "Cancelamento Confirmado!\nDeseja realizar novo Cancelamento?", "Confirmação", 0);
        if (opção == 0) {
        } else {//fecha se o usuário não quiser realizar novo cancelamento
            this.dispose();
        }
    }

    private void criaCancelamento() {
        String dat = this.data.getText().replaceAll("/", "");
        String mot = this.motivo.getText();
        if (dat.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha a Data!");
        } else if (mot.equals(" ") || mot.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Motivo!");
        } else {
            cancelamento.setData_Cancelamento(dat);
            cancelamento.setMotivo(mot);
            cancelamento.setInscrição(Integer.parseInt(this.inscrição.getText().toString()));

            this.cancelamento.setProfessor(this.cancelado);
        }
    }

    public static void main(String[] args) {
        new Cancelamento_Tela().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Remover;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JTextField inscrição;
    private javax.swing.JButton inserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField motivo;
    private javax.swing.JLabel professor;
    private javax.swing.JTable tabelaCancelamento;
    // End of variables declaration//GEN-END:variables
}
