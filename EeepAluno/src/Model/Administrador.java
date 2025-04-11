
package Model;

import Controller.ControleAdministrador;

public class Administrador extends Login {

    public Administrador() {
        super(JtfUsuario.getText(), new String(JpfSenha.getPassword()));
    }

    private int idAdmin;

    private String nomeAdmin;

    private String emailAdmin;

    private String telefoneAdmin;

    private ControleAdministrador controleAdministrador;

    /**
     * @return the idAdmin
     */
    public int getIdAdmin() {
        return idAdmin;
    }

    /**
     * @param idAdmin the idAdmin to set
     */
    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    /**
     * @return the nomeAdmin
     */
    public String getNomeAdmin() {
        return nomeAdmin;
    }

    /**
     * @param nomeAdmin the nomeAdmin to set
     */
    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    /**
     * @return the emailAdmin
     */
    public String getEmailAdmin() {
        return emailAdmin;
    }

    /**
     * @param emailAdmin the emailAdmin to set
     */
    public void setEmailAdmin(String emailAdmin) {
        this.emailAdmin = emailAdmin;
    }

    /**
     * @return the telefoneAdmin
     */
    public String getTelefoneAdmin() {
        return telefoneAdmin;
    }

    /**
     * @param telefoneAdmin the telefoneAdmin to set
     */
    public void setTelefoneAdmin(String telefoneAdmin) {
        this.telefoneAdmin = telefoneAdmin;
    }
    
    

}
