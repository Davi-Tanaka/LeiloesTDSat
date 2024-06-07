package com.main.view;


import com.main.dao.ProdutosDAO;
import com.main.dto.ProdutosDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class listagemVendasVIEW extends javax.swing.JFrame {

    private ProdutosDAO produtosDao = new ProdutosDAO();
    
    public listagemVendasVIEW() {
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
        flow = new javax.swing.JPanel();
        btn_container = new javax.swing.JPanel();
        btnProdutos = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listagem de vendas");
        setEnabled(false);

        grid.setLayout(new javax.swing.BoxLayout(grid, javax.swing.BoxLayout.PAGE_AXIS));

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
        listaProdutos.setPreferredSize(new java.awt.Dimension(300, 400));
        jScrollPane1.setViewportView(listaProdutos);

        grid.add(jScrollPane1);

        flow.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        flow.setPreferredSize(new java.awt.Dimension(456, 30));
        flow.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 0));

        btn_container.setLayout(new java.awt.GridBagLayout());

        btnProdutos.setText("Consultar Produtos");
        btnProdutos.setPreferredSize(new java.awt.Dimension(180, 30));
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        btn_container.add(btnProdutos, gridBagConstraints);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        btn_container.add(btnCadastrar, gridBagConstraints);

        flow.add(btn_container);

        grid.add(flow);

        getContentPane().add(grid, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        JFrame cadastroView = new cadastroVIEW();         
        this.setVisible(false);
        
        cadastroView.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(listagemVendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listagemVendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listagemVendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listagemVendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listagemVendasVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JPanel btn_container;
    private javax.swing.JPanel flow;
    private javax.swing.JPanel grid;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaProdutos;
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
