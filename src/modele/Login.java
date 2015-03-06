/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author boute0161
 */
public class Login {

    private String username;
    private String password;

    /**
     *
     */
    public Login() {
        this.username = "";
        this.password = "";
    }

    /**
     *
     * @param user
     * @param pass
     */
    public void initializeParam(String user, String pass) {
        this.username = user;
        this.password = pass;
    }

    /**
     *
     * @return
     */
    public boolean testParam() {
        if (username.compareTo("") == 0 || password.compareTo("") == 0) {
            System.err.println("param�tres invalides");
            return false;
        } else {
            if (username.compareTo("toto") != 0) {
                return false;
            }
            if (password.compareTo("root") != 0) {
                return false;
            }
            return true;
        }
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

}

