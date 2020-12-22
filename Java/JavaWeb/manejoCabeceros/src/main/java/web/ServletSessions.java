package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletSessions")
public class ServletSessions extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        // gets the session or creates one
        HttpSession session = request.getSession();
        String titulo = "";


        Integer contadorVisitas = (Integer) session.getAttribute("contadorVisitas");

        if(contadorVisitas == null){
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez";
        }

        else{
            contadorVisitas++;
            titulo = "Bienvenido por no: " + contadorVisitas;
        }

        session.setAttribute("contadorVisitas", contadorVisitas);

        PrintWriter out = response.getWriter();

        out.print(titulo);
        out.print("   : id " + session.getId());

    }
}
