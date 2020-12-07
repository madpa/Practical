package practicals;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

@WebServlet("/firstservlet")
public class firstservlet extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
Enumeration<String> e =request.getParameterNames();
while(e.hasMoreElements())
{
	String name=(String)e.nextElement();
	String value[]=request.getParameterValues(name);
	for(int i=0;i<value.length;i++)
	{
		out.print(name+":");
		out.println(value[i]+"<br>");
	}
	
}
}

}
