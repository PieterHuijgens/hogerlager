package nl.oefenServlet.demo;

import java.io.IOException;
import java.time.LocalTime;
import java.time.ZoneId;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class TijdServlet
 */
@WebServlet("/TijdServlet")
public class TijdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	LocalTime tijd =  LocalTime.now();
	static int count = 0;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<!DOCTYPE html><html><head>" +
		"<title>Oefenservlet</title>" +
		"</head>" +
		"<body><p>" + "Het is nu: "  + tijd + "</p>" +
		"<p>" + "Deze pagina is " + count + " keer bekeken." +
		
		"</p></body></html>" );
		++count;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
