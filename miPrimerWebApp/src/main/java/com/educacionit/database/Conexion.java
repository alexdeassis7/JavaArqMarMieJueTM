package com.educacionit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*en esta clase tendremos la cadena de conexion con el que trabajara nuestra
 * applicacion , en esta se definira la BAse de Datos , el user , la password y el driver 
 * de conexion  , por defecto las credenciales de MySql son las siguientes
 * LOGIN = "root"
 * PASSWORD = ""  VACIO!
 * */
public class Conexion {

	static String db = "persona"; // nombre de mi base de datos
	static String login = "root"; // nombre de usuario de la DB
	static String password = ""; // contrasenia de la DB
	static String url = "jdbc:mysql://localhost/" + db;

	// creamos un objeto de tipo Connection
	Connection conn = null;

//constructor de lDBConnecction
	public Conexion() {

		try {
			// Obtenemos el driver de conexion a el motor MySQL
			Class.forName("com.mysql.jdbc.Driver");
			// Obtengo un OBJETO Conecction mediante el Driver manager una conexion a la db
			conn = DriverManager.getConnection(url, login, password);
			if (conn != null) {
				System.out.println("se logro conectar correctamente a la base  " + db);
			}

		} catch (SQLException e) {
			System.out.println("Error a intentar obtener la Conexion a la db " + db);
			e.printStackTrace();
			e.getCause();
			System.out.println(e.getMessage());

		} catch (ClassNotFoundException e) {
			System.out.println("Error a intentar obtener el Driver de Conexion");
			e.printStackTrace();
			e.getCause();
			System.out.println(e.getMessage());

		} catch (Exception e) {
			System.out.println("sucedio un error inesperado " + e.getMessage());

		}

	}

	// metodo para poder obetner la conexion a la db desde otras clases
	public Connection getConnection() {
		return conn;
	}

	public void desconectar() {
		try {
			conn.close();
			System.out.println("se desconecto de la db " + db);
		} catch (SQLException e) {
			System.out.println("no se pudo cerra la conexio a la db " + db);
			e.printStackTrace();
		}
	}

}
