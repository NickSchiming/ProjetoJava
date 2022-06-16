/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.Pedido;
import fatec.poo.model.Pessoa;
import fatec.poo.model.Produto;
import java.util.ArrayList;


/**
 *
 * @author niksc
 */
public class GuiMenu extends javax.swing.JFrame {

    /**
     * Creates new form GuiMenu
     */
    public GuiMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnuBarra = new javax.swing.JMenuBar();
        mnuCadastros = new javax.swing.JMenu();
        mnitClientes = new javax.swing.JMenuItem();
        mnitVendedores = new javax.swing.JMenuItem();
        mnitProdutos = new javax.swing.JMenuItem();
        mnitSeparador = new javax.swing.JPopupMenu.Separator();
        mnitSair = new javax.swing.JMenuItem();
        mnuPedido = new javax.swing.JMenu();
        mnitEmitirPedido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        mnuCadastros.setText("Cadastros");

        mnitClientes.setText("Clientes");
        mnitClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitClientesActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnitClientes);

        mnitVendedores.setText("Vendedores");
        mnitVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitVendedoresActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnitVendedores);

        mnitProdutos.setText("Produtos");
        mnitProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitProdutosActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnitProdutos);
        mnuCadastros.add(mnitSeparador);

        mnitSair.setText("Sair");
        mnuCadastros.add(mnitSair);

        mnuBarra.add(mnuCadastros);

        mnuPedido.setText("Pedido");

        mnitEmitirPedido.setText("Emitir Pedido");
        mnitEmitirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitEmitirPedidoActionPerformed(evt);
            }
        });
        mnuPedido.add(mnitEmitirPedido);

        mnuBarra.add(mnuPedido);

        setJMenuBar(mnuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnitClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitClientesActionPerformed
        new GuiCliente(cadCliVend).setVisible(true);
    }//GEN-LAST:event_mnitClientesActionPerformed

    private void mnitVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitVendedoresActionPerformed
        new GuiVendedor(cadCliVend).setVisible(true);
    }//GEN-LAST:event_mnitVendedoresActionPerformed

    private void mnitProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitProdutosActionPerformed
        new GuiProduto(cadProd).setVisible(true);
    }//GEN-LAST:event_mnitProdutosActionPerformed

    private void mnitEmitirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitEmitirPedidoActionPerformed
        new GuiPedido(cadPedido, cadCliVend, cadProd).setVisible(true);
    }//GEN-LAST:event_mnitEmitirPedidoActionPerformed
    
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
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem mnitClientes;
    private javax.swing.JMenuItem mnitEmitirPedido;
    private javax.swing.JMenuItem mnitProdutos;
    private javax.swing.JMenuItem mnitSair;
    private javax.swing.JPopupMenu.Separator mnitSeparador;
    private javax.swing.JMenuItem mnitVendedores;
    private javax.swing.JMenuBar mnuBarra;
    private javax.swing.JMenu mnuCadastros;
    private javax.swing.JMenu mnuPedido;
    // End of variables declaration//GEN-END:variables
    private static final ArrayList <Produto> cadProd = new ArrayList <Produto>();
    private static final ArrayList <Pessoa> cadCliVend = new ArrayList <Pessoa>();
    private static final ArrayList <Pedido> cadPedido = new ArrayList <Pedido>();
}
