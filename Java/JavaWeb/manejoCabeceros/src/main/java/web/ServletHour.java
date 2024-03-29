package web;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/ServletHour")
public class ServletHour extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("refresh" , "1");
        Date date = new Date();

        SimpleDateFormat format = new SimpleDateFormat("'Hora actualizada' HH:mm:ss");
        
        String hourFormat = format.format(date);

        PrintWriter out = response.getWriter();

        out.print("Hora actualizada: " + hourFormat);
        out.close();

    }
}
