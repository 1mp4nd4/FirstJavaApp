package clases;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginSevlet
 */
@WebServlet("/LoginSevlet")
public class LoginSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/* variable de sesion */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	{
		HttpSession session = request.getSession();
		ArrayList<User> UsersInSession = getUser();
		String username = request.getParameter("name");
	}
	
	
    
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private ArrayList<User> getUser()
	{
		/* Creo la lista */
		ArrayList<User> UserList = new ArrayList();
		User Test1 = new User();
		Test1.setNombre("Esteban");
		Test1.setApellido("Banquito");
		Test1.setUserName("EBanquito");
		Test1.setPassword("1234");
		/* añado a la lista */
		UserList.add(Test1);
		
		return UserList;
		
	}

}
