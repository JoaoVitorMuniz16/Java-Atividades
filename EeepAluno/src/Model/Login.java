package Model;

public class Login {

    private int idLogin;

    private String usuarioLogin;

    private String senhaLogin;

    public Login(String usuarioLogin, String senhaLogin) {
        this.usuarioLogin = usuarioLogin;
        this.senhaLogin = senhaLogin;
    }

    /*public Login(String text, String string) {
        this.usuarioLogin = usuarioLogin;
        this.senhaLogin = senhaLogin;
    }*/

    /**
     * @return the idLogin
     */
    public int getIdLogin() {
        return idLogin;
    }

    /**
     * @param idLogin the idLogin to set
     */
    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    /**
     * @return the usuarioLogin
     */
    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    /**
     * @param usuarioLogin the usuarioLogin to set
     */
    public void setUsuarioLogin(String usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    /**
     * @return the senhaLogin
     */
    public String getSenhaLogin() {
        return senhaLogin;
    }

    /**
     * @param senhaLogin the senhaLogin to set
     */
    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }
}
