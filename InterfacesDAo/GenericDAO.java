package pharmacy.InterfacesDAo;
import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T> {
        void create(T entity) throws SQLException;
        List<T> getAll() throws SQLException;
        T getById(int id) throws SQLException;
        void update(T entity) throws SQLException;
        void delete(T entity) throws SQLException;

    }

