package lessons.lesson22102021.jdbc.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DataAccessObject<T extends DataTransferObject> {
    protected final Connection connection;
    protected static final String LAST_VAL = "Select last_value FROM";
    protected static final String CUSTOMER_SEQUENCE = " hp_customer_seq";

    public DataAccessObject(Connection connection) {
        super();
        this.connection = connection;
    }

    public abstract T findById(long id);

    public abstract T update(T dto);

    public abstract T create(T dto);

    public abstract void delete(long id);

    protected int getLastValue(String sequence) {
        int key = 0;

        String sql = LAST_VAL + sequence;
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                key = resultSet.getInt(1);
            }
            return key;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
