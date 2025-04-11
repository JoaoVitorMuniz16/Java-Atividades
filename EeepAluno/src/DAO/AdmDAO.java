
package DAO;

import Model.Login;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AdmDAO {
    //  variavel global fora do metodo
    Connection conn; 
    // Acessar os objetos, então trago 
    // todos os objetos pra cá
    public ResultSet autenticarLogin(Login objLogin){
        // acessando minha classe de conexão 
        // com o nosso metodo conectaBD()
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "select * from login where usuarioLogin = ? and senhaLogin = ?";
            // prepar o objeto pstm a conexão e chamar a variavel sql
            PreparedStatement pstm = conn.prepareStatement(sql);
            // usando o objeto pstm p/ comparar
            // o que o usuario digitou e definir o paramentro
            pstm.setString(1, objLogin.getUsuarioLogin());
            pstm.setString(2, objLogin.getSenhaLogin());
            // executar tudo que foi passado
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na Classe AdmDAO" + erro.getMessage());
            return null;
        }
    }
        
    
}
