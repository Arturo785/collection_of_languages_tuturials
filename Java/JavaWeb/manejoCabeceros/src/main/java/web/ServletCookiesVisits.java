package web;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/ServletCookiesVisits")
public class ServletCookiesVisits extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int counter = 0;

        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("contadorVisitas")){
                    counter = Integer.parseInt(cookie.getValue());
                }
            }
        }

        counter++;

        Cookie newOne = new Cookie("contadorVisitas", Integer.toString(counter));

        //set a time to the cookie only one hour
        newOne.setMaxAge(3600);

        response.addCookie(newOne);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.print("Contador de visitas" + counter);
        out.close();
    }
}
