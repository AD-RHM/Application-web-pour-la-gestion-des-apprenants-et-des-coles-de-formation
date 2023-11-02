package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OffreFormationDAO {
	public OffreFormationDAO() {
		ConnexionBase.startConnection();
	}

	

	public boolean existOffreFormation(int id) {
		boolean done = false;

		String query = "select * from offreformation where id=?";
		PreparedStatement st = null;
		ResultSet r = null;
		try {
			st = ConnexionBase.connect.prepareStatement(query);
			st.setInt(1,id);			
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

	
	public boolean updateOffreFormation(OffreFormation x) {
		String query = "update offreformation set duree=?, prix=? where id=?";
		PreparedStatement st = null;
		int rows = 0;
		boolean done = false;
		try {
			st = ConnexionBase.connect.prepareStatement(query);

			st.setString(1, x.getDuree());
			st.setFloat(2, x.getPrix());
			st.setInt(3, x.getId());

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

	
	
	
	
	public boolean deleteOffreFormation(int x) {
		String query = "delete from offreformation where id= ?";
		PreparedStatement st = null;
		int rows = 0;
		boolean done = false;
		try {
			st = ConnexionBase.connect.prepareStatement(query);
			st.setInt(1, x);
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
	
	
	public boolean addOffreFormation(OffreFormation x) {
		boolean done = false;

		
			String query = "insert into offreformation (id,nom_etablissement,nom_formateur,designation,description,duree,Prix) values (?,?,?,?,?,?,?)";
			PreparedStatement st = null;
			int rows = 0;
			try {
				st = ConnexionBase.connect.prepareStatement(query);
				st.setInt(1, x.getId());
				st.setString(2, x.getNom_etablissement());
				st.setString(3, x.getNom_formateur());
				st.setString(4, x.getDesignation());
				st.setString(5, x.getDescription());
				st.setString(6, x.getDuree());
				st.setFloat(7, x.getPrix());
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
	
	public ArrayList<OffreFormation> getAll() {
		String query = "select * from offreformation ";
		PreparedStatement st = null;
		ResultSet r = null;
		ArrayList<OffreFormation> liste = new ArrayList<OffreFormation>();
			try {
					st = ConnexionBase.connect.prepareStatement(query);
	
					r = st.executeQuery();
					while (r.next()) {
						OffreFormation x = new OffreFormation();
						x.setId(r.getInt("id"));
						x.setNom_etablissement(r.getString("nom_etablissement"));
						x.setNom_formateur(r.getString("nom_formateur"));
						x.setDesignation(r.getString("designation"));
						x.setDescription(r.getString("description"));
						x.setDuree(r.getString("duree"));
						x.setPrix(r.getInt("prix"));
						
						
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

	
	

	

}
