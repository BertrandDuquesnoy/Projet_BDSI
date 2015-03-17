package bdd;

import java.io.UnsupportedEncodingException;

import bdd.PersonLDAP;
import modele.LdapConnect;
//import modele.LdapConnectPswd;
import modele.LdapException;

class testMainPersonLDAP{
	public static void main(String[] args) throws UnsupportedEncodingException, LdapException{
		PersonLDAP personne = new PersonLDAP();
		//LdapConnect co = new LdapConnect();
		//co.Connect("panetto5","");
		//LdapConnectPswd co = new LdapConnectPswd();
		//co.validateLogin("duquesno7u","");
		//personne.ldapRecup();
	}
}