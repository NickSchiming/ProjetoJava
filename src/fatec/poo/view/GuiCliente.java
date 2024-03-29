/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.Pessoa;
import fatec.poo.model.Cliente;
import fatec.poo.model.Vendedor;
import java.util.ArrayList;

/**
 *
 * @author niksc
 */
public class GuiCliente extends javax.swing.JFrame {

    /**
     * Creates new form GuiCliente
     * @param p
     */
    public GuiCliente(ArrayList <Pessoa> p) {
        initComponents();
        pessoa = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTelefone = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        cbxUF = new javax.swing.JComboBox<>();
        lblLD = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        txtDDD = new javax.swing.JTextField();
        lblLimiteDisponível = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        lblEndereco = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblLimiteCredito = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        txtEndereco = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtLimiteCredito = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        ftxCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");

        lblTelefone.setText("Telefone");

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        cbxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbxUF.setSelectedIndex(24);
        cbxUF.setEnabled(false);

        lblLD.setText("Limite Disponível");

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtDDD.setEnabled(false);

        lblLimiteDisponível.setText(" ");
        lblLimiteDisponível.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblNome.setText("Nome");

        txtTelefone.setEnabled(false);

        lblCEP.setText("CEP");

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtNome.setEnabled(false);

        lblCidade.setText("Cidade");

        txtCEP.setEnabled(false);
        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        lblEndereco.setText("Endereço");

        txtCidade.setEnabled(false);

        lblLimiteCredito.setText("Limite de crédito");

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        txtEndereco.setEnabled(false);

        lblCPF.setText("CPF");

        txtLimiteCredito.setEnabled(false);

        lblUF.setText("UF");

        try {
            ftxCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLimiteCredito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLimiteDisponível, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCPF)
                    .addComponent(ftxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF)
                    .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCEP)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLimiteCredito)
                    .addComponent(txtLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLD)
                    .addComponent(lblLimiteDisponível))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void ftxCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxCPFActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        boolean duo = false;
        
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtCidade.setText(null);
        txtDDD.setText(null);
        txtTelefone.setText(null);
        txtCEP.setText(null);
        cbxUF.setSelectedIndex(24);
        txtLimiteCredito.setText(null);
        lblLimiteDisponível.setText(null);
        psenc = null;
       
        for (int i = 0; i < pessoa.size(); i++){
            if(!(pessoa.get(i) instanceof Vendedor)){
                for (int k = 0; k < pessoa.size(); k++){
                if(pessoa.get(i).getCpf().replaceAll("[\\.\\-]", "").equals(pessoa.get(k).getCpf()) && !(pessoa.get(k) instanceof Cliente)){
                    duo = true;
                }
            }
            }
            
        }
        
        for (int i = 0; i < pessoa.size(); i++){
            if(pessoa.get(i).getCpf().replaceAll("[\\.\\-]", "").equals(ftxCPF.getText().replaceAll("[\\.\\-]", ""))){
                psenc = pessoa.get(i);
                if(psenc instanceof Cliente){
                    txtNome.setText(psenc.getNome());
                    txtEndereco.setText(psenc.getEndereco());
                    txtCidade.setText(psenc.getCidade());
                    txtDDD.setText(psenc.getDdd());
                    txtTelefone.setText(psenc.getTelefone());
                    txtCEP.setText(psenc.getCep());
                    txtLimiteCredito.setText(String.valueOf(((Cliente)psenc).getLimiteCred()));
                    lblLimiteDisponível.setText(String.valueOf(((Cliente)psenc).getLimiteDisp()));
                    cbxUF.setSelectedItem(psenc.getUf());
                    btnAlterar.setEnabled(true);
                    btnExcluir.setEnabled(true);
                    duo = true;
                    break;
                }

            }
        }
       
            if(psenc == null || !duo){
                txtNome.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtCidade.setEnabled(true);
                txtDDD.setEnabled(true);
                txtTelefone.setEnabled(true);
                txtCEP.setEnabled(true);
                cbxUF.setEnabled(true);
                txtLimiteCredito.setEnabled(true);
                btnIncluir.setEnabled(true);
                btnConsultar.setEnabled(false);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);

            }
        
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        
        if(alterar){
            psenc.setEndereco(txtEndereco.getText());
            psenc.setCidade(txtCidade.getText());
            psenc.setDdd(txtDDD.getText());
            psenc.setTelefone(txtTelefone.getText());
            psenc.setCep(txtCEP.getText());
            psenc.setUf(String.valueOf(cbxUF.getSelectedItem()));
            ((Cliente)psenc).setLimiteCred(Double.parseDouble(txtLimiteCredito.getText()));
            alterar = false;
        }else{
            Cliente cli = new Cliente(ftxCPF.getText(),txtNome.getText(),Double.parseDouble(txtLimiteCredito.getText()));
            cli.setEndereco(txtEndereco.getText());
            cli.setCidade(txtCidade.getText());
            cli.setDdd(txtDDD.getText());
            cli.setTelefone(txtTelefone.getText());
            cli.setCep(txtCEP.getText());
            cli.setUf(String.valueOf(cbxUF.getSelectedItem()));
            cli.setLimiteCred(Double.parseDouble(txtLimiteCredito.getText()));
            pessoa.add(cli);
        }
        
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCidade.setEnabled(false);
        txtDDD.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtCEP.setEnabled(false);
        cbxUF.setEnabled(false);
        txtLimiteCredito.setEnabled(false);
        btnIncluir.setEnabled(false);
        btnConsultar.setEnabled(true);
        ftxCPF.setEnabled(true);
        
        ftxCPF.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtCidade.setText(null);
        txtDDD.setText(null);
        txtTelefone.setText(null);
        txtCEP.setText(null);
        cbxUF.setSelectedIndex(24);
        txtLimiteCredito.setText(null);
        lblLimiteDisponível.setText(null);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        alterar = true;
        txtNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtCidade.setEnabled(true);
        txtDDD.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtCEP.setEnabled(true);
        cbxUF.setEnabled(true);
        txtLimiteCredito.setEnabled(true);
        lblLimiteDisponível.setEnabled(true);
        btnIncluir.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnConsultar.setEnabled(false);
        btnExcluir.setEnabled(false);
        ftxCPF.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        pessoa.remove(psenc);
        
        ftxCPF.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtCidade.setText(null);
        txtDDD.setText(null);
        txtTelefone.setText(null);
        txtCEP.setText(null);
        cbxUF.setSelectedIndex(24);
        txtLimiteCredito.setText(null);
        lblLimiteDisponível.setText(null);
        
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxUF;
    private javax.swing.JFormattedTextField ftxCPF;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblLD;
    private javax.swing.JLabel lblLimiteCredito;
    private javax.swing.JLabel lblLimiteDisponível;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtDDD;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtLimiteCredito;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private final ArrayList <Pessoa> pessoa;
    private Pessoa psenc;
    private boolean alterar = false;
}
