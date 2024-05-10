package interfaces;

import java.util.List;

import entidades.Clientes;

public interface clienteInterface {

	public int registrarCliente(Clientes cliente);
	public List<Clientes> listarCliente();
}
