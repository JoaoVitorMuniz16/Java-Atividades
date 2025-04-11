/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DAO.ConexaoDAO;
import Model.Curso;
import com.mysql.cj.CoreSession;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Professor
 */
public class ControleCurso {

    // variaveis globais
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Curso> lista = new ArrayList<>();

    public void cadastrarCurso(Curso objCurso) {

        String sql = "insert into curso(nomeCurso, statusCurso) values (?,?)";
        conn = new ConexaoDAO().conectaBD();
        // criando a exceção
        try {
            pstm = conn.prepareStatement(sql);
            // passamos a informação atraves do set
            // o get pega os valores da variavel
            // 1º paramento o nome do curso
            pstm.setString(1, objCurso.getNomeCurso());
            // 2º paramento o status do curso
            pstm.setString(2, objCurso.getStatusCurso());
            pstm.execute(); // pedir pra executar a variavel
            pstm.close(); // depois de executar fechar a conexão
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao Cadastrar verifique a classe ControleCurso no metodo cadastrarCurso" + erro);
        }
    }

    public ArrayList<Curso> consultarCurso() {
        String sql = "select * from curso";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            // como podemos ter varias informações no banco
            // crio um laço de repetição
            while (rs.next()) {  //  next próximo           
                Curso objCurso = new Curso(0, sql, sql);
                /* setando nesse objeto um valor no banco 
                coloco o nome igual q está na tabela curso pq qnd a 
                gente cadastrar pegamos a informação do curso 
                armazena no Curso e depois jogamos pro banco
                qnd consultamos e o contrario, pegamos a informação do banco
                armazena no Curso e depois pegamos p/ exibir ao usuario */
                objCurso.setIdCurso(rs.getInt("idCurso"));
                objCurso.setNomeCurso(rs.getString("nomeCurso"));
                objCurso.setStatusCurso(rs.getString("statusCurso"));
                // armazenar os objetos na lista
                lista.add(objCurso);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao Consultar Curso" + erro);
        }
        return lista;
    }

    public void alterarCurso(Curso objCurso) {
        String sql = "update curso set nomeCurso = ?, statusCurso = ? where idCurso = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCurso.getNomeCurso());
            pstm.setString(2, objCurso.getStatusCurso());
            pstm.setInt(3, objCurso.getIdCurso());
            pstm.executeUpdate();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,
                    "Erro na classe ControleCurso ao alterar os dados do curso" + erro);
        }
    }

    public void excluirCurso(Curso objCurso) {
        String sql = "DELETE FROM curso WHERE idCurso = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objCurso.getIdCurso());
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir curso: " + erro.getMessage());
        }
    }
}
