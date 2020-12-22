package web;

import beans.Client;
import data.ClientImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ServletController")
public class ServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if(action != null){
            switch (action){
                case "edit":
                    editClient(request,response);
                    break;
                case "delete":
                    deleteClient(request, response);
                    break;

                default:
                    actionDefault(request,response);
                    break;
            }
        }
        else {
            actionDefault(request,response);
        }
    }

    private void deleteClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("idClient"));
        int idClient = Integer.parseInt(request.getParameter("idClient")); // was sent by the url


        int modifiedRegisters = new ClientImpl().deleteClient(idClient);
        System.out.println("Modified registers :" + modifiedRegisters);

        actionDefault(request,response);
    }

    private void editClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //retrieve idClient
        int idClient = Integer.parseInt(request.getParameter("idClient"));

        Client client = new ClientImpl().findClient(idClient);
        request.setAttribute("client", client);
        String jspEdit = "/WEB-INF/pages/client/editClient.jsp";

        request.getRequestDispatcher(jspEdit).forward(request,response);
    }

    // shows the clients list with all the data needed
    private void actionDefault(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Client> clients = new ClientImpl().listClients(); // create the instance and call the method
        //processes the data to show in the cards
        int clientsTotal = clients.size();
        double totalAmount = clients.stream().
                mapToDouble(item -> item.getAmount()).sum();


        // when using request dispatcher is like this
        // scopes the result to the request
/*        request.setAttribute("clients", clients);
        request.setAttribute("clientsTotal", clientsTotal);
        request.setAttribute("totalAmount", totalAmount);
        // does not notify changes to browser
       // request.getRequestDispatcher("clients.jsp").forward(request, response);
        // does notify changes to browser*/

        // when using response other scope is needed

        HttpSession session = request.getSession();

        session.setAttribute("clients", clients);
        session.setAttribute("clientsTotal", clientsTotal);
        session.setAttribute("totalAmount", totalAmount);

        response.sendRedirect("clients.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if(action != null){
            switch (action){
                case "insert":
                    insertClient(request,response);
                    break;
                case "modify":
                    modifyClient(request,response);
                    break;

                default:
                actionDefault(request,response);
                break;
            }
        }
        else {
            actionDefault(request,response);
        }
    }

    private void modifyClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idClient = Integer.parseInt(request.getParameter("idClient")); // was sent by the url
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        double amount = 0.0;
        String amountStr = request.getParameter("amount");

        if(amountStr != null && !"".equals(amountStr)){
            amount = Double.parseDouble(amountStr);
        }

        Client client = new Client(idClient,name,lastname,email,phone,amount);

        int modifiedRegisters = new ClientImpl().updateClient(client);
        System.out.println("Modified registers :" + modifiedRegisters);

        //default action
        actionDefault(request, response);
    }

    private void insertClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        double amount = 0.0;
        String amountStr = request.getParameter("amount");

        if(amountStr != null && !"".equals(amountStr)){
            amount = Double.parseDouble(amountStr);
        }

        Client client = new Client(name,lastname,email,phone,amount);

        int modifiedRegisters = new ClientImpl().insertClient(client);
        System.out.println("Modified registers :" + modifiedRegisters);

        //default action
        actionDefault(request, response);
    }
}
