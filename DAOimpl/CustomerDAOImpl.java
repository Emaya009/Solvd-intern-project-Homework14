package pharmacy.DAOimpl;

import pharmacy.InterfacesDAo.CustomerDAO;
import pharmacy.model.Customers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    private static final String SELECT_QUERY = "SELECT * FROM Customers WHERE customer_id =?";
    private static final String SAVE_QUERY= "INSERT INTO Customers (customer_id, address_id, first_name, last_name, phone) VALUES (?, ?, ?, ?, ?)";
    private static final String UPDATE_QUERY="UPDATE customers" + "SET address_id=?,first_name=?,last_name=?,phone=?";
    private static final String DELETE_QUERY="DELETE FROM customers WHERE customer_id =?";
    private static final String SELECT_ALL_QUERY= "SELECT * FROM customers";
       private Connection conn;
       private ResultSet rs;

     public CustomerDAOImpl() {

     }

    public CustomerDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        List<Customers> customer = new ArrayList<>();
        Customers customers = null;
        try(PreparedStatement stmt = conn.prepareStatement(SELECT_ALL_QUERY)){
            rs = stmt.executeQuery();
            while (rs.next()) {
                customers = new Customers();
                customers.setCustomer_id(rs.getInt("customer_id"));
                customers.setAddress_id(rs.getInt("address_id"));
                customers.setFirst_name(rs.getString("first_name"));
                customers.setLast_name(rs.getString("last_name"));
                customers.setPhone(rs.getString("phone"));
                customer.add(customers);
            }
        }
        return customer;
    }

        @Override
        public Customers getCustomer(int customer_id) throws SQLException {
            Customers customer = null;
            try(PreparedStatement stmt = conn.prepareStatement(SELECT_QUERY)) {
                stmt.setInt(1, customer_id);
                rs = stmt.executeQuery();
                if (rs.next()) {
                    customer = new Customers();
                    customer.setCustomer_id(rs.getInt("customer_id"));
                    customer.setAddress_id(rs.getInt("address_id"));
                    customer.setFirst_name(rs.getString("first_name"));
                    customer.setLast_name(rs.getString("last_name"));
                    customer.setPhone(rs.getString("phone"));

                }
            }
         return customer;
        }

   @Override
        public void saveCustomer(Customers customer) throws SQLException {
            try(PreparedStatement stmt = conn.prepareStatement(SAVE_QUERY)) {
                stmt.setInt(1,customer.getCustomer_id());
                stmt.setInt(2,customer.getAddress_id());
                stmt.setString(3, customer.getFirst_name());
                stmt.setString(4, customer.getLast_name());
                stmt.setString(5, customer.getPhone());
                stmt.executeUpdate();
            }
        }

    @Override
        public void updateCustomer(Customers customer) throws SQLException {
            try(PreparedStatement stmt = conn.prepareStatement(UPDATE_QUERY)) {
                stmt.setInt(1, (int) customer.getAddress_id());
                stmt.setString(2, customer.getFirst_name());
                stmt.setString(3, customer.getLast_name());
                stmt.setString(4, customer.getPhone());
                stmt.executeUpdate();
            }
        }

        public void deleteCustomer(int customer_id) throws SQLException {
            try(PreparedStatement stmt = conn.prepareStatement(DELETE_QUERY)) {
                stmt.setInt(1,customer_id);
                stmt.executeUpdate();
            }
        }

}

