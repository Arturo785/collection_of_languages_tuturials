package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        String user = request.getParameter("userKey");
        String password = request.getParameter("passwordKey");
        String[] tecnologias = request.getParameterValues("tecnologiaKey");
        String genre = request.getParameter("genreKey");
        String ocupation = request.getParameter("ocupationKey");
        String[] music = request.getParameterValues("musicKey");
        String comments = request.getParameter("commentsKey");

        String myResponse = user + " " + password + " " + Arrays.toString(tecnologias) +
            " " + genre + " " + ocupation + " " + Arrays.toString(music) + " "
            + comments;

        out.print(myResponse);
    }
}

