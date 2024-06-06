package com.main.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectaDAO {   
    private Connection conn = null;

    public Connection connect(
        String host,
        String usuario,
        String senha,
        String nome_banco,
        int porta
    ){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("MySQL Driver carregado!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("MySQL Drive não encontrado", e);
        }
                
        try {
            String url = String.format(
                "jdbc:mysql://%s:%s/%s?useSSL=false", 
                host, 
                porta,
                nome_banco
            );
                
            conn = DriverManager.getConnection(url, usuario, senha);   
             
            if(conn != null) {
                System.out.println("Conexão com o bando definida !");
            }
            System.out.println("Uma nova conexão com o banco de dados foi criada");
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO" + erro.getMessage());
        }
       
        return conn;
    }
}
