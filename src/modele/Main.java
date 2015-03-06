package modele;

import java.io.UnsupportedEncodingException;

import modele.LdapConnect;
import modele.LdapException;

class Main{
	
	public static void main(String[] args) throws UnsupportedEncodingException, LdapException{
		LdapConnect co = new LdapConnect();
		co.testConnect("duquesno7u","mdp");
	}
	
}