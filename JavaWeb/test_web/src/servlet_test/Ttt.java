package servlet_test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Ttt extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

        response.setContentType("text/html;charset=UTF-8");
	    
    	String message = request.getParameter("Message");
    	String shape = request.getParameter("Shape");
    	String color = request.getParameter("Color");
    	String bgcolor = request.getParameter("BGColor");
    	String x = request.getParameter("X");
    	String y = request.getParameter("Y");
    	String font = request.getParameter("Font");
    	String ftstyle=request.getParameter("FTStyle");
    	String ftsize=request.getParameter("FTSize");

    		
    	HttpSession session = request.getSession();
    	session.setAttribute("Message", message);
    	session.setAttribute("Shape", shape);
    	session.setAttribute("Color", color);
    	session.setAttribute("BGColor", bgcolor);
    	session.setAttribute("X", x);
    	session.setAttribute("Y", y);
    	session.setAttribute("Font", font);
    	session.setAttribute("FTStyle", ftstyle);
    	session.setAttribute("FTSize", ftsize);

        
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
	}
}
