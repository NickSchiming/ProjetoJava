/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author niksc
 */
public class GuiProduto extends javax.swing.JFrame {

    /**
     * Creates new form GuiProduto
     * @param p
     */
    public GuiProduto(ArrayList <Produto> p) {
        initComponents();
        prod = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigo = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        lblDescricao = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        lblQtdeDisponivel = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblPrecUnit = new javax.swing.JLabel();
        lblEstoqueMin = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtQtdeDisponivel = new javax.swing.JTextField();
        txtPrecUnit = new javax.swing.JTextField();
        txtEstoqueMin = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        lblEstoqueMin1 = new javax.swing.JLabel();
        txtUnidMed = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produto");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        lblDescricao.setText("Descrição");

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblQtdeDisponivel.setText("Qtde. Disponível");

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblPrecUnit.setText("Preço Unitário");

        lblEstoqueMin.setText("Estoque Mínimo");

        txtDescricao.setEnabled(false);

        txtQtdeDisponivel.setEnabled(false);

        txtPrecUnit.setEnabled(false);

        txtEstoqueMin.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
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

        lblCodigo.setText("Código");

        lblEstoqueMin1.setText("Unidade de Medida");

        txtUnidMed.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEstoqueMin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUnidMed, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
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
                                .addComponent(lblQtdeDisponivel)
                                .addGap(17, 17, 17)
                                .addComponent(txtQtdeDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPrecUnit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEstoqueMin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstoqueMin1)
                        .addComponent(txtUnidMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodigo)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdeDisponivel)
                    .addComponent(lblPrecUnit)
                    .addComponent(lblEstoqueMin)
                    .addComponent(txtQtdeDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        txtDescricao.setText(null);
        txtQtdeDisponivel.setText(null);
        txtPrecUnit.setText(null);
        txtEstoqueMin.setText(null);
        prenc = null;
       
        for (int i = 0; i < prod.size(); i++){
            if(prod.get(i).getCodigo().equals(txtCodigo.getText())){
                prenc = prod.get(i);
                txtDescricao.setText(prenc.getDescricao());
                txtQtdeDisponivel.setText(String.valueOf(prenc.getQtdeEstoque()));
                txtPrecUnit.setText(String.valueOf(prenc.getPreco()));
                txtEstoqueMin.setText(String.valueOf(prenc.getEstoqueMinimo()));
                txtUnidMed.setText(prenc.getUnidadeMedida());
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
        }
        
        if (prenc == null){
            txtUnidMed.setEnabled(true);
            txtDescricao.setEnabled(true);
            txtQtdeDisponivel.setEnabled(true);
            txtPrecUnit.setEnabled(true);
            txtEstoqueMin.setEnabled(true);
            btnIncluir.setEnabled(true);
            btnConsultar.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        
        
        if(alterar){
            prenc.setDescricao(txtDescricao.getText());
            prenc.setQtdeEstoque(Double.parseDouble(txtQtdeDisponivel.getText()));
            prenc.setPreco(Double.parseDouble(txtPrecUnit.getText()));
            prenc.setEstoqueMinimo(Double.parseDouble(txtEstoqueMin.getText()));
            prenc.setUnidadeMedida(txtUnidMed.getText());
            alterar = false;
        }else{
            Produto produto = new Produto(txtCodigo.getText(),txtDescricao.getText());
            produto.setQtdeEstoque(Double.parseDouble(txtQtdeDisponivel.getText()));
            produto.setPreco(Double.parseDouble(txtPrecUnit.getText()));
            produto.setEstoqueMinimo(Double.parseDouble(txtEstoqueMin.getText()));
            produto.setUnidadeMedida(txtUnidMed.getText());
            prod.add(produto);
        }
        
        txtCodigo.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtQtdeDisponivel.setEnabled(false);
        txtPrecUnit.setEnabled(false);
        txtEstoqueMin.setEnabled(false);
        txtCodigo.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnConsultar.setEnabled(true);
        txtUnidMed.setEnabled(false);
        
        txtCodigo.setText(null);
        txtDescricao.setText(null);
        txtQtdeDisponivel.setText(null);
        txtPrecUnit.setText(null);
        txtEstoqueMin.setText(null);
        txtUnidMed.setText(null);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        prod.remove(prenc);
        
        txtCodigo.setText(null);
        txtDescricao.setText(null);
        txtQtdeDisponivel.setText(null);
        txtPrecUnit.setText(null);
        txtEstoqueMin.setText(null);
        
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        alterar = true;
        txtCodigo.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtQtdeDisponivel.setEnabled(true);
        txtPrecUnit.setEnabled(true);
        txtEstoqueMin.setEnabled(true);
        btnIncluir.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnConsultar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstoqueMin;
    private javax.swing.JLabel lblEstoqueMin1;
    private javax.swing.JLabel lblPrecUnit;
    private javax.swing.JLabel lblQtdeDisponivel;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoqueMin;
    private javax.swing.JTextField txtPrecUnit;
    private javax.swing.JTextField txtQtdeDisponivel;
    private javax.swing.JTextField txtUnidMed;
    // End of variables declaration//GEN-END:variables
    private final ArrayList <Produto> prod;
    private Produto prenc;
    private boolean alterar = false;
}