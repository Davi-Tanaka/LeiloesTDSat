package com.main.dao;

import com.main.dto.ProdutosDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.main.global.Global;
import java.sql.SQLException;

public class ProdutosDAO {
    Connection conn = Global.retornarConexao();

    public boolean cadastrarProduto (ProdutosDTO produto) throws SQLException  {
        PreparedStatement prep = conn.prepareStatement("INSERT INTO produtos(nome, valor, status) VALUES (?,?,?)");

        prep.setString(1, produto.getNome());
        prep.setInt(2, produto.getValor());
        prep.setString(3, produto.getStatus());            

        
        return prep.executeUpdate() > 0;
    }
    
    public ArrayList<ProdutosDTO> listarProdutos() throws SQLException {
        ArrayList<ProdutosDTO> listagem = new ArrayList<>();
        PreparedStatement prep = conn.prepareStatement("SELECT id, nome, valor, status FROM produtos");
        ResultSet resultSet;
        
        resultSet = prep.executeQuery();
        
        while(resultSet.next()) {
            int     id      = resultSet.getInt("id");
            String  nome    = resultSet.getString("nome");
            int     valor   = resultSet.getInt("valor");
            String  status  = resultSet.getString("status");

            ProdutosDTO prod = new ProdutosDTO();
            
            prod.setId(id);
            prod.setNome(nome);
            prod.setValor(valor);
            prod.setStatus(status);

            listagem.add(prod);
        }

        return listagem;
    }       
    
    public boolean vender(int produtoId) {
        try {
            PreparedStatement prep = conn.prepareStatement("UPDATE produtos SET status='Vendido' WHERE id = ?");
            prep.setInt(1, produtoId);
            
            return prep.executeUpdate() > 0;         
        } catch(SQLException error) {
            return false;
        }        
    }
    
    public ArrayList<ProdutosDTO> listartProdutosVendidos() throws SQLException {
        ArrayList<ProdutosDTO> produtosVendidos = new ArrayList<>();
        
        PreparedStatement prep = conn.prepareStatement("SELECT id, nome, valor, status FROM produtos WHERE status = 'Vendido'");
        ResultSet resultSet = prep.executeQuery();
        
        while(resultSet.next()) {
            int id = resultSet.getInt("id");
            String nome = resultSet.getString("nome");
            int valor = resultSet.getInt("valor");
            String status = resultSet.getString("status");
            
            ProdutosDTO prod = new ProdutosDTO();
            
            prod.setId(id);
            prod.setNome(nome);
            prod.setValor(valor);
            prod.setStatus(status);
            
            produtosVendidos.add(prod);
        }
        
        return produtosVendidos;
    }
}