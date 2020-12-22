package web;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletCookies")
public class ServletCookies extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //primera vez en el sitio
        boolean newUser = true;
        String message = "";
        PrintWriter out = response.getWriter();

        //obtain all cookies
        Cookie[] cookies = request.getCookies();

        //search for specific cookie
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("visitanteRecurrente") && cookie.getValue().equals("si")){
                    //already visited
                    newUser = false;
                    break;
                }
            }
        }

        if(newUser){
            Cookie visitedCookie = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitedCookie);
            message = "Gracias por visitar el sitio";
        }
        else {
            message = "Que hongo otra vez aqui";
        }

        response.setContentType("text/html;charset=UTF-8");
        out.print(message);
    }
}
