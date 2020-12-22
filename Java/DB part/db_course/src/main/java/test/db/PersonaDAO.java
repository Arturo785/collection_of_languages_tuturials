package test.db;

import test.data.ConnectionSQL;
import test.models.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    private static final String SQL_SELECT = "SELECT * FROM persona;";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?);";
    private static final String SQL_UPDATE =
            "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?;";

    private static final String SQL_DELETE = "DELETE from persona WHERE id_persona = ?";

    public List<Persona> getAllPersons(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Persona person = null;
        List<Persona> persons = new ArrayList<>();

        try {
            connection = ConnectionSQL.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECT);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt("id_persona");
                String name = resultSet.getString("nombre");
                String lastName = resultSet.getString("apellido");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("telefono");

                person = new Persona(id,name,lastName,email,phone);
                persons.add(person);
            }

        }
        catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
        finally {
            try {
                ConnectionSQL.close(resultSet);
                ConnectionSQL.close(preparedStatement);
                ConnectionSQL.close(connection);
            }
            catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }

        }

        return persons;
    }

    public int insertPerson(Persona persona){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registers = 0;

        try {
            connection = ConnectionSQL.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT);

            preparedStatement.setString(1,persona.getNombre());
            preparedStatement.setString(2,persona.getApellido());
            preparedStatement.setString(3,persona.getEmail());
            preparedStatement.setString(4,persona.getTelefono());

            registers = preparedStatement.executeUpdate();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
        finally {
            try {
                ConnectionSQL.close(preparedStatement);
                ConnectionSQL.close(connection);
            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return registers;
    }

    public int updatePerson(Persona persona){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registers = 0;

        try {
            connection = ConnectionSQL.getConnection();
            preparedStatement = connection.prepareStatement(SQL_UPDATE);

            preparedStatement.setString(1,persona.getNombre());
            preparedStatement.setString(2,persona.getApellido());
            preparedStatement.setString(3,persona.getEmail());
            preparedStatement.setString(4,persona.getTelefono());
            preparedStatement.setInt(5,persona.getIdPersona());

            registers = preparedStatement.executeUpdate();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
        finally {
            try {
                ConnectionSQL.close(preparedStatement);
                ConnectionSQL.close(connection);
            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return registers;
    }

    public int deletePerson(int idPerson){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registers = 0;

        try {
            connection = ConnectionSQL.getConnection();
            preparedStatement = connection.prepareStatement(SQL_DELETE);

            preparedStatement.setInt(1,idPerson);

            registers = preparedStatement.executeUpdate();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
        finally {
            try {
                ConnectionSQL.close(preparedStatement);
                ConnectionSQL.close(connection);
            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return registers;
    }
}
