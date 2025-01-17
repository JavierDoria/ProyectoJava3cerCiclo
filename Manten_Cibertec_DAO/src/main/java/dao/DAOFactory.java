package dao;


import interfaces.*;

public abstract class DAOFactory {
	public static final int MYSQL =1;
	public static final int SQLSERVER=2;
	public static final int ORACLE=3;
	
	public abstract CursoDAO getCurso();
	public abstract UsuarioDAO getUsuario();
	
	public static DAOFactory getDaoFactory(int tipo) {
		switch(tipo) {
		case MYSQL:
			return new MySqlDAOFactory();
		case SQLSERVER:
			return new SQLServerDAOFactory();
		
		case ORACLE:
			return new OracleDAOFactory();	
			default: return null;
		}
	}

}
