

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.oefenServlet.demo.TijdServlet;

/**
 * Servlet implementation class OefenForm
 */
@WebServlet("/OefenForm")
public class OefenForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<!DOCTYPE html><html><head>" +
				"<title>Please, fill in form.</title>" +
				"</head>" +
				"<body><p><form method=post action= OefenFormNext>" +
				"Eerste invoer:" + "<br>" +
				"<input type=number name=eersteInvoer>" + "<br>" +
				"Kies de operatie:" + "<br>" +
				"<select name=operatieDropDown>" +
				"<option value=+>" + "+" + "</option>" +
				"<option value=->" + "-" + "</option>" +
				"<option value=/>" + "/" + "</option>" +
				"<option value=*>" + "*" + "</option>" + "</select>" + "<br>" +
				"Tweede invoer:" + "<br>" +
				"<input type=number name=tweedeInvoer>" + "<br>" +
				"<input type=submit value=Verzend!>" +
				"</form></p></body></html>" );
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response); 
	}

}
