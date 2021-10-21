import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class JDBCTest {
    public static void main(String[] args) {
        try {
            // register driver
            // create connection
            // create statement
            // (Select) execute the query with statement
            // scroll through ResultSet to print album artists

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
                    "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",
                    // DB username
                    "root",
                    // DB password
                    "codeup"
            );

            // create statement

            Statement statement = connection.createStatement();

            // (Select) execute the query with statement

            ResultSet resultSet = statement.executeQuery("SELECT * FROM albums");

            // resultSet.next(); // look at first result

            resultSet.next();
            resultSet.next();
            resultSet.next();

            if (resultSet.next()) { // look at first result
                String firstArtist = resultSet.getString("artist");
                String firstAlbum = resultSet.getString("name");
                System.out.println(firstArtist);
                System.out.println(firstAlbum);
            }



            String firstArtist = resultSet.getString("artist");
            String firstAlbum = resultSet.getString("name");

            System.out.println(firstArtist);
            System.out.println(firstAlbum);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }





            // scroll through ResultSet to print album artists


            // id |         artist |                      name | release_date | sales | genre <------------ column names
            // 1  |              2 |                         3 |            4 |     5 |     6 <------------ column numbers


            // 1 | Michael Jackson |                  Thriller |         1982 |  47.3 | Pop, Rock, R&B // next() returns true
            // 2 |           AC/DC |             Back in Black |         1980 |  26.1 | Hard rock // .next() returns true
            // 3 |      Pink Floyd | The Dark Side of the Moon |         1973 |  24.2 | Progressive rock // .next() returns true
            // .next() false
            //


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
