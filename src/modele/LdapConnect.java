/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modele;

import org.ietf.ldap.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import modele.LdapException;

public class LdapConnect {

	private String ldapHost = "ldap.telecomnancy.univ-lorraine.fr";
	private String searchBase = "dc=telecomnancy, dc=univ-lorraine, dc=fr";
	private String searchFilter = "(objectclass=*)";
	private  String login;
	private String groupe;
	private  String passwd;

	private int userID;

	public LdapConnect() {
	}

	public boolean Connect(String login, String passwd) throws java.io.UnsupportedEncodingException, LdapException {

		try {
			System.out.println("Je rentre dans testConnect !");
			this.login = login;
			int ldapPort = LDAPConnection.DEFAULT_PORT;
			int ldapVersion = 3;

			LDAPConnection lc = new LDAPConnection();

			// connexion anonyme au serveur
			lc.connect(ldapHost, ldapPort);

			if (!lc.isConnected()) {
				// throw new LdapException("probleme de connexion!");
				return false;
			}

			/*
			 * System.out.println("Avant update : "+login);
			 * updateDataBase(login);
			 */
			System.out.println("Apres update");
			String searchFilterExpand = "(&" + searchFilter + "(uid=" + login + "))";

			LDAPSearchResults searchResults = lc.search(searchBase,LDAPConnection.SCOPE_SUB, searchFilterExpand, null, false);

			String loginDN = "";
			// System.out.println(searchResults.next().getDN());
			if (searchResults.hasMore()) {
				loginDN = searchResults.next().getDN();
				// System.out.println("loginDN:"+loginDN );
			} else {
				// throw new LdapException("login incorrect !");
				return false;
			}
			if (loginDN.contains("ETUDIANTS")) {
				groupe = "ETUDIANTS";
				System.out.println("Groupe : " + groupe);
			}
			if (loginDN.contains("EqTech")) {
				groupe = "EqTech";
				System.out.println("Groupe : " + groupe);
			}
			if (loginDN.contains("panetto5")) {
				groupe = "Respo";
				System.out.println("Groupe : " + groupe);
			}

			// authentification
			try {
				lc.bind(ldapVersion, loginDN, passwd.getBytes("UTF8"));
			} catch (LDAPException e1) {
				// throw new LdapException("mot de passe incorrect !");
				return false;
			}

			// deconnexion
			lc.disconnect();
			return true;
		} catch (LDAPException e1) {
			// LdapException("Erreur interne LDAP : "+e1.getMessage());
			return false;
		}
	}

	public String getLogin() {
		return login;
	}

	public String getGroup() {
		return groupe;
	}

	public String getPasswd() {
		return passwd;
	}

	public void raz() {
		this.login = "";
		this.groupe = "";
	}

	private void updateDataBase(String login) {
		System.out.println("T1");
		// Person p = new Person();
		System.out.println("T2");
		// userID = p.addToDataBase2(login);
		System.out.println("T3");
		System.out.println("userid = " + userID);

	}

	public String getUserID() {
		return "" + userID;
	}

}