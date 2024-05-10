package Interface;

import java.util.List;

import Entidad.Curso;

public interface CursoInterface {
	
	public int registrarCurso(Curso curso);
	
	public List<Curso> listarCursos();
	
	public Curso obtenerCurso(int id);
	
	public int editarCurso(Curso curso);
	
	public int eliminarCurso(int id);

}
