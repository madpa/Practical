package practicals;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class reqdispatch extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();

	String userid=request.getParameter("id");
    String pwd= request.getParameter("pwd");

    RequestDispatcher rd;
    if(userid.equals("root")&&pwd.equals("root"))
    {
    	rd=request.getRequestDispatcher("success");
    	rd.forward(request, response);
    }
    else{
    	out.print("invalid");
    	rd=request.getRequestDispatcher("reqdis.html");
    	rd.forward(request,response);
    }
    out.close();
    
}


}
