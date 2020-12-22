package data;

import beans.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientImpl implements ClientDAO {

    private static final String SQL_SELECT = "SELECT * FROM client";

    private static final String SQL_SELECT_BY_ID = "SELECT * FROM client WHERE id_client = ?";

    private static final String SQL_INSERT = "INSERT INTO client(name, lastname, email, phone, amount) "
            + "VALUES (?,?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE client "+
            "SET name=?, lastname=?, email=?, phone=?, amount=? WHERE id_client = ?";

    private static final String SQL_DELETE = "DELETE FROM client where id_client = ?";

    @Override
    public List<Client> listClients() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Client client = null;

        List<Client> clients = new ArrayList<>();

        try {
            connection = MainConnection.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECT);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int idClient = resultSet.getInt("id_client");
                String name = resultSet.getString("name");
                String lastname = resultSet.getString("lastname");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                double amount = resultSet.getDouble("amount");

                client = new Client(idClient,name,lastname,email,phone,amount);
                clients.add(client);
            }
        }
        catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
        finally {
            MainConnection.close(resultSet);
            MainConnection.close(preparedStatement);
            MainConnection.close(connection);
        }

        return clients;
    }

    @Override
    public Client findClient(int idClient) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Client client = null;


        try {
            connection = MainConnection.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECT_BY_ID);
            preparedStatement.setInt(1, idClient);

            resultSet = preparedStatement.executeQuery();

            resultSet.next(); // we go to the result


            String name = resultSet.getString("name");
            String lastname = resultSet.getString("lastname");
            String email = resultSet.getString("email");
            String phone = resultSet.getString("phone");
            double amount = resultSet.getDouble("amount");

            client = new Client(idClient,name,lastname,email,phone,amount);

        }
        catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
        finally {
            MainConnection.close(resultSet);
            MainConnection.close(preparedStatement);
            MainConnection.close(connection);
        }
        return client;
    }

    @Override
    public int insertClient(Client clientToInsert) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int result = 0;

        try {
            connection = MainConnection.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT);


            preparedStatement.setString(1, clientToInsert.getName());
            preparedStatement.setString(2, clientToInsert.getLastname());
            preparedStatement.setString(3, clientToInsert.getEmail());
            preparedStatement.setString(4, clientToInsert.getPhone());
            preparedStatement.setDouble(5, clientToInsert.getAmount());

            result = preparedStatement.executeUpdate();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
        finally {
            MainConnection.close(preparedStatement);
            MainConnection.close(connection);
        }
        return result;
    }

    @Override
    public int updateClient(Client clientToUpdate) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int result = 0;

        try {
            connection = MainConnection.getConnection();
            preparedStatement = connection.prepareStatement(SQL_UPDATE);


            preparedStatement.setString(1, clientToUpdate.getName());
            preparedStatement.setString(2, clientToUpdate.getLastname());
            preparedStatement.setString(3, clientToUpdate.getEmail());
            preparedStatement.setString(4, clientToUpdate.getPhone());
            preparedStatement.setDouble(5, clientToUpdate.getAmount());
            preparedStatement.setInt(6, clientToUpdate.getIdClient());

            result = preparedStatement.executeUpdate();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
        finally {
            MainConnection.close(preparedStatement);
            MainConnection.close(connection);
        }
        return result;
    }

    @Override
    public int deleteClient(int idClient) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int result = 0;

        try {
            connection = MainConnection.getConnection();
            preparedStatement = connection.prepareStatement(SQL_DELETE);

            preparedStatement.setInt(1, idClient);

            result = preparedStatement.executeUpdate();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
        finally {
            MainConnection.close(preparedStatement);
            MainConnection.close(connection);
        }
        return result;
    }
}
