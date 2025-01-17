package dao;

import interfaces.AlquilerInterface;
import interfaces.ConductorInterface;
import interfaces.InfraccionInterface;
import interfaces.ListaNegraInterface;
import interfaces.TrabajadorInterface;
import interfaces.VehiculoInterface;

public abstract class DAOFactory {
	public static final int MYSQL =1;
	public static final int SQLSERVER=2;
	public static final int ORACLE=3;
	
	public abstract AlquilerInterface getAlquiler();
	public abstract ConductorInterface getConductor();
	public abstract InfraccionInterface getInfraccion();
	public abstract ListaNegraInterface getListaNegra();
	public abstract TrabajadorInterface getTrabajador();
	public abstract VehiculoInterface getVehiculo();
	
	public static DAOFactory getDaoFactory(int tipo) {
		switch(tipo) {
		case MYSQL:
			return new MySqlDAOFactory();
		case SQLSERVER: 
			return new SQLServerDAOFactory();
		case ORACLE:
			return new OracleDAOFactory();
			default:return null;
		}
	}
}
