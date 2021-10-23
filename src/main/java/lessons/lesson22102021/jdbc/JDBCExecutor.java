package lessons.lesson22102021.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCExecutor {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/hplussport";
        Properties properties = new Properties();
        properties.setProperty("user", "postgres");
        properties.setProperty("password", "postgres");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, properties);
            CustomerDAO customerDAO = new CustomerDAO(connection);
//            Customer byId = customerDAO.findById(1000);
//            System.out.println(byId);
//            byId.setFirstName("George");
//            customerDAO.update(byId);
//            System.out.println(byId);
//            Customer customer = new Customer();
//            customer.setFirstName("Bob");
//            customer.setLastName("Tornton");
//            customer.setEmail("badSanta@gmail.com");
//            customer.setPhone("555-444-2");
//            customer.setCity("Minneapolis");
//            customer.setState("Nevada");
//            customer.setAddress("Mall");
//            customer.setZipCode("12345");
//
//            Customer customerDB = customerDAO.create(customer);
//            System.out.println(customerDB);

//            System.out.println(customerDAO.findById(10000));
            customerDAO.delete(10000);
            System.out.println(customerDAO.findById(10000));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
