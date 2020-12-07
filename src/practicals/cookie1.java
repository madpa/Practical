package practicals;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();

	String email=request.getParameter("email");
    String pwd= request.getParameter("pwd");
    Cookie c1 =new Cookie("email", email);
    Cookie c2= new Cookie("pwd", pwd);
    response.addCookie(c1);
    response.addCookie(c2);
    out.print("<br><br><a href="+"cookie2"+">View Details</a>");
    out.close();
    
}


}
