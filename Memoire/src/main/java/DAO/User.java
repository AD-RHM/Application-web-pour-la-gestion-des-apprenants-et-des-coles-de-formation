package DAO;




public class User {
	
	private String email;
	private String password;
	private int is_valide;
	
	
	
	
	
	
	public User() {
		
	}
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	
	
	public User(String email, String password, int is_valide) {
		super();
		this.email = email;
		this.password = password;
		this.is_valide = is_valide;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIs_valide() {
		return is_valide;
	}
	public void setIs_valide(int is_valide) {
		this.is_valide = is_valide;
	}


	/*
	 * public boolean getIs_valide() { return Is_valide; }
	 * 
	 * 
	 * public void setIs_valide(boolean is_valide) { Is_valide = is_valide; }
	 */
	
	
	

	
}
