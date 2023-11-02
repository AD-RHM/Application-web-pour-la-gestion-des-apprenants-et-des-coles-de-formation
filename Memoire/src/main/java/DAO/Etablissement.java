package DAO;

import java.sql.Blob;

public class Etablissement extends User {
	
	private String nom_etablissement;
	private String num_tel;
	private String siege;
	private String niveau;
	private String filiere;
	private String diplome;
	private String region;
	private String ville;
	//private boolean Is_valide;
	//private Blob autorisation;
	
	
	public Etablissement(String email, String password) {
		super(email, password);
	}
	
	
	public Etablissement(String email, String password, String nom_etablissement, String num_tel, String siege, String niveau,String filiere, String diplome, String region, String ville) {
		super(email, password);
		this.nom_etablissement = nom_etablissement;
		this.num_tel = num_tel;
		this.siege = siege;
		this.niveau = niveau;
		this.filiere = filiere;
		this.diplome = diplome;
		this.region = region;
		this.ville = ville;
	}
	
	
	
	
	
	
	
	public Etablissement(String nom_etablissement, String num_tel, String siege, String niveau, String filiere,
			String diplome, String region, String ville) {
		super();
		this.nom_etablissement = nom_etablissement;
		this.num_tel = num_tel;
		this.siege = siege;
		this.niveau = niveau;
		this.filiere = filiere;
		this.diplome = diplome;
		this.region = region;
		this.ville = ville;
	}


	public Etablissement() {
		super();
	}


	public String getNom_etablissement() {
		return nom_etablissement;
	}
	public void setNom_etablissement(String nom_etablissement) {
		this.nom_etablissement = nom_etablissement;
	}
	public String getNum_tel() {
		return num_tel;
	}
	public void setNum_tel(String num_tel) {
		this.num_tel = num_tel;
	}
	public String getSiege() {
		return siege;
	}
	public void setSiege(String siege) {
		this.siege = siege;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}


	
	
}
