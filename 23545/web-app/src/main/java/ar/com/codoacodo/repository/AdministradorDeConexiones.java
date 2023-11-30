package ar.com.codoacodo.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
	
	public static Connection getConnection() {
		String host = "localhost";
		String username = "root";
		String password ="1OxAtOx8BIbe";
		String port = "3306";
		String dbName = "DB-integrador_cac";
		
		String dbUrl = "jdbc:mysql://"+host+":"+port+"/"+dbName + "?ServerTimeZone=false";
		
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver);
			DriverManager.getConnection(dbUrl, username, password);
		}catch (Exception e) {
			throw new IllegalArgumentException("No se pudo encontrar conexion: " + dbUrl + " - " + driver);
		}
	return null;
	}

}
