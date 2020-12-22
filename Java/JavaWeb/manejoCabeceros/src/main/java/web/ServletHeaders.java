package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/ServletHeaders")
public class ServletHeaders extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        String methodHttp = request.getMethod();
        String uri = request.getRequestURI();

        out.print(methodHttp + " " + uri);

        Enumeration headers = request.getHeaderNames();

        while (headers.hasMoreElements()){
            String name = (String) headers.nextElement();
            out.print(name);
            out.print("\n");
            out.print(request.getHeader(name));
            out.print("\n");
        }
        out.close();
    }
}
