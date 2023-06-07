package pharmacy.InterfacesDAo;

import pharmacy.model.Addresses;

import java.sql.SQLException;
import java.util.List;

public interface AddressDAO {

    List<Addresses> getAllAddress() throws SQLException;
    Addresses getAddress(int address_id) throws SQLException;
    void saveAddress(Addresses addresses) throws SQLException;
    void updateAddress(Addresses addresses) throws SQLException;
    void deleteAddress(int address_id) throws SQLException;

}


