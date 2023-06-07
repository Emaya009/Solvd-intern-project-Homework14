package pharmacy.Services;

import pharmacy.InterfacesDAo.DoctorsDAO;
import pharmacy.model.Doctors;

import java.sql.SQLException;
import java.util.List;

public class DoctorsService {
    private DoctorsDAO doctorsDAO;

    public DoctorsService(DoctorsDAO doctorsDAO) {
        this.doctorsDAO = doctorsDAO;
    }

    public Doctors getId(int doctor_id) throws SQLException {
        return doctorsDAO.getId(doctor_id);
    }

    public List<Doctors> getAll() throws SQLException {
        return doctorsDAO.getAll();
    }

    public void saveId(Doctors doctors) throws SQLException {
        doctorsDAO.saveId(doctors);
    }

    public void updateId(Doctors doctors) throws SQLException {
        doctorsDAO.updateId(doctors);
    }

    public void deleteId(int doctor_id) throws SQLException {
        doctorsDAO.deleteId(doctor_id);
    }

}
