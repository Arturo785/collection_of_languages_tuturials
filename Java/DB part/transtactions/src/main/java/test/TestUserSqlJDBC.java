package test;

import test.db.PersonaDAO;
import test.db.UserDAO;
import test.models.Persona;
import test.models.User;

import java.util.List;

public class TestUserSqlJDBC {

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        List<User> usersRetrieved;

        User user1 = new User(1,"JorgeYEI", "123");
       // System.out.println(personaDAO.insertPerson(persona1));
      //  userDAO.insertUser(user1);
        //userDAO.updateUser(user1);

        usersRetrieved = userDAO.getAllUsers();

        usersRetrieved.forEach(System.out::println);

    }


}
