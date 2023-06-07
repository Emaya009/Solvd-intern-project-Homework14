package pharmacy.Services;


import pharmacy.InterfacesDAo.AddressDAO;
import pharmacy.model.Addresses;

import java.sql.SQLException;
import java.util.List;

public class AddressesService {
    private AddressDAO addressDAO;

    public AddressesService(AddressDAO addressDAO) {
        this.addressDAO = addressDAO;
    }

    public Addresses getAddress(int address_id) throws SQLException {
        return addressDAO.getAddress(address_id);
    }

    public List<Addresses> getAllAddress() throws SQLException {
        return addressDAO.getAllAddress();
    }

    public void saveAddress(Addresses addresses) throws SQLException {
        addressDAO.saveAddress(addresses);
    }

    public void updateAddress(Addresses addresses) throws SQLException {
        addressDAO.updateAddress(addresses);
    }

    public void deleteAddress(int address_id) throws SQLException {
        addressDAO.deleteAddress(address_id);
    }
}