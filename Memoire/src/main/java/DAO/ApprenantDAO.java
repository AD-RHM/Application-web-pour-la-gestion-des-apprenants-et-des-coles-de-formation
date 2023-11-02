package DAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ApprenantDAO {
	public ApprenantDAO() {
		ConnexionBase.startConnection();
	}

	public boolean existApprenant(Apprenant x) {
		boolean done = false;

		String query = "select * from apprenant where nom=? and prenom = ? ";
		PreparedStatement st = null;
		ResultSet r = null;
		try {
			st = ConnexionBase.connect.prepareStatement(query);
			st.setString(1, x.getNom());
			st.setString(2, x.getPrenom());
			r = st.executeQuery();
			if (r.next())
				done = true;
			st.close();
			r.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return done;
	}

	public boolean existApprenant(String email) {
		boolean done = false;

		String query = "select * from apprenant where email=?";
		PreparedStatement st = null;
		ResultSet r = null;
		try {
			st = ConnexionBase.connect.prepareStatement(query);
			st.setString(1,email);			
			r = st.executeQuery();
			if (r.next())
				done = true;
			st.close();
			r.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return done;
	}

	public boolean addApprenant(Apprenant x) {
		boolean done = false;

		UserDAO u = new UserDAO();
		if (u.addUser(new User(x.getEmail(),x.getPassword())) == true) {
			String query = "insert into apprenant (email,nom,prenom,adresse,num_tel) values (?,?,?,?,?)";
			PreparedStatement st = null;
			int rows = 0;
			try {
				st = ConnexionBase.connect.prepareStatement(query);
				st.setString(1, x.getEmail());
				st.setString(2, x.getNom());
				st.setString(3, x.getPrenom());
				st.setString(4, x.getAdresse());
				st.setString(5, x.getNum_tel());
			
				rows = st.executeUpdate();
				if (rows > 0)
					done = true;
				st.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 

		}
		return done;
	}

	public boolean updateApprenant(Apprenant x) {
		String query = "update apprenant set adresse=?, num_tel=? where nom=? and prenom=?";
		PreparedStatement st = null;
		int rows = 0;
		boolean done = false;
		try {
			st = ConnexionBase.connect.prepareStatement(query);

			
			st.setString(1, x.getAdresse());
			st.setString(2, x.getNum_tel());
			st.setString(3, x.getNom());
			st.setString(4, x.getPrenom());
			rows = st.executeUpdate();
			if (rows > 0)
				done = true;
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return done;
	}

	

	public ArrayList<Apprenant> getAll() {
//		String query = "select * from apprenant, user where apprenant.email=user.email";
		
		String query = "select * from apprenant, user where user.isvalide=? and apprenant.email=user.email";
		PreparedStatement st = null;
		ResultSet r = null;
		ArrayList<Apprenant> liste = new ArrayList<Apprenant>();
		try {
			st = ConnexionBase.connect.prepareStatement(query);
			st.setInt(1, 0);

			r = st.executeQuery();
			
			while (r.next()) {				
				User u = new User();
				u.setIs_valide(r.getInt("isvalide"));
				Apprenant x = new Apprenant();	
				x.setEmail(r.getString("email"));
				x.setNom( r.getString("nom"));
				x.setPrenom( r.getString("prenom"));
				x.setAdresse( r.getString("adresse"));
				x.setNum_tel( r.getString("num_tel"));
			//	x.setIs_valide(r.getInt("isvalide"));
				liste.add(x);
			}

			st.close();
			r.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	public Apprenant find(String email) {
		Apprenant x = null;

		String query = "select * from apprenant, user where apprenant.email=user.email and email =? ";
		PreparedStatement st = null;
		ResultSet r = null;
		ArrayList<User> liste = new ArrayList<User>();
		try {
			st = ConnexionBase.connect.prepareStatement(query);
			st.setString(1, email);
			r = st.executeQuery();
			
			if (r.next()) {
			
				User c=new User();
				c.setEmail(r.getString("email"));
				c.setPassword(r.getString("password"));
				x = new Apprenant(c.getEmail(),c.getPassword());				
				x.setNom( r.getString("nom"));
				x.setPrenom( r.getString("prenom"));
				x.setAdresse( r.getString("adresse"));
				x.setNum_tel( r.getString("num_tel"));
			//	x.setIs_valide( r.getBoolean("Is_valide"));	

			}

			st.close();
			r.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}

	
	public boolean deleteApprenant(String x) {
		String query = "delete from apprenant where email= ?";
		PreparedStatement st = null;
		int rows = 0;
		boolean done = false;
		try {
			st = ConnexionBase.connect.prepareStatement(query);
			st.setString(1, x);
			rows = st.executeUpdate();
			if (rows > 0)
				done = true;
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return done;
	}
}
