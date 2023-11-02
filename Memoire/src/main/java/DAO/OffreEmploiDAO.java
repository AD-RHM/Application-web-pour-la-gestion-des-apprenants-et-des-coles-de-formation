package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OffreEmploiDAO {
	public OffreEmploiDAO() {
		ConnexionBase.startConnection();
	}

	

	public boolean existOffreEmploi(int x) {
		boolean done = false;

		String query = "select * from offreemploi where id=?";
		PreparedStatement st = null;
		ResultSet r = null;
		try {
			st = ConnexionBase.connect.prepareStatement(query);
			st.setInt(1,x);			
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

	
	public boolean updateOffreEmploi(OffreEmploi x) {
		String query = "update offreemploi set contrat=?, minexpr=?, salaire=? where id=?";
		PreparedStatement st = null;
		int rows = 0;
		boolean done = false;
		try {
			st = ConnexionBase.connect.prepareStatement(query);

			st.setString(1, x.getContrat());
			st.setString(2, x.getMinexpr());
			st.setInt(3, x.getSalaire());
			st.setInt(4, x.getId());

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

	
	
	
	
	public boolean deleteOffreEmploi(int x) {
		String query = "delete from offreemploi where id= ?";
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
	
	
	public boolean addOffreEmploi(OffreEmploi x) {
		boolean done = false;

		
			String query = "insert into offreemploi (id,nom_etablissement,designation,description,contrat,minexpr,salaire) values (?,?,?,?,?,?,?)";
			PreparedStatement st = null;
			int rows = 0;
			try {
				st = ConnexionBase.connect.prepareStatement(query);
				st.setInt(1, x.getId());
				st.setString(2, x.getNom_etablissement());
				st.setString(3, x.getDesignation());
				st.setString(4, x.getDescription());
				st.setString(5, x.getContrat());
				st.setString(6, x.getMinexpr());
				st.setInt(7, x.getSalaire());
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
	

		public ArrayList<OffreEmploi> getAll() {
			String query = "select * from offreemploi ";
			PreparedStatement st = null;
			ResultSet r = null;
			ArrayList<OffreEmploi> liste = new ArrayList<OffreEmploi>();
				try {
						st = ConnexionBase.connect.prepareStatement(query);
		
						r = st.executeQuery();
						while (r.next()) {
							OffreEmploi x = new OffreEmploi();
							x.setId(r.getInt("id"));
							x.setNom_etablissement(r.getString("nom_etablissement"));
							x.setDesignation(r.getString("designation"));
							x.setDescription(r.getString("description"));
							x.setContrat(r.getString("contrat"));
							x.setMinexpr(r.getString("minexpr"));
							x.setSalaire(r.getInt("salaire"));
							
							
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
