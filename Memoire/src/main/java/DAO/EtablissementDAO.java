package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EtablissementDAO {
	public EtablissementDAO() {
		ConnexionBase.startConnection();
	}

	public boolean existEtablissement(Etablissement x) {
		boolean done = false;

		String query = "select * from etablissement where nom_etablissement = ? ";
		PreparedStatement st = null;
		ResultSet r = null;
		try {
			st = ConnexionBase.connect.prepareStatement(query);
			st.setString(1, x.getNom_etablissement());
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

	public boolean existEtablissement(String email) {
		boolean done = false;

		String query = "select * from etablissement where email=?";
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

	public boolean addEtablissement(Etablissement x) {
		boolean done = false;

		UserDAO u = new UserDAO();
		if (u.addUser(new User(x.getEmail(),x.getPassword())) == true) {
			String query = "insert into etablissement (email,nom_etablissement,siege,num_tel,niveau,filiere,diplome,region,ville) values ( ?,?,?,?,?,?,?,?,?)";
			PreparedStatement st = null;
			int rows = 0;
			try {
				st = ConnexionBase.connect.prepareStatement(query);
				st.setString(1, x.getEmail());
				st.setString(2, x.getNom_etablissement());
				st.setString(3, x.getSiege());
				st.setString(4, x.getNum_tel());
				st.setString(5, x.getNiveau());
				st.setString(6, x.getFiliere());
				st.setString(7, x.getDiplome());
				st.setString(8, x.getRegion());
				st.setString(9, x.getVille());
				//st.setBlob(9, x.getAutorisation());
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

	public boolean updateEtablissement(Etablissement x) {
		String query = "update etablissement set num_tel=?, siege=?, niveau=?, filiere=?, diplome=?, region=? , ville=? where nom_etablissement=?";
		PreparedStatement st = null;
		int rows = 0;
		boolean done = false;
		try {
			st = ConnexionBase.connect.prepareStatement(query);

			st.setString(1, x.getNum_tel());
			st.setString(2, x.getSiege());
			st.setString(3, x.getNiveau());
			st.setString(4, x.getFiliere());
			st.setString(5, x.getDiplome());
			st.setString(6, x.getRegion());
			st.setString(7, x.getVille());
			st.setString(8, x.getNom_etablissement());


			//st.setBoolean(8, x.getIs_valide());
			//st.setBlob(9, x.getAutorisation());
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

	

	public ArrayList<Etablissement> getAll() {
		String query = "select * from etablissement, user where user.isvalide=? and etablissement.email=user.email";
		PreparedStatement st = null;
		ResultSet r = null;
		ArrayList<Etablissement> liste = new ArrayList<Etablissement>();
		try {
			st = ConnexionBase.connect.prepareStatement(query);
			st.setInt(1, 0);
			r = st.executeQuery();
			
			while (r.next()) {				
				
				Etablissement x = new Etablissement();
				x.setEmail(r.getString("email"));
				x.setNom_etablissement(r.getString("nom_etablissement"));
				x.setNum_tel(r.getString("num_tel"));
				x.setSiege( r.getString("siege"));
				x.setNiveau(r.getString("niveau"));
				x.setFiliere(r.getString("filiere"));
				x.setDiplome(r.getString("diplome"));
				x.setRegion(r.getString("region"));
				x.setVille(r.getString("ville"));
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

	public ArrayList<Etablissement> getAllInternaute() {
		String query = "select * from etablissement, user where user.isvalide=? and etablissement.email=user.email";
		PreparedStatement st = null;
		ResultSet r = null;
		ArrayList<Etablissement> liste = new ArrayList<Etablissement>();
		try {
			st = ConnexionBase.connect.prepareStatement(query);
			st.setInt(1, 1);
			r = st.executeQuery();
			
			while (r.next()) {				
				
				Etablissement x = new Etablissement();
				x.setEmail(r.getString("email"));
				x.setNom_etablissement(r.getString("nom_etablissement"));
				x.setNum_tel(r.getString("num_tel"));
				x.setSiege( r.getString("siege"));
				x.setNiveau(r.getString("niveau"));
				x.setFiliere(r.getString("filiere"));
				x.setDiplome(r.getString("diplome"));
				x.setRegion(r.getString("region"));
				x.setVille(r.getString("ville"));
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
	
	
	public Etablissement find(String email) {
		Etablissement x = null;

		String query = "select * from etablissement, user where etablissement.email=user.email and email =? ";
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
				x = new Etablissement(c.getEmail(),c.getPassword());				
				x.setNom_etablissement(r.getString("nom_etablissement"));
				x.setSiege( r.getString("siege"));
				x.setNum_tel( r.getString("num_tel"));

			}

			st.close();
			r.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	
	public boolean deleteEtablissement(String x) {
		String query = "delete from etablissement where email= ?";
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
