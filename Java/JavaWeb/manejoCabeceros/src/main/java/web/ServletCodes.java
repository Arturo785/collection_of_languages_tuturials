package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletCodes")
public class ServletCodes extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //dummy data
        String userOk = "test";
        String passwordOk = "123";

        String user = request.getParameter("userKey");
        String password = request.getParameter("passwordKey");

        PrintWriter out = response.getWriter();

        if(user.equals(userOk) && password.equals(passwordOk)){
            out.print("Datos correctos");
        }
        else{
            response.sendError(response.SC_UNAUTHORIZED, "invalid credentials");
        }

        out.close();
    }
}
