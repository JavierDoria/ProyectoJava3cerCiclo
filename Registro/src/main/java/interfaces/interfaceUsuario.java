package interfaces;

import java.util.List;

import entidades.Usuario;

public interface interfaceUsuario {
	public int registrarUsuario(Usuario usuario);
	public List<Usuario> listarUsuario();

}
