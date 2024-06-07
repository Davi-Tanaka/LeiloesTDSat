package com.main.view;

import com.main.dao.ProdutosDAO;
import com.main.dto.ProdutosDTO;
import java.sql.SQLException;
import javax.swing.JFrame;

import javax.swing.JOptionPane;

public class cadastroVIEW extends javax.swing.JFrame {
    private ProdutosDAO produtoDAO = new ProdutosDAO();
    
    public cadastroVIEW() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        this.setUndecorated(false);
        this.setVisible(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        principalJpanel = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        desc = new javax.swing.JLabel();
        nome_container = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cadastroNome = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(16, 0), new java.awt.Dimension(16, 0), new java.awt.Dimension(16, 32767));
        valor_container = new javax.swing.JPanel();
        cadastroValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(16, 0), new java.awt.Dimension(16, 0), new java.awt.Dimension(16, 32767));
        btnCadastrar = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 16), new java.awt.Dimension(0, 16), new java.awt.Dimension(32767, 16));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 16), new java.awt.Dimension(0, 16), new java.awt.Dimension(32767, 16));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 16), new java.awt.Dimension(0, 16), new java.awt.Dimension(32767, 16));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(10, 10));

        principalJpanel.setPreferredSize(new java.awt.Dimension(720, 500));
        principalJpanel.setLayout(new java.awt.GridBagLayout());

        titulo.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        titulo.setText("Sistema de Leilões");
        principalJpanel.add(titulo, new java.awt.GridBagConstraints());

        desc.setText("Cadastre um novo produto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        principalJpanel.add(desc, gridBagConstraints);

        nome_container.setPreferredSize(new java.awt.Dimension(400, 30));
        nome_container.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Nome:");
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        nome_container.add(jLabel4, gridBagConstraints);

        cadastroNome.setPreferredSize(new java.awt.Dimension(250, 30));
        cadastroNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroNomeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 16;
        nome_container.add(cadastroNome, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        nome_container.add(filler1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        principalJpanel.add(nome_container, gridBagConstraints);

        valor_container.setPreferredSize(new java.awt.Dimension(400, 30));
        valor_container.setLayout(new java.awt.GridBagLayout());

        cadastroValor.setPreferredSize(new java.awt.Dimension(250, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 16;
        valor_container.add(cadastroValor, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Valor:");
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        valor_container.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        valor_container.add(filler2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        principalJpanel.add(valor_container, gridBagConstraints);

        btnCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setPreferredSize(new java.awt.Dimension(94, 35));
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        principalJpanel.add(btnCadastrar, gridBagConstraints);

        btnProdutos.setText("Consultar Produtos");
        btnProdutos.setPreferredSize(new java.awt.Dimension(155, 35));
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        principalJpanel.add(btnProdutos, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        principalJpanel.add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        principalJpanel.add(filler4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        principalJpanel.add(filler6, gridBagConstraints);

        getContentPane().add(principalJpanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroNomeActionPerformed

    }//GEN-LAST:event_cadastroNomeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        listagemVIEW listagem = new listagemVIEW(); 
        this.setVisible(false);
     
        listagem.setVisible(true);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        try {
            ProdutosDTO produto = new ProdutosDTO();
            
            String nome = cadastroNome.getText();
            int valor = Integer.parseInt(cadastroValor.getText());
            String status = "A Venda";

            produto.setNome(nome);
            produto.setValor(valor);
            produto.setStatus(status);
            
            try {
                boolean prodCadastrado = produtoDAO.cadastrarProduto(produto);
                
                if(prodCadastrado) {
                    JOptionPane.showMessageDialog(this, produto.getNome() + " foi cadastrado !");
                    
                    cadastroNome.setText("");
                    cadastroValor.setText("");
                }
                        
            } catch (SQLException error) {
                JOptionPane.showMessageDialog(this, "Error ao tentar inserir produto no banco de dados.");
                System.out.println(error.getMessage());
            }
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(this, "Valor inválido.");
            System.out.println(error.getMessage());
        }
        
    }//GEN-LAST:event_btnCadastrarMouseClicked

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
            java.util.logging.Logger.getLogger(cadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JTextField cadastroNome;
    private javax.swing.JTextField cadastroValor;
    private javax.swing.JLabel desc;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel nome_container;
    private javax.swing.JPanel principalJpanel;
    private javax.swing.JLabel titulo;
    private javax.swing.JPanel valor_container;
    // End of variables declaration//GEN-END:variables
}
