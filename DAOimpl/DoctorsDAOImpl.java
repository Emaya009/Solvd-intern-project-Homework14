package pharmacy.DAOimpl;

import pharmacy.InterfacesDAo.DoctorsDAO;
import pharmacy.model.Doctors;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorsDAOImpl implements DoctorsDAO {

    private static final String SELECT_QUERY = "SELECT * FROM Doctors WHERE doctor_id =?";
    private static final String SAVE_QUERY= "INSERT INTO Doctors (doctor_id, address_id1, first_name, last_name, phone, email) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_QUERY="UPDATE Doctors" + "SET address_id1 =?, first_name =?, last_name =?, phone =?, email =?";
    private static final String DELETE_QUERY="DELETE FROM Doctors WHERE doctor_id =?";
    private static final String SELECT_ALL_QUERY= "SELECT * FROM Doctors";
    private Connection conn2;
    private ResultSet rs2;

    public DoctorsDAOImpl() {
    }

    public DoctorsDAOImpl(Connection conn2) {
        this.conn2 = conn2;
    }

    @Override
    public List<Doctors> getAll() throws SQLException {
        List<Doctors> doctor = new ArrayList<>();
        Doctors doctors = null;
        try (PreparedStatement stmt2 = conn2.prepareStatement(SELECT_ALL_QUERY)) {
            rs2 = stmt2.executeQuery();
            while (rs2.next()) {
                doctors = new Doctors();
                doctors.setDoctor_id(rs2.getInt("doctor_id"));
                doctors.setAddress_id1(rs2.getInt("address_id1"));
                doctors.setFirst_name(rs2.getString("first_name"));
                doctors.setLast_name(rs2.getString("last_name"));
                doctors.setPhone(rs2.getString("phone"));
                doctors.setEmail(rs2.getString("email"));
                doctor.add(doctors);
            }
        }
        return doctor;
    }
    @Override
    public Doctors getId(int doctor_id) throws SQLException {
       Doctors doctor1 = null;
        try (PreparedStatement stmt2 = conn2.prepareStatement(SELECT_QUERY)) {
            stmt2.setInt(1, doctor_id);
            rs2 = stmt2.executeQuery();
            if (rs2.next()) {
                doctor1 = new Doctors();
                doctor1.setAddress_id1(rs2.getInt("address_id1"));
                doctor1.setFirst_name(rs2.getString("first_name"));
                doctor1.setLast_name(rs2.getString("last_name"));
                doctor1.setPhone(rs2.getString("phone"));
                doctor1.setEmail(rs2.getString("email"));
            }
        }
        return doctor1;
    }
    @Override
    public void saveId(Doctors doctors) throws SQLException {
        try (PreparedStatement stmt2 = conn2.prepareStatement(SAVE_QUERY)) {
            stmt2.setInt(1, doctors.getDoctor_id());
            stmt2.setInt(2, doctors.getAddress_id1());
            stmt2.setString(3, doctors.getFirst_name());
            stmt2.setString(4, doctors.getLast_name());
            stmt2.setString(5, doctors.getPhone());
            stmt2.setString(6, doctors.getEmail());
            stmt2.executeUpdate();
        }
    }

    @Override
    public void updateId(Doctors doctors) throws SQLException {
        try (PreparedStatement stmt2 = conn2.prepareStatement(UPDATE_QUERY)) {
            stmt2.setInt(1,doctors.getAddress_id1());
            stmt2.setString(2, doctors.getFirst_name());
            stmt2.setString(3, doctors.getLast_name());
            stmt2.setString(4, doctors.getPhone());
            stmt2.setString(5,doctors.getEmail());
            stmt2.executeUpdate();
        }
    }

    public void deleteId(int doctor_id) throws SQLException {
        try (PreparedStatement stmt2 = conn2.prepareStatement(DELETE_QUERY)) {
            stmt2.setInt(1, doctor_id);
            stmt2.executeUpdate();
        }
    }


}
