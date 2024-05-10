package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entidad.Curso;
import model.CursoModel;

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
		String tipo = request.getParameter("tipo");
		switch(tipo) {
		case "list": listCurso(request,response);break;
		case "regist":registCurso(request, response);break;
		case "info": detalleCurso(request, response);break;
		case "modif": modificarCurso(request, response);break;
		case "edit": actualizarCurso(request, response);break;
		case "delete": eliminarCurso(request, response);break;
		default:
			request.setAttribute("mensaje", "Ocurrio un problema");
			request.getRequestDispatcher("regCursos.jsp").forward(request, response);
		}
		
	}
	protected void listCurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		CursoModel model = new CursoModel();
		List<Curso> lista = model.listarCursos();
		request.setAttribute("lista", lista);
		request.getRequestDispatcher("listCursos.jsp").forward(request, response);
		
		//Comando para eliminar
		String id = request.getParameter("id");		
		int numero = Integer.parseInt(id);		
		model.eliminarCurso(numero);
	}
	protected void registCurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String codigo = request.getParameter("txtCodigo");
		String nombre = request.getParameter("txtNombre");
		String nivel = request.getParameter("txtNivel");
		String profesor = request.getParameter("txtProfesor");
		
		Curso curso= new Curso();
		curso.setCodigo(codigo);
		curso.setNombre(nombre);
		curso.setNivel(nivel);
		curso.setProfesor(profesor);
		
		CursoModel model = new CursoModel();
		int value = model.registrarCurso(curso);
		
		if(value == 1) {
			listCurso(request, response);
		}else {
			request.setAttribute("mensaje", "Ocurrio un problema");
			request.getRequestDispatcher("regCursos.jsp").forward(request, response);
		}
	}
	protected void modificarCurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
		int idCurso=Integer.parseInt(request.getParameter("id"));
		CursoModel model = new CursoModel();
		Curso curso = model.obtenerCurso(idCurso);
		request.setAttribute("cursoData", curso);
		request.getRequestDispatcher("editCurso.jsp").forward(request, response);
	}
	protected void actualizarCurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int id=Integer.parseInt(request.getParameter("idCurso"));
		
		String codigo = request.getParameter("txtCodigo");
		String nombre = request.getParameter("txtNombre");
		String nivel = request.getParameter("txtNivel");
		String profesor = request.getParameter("txtProfesor");
		
		Curso curso = new Curso();
		curso.setId(id);
		curso.setCodigo(codigo);
		curso.setNombre(nombre);
		curso.setNivel(nivel);
		curso.setProfesor(profesor);
		
		CursoModel model = new CursoModel();
		int value = model.editarCurso(curso);
		
		if(value ==1) {
			listCurso(request, response);
		}else {
			request.setAttribute("mensaje", "Ocurrio un Problema");
			request.getRequestDispatcher("listCursos.jsp").forward(request, response);
			
		}
	}
	protected void detalleCurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int idcurso =Integer.parseInt(request.getParameter("id"));
		CursoModel  model = new CursoModel();
		Curso curso = model.obtenerCurso(idcurso);
		
		request.setAttribute("cursoData", curso);
		request.getRequestDispatcher("detCurso.jsp").forward(request, response);
	}
	protected void eliminarCurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int id = Integer.parseInt(request.getParameter("id"));
		
		CursoModel model = new CursoModel();
		int value = model.eliminarCurso(id);
		
		if(value ==1) {
			listCurso(request, response);
		}else {
			request.setAttribute("mensaje", "Ocurrio un problema");
			request.getRequestDispatcher("listCursos.jsp").forward(request, response);
		}
		
		
	}
}
