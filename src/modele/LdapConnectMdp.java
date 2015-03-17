package modele;

import java.io.UnsupportedEncodingException;

import org.ietf.ldap.LDAPConnection;
import org.ietf.ldap.LDAPException;
import org.ietf.ldap.LDAPSearchResults;

import bdd.PersonLDAP;

class LdapConnectMdp{
	public static void authentifier(String login, String mdp) throws LdapException, UnsupportedEncodingException{
		String groupe="";
		String ldapHost="ldap.telecomnancy.univ-lorraine.fr";
		String searchBase = "dc=telecomnancy, dc=univ-lorraine, dc=fr";
		String searchFilter = "(objectclass=*)";
		try {
			System.out.println("Je rentre dans testConnect !");
			
			int ldapPort = LDAPConnection.DEFAULT_PORT;
			int ldapVersion = 3;

			LDAPConnection lc = new LDAPConnection();

			// connexion anonyme au serveur
			lc.connect(ldapHost, ldapPort);
			if (!lc.isConnected()) {
				throw new LdapException("probleme de connexion!");
				
			}
			System.out.println("Apres update");
			String searchFilterExpand = "(&" + searchFilter + "(uid=" + login + "))";

			LDAPSearchResults searchResults = lc.search(searchBase,LDAPConnection.SCOPE_SUB, searchFilterExpand, null, false);

			String loginDN = "";
			// System.out.println(searchResults.next().getDN());
			if (searchResults.hasMore()) {
				loginDN = searchResults.next().getDN();
				// System.out.println("loginDN:"+loginDN );
			} else {
				throw new LdapException("login incorrect !");
				
			}
			if (loginDN.contains("ETUDIANTS")) {
				groupe = "Etudiant";
				System.out.println("Groupe : " + groupe);
			}
			if (loginDN.contains("EqTech")) {
				groupe = "Administrateur";
				System.out.println("Groupe : " + groupe);
			}
			if (loginDN.contains("EqPedag") && !loginDN.contains("panetto5")) {
				groupe = "Professeur";
				System.out.println("Groupe : " + groupe);
			}
			if (loginDN.contains("EqAdmin")) {
				groupe = "Pôle Relations Internationales";
				System.out.println("Groupe : " + groupe);
			}
			if (loginDN.contains("panetto5")) {
				groupe = "Responsable Relations Internationales";
				System.out.println("Groupe : " + groupe);
			}
			// authentification
			try {
				lc.bind(ldapVersion, loginDN, mdp.getBytes("UTF8"));
				System.out.println("mot de passe correct !");
			} catch (LDAPException e1) {
				throw new LdapException("mot de passe incorrect !");
				
			}
			// deconnexion
			lc.disconnect();
			
		} catch (LDAPException e1) {
			throw new LdapException("Erreur interne LDAP : "+e1.getMessage());			
		}
	}
	public static void main(String[] args) throws UnsupportedEncodingException, LDAPException, LdapException{
		authentifier("duquesno7u","lol");
	}
}