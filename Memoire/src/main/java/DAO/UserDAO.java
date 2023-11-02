package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {
	

	public UserDAO() {
		ConnexionBase.startConnection();

	}

	public boolean existUser(String email) {
		boolean done = false;

		String query = "select * from user where email = ?";
		PreparedStatement st = null;
		ResultSet r = null;
		try {
			st = ConnexionBase.connect.prepareStatement(query);
			st.setString(1, email);
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

	public boolean existUser(String email, String password, int is_valide) {
		String query = "select * from user where email = ? and password = ? and isvalide = ?";
		PreparedStatement st = null;
		ResultSet r = null;
		boolean done = false;
		try {
			st = ConnexionBase.connect.prepareStatement(query);
			st.setString(1, email);
			st.setString(2, password);
			st.setInt(3, is_valide);
			
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

	public boolean addUser(User x) {
		String query = "insert into user (email,password,isvalide) values ( ?,?,?)";
		PreparedStatement st = null;
		int rows = 0;
		boolean done = false;
		try {
			st = ConnexionBase.connect.prepareStatement(query);
			st.setString(1, x.getEmail());
			st.setString(2, x.getPassword());
			st.setInt(3, 0);
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

	public boolean updateUser(User x) {
		String query = "update user set password=? where email=?";
		PreparedStatement st = null;
		int rows = 0;
		boolean done = false;
		try {
			st = ConnexionBase.connect.prepareStatement(query);

			st.setString(1, x.getPassword());
			st.setString(2, x.getEmail());
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

	public boolean deleteUser(String x) {
		String query = "delete from user where email= ?";
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

	public ArrayList<User> getAll() {
		String query = "select * from user ";
		PreparedStatement st = null;
		ResultSet r = null;
		ArrayList<User> liste = new ArrayList<User>();
		try {
			st = ConnexionBase.connect.prepareStatement(query);

			r = st.executeQuery();
			while (r.next()) {
				User x = new User();
				x.setEmail(r.getString("email"));
				x.setPassword(r.getString("password"));
				x.setIs_valide(r.getInt("is_valide"));
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
	
	public boolean updateState(User x) {
		String query = "update  user set isvalide=? where email=?";
		PreparedStatement st = null;
		int rows = 0;
		boolean done = false;
		try {
			st = ConnexionBase.connect.prepareStatement(query);

			st.setInt(1, 1);
			st.setString(2, x.getEmail());
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
