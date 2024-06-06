package com.main;

import com.main.dao.ConectaDAO;
import com.main.global.Global;
import com.main.view.cadastroVIEW;

import java.sql.Connection;
import javax.swing.JFrame;

public class Main {
    private static JFrame cadastroView;

    public static void main(String[] args) {  
        config();
        
        cadastroView = new cadastroVIEW();
        cadastroView.setVisible(true);
    }
    
    private static void config() {
        Connection conn = new ConectaDAO().connect("localhost", "root", " ", "uc11", 3306);
        Global.definirConexao(conn);
    } 
}
