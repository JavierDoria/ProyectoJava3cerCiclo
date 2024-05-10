package interfaces;

import java.util.List;

import entidades.Alquiler;
import entidadesDTO.AlquilerDTO;

public interface AlquilerInterface {
	
	public List<AlquilerDTO> listarAlquiler();
	public int registrarAlquiler(Alquiler alquiler);
	public AlquilerDTO buscarAlquilerId(int id);

}
