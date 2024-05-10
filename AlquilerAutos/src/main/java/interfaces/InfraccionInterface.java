package interfaces;

import java.util.List;

import entidades.Infraccion;

public interface InfraccionInterface {
	
	public List<Infraccion> listarInfraccion();
	public int registrarInfraccion(Infraccion infraccion);
	public Infraccion buscarInfraccionId(int id);
}
