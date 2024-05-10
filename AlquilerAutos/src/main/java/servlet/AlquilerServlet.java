package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOFactory;
import entidades.Alquiler;
import modelo.AlquilerDAO;

/**
 * Servlet implementation class AlquilerServlet
 */
@WebServlet("/AlquilerServlet")
public class AlquilerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlquilerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipo = request.getParameter("tipo");
		switch(tipo) {
		case"list": listAlquiler(request,response);break;
		case"reges": regisAlquiler(request,response);break;
		case"buscar": busAlquiler(request,response);break;
		default:
			request.setAttribute("mensaje", "Ocurrio un problema");
			request.getRequestDispatcher("regAlquiler.jsp").forward(request, response);
		}
	}

	private void listAlquiler(HttpServletRequest request, HttpServletResponse response) {
		DAOFactory daoFactory =DAOFactory.getDaoFactory(DAOFactory.MYSQL);
		AlquilerDAO dao= daoFactory.getAlquiler();
		request.setAttribute("lista", Alquiler);
		request.getRequestDispatcher("listarAlquiler.jsp").forward(request, response);
		
	}
	private void regisAlquiler(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void busAlquiler(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}



}
