package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Usuario;
import modelo.UsuarioModelo;

/**
 * Servlet implementation class UsuarioServlet
 */
@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("txtNombre");
		String correo= request.getParameter("txtCorreo");
		String pais = request.getParameter("txtPais");
		String telefono=request.getParameter("txtTelefono");
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setCorreo(correo);
		usuario.setPais(pais);
		usuario.setTelefono(0);
		
		UsuarioModelo model= new UsuarioModelo();
		int value = model.registrarUsuario(usuario);
		
		if(value ==1) {
			listUsuario(request,response);
		}else {
			request.setAttribute("mensaje", "Ocurrio un problema");
			request.getRequestDispatcher("bd_registro.jsp").forward(request, response); 
				
		}
	}
	
	protected void listCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		UsuarioModelo  model= new UsuarioModelo();
		List<Usuario> lista = model.listarUsuario();
		request.setAttribute("lista", lista);
		request.getRequestDispatcher("listar.jsp").forward(request, response);
	}

}
