package bdd;

import java.io.UnsupportedEncodingException;
import bdd.PersonLDAP;
import modele.LdapConnect;
import modele.LdapException;

class testMainPersonLDAP{
	public static void main(String[] args) throws UnsupportedEncodingException, LdapException{
		PersonLDAP personne = new PersonLDAP();
		personne.login("mdp");
		personne.ldapRecup();
	}
}