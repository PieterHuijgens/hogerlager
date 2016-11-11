

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/OefenFormNext")
public class OefenFormNext extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer EersteInvoer = Integer.parseInt(request.getParameter("eersteInvoer"));
		Integer TweedeInvoer = Integer.parseInt(request.getParameter("tweedeInvoer"));
		String Operatie = request.getParameter("operatieDropDown").toString();

		
		response.getWriter().append("<!DOCTYPE html><html><head>" +
				"<title>Form submitted!</title>" +
				"</head>" +
				"<body><p><form>" + 
				"De opgave: " + "<br>"+
				request.getParameter("eersteInvoer") + " " +  request.getParameter("operatieDropDown") + " " +
				request.getParameter("tweedeInvoer") + " = " + operatie(EersteInvoer, TweedeInvoer, Operatie) + 
				"<br>" +
				"</form></p></body></html>" );
				}


	public String operatie(Integer invoer1, Integer invoer2, String operatie){
		 Integer uitkomst = 0;
		if(operatie.equals("+")){
			uitkomst = uitkomst + (invoer1+invoer2);
		}
		else if(operatie.equals("-")){
			uitkomst = uitkomst + (invoer1-invoer2);
		}
		else if(operatie.equals("/")){
			uitkomst = uitkomst + (invoer1/invoer2);
		}
		else if(operatie.equals("*")){
			uitkomst = uitkomst + (invoer1*invoer2);
		}
		String stringUitkomst = uitkomst.toString();
		return stringUitkomst;
	}
}

