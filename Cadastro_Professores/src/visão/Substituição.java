/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import Hibernate_Daos.Dao_Afastamento;
import Hibernate_Daos.Dao_Substituicao;
import Sessão.Sessão;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Afastamento;
import modelo.Pessoa.Professor;
import modelo.Substituicao;
import modelo.curricular.Disciplina;
import org.hibernate.Session;

public class Substituição extends javax.swing.JFrame {
    private boolean eSubstituto;
    private Professor afastado;
    private Professor substituto;
    private Afastamento afastamento;
    private Session sessão;
    private List<Professor> afastados;
    private Substituicao substituicao;
    
    public Substituição() {
        super.setTitle("Substituição");
        initComponents();
        this.sessão = new Sessão().retornaSession();
        this.afastamento = new Afastamento();
        this.substituicao = new Substituicao();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        inserir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dataSubstituicao = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        inícioSubtituicao = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        buscaSubstituto = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Cancelado = new javax.swing.JTable();
        substituir = new javax.swing.JButton();
        nomeSubstituto = new javax.swing.JLabel();
        nome_Afastado = new javax.swing.JTextField();
        buscar_Afastado = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SUBSTITUIÇÃO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        inserir.setBackground(new java.awt.Color(255, 102, 102));
        inserir.setText("Gravar");
        inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Afastado:");

        jLabel7.setText("Data:");

        try {
            dataSubstituicao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setText("Início:");

        try {
            inícioSubtituicao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Substituto:");

        buscaSubstituto.setText("Buscar");
        buscaSubstituto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaSubstitutoActionPerformed(evt);
            }
        });

        tabela_Cancelado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº", "Disciplina", "Turma", "Curso"
            }
        ));
        jScrollPane1.setViewportView(tabela_Cancelado);

        substituir.setText("Substituir");
        substituir.setMargin(new java.awt.Insets(2, 0, 2, 0));
        substituir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substituirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(substituir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(substituir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        nomeSubstituto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buscar_Afastado.setText("Buscar");
        buscar_Afastado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_AfastadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataSubstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inícioSubtituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_Afastado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_Afastado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeSubstituto, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscaSubstituto)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeSubstituto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5)
                        .addComponent(buscaSubstituto)
                        .addComponent(nome_Afastado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscar_Afastado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dataSubstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(inícioSubtituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(inserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setProfessor(Professor p) {
        int confirm = JOptionPane.showConfirmDialog(null, "Confirma o Substituto:\n " + p.getNome(), "Confirmação de Substituto", 0);
           System.out.println(p.getDisciplina());
       if(this.eSubstituto){
        if (confirm == 0) {
            this.substituto = p;
            this.substituicao.setSubstituto(this.substituto);
            this.nomeSubstituto.setText(p.getNome());
        }
       }else{
           this.afastado=p;
           this.nome_Afastado.setText(p.getNome());
           limpaTabela();
       }
    }
    
    private void carregaTabelaAfastado(DefaultTableModel model) {
        Dao_Afastamento da = new Dao_Afastamento(this.sessão);
        this.afastamento = da.afastamentoIdProfessor(this.afastado.getId());
        
        for (Disciplina d : this.afastamento.getDisciplinas()) {
            model.addRow(new Object[]{
                d.getId(),
                d.getCodigo() + " " + d.getNome(),
                d.getTurma().getSerie() + d.getTurma().getSeriacao() + " " + d.getTurma().getTurno(),
                d.getTurma().getCurso()
            });
        }
    }
    
    private void limpaTabela() {
        DefaultTableModel model = (DefaultTableModel) this.tabela_Cancelado.getModel();
        int linhas = this.tabela_Cancelado.getRowCount();
        
        if (linhas > 0) {
            for (int i = 0; i < linhas; i++) {
                model.removeRow(0);
            }
        } else {
            carregaTabelaAfastado(model);
        }
    }
    
    private void inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirActionPerformed
        // TODO add your handling code here:

        if (validaDatas()) {
            Dao_Substituicao ds = new Dao_Substituicao(this.sessão);
            
            try {
                ds.persiste(this.substituicao);
            } catch (Exception ex) {
                Logger.getLogger(Substituição.class.getName()).log(Level.SEVERE, null, ex);
            }       
        }        
    }//GEN-LAST:event_inserirActionPerformed
    
    private boolean validaDatas() {
        String dataSubst = this.dataSubstituicao.getText().replaceAll("/", "");
        String inicioSubst = this.inícioSubtituicao.getText().replaceAll("/", "");
        
        if (dataSubst.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe a Data da Substituição!");
            return false;
        } else if (inicioSubst.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe a Data de Início da Substituição!");            
            return false;
        } else {
            this.substituicao.setDataSubstituicao(dataSubst);
            this.substituicao.setDataInicio(inicioSubst);
            return true;
        }
        
    }
    
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed
        
    private void buscaSubstitutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaSubstitutoActionPerformed
        // TODO add your handling code here:
        this.eSubstituto=true;
        Consulta_Prof cp = new Consulta_Prof(this, this.sessão);
        cp.setVisible(true);
    }//GEN-LAST:event_buscaSubstitutoActionPerformed

    //AÇÕES DO BOTÃO SUBSTITUIR
    private void substituirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substituirActionPerformed
        
        int linha = this.tabela_Cancelado.getSelectedRow();
        
        if (linha != -1 || this.nomeSubstituto.equals("")) {
            Object id = this.tabela_Cancelado.getValueAt(linha, 0);
            for (Disciplina disciplina : this.afastamento.getDisciplinas()) {
                
                if (disciplina.getId() == id) {
                    
                    this.substituto.setDisciplina(disciplina);
                    
                    disciplina.setAtribuida(true);
                    
                    this.substituicao.setDisciplina(disciplina);
                    
                    removeLinhaTabAfastado(linha);
                    
                    break;
                }
            }
        }
    }//GEN-LAST:event_substituirActionPerformed

    private void buscar_AfastadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_AfastadoActionPerformed
        // TODO add your handling code here:
        this.eSubstituto=false;
        Consulta_Prof cp = new Consulta_Prof(this, this.sessão);
        cp.setVisible(true);
        
    }//GEN-LAST:event_buscar_AfastadoActionPerformed
    
    private void removeLinhaTabAfastado(int linha) {
        DefaultTableModel model = (DefaultTableModel) this.tabela_Cancelado.getModel();
        model.removeRow(linha);
    }

    //FIM DAS AÇÕES DO BOTÃOD E SUBSTITUIÇÃO
//    private void carregaComboAfastado() {
//        Dao_Substituicao ds = new Dao_Substituicao(this.sessão);
//        List<Professor> lp = ds.retornaTodos();
//        
//        if (!lp.isEmpty()) {
//            this.afastados = new ArrayList();
//            this.afastados = lp;
//            for (Professor professor : lp) {
//                this.select_Afastado.addItem(professor.getNome());
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Não há Professor(es) Afastado(s)!");
//        }
//        
//    }
    
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
            java.util.logging.Logger.getLogger(Substituição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Substituição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Substituição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Substituição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Substituição().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscaSubstituto;
    private javax.swing.JButton buscar_Afastado;
    private javax.swing.JButton cancelar;
    private javax.swing.JFormattedTextField dataSubstituicao;
    private javax.swing.JButton inserir;
    private javax.swing.JFormattedTextField inícioSubtituicao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeSubstituto;
    private javax.swing.JTextField nome_Afastado;
    private javax.swing.JButton substituir;
    private javax.swing.JTable tabela_Cancelado;
    // End of variables declaration//GEN-END:variables
}
