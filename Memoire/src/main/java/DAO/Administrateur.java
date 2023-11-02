package DAO;


public class Administrateur {
	
	private User compte;
	

	


	public Administrateur(User compte) {
		super();
		this.compte = compte;
		
	}



	public User getCompte() {
		return compte;
	}





	public void setCompte(User compte) {
		this.compte = compte;
	}
	
	
}
