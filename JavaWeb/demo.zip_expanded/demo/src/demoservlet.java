
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class demoservlet
 */
@WebServlet("/demoservlet")
public class demoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demoservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
response.setContentType("text/html;charset=UTF-8");
	    
    	String message = request.getParameter("message");
    	String shape = request.getParameter("shape");
    	String color = request.getParameter("color");
    	String bgcolor = request.getParameter("bgcolor");
    	String px = request.getParameter("px");
    	String py = request.getParameter("py");
    	String ftstyle=request.getParameter("ftstyle");
    	String ftsize=request.getParameter("ftsize");
    	String ax=request.getParameter("ax");
    	String ay=request.getParameter("ay");
    	
    	
    	HttpSession session = request.getSession();
    	session.setAttribute("message", message);
    	session.setAttribute("shape", shape);
    	session.setAttribute("color", color);
    	session.setAttribute("bgcolor", bgcolor);
    	session.setAttribute("px", px);
    	session.setAttribute("py", py);
    	session.setAttribute("ftstyle", ftstyle);
    	session.setAttribute("ftsize", ftsize);
    	session.setAttribute("ax", ax);
    	session.setAttribute("ay", ay);

        
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");;
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
	    
    	String message = request.getParameter("message");
    	String shape = request.getParameter("shape");
    	String color = request.getParameter("color");
    	String bgcolor = request.getParameter("bgcolor");
    	String px = request.getParameter("px");
    	String py = request.getParameter("py");
    	String ftstyle=request.getParameter("ftstyle");
    	String ftsize=request.getParameter("ftsize");
    	String ax=request.getParameter("ax");
    	String ay=request.getParameter("ay");
    	
    	
    	HttpSession session = request.getSession();
    	session.setAttribute("message", message);
    	session.setAttribute("shape", shape);
    	session.setAttribute("color", color);
    	session.setAttribute("bgcolor", bgcolor);
    	session.setAttribute("px", px);
    	session.setAttribute("py", py);
    	session.setAttribute("ftstyle", ftstyle);
    	session.setAttribute("ftsize", ftsize);
    	session.setAttribute("ax", ax);
    	session.setAttribute("ay", ay);

        
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");;
        dispatcher.forward(request, response);
	}

}

