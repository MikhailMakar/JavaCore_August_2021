package lessons.lesson22102021.jdbc;

import java.sql.*;
import java.util.Properties;

public class JdbcConnectionExample {

    private static final String SQL = "Select * from customer where first_name = ? and customer_id > ?";
    private static final String CALLABLE_STAT = "Select * from get_orders_by_customer(?)";

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/hplussport";
        Properties properties = new Properties();
        properties.setProperty("user", "postgres");
        properties.setProperty("password", "postgres");

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, properties);
            System.out.println("Connected");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from customer where customer_id in (200, 1000)");
//            System.out.println();
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString(1));
//                System.out.println(resultSet.getString(2));
//                System.out.println(resultSet.getString(3));
//                System.out.println(resultSet.getString(4));
//                System.out.println(resultSet.getString(5));
//                System.out.println(resultSet.getString(6));
//                System.out.println(resultSet.getString(7));
//                System.out.println(resultSet.getString(8));
//                System.out.println(resultSet.getString(9));
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }

//            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
//            preparedStatement.setString(1, "John");
//            preparedStatement.setLong(2, 100);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("first_name") + " " + resultSet.getString("last_name")
//                + " " + resultSet.getString("customer_id"));
//            }

            CallableStatement callableStatement = connection.prepareCall(CALLABLE_STAT);
            callableStatement.setLong(1, 789);
            ResultSet resultSet = callableStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getString(4));
                System.out.println(resultSet.getString(5));
                System.out.println(resultSet.getString(6));
                System.out.println(resultSet.getString(7));
                System.out.println(resultSet.getString(8));
                System.out.println(resultSet.getString(9));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
