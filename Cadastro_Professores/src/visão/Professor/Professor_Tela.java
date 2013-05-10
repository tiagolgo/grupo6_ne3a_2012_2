/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visão.Professor;

import Arquivo.Arquivo_Estados;
import Estados.Estados;
import Hibernate_Daos.Dao_Professor;
import Sessão.Sessão;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Pessoa.Email;
import modelo.Pessoa.Endereco;
import modelo.Pessoa.Professor;
import modelo.Pessoa.RG;
import modelo.Pessoa.Telefone;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Meus Documentos
 */
public class Professor_Tela extends javax.swing.JFrame {

    private Session sessão;
    private Professor pessoa;
    private boolean atualiza;

    public Professor_Tela() {
        this.sessão = new Sessão().retornaSession();
        this.pessoa = new Professor();
        auxConstrutor();
    }

    private void auxConstrutor() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        carregaCombosEstados();
    }

    public Professor_Tela(Object obj, Session sessao) {
        this.sessão = sessao;
        auxConstrutor();
        this.pessoa = (Professor) obj;
        preencheCampos();
//        this.atualiza = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sexo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        estado_Nasc = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        uf_Rg = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        emissão_Rg = new javax.swing.JFormattedTextField();
        cpf = new javax.swing.JFormattedTextField();
        rg = new javax.swing.JTextField();
        nascimento = new javax.swing.JFormattedTextField();
        municipio = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lFuncional = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        função = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        vínculo = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        rua = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        número = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        uf_Endereco = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        cep = new javax.swing.JFormattedTextField();
        mun_Endereco = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        fone_Res = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        cadastrar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jPanel5.setBackground(new java.awt.Color(0, 153, 102));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CADASTRO DE PROFESSOR");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 51)));

        jLabel1.setText("Nome:");

        jLabel2.setText("Sexo:");

        sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Masculino", "Feminino" }));

        jLabel3.setText("Nascimento:");

        jLabel4.setText("Município:");

        jLabel5.setText("Estado:");

        estado_Nasc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        estado_Nasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_NascActionPerformed(evt);
            }
        });

        jLabel6.setText("RG:");

        jLabel7.setText("UF:");

        jLabel9.setText("Emissão:");

        jLabel10.setText("CPF:");

        try {
            emissão_Rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        municipio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nascimento))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uf_Rg, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emissão_Rg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpf))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(5, 5, 5)
                                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(estado_Nasc, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(estado_Nasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(uf_Rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(emissão_Rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 51)));

        jLabel11.setText("Lotação Funcional:");

        lFuncional.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "1", "2", "3" }));

        jLabel12.setText("Função:");

        função.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Professor", "Secretário", "Servidor" }));

        jLabel13.setText("Vínculo:");

        vínculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "PSS", "QPM", "QPPE" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(função, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vínculo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(função, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(vínculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 51)));

        jLabel14.setText("Rua:");

        jLabel15.setText("Nº:");

        jLabel16.setText("Bairro:");

        jLabel17.setText("Município:");

        jLabel18.setText("Estado:");

        uf_Endereco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        uf_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uf_EnderecoActionPerformed(evt);
            }
        });

        jLabel19.setText("CEP:");

        try {
            cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        mun_Endereco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uf_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mun_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cep))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(número, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bairro)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(número, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(uf_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mun_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 51)));

        jLabel20.setText("Telefone:");

        jLabel23.setText("E-mail:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fone_Res, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(fone_Res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        cadastrar.setBackground(new java.awt.Color(0, 102, 0));
        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastrar)
                .addGap(56, 56, 56)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Contato:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Endereço:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Informações Funcionais:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Informações Pessoais:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel27)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void carregaCombosEstados() {
        List<String> values = new ArrayList();

        values.add(" ");
        for (Estados estados : Estados.values()) {
            values.add(estados.toString().replaceAll("_", ""));
        }
        this.uf_Endereco.setModel(new javax.swing.DefaultComboBoxModel(values.toArray()));
        this.uf_Rg.setModel(new javax.swing.DefaultComboBoxModel(values.toArray()));
        this.estado_Nasc.setModel(new javax.swing.DefaultComboBoxModel(values.toArray()));
    }

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed

        if (verDadosPessoais() & verInfoFuncionais()) {

            preenche_DadosPessoais(pessoa);

            preenche_InfoFuncionais(pessoa);

            pessoa.setMunicipio(this.municipio.getSelectedItem().toString());
            
            pessoa.setEstado(this.estado_Nasc.getSelectedItem().toString());

            pessoa.setRg(cria_RG());

            pessoa.setEndereco(cria_Endereço());

            pessoa.setTelefone(cria_Telefones());

            pessoa.setEmail(cria_Email());
            
            chamaPersiste();

        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void chamaPersiste() {

        try {
            Dao_Professor dp = new Dao_Professor(this.sessão);
            
            Transaction tr = this.sessão.beginTransaction();

            dp.persiste(pessoa);

            tr.commit();

            confirma_NovoAfastamento();

        } catch (HibernateException | HeadlessException ex) {
            this.sessão.beginTransaction().rollback();
            Logger.getLogger(Professor_Tela.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void confirma_NovoAfastamento() {
        int opção = JOptionPane.showConfirmDialog(
                null, "Professor Inserido!\nDeseja realizar nova Inserção?", "Confirmação", 0);
        if (opção == 0) {
        } else {//fecha se o usuário não quiser realizar novo cancelamento
            this.dispose();
        }
    }

      
    private List<String> buscaMunicipios(String estado) {
        Arquivo_Estados ae = new Arquivo_Estados();
        return ae.listaMunicipios(estado);
    }

    private void uf_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uf_EnderecoActionPerformed
        // TODO add your handling code here:
        if(!this.uf_Endereco.getSelectedItem().equals(" ")){
        List<String> buscaMunicipios = buscaMunicipios(this.uf_Endereco.getSelectedItem().toString());
        this.mun_Endereco.setModel(new javax.swing.DefaultComboBoxModel(buscaMunicipios.toArray()));
            
        }
    }//GEN-LAST:event_uf_EnderecoActionPerformed

    private void estado_NascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_NascActionPerformed
        // TODO add your handling code here:
      if(!this.estado_Nasc.getSelectedItem().equals(" ")){
        List<String> buscaMunicipios = buscaMunicipios(this.estado_Nasc.getSelectedItem().toString());
        municipio.setModel(new javax.swing.DefaultComboBoxModel(buscaMunicipios.toArray()));
          
      }
        
    }//GEN-LAST:event_estado_NascActionPerformed

    private void preenche_InfoFuncionais(Professor prof) {
        prof.setCargo(this.função.getSelectedItem().toString());
        prof.setVinculo(this.vínculo.getSelectedItem().toString());
        prof.setLF(Integer.parseInt(this.lFuncional.getSelectedItem().toString()));
    }

    private void preenche_DadosPessoais(Professor prof) {
        prof.setNome(this.nome.getText());
        prof.setSexo(this.sexo.getSelectedItem().toString());
        prof.setData_Nascimento(this.nascimento.getText().replaceAll("/", ""));
        prof.setCpf(this.cpf.getText().replace('.', '-').replaceAll("-", ""));
    }

    private void preencheCampos() {
        this.nome.setText(pessoa.getNome());
        this.sexo.setSelectedItem(pessoa.getSexo());
        this.nascimento.setText(pessoa.getData_Nascimento());
        this.estado_Nasc.setSelectedItem(pessoa.getEstado());
        this.municipio.setSelectedItem(pessoa.getMunicipio());
        this.rg.setText(pessoa.getRg().getNúmero().toString());
        this.uf_Rg.setSelectedItem(pessoa.getRg().getEstado());
        this.emissão_Rg.setText(pessoa.getRg().getEmissão());
        this.cpf.setText(pessoa.getCpf().toString());

        this.lFuncional.setSelectedItem(String.valueOf(pessoa.getLF()));
        this.função.setSelectedItem(pessoa.getCargo());
        this.vínculo.setSelectedItem(pessoa.getVinculo());

        this.rua.setText(pessoa.getEndereco().getRua());
        this.número.setText(String.valueOf(pessoa.getEndereco().getNumero()));
        this.bairro.setText(pessoa.getEndereco().getBairro());
        this.uf_Endereco.setSelectedItem(pessoa.getEndereco().getEstado());
        this.mun_Endereco.setSelectedItem(pessoa.getEndereco().getMunicipio());
        this.cep.setText(pessoa.getEndereco().getCep());

        if (!pessoa.getTelefone().isEmpty()) {
            this.fone_Res.setText(String.valueOf(pessoa.getTelefone().get(0).getNumero()));
        }

        if (!pessoa.getEmail().isEmpty()) {
            this.email1.setText(pessoa.getEmail().get(0).getEndereco());
        }

    }

    public boolean verDadosPessoais() {
        String nom = this.nome.getText();
        String nas = this.nascimento.getText();
        String sex = this.sexo.getSelectedItem().toString();
        String identidade = this.rg.getText();
        String ufr = this.uf_Rg.getSelectedItem().toString();
        String estnas = this.estado_Nasc.getSelectedItem().toString();
        String mun = this.municipio.getSelectedItem().toString();
        String emiss = this.emissão_Rg.getText();

        if (nom.equals("") || nom.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Informe o Nome!");
        } else if (nas.equals("") || nas.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Informe a Data de Nascimento!");
        } else if (sex == null) {
            JOptionPane.showMessageDialog(null, "Informe o Sexo!");
        } else if (identidade.equals("") || identidade.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Informe o RG!");
        } else if (ufr.equals("") || ufr.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Informe a UF do RG!");
        } else if (estnas.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o Estado de Nascimento!");
        } else if (mun.equals("") || mun.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Informe o Município de Nascimento!");
        } else if (emiss.equals("") || emiss.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Informe a Data de Emissão do RG!");
        } else {
            return true;
        }
        return false;
    }

    public boolean verInfoFuncionais() {
        String lf = this.lFuncional.getSelectedItem().toString();
        String funcao = this.função.getSelectedItem().toString();
        String vinculo = this.vínculo.getSelectedItem().toString();

        if (lf.equals("") || lf.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Informe a Lotação Funcional!");
        } else if (funcao.equals("") || funcao.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Informe a Função!");
        } else if (vinculo.equals("") || vinculo.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Informe o Vínculo!");
        } else {
            return true;
        }
        return false;
    }

    public List<Telefone> cria_Telefones() {
        List<Telefone> t = new ArrayList();
        Telefone fone;

        if (!this.fone_Res.getText().equals("") & !this.fone_Res.getText().equals(" ")) {
            fone = new Telefone();
            fone.setNumero(Integer.parseInt(this.fone_Res.getText()));
            t.add(fone);
        }
//        if (!this.fone_Com.getText().equals("") & this.fone_Com.getText().equals(" ")) {
//            fone = new Telefone();
//            fone.setNumero(Integer.parseInt(this.fone_Com.getText()));
//            t.add(fone);
//        }
//        if (!this.celular.getText().equals("") & this.celular.getText().equals(" ")) {
//            fone = new Telefone();
//            fone.setNumero(Integer.parseInt(this.celular.getText()));
//            t.add(fone);
//        }
        return t;
    }

    public List<Email> cria_Email() {
        List<Email> m = new ArrayList();
        Email mail;
        if (!(this.email1.getText().isEmpty() & this.email1.getText().equals(" "))) {
            mail = new Email();
            mail.setEndereco(this.email1.getText());
            m.add(mail);
        }
//        if (!(this.email2.getText().isEmpty() & this.email2.getText().equals(" "))) {
//            mail = new Email();
//            mail.setEndereco(this.email2.getText());
//            m.add(mail);
//        }
        return m;
    }

    private Endereco cria_Endereço() {
        Endereco endereco = new Endereco();
        endereco.setRua(this.rua.getText());
        endereco.setMunicipio(this.mun_Endereco.getSelectedItem().toString());
        endereco.setEstado(this.uf_Endereco.getSelectedItem().toString());
        if(!this.número.getText().equals(null)){
        endereco.setNumero(Integer.parseInt(this.número.getText()));
        }
        endereco.setBairro(this.bairro.getText());
        endereco.setCep(this.cep.getText().replaceAll("-", ""));

        return endereco;
    }

//    private Municipio municipio_Endereço(Dao_Professor dp) {
//        Municipio munEndereco = new Municipio();
//        munEndereco.setNome(this.mun_Endereco.getSelectedItem().toString());
//        munEndereco.setEstado(this.uf_Endereco.getSelectedItem().toString());
//        try {
//            Transaction tr = this.sessão.beginTransaction();
//            dp.persiste(munEndereco);
//            tr.commit();
//
//        } catch (Exception ex) {
//            this.sessão.getTransaction().rollback();
//            Logger.getLogger(Professor_Tela.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            return munEndereco;
//        }
//    }
    private RG cria_RG() {
        RG pessoaRg = new RG();
        pessoaRg.setNúmero(Long.parseLong(this.rg.getText()));
        pessoaRg.setEstado(this.uf_Rg.getSelectedItem().toString());
        pessoaRg.setEmissão(this.emissão_Rg.getText().replaceAll("/", ""));

        return pessoaRg;
    }

//    private Municipio cria_Municipio() {
//        Municipio mun = new Municipio();
//        mun.setNome(this.municipio.getSelectedItem().toString());
//        mun.setEstado(this.estado_Nasc.getSelectedItem().toString());
//
//        return mun;
//    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Professor_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Professor_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Professor_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Professor_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>Professor_Telaate and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Professor_Tela pt = new Professor_Tela();
                pt.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro;
    private javax.swing.JButton cadastrar;
    private javax.swing.JFormattedTextField cep;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JTextField email1;
    private javax.swing.JFormattedTextField emissão_Rg;
    private javax.swing.JComboBox estado_Nasc;
    private javax.swing.JTextField fone_Res;
    private javax.swing.JComboBox função;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox lFuncional;
    private javax.swing.JComboBox mun_Endereco;
    private javax.swing.JComboBox municipio;
    private javax.swing.JFormattedTextField nascimento;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField número;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField rua;
    private javax.swing.JButton sair;
    private javax.swing.JComboBox sexo;
    private javax.swing.JComboBox uf_Endereco;
    private javax.swing.JComboBox uf_Rg;
    private javax.swing.JComboBox vínculo;
    // End of variables declaration//GEN-END:variables
}
