package dao;

import interfaces.AlquilerInterface;
import interfaces.ConductorInterface;
import interfaces.InfraccionInterface;
import interfaces.ListaNegraInterface;
import interfaces.TrabajadorInterface;
import interfaces.VehiculoInterface;
import modelo.AlquilerDAO;
import modelo.ConductorDAO;
import modelo.InfraccionDAO;
import modelo.ListaNegraDAO;
import modelo.TrabajadorDAO;
import modelo.VehiculoDAO;

public class OracleDAOFactory extends DAOFactory{

	public AlquilerInterface getAlquiler() {
		return new AlquilerDAO();
	}
	public ConductorInterface getConductor() {
		return new ConductorDAO();
	}
	public InfraccionInterface getInfraccion() {
		return new InfraccionDAO();
	}
	public ListaNegraInterface getListaNegra() {
		return new ListaNegraDAO();
	}
	public TrabajadorInterface getTrabajador() {
		return new TrabajadorDAO();
	}
	public VehiculoInterface getVehiculo() {
		return new VehiculoDAO();
	}
}
