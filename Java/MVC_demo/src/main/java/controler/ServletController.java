package controler;

import beans.Rectangle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/ServletController")
public class ServletController  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. if params exists process

        //2. create java beans
        Rectangle rectangle = new Rectangle(3,6);

        //3. add bean to some scope
        // request param
        request.setAttribute("message", "Hello from servlet");

        HttpSession session = request.getSession();
        session.setAttribute("rectangle", rectangle);

        //4. redirect to selected view
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/viewVariables.jsp");

        requestDispatcher.forward(request, response);

    }
}
