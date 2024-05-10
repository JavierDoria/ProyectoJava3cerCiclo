package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Clientes;
import modelo.ClienteModelo;

/**
 * Servlet implementation class ClientesServlet
 */
@WebServlet("/ClientesServlet")
public class ClientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("txtNombre");
		String mascota = request.getParameter("txtMascota");
		String cita = request.getParameter("txtCita");
		String dni = request.getParameter("txtDni");
		String nacionalidad = request.getParameter("txtNacionalidad");
		
		Clientes cliente = new Clientes();
		cliente.setNombreDuenio(nombre);
		cliente.setNombreMascota(mascota);
		cliente.setFechaCita(cita);
		cliente.setDni(dni);
		cliente.setNacionalidad(nacionalidad);
		
		ClienteModelo model = new ClienteModelo();
		int value = model.registrarCliente(cliente);
		
		if(value ==1) {
			listCliente(request, response);
		}else {
			request.setAttribute("mensaje","Ocurrio un problema");
			request.getRequestDispatcher("registroDoria.jsp").forward(request, response);
		}
	}
	protected void listCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		ClienteModelo model = new ClienteModelo();
		List<Clientes> lista = model.listarCliente();
		
		request.setAttribute("lista", lista);
		request.getRequestDispatcher("listaDoria.jsp").forward(request, response);
	
}
}
