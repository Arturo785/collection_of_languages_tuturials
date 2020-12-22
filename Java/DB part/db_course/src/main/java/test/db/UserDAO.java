package test.db;

import test.data.ConnectionSQL;
import test.models.Persona;
import test.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private static final String SQL_SELECT = "SELECT * FROM usuario;";
    private static final String SQL_INSERT = "INSERT INTO usuario (user_name, password) VALUES(?, ?);";
    private static final String SQL_UPDATE =
            "UPDATE usuario SET user_name = ?, password = ? WHERE id_user = ?;";

    private static final String SQL_DELETE = "DELETE from usuario WHERE id_user = ?";

    public List<User> getAllUsers(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        User user = null;
        List<User> users = new ArrayList<>();

        try {
            connection = ConnectionSQL.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECT);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt("id_user");
                String username = resultSet.getString("user_name");
                String password = resultSet.getString("password");

                user = new User(id,username,password);
                users.add(user);
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

        return users;
    }

    public int insertUser(User user){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registers = 0;

        try {
            connection = ConnectionSQL.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT);

            preparedStatement.setString(1,user.getUserName());
            preparedStatement.setString(2,user.getPassword());

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

    public int updateUser(User user){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registers = 0;

        try {
            connection = ConnectionSQL.getConnection();
            preparedStatement = connection.prepareStatement(SQL_UPDATE);

            preparedStatement.setString(1,user.getUserName());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.setInt(3,user.getIdUser());

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

    public int deleteUser(int idUser){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registers = 0;

        try {
            connection = ConnectionSQL.getConnection();
            preparedStatement = connection.prepareStatement(SQL_DELETE);

            preparedStatement.setInt(1,idUser);

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
