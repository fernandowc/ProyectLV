package util;

/*
** Clase que permite la conexión a una BD
*/

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlDBConn {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (Exception e) {
			System.out.println(
				"Proyecto: "
					+ Parametros.S_APP_NOMBRE
					+ "; Clase: "
					+ "edu.plantilla.util.SqlDBConn"
					+ "; Mensaje:"
					+ e);

		}
	}

	/**
	 * Obtiene una conexión a la Base de Datos.
	 */
	public Connection getConnection() {

		Connection connection = null;
		try {

			connection =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/inictel","developtd","inicteldeveloptd");

		} catch (Exception e) {
			System.out.println(
				"Proyecto: "
					+ Parametros.S_APP_NOMBRE
					+ "; Clase: "
					+ getClass().getName()
					+ "; Mensaje:"
					+ e);

		}
		return connection;
	}
	
	public Connection getConnection(String db) 
	{

		Connection connection = null;
		try {

			connection = 
			
			DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,"root","123456");

		} catch (Exception e) {
			System.out.println(
				"Proyecto: "
					+ Parametros.S_APP_NOMBRE
					+ "; Clase: "
					+ getClass().getName()
					+ "; Mensaje:"
					+ e);

		}
		return connection;
	}
}
