package test;

import java.sql.*;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        /*String url = "jdbc:mysql://localhost:3306/test?" +
                "useSSL=false&" +
                "useTimezone=true&" +
                "serverTimezone=UTC&" +
                "allowPublicKeyRetrieval=true";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionSQL connection = DriverManager.getConnection(url,"root","pitonpastel");

            // createStatement returns the impl for the Statement interface
            Statement sqlInstruction = connection.createStatement();

            String query = "SELECT * FROM persona;";

            // gets the result from the query
            ResultSet result = sqlInstruction.executeQuery(query);

            while (result.next()){
                System.out.print(result.getInt("id_persona") + " ");
                System.out.print(result.getString("nombre") + " ");
                System.out.print(result.getString("apellido") + " ");
                System.out.print(result.getString("email") + " ");
                System.out.println(result.getString("telefono"));
            }

            result.close();
            sqlInstruction.close();
            connection.close();
        }
        catch (ClassNotFoundException e) {
            // the one for class name
            e.printStackTrace(System.out);
        }
        catch (SQLException throwables) {
            // the one for connection
            throwables.printStackTrace(System.out);
        }*/
    }
}
