package test.db;

import test.data.ConnectionSQL;
import test.models.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements IPersonaDAO {

    private Connection connectionTransactional;

    public PersonaDAO(){ }

    public PersonaDAO(Connection connection){
        this.connectionTransactional = connection;
    }

    private static final String SQL_SELECT = "SELECT * FROM persona;";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?);";
    private static final String SQL_UPDATE =
            "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?;";

    private static final String SQL_DELETE = "DELETE from persona WHERE id_persona = ?";

    @Override
    public List<Persona> select(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Persona person = null;
        List<Persona> persons = new ArrayList<>();

        try {
            if(connectionTransactional == null){
                connection = ConnectionSQL.getConnection();
            }
            else {
                connection = connectionTransactional;
            }

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

                if(this.connectionTransactional == null){
                    ConnectionSQL.close(connection);
                }

            }
            catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }

        }

        return persons;
    }

    @Override
    public int insert(Persona persona) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registers = 0;

        try {
            if(connectionTransactional == null){
                connection = ConnectionSQL.getConnection();
            }
            else {
                connection = connectionTransactional;
            }
            preparedStatement = connection.prepareStatement(SQL_INSERT);

            preparedStatement.setString(1,persona.getNombre());
            preparedStatement.setString(2,persona.getApellido());
            preparedStatement.setString(3,persona.getEmail());
            preparedStatement.setString(4,persona.getTelefono());

            registers = preparedStatement.executeUpdate();
        }
        finally {
            try {
                ConnectionSQL.close(preparedStatement);

                if(this.connectionTransactional == null){
                    ConnectionSQL.close(connection);
                }
            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return registers;
    }

    @Override
    public int update(Persona persona) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registers = 0;

        try {
            if(connectionTransactional == null){
                connection = ConnectionSQL.getConnection();
            }
            else {
                connection = connectionTransactional;
            }

            preparedStatement = connection.prepareStatement(SQL_UPDATE);

            preparedStatement.setString(1,persona.getNombre());
            preparedStatement.setString(2,persona.getApellido());
            preparedStatement.setString(3,persona.getEmail());
            preparedStatement.setString(4,persona.getTelefono());
            preparedStatement.setInt(5,persona.getIdPersona());

            registers = preparedStatement.executeUpdate();
        }

        finally {
            try {
                ConnectionSQL.close(preparedStatement);

                if(this.connectionTransactional == null){
                    ConnectionSQL.close(connection);
                }
            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return registers;
    }

    @Override
    public int delete(int idPerson) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registers = 0;

        try {
            if(connectionTransactional == null){
                connection = ConnectionSQL.getConnection();
            }
            else {
                connection = connectionTransactional;
            }

            preparedStatement = connection.prepareStatement(SQL_DELETE);

            preparedStatement.setInt(1,idPerson);

            registers = preparedStatement.executeUpdate();
        }
        finally {
            try {
                ConnectionSQL.close(preparedStatement);
                if(this.connectionTransactional == null){
                    ConnectionSQL.close(connection);
                }

            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return registers;
    }
}
