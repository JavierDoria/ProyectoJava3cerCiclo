package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConexion {
	public static Connection getConexion() {
		Connection con = null;
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			String url ="jdbc:mysql://localhost:3306/_alquilerautos?useSSL=false&useTimezone=true&serverTimezone=UTC";
			String user="root";
			String pwd = "admin";
			con = DriverManager.getConnection( url, user,pwd);
		}catch(ClassNotFoundException e) {
			System.out.print("Error de Driver instalado" + e.getMessage());
		}catch (SQLException e) {
			System.out.print("Error de conexion en la base de datos"+ e.getMessage());
		}catch (Exception e) {
			System.out.print("Error general"+ e.getMessage());
		}
		return con;
	}
	public static void CloseConexion(Connection con) {
		try {
			con.close();
		} catch (Exception e) {
			System.out.print("Problema al cerrar la Conexion" + e.getMessage());
		}
	}
	}


