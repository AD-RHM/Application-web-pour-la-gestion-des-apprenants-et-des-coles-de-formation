package DAO;



public class OffreEmploi {
	private int id;
	private String nom_etablissement;
	private String designation;
	private String description;
	private String contrat;
	private String minexpr;
	private int salaire;
	
	
	
	
	
	
	public OffreEmploi() {
		super();
	}
	
	
	
	
	public OffreEmploi(int id) {
		super();
		this.id = id;
	}




	public OffreEmploi(int id, String contrat, String minexpr, int salaire) {
		super();
		this.id = id;
		this.contrat = contrat;
		this.minexpr = minexpr;
		this.salaire = salaire;
	}




	public OffreEmploi(int id, String nom_etablissement, String designation, String description, String contrat,
			String minexpr, int salaire) {
		super();
		this.id = id;
		this.nom_etablissement = nom_etablissement;
		this.designation = designation;
		this.description = description;
		this.contrat = contrat;
		this.minexpr = minexpr;
		this.salaire = salaire;
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
	public String getContrat() {
		return contrat;
	}
	public void setContrat(String contrat) {
		this.contrat = contrat;
	}
	public String getMinexpr() {
		return minexpr;
	}
	public void setMinexpr(String minexpr) {
		this.minexpr = minexpr;
	}
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	
	
	
	}
