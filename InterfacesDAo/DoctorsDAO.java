package pharmacy.InterfacesDAo;

import pharmacy.model.Doctors;

import java.sql.SQLException;
import java.util.List;

public interface DoctorsDAO {

    List<Doctors> getAll() throws SQLException;
    Doctors getId(int id) throws SQLException;
    void saveId(Doctors doctors) throws SQLException;

    void updateId(Doctors doctors) throws SQLException;

    void deleteId(int id) throws SQLException;
}
