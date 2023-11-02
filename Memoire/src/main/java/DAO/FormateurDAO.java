package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FormateurDAO {
	public FormateurDAO() {
		ConnexionBase.startConnection();
	}

	public boolean existFormateur(Formateur x) {
		boolean done = false;

		String query = "select * from formateur where nom=? and prenom = ? ";
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

	public boolean existFormateur(String email) {
		boolean done = false;

		String query = "select * from formateur where email=?";
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

	public boolean addFormateur(Formateur x) {
		boolean done = false;

		UserDAO u = new UserDAO();
		if (u.addUser(new User(x.getEmail(),x.getPassword())) == true) {
			String query = "insert into formateur (email,nom,prenom,adresse,num_tel) values (?,?,?,?,?)";
			PreparedStatement st = null;
			int rows = 0;
			try {
				st = ConnexionBase.connect.prepareStatement(query);
				st.setString(1, x.getEmail());
				st.setString(2, x.getNom());
				st.setString(3, x.getPrenom());
				st.setString(4, x.getAdresse());
				st.setString(5, x.getNum_tel());
			//	st.setBinaryStream(7, cv);
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

	public boolean updateFormateur(Formateur x) {
		String query = "update formateur set adresse=?, num_tel=? where nom=? and prenom=?";
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
	

	public ArrayList<Formateur> getAll() {
		
		String query = "select * from formateur, user where user.isvalide=? and formateur.email=user.email";
		PreparedStatement st = null;
		ResultSet r = null;
		ArrayList<Formateur> liste = new ArrayList<Formateur>();
		try {
			st = ConnexionBase.connect.prepareStatement(query);
			st.setInt(1, 0);

			r = st.executeQuery();
			
			while (r.next()) {				
				Formateur x = new Formateur();	
				x.setEmail(r.getString("email"));
				x.setNom( r.getString("nom"));
				x.setPrenom( r.getString("prenom"));
				x.setAdresse( r.getString("adresse"));
				x.setNum_tel( r.getString("num_tel"));

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

	public Formateur find(String email) {
		Formateur x = null;

		String query = "select * from formateur, user where apprenant.email=user.email and email =? ";
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
				x = new Formateur(c.getEmail(),c.getPassword());				
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
	
	public boolean deleteFormateur(String x) {
		String query = "delete from formateur where email= ?";
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
