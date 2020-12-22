package test.data;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class ConnectionSQL {

    private final static String JDBC_URL = "jdbc:mysql://localhost:3306/test?" +
            "useSSL=false&" +
            "useTimezone=true&" +
            "serverTimezone=UTC&" +
            "allowPublicKeyRetrieval=true";

    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "pitonpastel";

    //With pool connections
    public static DataSource getDataSource(){
        BasicDataSource basicDataSource = new BasicDataSource();

        basicDataSource.setUrl(JDBC_URL);
        basicDataSource.setUsername(JDBC_USER);
        basicDataSource.setPassword(JDBC_PASSWORD);

        //Initial size of the pool
        basicDataSource.setInitialSize(5);
        return basicDataSource;
    }


    public static Connection getConnection() throws SQLException {
        //Without pool connections
       // return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

        //With pool connections
        return getDataSource().getConnection();
    }

    public static void close(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }

    public static void close(Statement statement) throws SQLException {
        statement.close();
    }

    public static void close(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }

    public static void close(Connection connection) throws SQLException {
        connection.close();
    }


}
