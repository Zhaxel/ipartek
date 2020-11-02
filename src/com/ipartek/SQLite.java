/**
 * 
 */
package com.ipartek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ipartek.pojo.Perro;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public class SQLite {

	final static private String URL_DRIVER = "jdbc:sqlite:";
	// final static private String URL_DB = "P:\\SQLiteDDBB\\";
	final static private String URL_DB = "db/perrera.db";
	final static private String DB_NAME = "concesionario.db";
	final static private String SQL_QUERY = "SELECT * FROM coche";

	/**
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<Perro> dogList = new ArrayList<Perro>();

		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection(URL_DRIVER + URL_DB + DB_NAME);
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

		System.out.println("Conexión realizada.");

		/*
		 * pst = con.prepareStatement(SQL_QUERY); rs = pst.executeQuery();
		 * 
		 * while( rs.next() ) { System.out.println( rs.getInt("id") +
		 * rs.getString("nombre"));
		 * 
		 * pst.close(); rs.close();
		 * 
		 * }
		 */

		con.close();

	}

}
