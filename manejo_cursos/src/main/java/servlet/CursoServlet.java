package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Curso;
import modelo.CursoModel;

/**
 * Servlet implementation class CursoServlet
 */
@WebServlet("/CursoServlet")
public class CursoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codigo = request.getParameter("txtCodigo");
		String nombre =request.getParameter("txtNombre");
		String nivel = request.getParameter("txtNivel");
		String profesor=request.getParameter("txtProfesor");
		
		Curso curso = new Curso();
		curso.setCodigo(codigo);
		curso.setNombre(nombre);
		curso.setNivel(nivel);
		curso.setProfesor(profesor);
		
		CursoModel model = new CursoModel();
		int value = model.registrarCurso(curso);
		
		if(value ==1) {
			listCurso(request, response);
		}else {
			request.setAttribute("mensaje", "Ocurrio un problema");
			request.getRequestDispatcher("regCursos.jsp").forward(request, response);
			
		}
	}
	protected void listCurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		CursoModel model = new CursoModel();
		List<Curso> lista = model.listarCurso();
		
		request.setAttribute("lista", lista);
		request.getRequestDispatcher("listCursos.jsp").forward(request, response);
	}

}
