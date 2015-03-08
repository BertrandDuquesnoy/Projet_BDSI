package bdd;

import java.io.UnsupportedEncodingException;
import bdd.PersonLDAP;
import modele.LdapConnect;
import modele.LdapException;

class testMainPersonLDAP{
	public static void main(String[] args) throws UnsupportedEncodingException, LdapException{
		PersonLDAP personne = new PersonLDAP();
		LdapConnect co = new LdapConnect();
		co.Connect("duquesno7u","");
		personne.ldapRecup();
	}
}