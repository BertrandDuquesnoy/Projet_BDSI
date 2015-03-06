/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modele;

/**
 *
 * @author tref0011
 */
import java.lang.Exception;

public class LdapException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LdapException(String message) {
        super(message);
    }

}

