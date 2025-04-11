package Model;

import Controller.ControleAdministrador;
import java.util.Date;

public class Aluno {

    private int idAluno;

    private int matriculaAluno;

    private String nomeAluno;

    private String cpfAluno;

    private String rgAluno;

    private Date dataNascAluno;

    private int idadeAluno;

    private String enderecoAluno;

    private ControleAdministrador controleAdministrador;

    private Curso curso;

    /**
     * @return the idAluno
     */
    public int getIdAluno() {
        return idAluno;
    }

    /**
     * @param idAluno the idAluno to set
     */
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    /**
     * @return the matriculaAluno
     */
    public int getMatriculaAluno() {
        return matriculaAluno;
    }

    /**
     * @param matriculaAluno the matriculaAluno to set
     */
    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    /**
     * @return the nomeAluno
     */
    public String getNomeAluno() {
        return nomeAluno;
    }

    /**
     * @param nomeAluno the nomeAluno to set
     */
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    /**
     * @return the cpfAluno
     */
    public String getCpfAluno() {
        return cpfAluno;
    }

    /**
     * @param cpfAluno the cpfAluno to set
     */
    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    /**
     * @return the rgAluno
     */
    public String getRgAluno() {
        return rgAluno;
    }

    /**
     * @param rgAluno the rgAluno to set
     */
    public void setRgAluno(String rgAluno) {
        this.rgAluno = rgAluno;
    }

    /**
     * @return the dataNascAluno
     */
    public Date getDataNascAluno() {
        return dataNascAluno;
    }

    /**
     * @param dataNascAluno the dataNascAluno to set
     */
    public void setDataNascAluno(Date dataNascAluno) {
        this.dataNascAluno = dataNascAluno;
    }

    /**
     * @return the idadeAluno
     */
    public int getIdadeAluno() {
        return idadeAluno;
    }

    /**
     * @param idadeAluno the idadeAluno to set
     */
    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }

    /**
     * @return the enderecoAluno
     */
    public String getEnderecoAluno() {
        return enderecoAluno;
    }

    /**
     * @param enderecoAluno the enderecoAluno to set
     */
    public void setEnderecoAluno(String enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }
}
