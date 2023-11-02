package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBase {
	public static final String Host="jdbc:mysql://localhost:3306/";
	public static final String DB_Name="memoire";
	public static final String USERNAME= "root";
	public static final String PASSWORD="35059601";
	
	public static Connection connect=null;
	public static void startConnection() {
		if (connect ==null) {
		try {
			connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/memoire?useUnicode=true&characterEncoding=UTF-8&&serverTimezone=GMT", USERNAME, PASSWORD);
		}
		catch (SQLException e) {
			System.out.println("Driver Manager Erreur "+e);
		}
	}
	}}