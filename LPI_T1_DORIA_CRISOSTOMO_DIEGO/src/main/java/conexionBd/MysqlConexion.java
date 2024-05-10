package conexionBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConexion {
	public static Connection getConexion() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			String url = "jdbc:mysql://localhost:3306/db_doria?useSSL=false&useTimezone=true&serverTimezone=UTC";
			String user ="root";
			String pwd ="admin";
			con=DriverManager.getConnection(url,user,pwd);
		} catch (ClassNotFoundException e) {
			System.out.println("Error de Driver no instalado" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Error de conexion con la base de datos" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error egeneral" +e.getMessage());
		}
		return con;
	}
	public static void ClaseConexion(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.print("Problemas al cerrar la conexion" + e.getMessage());
		}
	}

}
