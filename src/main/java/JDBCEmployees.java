import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class JDBCEmployees {
    public static void main(String[] args) {
        try {
            // register driver - done
            // create connection - done
            // create statement - done
            // (Select) execute the query with statement
            // scroll through ResultSet to print out first 10 employee first names

            // register driver
            DriverManager.registerDriver(new Driver() {
                @Override
                public Connection connect(String url, Properties info) throws SQLException {
                    return null;
                }

                @Override
                public boolean acceptsURL(String url) throws SQLException {
                    return false;
                }

                @Override
                public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                    return new DriverPropertyInfo[0];
                }

                @Override
                public int getMajorVersion() {
                    return 0;
                }

                @Override
                public int getMinorVersion() {
                    return 0;
                }

                @Override
                public boolean jdbcCompliant() {
                    return false;
                }

                @Override
                public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                    return null;
                }
            });

            // create connection
            Connection connection = DriverManager.getConnection(
                    // DB connection url
                    "jdbc:mysql://localhost/employees_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",
                    // DB username
                    "root",
                    // DB password
                    "codeup"
            );

            // create statement
            Statement statement = connection.createStatement();

            // (Select) execute the query with statement
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

            // scroll through ResultSet to print out first 10 employee first names
            resultSet.next();

            if (resultSet.next()) {
                String firstName = resultSet.getString("firstName");
                System.out.println(firstName);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
