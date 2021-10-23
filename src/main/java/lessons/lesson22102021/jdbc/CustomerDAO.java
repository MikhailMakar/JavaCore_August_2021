package lessons.lesson22102021.jdbc;

import lessons.lesson22102021.jdbc.util.DataAccessObject;

import java.sql.*;

public class CustomerDAO extends DataAccessObject<Customer> {

    private static final String GET_ONE = "Select * FROM customer WHERE customer_id = ?";

    private static final String CREATE =
            "INSERT INTO customer (first_name,last_name, email, phone, address, city, state, zipcode)"
                    + "VALUES(?,?,?,?,?,?,?,?)";

    private static final String UPDATE =
            " UPDATE customer SET first_name = ?, last_name = ?,"
                    + "email = ?, phone = ?, address = ?, city = ?, state = ?, zipcode = ? WHERE customer_id = ?";

    private static final String DELETE = "DELETE FROM customer where customer_id = ?";

    public CustomerDAO(Connection connection) {
        super(connection);
    }

    @Override
    public Customer findById(long id) {
        Customer customer = new Customer();

//        Savepoint savepoint = null;
//        try {
//            savepoint = connection.setSavepoint();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
//            connection.setAutoCommit(false);
//            connection.setTransactionIsolation(8);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                customer.setId(resultSet.getLong("customer_id"));
                customer.setFirstName(resultSet.getString("first_name"));
                customer.setLastName(resultSet.getString("last_name"));
                customer.setEmail(resultSet.getString("email"));
                customer.setPhone(resultSet.getString("phone"));
                customer.setAddress(resultSet.getString("address"));
                customer.setCity(resultSet.getString("city"));
                customer.setState(resultSet.getString("state"));
                customer.setZipCode(resultSet.getString("zipcode"));
            }
        } catch (SQLException e) {
//            try {
//                connection.rollback(savepoint);
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return customer;
    }

    @Override
    public Customer update(Customer dto) {
        Customer byId;

        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            populatePreparedStatement(dto, statement);
            statement.setLong(9, dto.getId());
            statement.execute();
            byId = this.findById(dto.getId());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return byId;
    }

    private void populatePreparedStatement(Customer dto, PreparedStatement statement) throws SQLException {
        statement.setString(1, dto.getFirstName());
        statement.setString(2, dto.getLastName());
        statement.setString(3, dto.getEmail());
        statement.setString(4, dto.getPhone());
        statement.setString(5, dto.getAddress());
        statement.setString(6, dto.getCity());
        statement.setString(7, dto.getState());
        statement.setString(8, dto.getZipCode());
    }

    @Override
    public Customer create(Customer dto) {
        Customer customer = null;
        try {
            System.out.println(connection.getAutoCommit());
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (PreparedStatement statement = this.connection.prepareStatement(CREATE)) {
            populatePreparedStatement(dto, statement);
            statement.execute();
            connection.commit();
            int lastValue = this.getLastValue(CUSTOMER_SEQUENCE);

            customer = this.findById(lastValue);
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return customer;
    }

    @Override
    public void delete(long id) {
        try(PreparedStatement statement = this.connection.prepareStatement(DELETE)) {
            statement.setLong(1, id);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
