package DAO;

import java.sql.Blob;

public class Formateur extends User {
	
	private String nom;
	private String prenom;
	private String num_tel;
	private String adresse;
	//private String cv;
	


	



	public Formateur() {
		super();
	}





	public Formateur(String email, String password) {
		super(email,password);
	}





	public Formateur( String email, String password,String nom, String prenom, String num_tel, String adresse/*, boolean Is_valide, String cv*/) {
		super(email,password);
		this.nom = nom;
		this.prenom = prenom;
		this.num_tel = num_tel;
		this.adresse = adresse;
		//this.Is_valide=Is_valide;
		//this.cv=cv;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	/*
	 * public String getEmail() { return email; }
	 * 
	 * 
	 * 
	 * public void setEmail(String email) { this.email = email; }
	 */


	



	public String getNum_tel() {
		return num_tel;
	}



	public void setNum_tel(String num_tel) {
		this.num_tel = num_tel;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}





	/*
	 * public boolean getIs_valide() { return Is_valide; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public void setIs_valide(boolean is_valide) { Is_valide = is_valide; }
	 * 
	 * 
	 * 
	 */

	/*
	 * public String getCv() { return cv; }
	 * 
	 * 
	 * 
	 * public void setCv(String cv) { this.cv = cv; }
	 */





	





	/*
	 * public boolean getIs_valide() { return Is_valide; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public void setIs_valide(boolean is_valide) { Is_valide = is_valide; }
	 * 
	 * 
	 * 
	 */


	/*
	 * public Blob getCv() { return cv; }
	 * 
	 * 
	 * 
	 * public void setCv(Blob cv) { this.cv = cv; }
	 */






	
	
}
