package DAO;

import java.sql.Connection; // conexão SQL p/ java
import java.sql.DriverManager; // driver d econexão SQL p/ java
import java.sql.SQLException; //  tratamento de exceções
import javax.swing.JOptionPane; // Painel de messagem

public class ConexaoDAO {
    // metodo publico conectaBD()
    public Connection conectaBD(){
        // Variavel do tipo Connection chamada conn
        Connection conn = null;
        
        try { // try faz a verificação para gerar algo
            // 1º parametro refere-se ao drive de conexão jdbc:mysql://
            // 2º onde está nossa base de dados
            // 3º nome da base de dados
            // 4º usuario e a senha de acesso ao banco
            String url = "jdbc:mysql://localhost:3306/eeepaluno?user=root&password=db91939";
            // Armazenar o driver d egerenciamento na variavel
            // conn usando o metodo getConnection
            conn = DriverManager.getConnection(url);
            // Classe de Exception exceção
            // catch se não gerar terá exceção, objeto erro
        } catch (SQLException erro) {
            // getMessage() nome do nosso metodo
            JOptionPane.showMessageDialog(null, "Erro na Classe ConexãoDAO" + erro.getMessage());
        }
        return conn;
    }
}
