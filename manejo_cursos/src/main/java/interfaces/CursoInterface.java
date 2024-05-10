package interfaces;

import java.util.List;

import entidades.Curso;

public interface CursoInterface {
	public int registrarCurso(Curso curso);
	public List<Curso> listarCurso();

}
