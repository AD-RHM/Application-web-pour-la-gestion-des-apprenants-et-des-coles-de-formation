package DAO;



public class OffreFormation {
	private int id;
	private String nom_etablissement;
	private String nom_formateur;
	private String designation;
	private String description;
	private String duree;
	private float prix;
	
	
	public OffreFormation(int id, String nom_etablissement, String nom_formateur, String designation, String description, String duree, float prix) {
		super();
		this.id = id;
		this.nom_etablissement = nom_etablissement;
		this.nom_formateur = nom_formateur;
		this.designation = designation;
		this.description = description;
		this.duree = duree;
		this.prix = prix;
	}


	public OffreFormation() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom_etablissement() {
		return nom_etablissement;
	}


	public void setNom_etablissement(String nom_etablissement) {
		this.nom_etablissement = nom_etablissement;
	}


	public String getNom_formateur() {
		return nom_formateur;
	}


	public void setNom_formateur(String nom_formateur) {
		this.nom_formateur = nom_formateur;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDuree() {
		return duree;
	}


	public void setDuree(String duree) {
		this.duree = duree;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	} 
	
	
	
	
}
