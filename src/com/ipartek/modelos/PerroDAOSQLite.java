/**
 * 
 */
package com.ipartek.modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ipartek.pojo.Perro;

/**
 * @author Joaquín Ruiz Morín
 *
 */

public class PerroDAOSQLite implements PerroDAO {

	private static final String PATH = "db/perrera.db";

	@Override
	public ArrayList<Perro> getDogsList() {
		final String SQL = "SELECT id, nombre FROM perro ORDER BY nombre ASC;";
		ArrayList<Perro> perros = new ArrayList<Perro>();

		try {
			// DUDA: No me funciona el código como a Ander
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
			PreparedStatement pst = conn.prepareStatement(SQL);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				Perro p = new Perro();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("nombre"));
				/*
				 * p.setRaza( rs.getString("raza")); p.setPeso( rs.getFloat("peso"));
				 * p.setVacunado( rs.getBoolean("vacunado")); p.setHistoria(
				 * rs.getString("historia"));
				 */
				perros.add(p);

			} // while

		} catch (Exception e) {
			e.printStackTrace();
		}
		return perros;
	}

	@Override
	public Perro getDog(int id) {
		Perro perro = null;
		final String SQL = "SELECT id, nombre FROM perro WHERE id = ?;";

		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
				PreparedStatement pst = conn.prepareStatement(SQL);) {

			pst.setInt(1, id); // sustituimos el ? de la SQL por el parametro id

			try (ResultSet rs = pst.executeQuery()) {
				if (rs.next()) {
					perro = new Perro();
					perro.setId(rs.getInt("id"));
					perro.setName(rs.getString("nombre"));
				} // while
			} // 2º try

		} catch (Exception e) {
			e.printStackTrace();
		}
		return perro;
	}

	@Override
	public Perro createDog(Perro p) throws Exception {
		Perro perro = null;
		final String SQL = "INSERT INTO perro (nombre, peso) VALUES (?, ?);";
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
				PreparedStatement pst = conn.prepareStatement(SQL);) {

			pst.setString(1, p.getName());
			pst.setFloat(2, p.getWeight());

			pst.executeUpdate(); // CUIDADO no usar executeQuery

		}

		return perro;
	}

	@Override
	public Perro updateDog(Perro p) throws Exception {
		Perro perro = null;
		final String SQL = "UPDATE perro nombre = ? , peso = ? WHERE id = ?;";
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
				PreparedStatement pst = conn.prepareStatement(SQL);) {

			pst.setString(1, p.getName());
			pst.setFloat(2, p.getWeight());
			pst.setInt(3, p.getId());

			pst.executeUpdate(); // CUIDADO no usar executeQuery

		}

		return perro;
	}

	@Override
	public boolean deleteDog(int id) throws Exception {
		boolean resul = false;
		final String SQL = "DELETE FROM perro WHERE id = ?;";
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
				PreparedStatement pst = conn.prepareStatement(SQL);) {

			pst.setInt(1, id);

			if (1 == pst.executeUpdate()) {
				resul = true;
			}

		}
		return resul;
	}

}
