package pharmacy.InterfacesDAo;
import pharmacy.model.Customers;
import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {
      List<Customers> getAllCustomers() throws SQLException;
        Customers getCustomer(int customer_id) throws SQLException;
        void saveCustomer(Customers customer) throws SQLException;
        void updateCustomer(Customers customer) throws SQLException;
        void deleteCustomer(int customer) throws SQLException;

    }


