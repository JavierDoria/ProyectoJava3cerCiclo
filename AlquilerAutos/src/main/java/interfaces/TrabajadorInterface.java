package interfaces;

import java.util.List;

import entidades.Trabajador;

public interface TrabajadorInterface {
	
	public List<Trabajador> listarTrabajadores();
	public Trabajador buscarTrabajadorId(int id);
	public Trabajador buscarTrabajadorDni(String dni);
	public List<Trabajador> buscarTrabajador(String apellido);
	public int registrarTrabajador(Trabajador trabajador);
	public int actualizarTrabajador(Trabajador trabajador);

}
