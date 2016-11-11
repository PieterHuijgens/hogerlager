package nl.oefenServlet.demo;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class URL_servlet
 */
@WebServlet("/url/*")
public class URL_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String blauw="";
		
		Enumeration<String> Headers = request.getHeaderNames();
		while(Headers.hasMoreElements()){
			String s = Headers.nextElement();
			Enumeration<String> HeaderWaardes = request.getHeaders(s);
			blauw += "<p>" + s + " : ";
				while(HeaderWaardes.hasMoreElements()){
					String headerWaarde = HeaderWaardes.nextElement();
					blauw += headerWaarde + " ";

				}
			blauw += "</p>";
		}
		
		response.getWriter().append("<!DOCTYPE html><html><head>" +
				"<title>Verkeerde URL</title>" +
				"</head>" +
				"<body><p>" + "Verkeerde URL ingevoerd: " + request.getRequestURL().toString() + 
				"<p>" + blauw + 
				"</p></body></html>" );
				
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
