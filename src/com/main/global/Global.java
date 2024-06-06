package com.main.global;
import java.sql.Connection;

public class Global {
    private static Connection globalConn;
    
    public static void definirConexao(Connection conn) {
       globalConn = conn;
    }
    
    public static Connection retornarConexao() {
        return globalConn;
    }
}
