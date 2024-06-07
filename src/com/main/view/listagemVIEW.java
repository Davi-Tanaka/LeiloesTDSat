package com.main.view;


import com.main.dao.ProdutosDAO;
import com.main.dto.ProdutosDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class listagemVIEW extends javax.swing.JFrame {

    private ProdutosDAO produtosDao = new ProdutosDAO();
    
    public listagemVIEW() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        this.setUndecorated(false);
        this.setVisible(true);
        
        initComponents();
        
        try {
            ArrayList<ProdutosDTO> listagem = produtosDao.listarProdutos();
            listarProdutos(listagem);
        } catch(SQLException error) {
            JOptionPane.showConfirmDialog(this, "Error ao listar produtos :c");
            System.err.println(error);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        grid = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 16), new java.awt.Dimension(0, 16), new java.awt.Dimension(32767, 16));
        vender_prod_flow = new javax.swing.JPanel();
        vender_produto_container = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(16, 0), new java.awt.Dimension(16, 0), new java.awt.Dimension(16, 32767));
        jScrollPane2 = new javax.swing.JScrollPane();
        id_produto_venda = new javax.swing.JTextPane();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(16, 0), new java.awt.Dimension(16, 0), new java.awt.Dimension(16, 32767));
        btnVender = new javax.swing.JButton();
        btn_container = new javax.swing.JPanel();
        flow = new javax.swing.JPanel();
        btnVendas = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listagem de produtos");
        setPreferredSize(new java.awt.Dimension(720, 500));

        grid.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setMinimumSize(new java.awt.Dimension(720, 500));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(720, 300));

        listaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Valor", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaProdutos.setPreferredSize(new java.awt.Dimension(100, 300));
        jScrollPane1.setViewportView(listaProdutos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        grid.add(jScrollPane1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Produtos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        grid.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        grid.add(filler1, gridBagConstraints);

        vender_prod_flow.setLayout(new javax.swing.BoxLayout(vender_prod_flow, javax.swing.BoxLayout.LINE_AXIS));

        vender_produto_container.setMinimumSize(new java.awt.Dimension(100, 100));
        vender_produto_container.setPreferredSize(new java.awt.Dimension(50, 40));
        vender_produto_container.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 5));

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Vender Produto (ID):");
        vender_produto_container.add(jLabel2);
        vender_produto_container.add(filler3);

        id_produto_venda.setPreferredSize(new java.awt.Dimension(250, 20));
        jScrollPane2.setViewportView(id_produto_venda);

        vender_produto_container.add(jScrollPane2);
        vender_produto_container.add(filler2);

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        vender_produto_container.add(btnVender);

        vender_prod_flow.add(vender_produto_container);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        grid.add(vender_prod_flow, gridBagConstraints);

        btn_container.setLayout(new javax.swing.BoxLayout(btn_container, javax.swing.BoxLayout.LINE_AXIS));

        flow.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 0));

        btnVendas.setText("Consultar Vendas");
        btnVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVendasMouseClicked(evt);
            }
        });
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });
        flow.add(btnVendas);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        flow.add(btnVoltar);

        btn_container.add(flow);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        grid.add(btn_container, gridBagConstraints);

        getContentPane().add(grid, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        String id = id_produto_venda.getText();
        
        try {
            int prod_id = Integer.parseInt(id);
            try {
                ArrayList<ProdutosDTO> listagem = produtosDao.listarProdutos();
                produtosDao.vender(prod_id);
                listarProdutos(listagem);                
                
            } catch(SQLException error) {
                JOptionPane.showMessageDialog(this, "Erro ao tentar listar produtos");
                System.err.println(error);
            }
        } catch(NumberFormatException error) {
            System.err.println(error);
            
            JOptionPane.showMessageDialog(this, "ID invalido :c");
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        JFrame cadastroView = new cadastroVIEW();         
        this.setVisible(false);
        cadastroView.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendasMouseClicked
        // TODO add your handling code here:
        listagemVendasVIEW listagemDeVendasView = new listagemVendasVIEW();
        this.setVisible(false);
        listagemDeVendasView.setVisible(true);
    }//GEN-LAST:event_btnVendasMouseClicked

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
            java.util.logging.Logger.getLogger(listagemVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listagemVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listagemVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listagemVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listagemVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVendas;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel btn_container;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JPanel flow;
    private javax.swing.JPanel grid;
    private javax.swing.JTextPane id_produto_venda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaProdutos;
    private javax.swing.JPanel vender_prod_flow;
    private javax.swing.JPanel vender_produto_container;
    // End of variables declaration//GEN-END:variables

    private void listarProdutos(ArrayList<ProdutosDTO> produtos) {        
        try {            
            DefaultTableModel model = (DefaultTableModel) listaProdutos.getModel();
            model.setRowCount(0);
                        
            for (int i = 0; i < produtos.size(); i++) {
                model.insertRow(i, new Object[] {
                    produtos.get(i).getId(),
                    produtos.get(i).getNome(),
                    produtos.get(i).getValor(),
                    produtos.get(i).getStatus()
                });
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
