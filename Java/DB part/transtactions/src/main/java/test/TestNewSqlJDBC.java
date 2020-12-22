package test;

import test.data.ConnectionSQL;
import test.db.IPersonaDAO;
import test.db.PersonaDAO;
import test.models.Persona;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestNewSqlJDBC {

    public static void main(String[] args) {

        Connection connection = null;

        try {
            connection = ConnectionSQL.getConnection();

            connection.setAutoCommit(false);

            IPersonaDAO personaDAO = new PersonaDAO(connection);

 /*           Persona personaUpdate = new Persona(1,"update","update", "update", "123");
            Persona personaInsert = new Persona("newOne","newOne", "newOne", "4524125");

            personaDAO.update(personaUpdate);
            personaDAO.insert(personaInsert);*/
            List<Persona> selectRes = personaDAO.select();

            selectRes.forEach(System.out::println);

            connection.commit();

        }
        catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
            System.out.println("Entramos al rollBack");

            try {
                connection.rollback();
            }
            catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        finally {
            try {
                ConnectionSQL.close(connection);
            }
            catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }

    }


}
