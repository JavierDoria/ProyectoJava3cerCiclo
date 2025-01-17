package interfaces;

import java.util.List;

import entidades.Vehiculo;

public interface VehiculoInterface {
	
	public List<Vehiculo> listarVehiculos();
	public Vehiculo buscarVehiculoPlaca(String placa);
	public int eliminarVehiculoPlaca(String placa);
	public int eliminarVehiculoId(int id);
	public int registrarVehiculos(Vehiculo vehiculo);
	
}
