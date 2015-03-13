package bdd;

import java.io.UnsupportedEncodingException;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;

import modele.LdapException;
import modele.LdapConnect;

import beans.PersonBean;

import org.ietf.ldap.*;

//import eu.telecomnancy.bdsi.dao.DaoFactory;

public class PersonLDAP extends LdapConnect {

	private String login;
	private String year;
	private String mail;
	private String firstName;
	private String lastName;
	private String categorie;

	public PersonLDAP() {
		login="";
		year="";
		mail="";
		firstName="";
		lastName="";
		categorie="";
	}

	public PersonLDAP(String login, String year, String mail, String firstName,
			String lastName, String categorie) {
		super();
		this.login = login;
		this.year = year;
		this.mail = mail;
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String _firstName) {
		this.firstName = _firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String _lastName) {
		this.lastName = _lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String _login) {
		this.login = _login;
	}

	/*public boolean login() throws java.io.UnsupportedEncodingException, LdapException
	{
		try {
			if (Connect(LdapConnect.getLogin(),LdapConnect.getPasswd())) { //faux
				return true;
			} else return false;
		} catch (UnsupportedEncodingException ex) {
			Logger.getLogger(PersonLDAP.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		} catch (LdapException ex) {
			Logger.getLogger(PersonLDAP.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}*/

	public static ArrayList<PersonLDAP> ldapRecup() throws java.io.UnsupportedEncodingException, LdapException{
		ArrayList<PersonLDAP> lp = new ArrayList<PersonLDAP>();
		try {
			//variables de configuration de ldap
			System.out.println("Recup avant co");
			String ldapHost = "ldap.telecomnancy.univ-lorraine.fr";
			String searchBase = "dc=telecomnancy,dc=univ-lorraine,dc=fr";
			int ldapPort = LDAPConnection.DEFAULT_PORT;
			LDAPConnection lc = new LDAPConnection();
			lc.connect(ldapHost, ldapPort);
			System.out.println("Recup apres co/Avant recherche");
			String searchFilterExpand = "(&(objectclass=*)(uid=*))";
			String[] attr = {"uid","supannEtuCursusAnnee","primarymail","givenName","sn", "eduPersonAffiliation"};
			LDAPSearchResults searchResults = lc.search(searchBase, LDAPConnection.SCOPE_SUB, searchFilterExpand, attr, false);
			System.out.println("Recup apres recherche");
			while ( searchResults.hasMore() ) {
				LDAPEntry entry = searchResults.next();
				lp.add(getEntry(entry, attr));
			}
			lc.disconnect();
			System.out.println("\nDéconnecté !");
			return lp;
		} catch (LDAPException e1) {
		}
		return lp;
	}

	@SuppressWarnings({ "unused", "rawtypes" })
	public static PersonLDAP getEntry(LDAPEntry entry, String[] attrs) {
		PersonLDAP p;
		ArrayList<String> als = new ArrayList<String>();
		ArrayList<PersonBean> pbList = new ArrayList<PersonBean>();

		for (int i=0; i < attrs.length; i++) {
			LDAPAttribute attr = entry.getAttribute(attrs[i]);
			if (attr == null) {
				System.out.println("    [" + attrs[i] + ": not present]");
				als.add("");
				continue;
			}

			Enumeration enumVals = attr.getStringValues();
			boolean hasVals = false;
			while ( (enumVals != null) && (enumVals.hasMoreElements()) ) {           	
				String val = (String) enumVals.nextElement();
				System.out.println("    [" + attrs[i] + ": " + val + "]");
				//stocker ici les infos de chaque personne
				PersonBean pb = new PersonBean();
				switch(attrs[i]){
				case "uid": 
				break;

				case "supannEtuCursusAnnee": pb.setAnnee(val);
				break;

				case "primarymail": pb.setMail(val);
				break;

				case "givenName": pb.setPrenom(val); System.out.println("prénom : "+pb.getPrenom());
				break;

				case "sn": pb.setNom(val);
				break;

				case "eduPersonAffiliation": pb.setCategorie(val);
				break;
				}
				pbList.add(pb);
				hasVals = true;
				als.add(val);
			}
			if (!hasVals) {
				System.out.println("    [" + attrs[i] + ": has no values]");                
				als.add("");
			}
		}
		System.out.println("---------------------------------------------");
		//System.out.println("Récap de l'utilisateur : " + als); // ordre : uid, annéeEtude, mail, prénom, nom, catégorie
		System.out.println("pbList : "+pbList);
		return p = new PersonLDAP(als.get(0),als.get(1),als.get(2),als.get(3),als.get(4),als.get(5));
	}

	public String toString() {
		return "Person [login=" + login + ", year=" + year + ", mail=" + mail
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", affectation=" +  "]";
	}	
	public String toStringDataBase() {
		String res ="\n[";
		res+=login+';'+mail+";gender;date_of_birth;"+firstName+';'+lastName+";speciality;"+year+']';
		return res;
	}

	public void updateUser(java.sql.Connection tunnel) throws SQLException{
		String label="";
		CallableStatement update_user = tunnel.prepareCall("{call update_user(?,?,?,?,?,?,?,?,?)}");
		//label,user_name,email,gender,date_of_birth,first_name,last_name,speciality,level_user
		String tempMail=null;
		if(this.getMail().equals("") | this.getMail()==null) tempMail=null;
		else tempMail=this.getMail();
		update_user.setString(1, label);
		update_user.setString(2, this.getLogin());
		update_user.setString(3,tempMail);
		update_user.setDate(4, null);			
		update_user.setString(5, null);
		update_user.setString(6, this.getFirstName());
		update_user.setString(7,this.getLastName());
		update_user.setString(8, null);
		update_user.setString(9, this.getYear());
		System.out.println(update_user.toString());
		System.out.println(this.getMail().length());
		update_user.execute();
		update_user.close();
	}

	/*
	public static Profil getProfil(java.sql.Connection tunnel, String user_name) throws SQLException{
			System.out.println("Get profil : deb");
			Profil resProfil;
			CallableStatement get_profil = tunnel.prepareCall("{call get_profil(?)}");
			get_profil.setString(1, user_name);
		    //get_profil.registerOutParameter(1, java.sql.Types.VARCHAR);
		    System.out.println("Get profil : exe");
			get_profil.execute();
			ResultSet res =get_profil.getResultSet();
		    res.next();
		          String label = res.getString("label");
		          if(label==null)label="";
		          String user_id = res.getString("user_id");
		          if(user_id==null)user_id="";
		          String email = res.getString("email");
		          if(email==null)email="";
		          String gender = res.getString("gender");
		          if(gender==null)gender="";
		          String firstName = res.getString("first_name");
		          if(firstName==null)firstName="";
		          String lastName = res.getString("last_name");
		          if(lastName==null)lastName="";
		          Date birthT = res.getDate("date_of_birth");
		          String birth="";
		          if(birthT!=null)birth=birthT.toString();
		          String speciality = "";
		          String level_user = "";
		          try{
		        	  speciality = res.getString("speciality");
			          if(speciality==null)speciality="";
			          level_user = res.getString("level_user");
			          if(level_user==null)level_user="";
		          }catch(Exception e){

		          }
		    System.out.println(label+' '+user_id+' '+email+' '+gender+' '+firstName+' '+lastName+' '+birth+' '+speciality+' '+level_user);

			//System.out.println("Label : " + get_profil.getString("label"));
		    res.close();
			get_profil.close();
			System.out.println("Get profil : end");
			resProfil = new Profil(label,user_id,email,gender,firstName,lastName,birth,speciality,level_user);
			return resProfil;
	}*/
}

