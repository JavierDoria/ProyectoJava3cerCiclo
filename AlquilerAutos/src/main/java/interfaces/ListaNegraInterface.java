package interfaces;

import java.util.List;

import entidades.ListaNegra;
import entidadesDTO.ListaNegraDTO;

public interface ListaNegraInterface {
	
	public List<ListaNegraDTO> listarListaNegra();
	public int registrarListaNegra(ListaNegra listaNegra);
	public ListaNegraDTO buscarListaNegraId(int id);
}
