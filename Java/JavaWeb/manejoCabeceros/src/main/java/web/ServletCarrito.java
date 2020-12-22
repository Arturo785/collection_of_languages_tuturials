package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ServletCarrito")
public class ServletCarrito extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        //we get the article passed by the form
        String articleRetrieved = request.getParameter("articuloKey");

        HttpSession session = request.getSession();

        //we retrieve if more articles exists

        List<String> articles = (List<String>) session.getAttribute("articulos");

        if(articles == null){
            articles = new ArrayList<>();

            //Because of reference if the list changes also the item contained does
            session.setAttribute("articulos", articles);
        }

        if(articleRetrieved != null){
            if (!articleRetrieved.trim().equals("")){
                articles.add(articleRetrieved);
            }
        }

        PrintWriter out = response.getWriter();

        articles.forEach(item -> {
            out.print(item);
            out.print("<br/>");
        });

        out.print("<a href=\"carrito.html\">Link al carrito</a>");
        out.close();

    }
}
