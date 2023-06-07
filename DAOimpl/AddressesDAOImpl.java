package pharmacy.DAOimpl;

import pharmacy.InterfacesDAo.AddressDAO;
import pharmacy.model.Addresses;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddressesDAOImpl implements AddressDAO {
    private static final String SELECT_QUERY = "SELECT * FROM Addresses WHERE address_id =?";
    private static final String SAVE_QUERY= "INSERT INTO Addresses (address_id, street_name, city, state, country) VALUES (?, ?, ?, ?, ?)";
    private static final String UPDATE_QUERY="UPDATE Addresses" + "SET street_name =?, city =?, state =?, country =?";
    private static final String DELETE_QUERY="DELETE FROM Addresses WHERE address_id =?";
    private static final String SELECT_ALL_QUERY= "SELECT * FROM Addresses";
        private Connection conn1;
        private ResultSet rs1;

        public AddressesDAOImpl() {

        }
    public AddressesDAOImpl(Connection conn1) {
        this.conn1 = conn1;
    }

    @Override
            public List<Addresses> getAllAddress() throws SQLException {
        List<Addresses> address = new ArrayList<>();
        Addresses addresses = null;
        try (PreparedStatement stmt1 = conn1.prepareStatement(SELECT_ALL_QUERY)) {
                rs1 = stmt1.executeQuery();
                while (rs1.next()) {
                    addresses = new Addresses();
                    addresses.setAddress_id(rs1.getInt("address_id"));
                    addresses.setStreet_name(rs1.getString("street_name"));
                    addresses.setCity(rs1.getString("city"));
                    addresses.setState(rs1.getString("state"));
                    addresses.setCountry(rs1.getString("country"));
                    address.add(addresses);
                }
            }
            return address;
        }
        @Override
        public Addresses getAddress(int address_id) throws SQLException {
            Addresses addresses1 = null;
            try (PreparedStatement stmt1 = conn1.prepareStatement(SELECT_QUERY)) {
                stmt1.setInt(1, address_id);
                rs1 = stmt1.executeQuery();
                if (rs1.next()) {
                    addresses1 = new Addresses();
                    addresses1.setAddress_id(rs1.getInt("address_id"));
                    addresses1.setStreet_name(rs1.getString("street_name"));
                    addresses1.setCity(rs1.getString("city"));
                    addresses1.setState(rs1.getString("state"));
                    addresses1.setCountry(rs1.getString("country"));
                }
            }
            return addresses1;
        }
            @Override
            public void saveAddress(Addresses addresses) throws SQLException {
                try (PreparedStatement stmt1 = conn1.prepareStatement(SAVE_QUERY)) {
                    stmt1.setInt(1, addresses.getAddress_id());
                    stmt1.setString(2, addresses.getStreet_name());
                    stmt1.setString(3, addresses.getCity());
                    stmt1.setString(4, addresses.getState());
                    stmt1.setString(5, addresses.getCountry());
                    stmt1.executeUpdate();
                }
            }

            @Override
            public void updateAddress(Addresses addresses) throws SQLException {
                try (PreparedStatement stmt1 = conn1.prepareStatement(UPDATE_QUERY)) {
                    stmt1.setString(1, addresses.getStreet_name());
                    stmt1.setString(2, addresses.getCity());
                    stmt1.setString(3, addresses.getState());
                    stmt1.setString(4, addresses.getCountry());
                    stmt1.executeUpdate();
                }
            }

            public void deleteAddress(int address_id) throws SQLException {
                try (PreparedStatement stmt1 = conn1.prepareStatement(DELETE_QUERY)) {
                    stmt1.setInt(1, address_id);
                    stmt1.executeUpdate();
                }
            }


}
