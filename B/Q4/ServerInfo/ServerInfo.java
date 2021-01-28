 // Program to request server
// information viz Request Method, URL, Protocol
// and remote address.

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class ServerInfo extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        out.println(request.getMethod());
        out.println(request.getRequestURL());
        out.println(request.getProtocol());
        out.println(request.getRemoteAddr());

    }
}
