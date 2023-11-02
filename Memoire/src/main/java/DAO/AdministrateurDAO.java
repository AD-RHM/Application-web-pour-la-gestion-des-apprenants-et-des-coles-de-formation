package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AdministrateurDAO {
	public AdministrateurDAO() {
		ConnexionBase.startConnection();
	}

	

	public boolean existAdministrateur(String email) {
		boolean done = false;

		String query = "select * from administrateur where email=?";
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

	
	public boolean updateAdministrateur(Administrateur x) {
		String query = "update  administrateur set password=? where email=?";
		PreparedStatement st = null;
		int rows = 0;
		boolean done = false;
		try {
			st = ConnexionBase.connect.prepareStatement(query);

			st.setString(1, x.getCompte().getPassword());
			st.setString(2, x.getCompte().getEmail());
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

	

	

	public Apprenant find(String email) {
		Apprenant x = null;

		String query = "select * from administrateur, user where administrateur.email=user.email and email =? ";
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
				x.setNom( r.getString("nom"));
				x.setPrenom( r.getString("prenom"));

			}

			st.close();
			r.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}

}
