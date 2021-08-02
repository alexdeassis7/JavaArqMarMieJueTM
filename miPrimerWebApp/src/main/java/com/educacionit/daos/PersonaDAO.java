package com.educacionit.daos;

import java.sql.SQLException;
import java.sql.Statement;
import com.educacionit.database.Conexion;
import com.educacionit.models.PersonaVO;

public class PersonaDAO {
	public void registrarPersona(PersonaVO miPersona) {
		Conexion conex = new Conexion();

		try {
			Statement estatuto = conex.getConnection().createStatement();

			estatuto.executeUpdate("INSERT INTO persona ( `nombre`, `edad`, `profesion`, `telefono`)  VALUES ('"
					+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
					+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "' )");

			System.out.println("Se ha registrado Existosamente a" + miPersona.getNombrePersona());

			// libero los recursos
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("No se registro a " + miPersona.getNombrePersona());
		}
	}
}
