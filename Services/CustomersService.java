package pharmacy.Services;

import pharmacy.InterfacesDAo.CustomerDAO;
import pharmacy.model.Customers;

import java.sql.SQLException;
import java.util.List;

public class CustomersService {

           private CustomerDAO customerDAO;

    public CustomersService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public Customers getCustomer(int customer_id) throws SQLException {
            return customerDAO.getCustomer(customer_id);
        }
        public List<Customers> getAllCustomers() throws SQLException {
            return customerDAO.getAllCustomers();
    }
        public void saveCustomer(Customers customer) throws SQLException {
            customerDAO.saveCustomer(customer);
        }
        public void updateCustomer(Customers customer) throws SQLException {
            customerDAO.updateCustomer(customer);
        }
        public void deleteCustomer(int customer) throws SQLException {
            customerDAO.deleteCustomer(customer);
        }
    }

