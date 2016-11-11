package hoger_lager;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hoger_lager")
public class hoger_lager extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String hint = " ";
	Random rand = new Random();
	Integer secret = rand.nextInt(100);
	int count = 0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("hint", hint);
		request.setAttribute("count", count);
		request.getRequestDispatcher("/WEB-INF/HogerLager.jsp").forward(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer Gok = Integer.parseInt(request.getParameter("gok"));
		if(Gok != null){
		if(Gok<secret){hint = "Je moet hoger gokken.";}
		if(secret<Gok){hint = "Je moet lager gokken.";}
		if(secret == Gok){hint = "gefeliciteerd, je hebt het geraden. Voer een nieuw getal in om het nog een keer te spelen."; count = 0; secret = rand.nextInt(100);}}
		count++;
		request.setAttribute("count", count);
		request.setAttribute("hint", hint);
		request.getRequestDispatcher("/WEB-INF/HogerLager.jsp").forward(request, response);
		
		
}

}