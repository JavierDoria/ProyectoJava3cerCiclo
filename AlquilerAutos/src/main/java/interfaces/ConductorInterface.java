package interfaces;

import java.util.List;
import entidades.Conductor;

public interface ConductorInterface {
	
	public List<Conductor> listarConductores();
	public Conductor buscarConductorId(int id); 
	public Conductor buscarConductorDni(String dni);
	public List<Conductor> buscarConductorApellido(String apellidos);
	public int registrarConductor(Conductor conductor);
	public int actualizarConductor(Conductor conductor);
	//public int eliminarConductor(int id);
}
