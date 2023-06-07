package pharmacy.Services;

import pharmacy.DAOimpl.GenericDAOImpl;
import pharmacy.model.Manufacturers;

import java.util.List;

public class ManufacturersService {
    private GenericDAOImpl<Manufacturers> manufacturersGenericDAO;

    public ManufacturersService(GenericDAOImpl<Manufacturers> manufacturersGenericDAO) {
        this.manufacturersGenericDAO = manufacturersGenericDAO;
    }

    public void createManufacturers(Manufacturers manufacturers) {
        manufacturersGenericDAO.create(manufacturers);
    }

    public Manufacturers getManufacturersById(int id) {
        return manufacturersGenericDAO.getById(id);
    }

    public List<Manufacturers> getAllManufacturers() {
        return manufacturersGenericDAO.getAll();
    }

    public void updateManufacturers(Manufacturers manufacturers) {
        manufacturersGenericDAO.update(manufacturers);
    }
    public void deleteManufacturers(Manufacturers manufacturers) {
       manufacturersGenericDAO.delete(manufacturers);
    }
}
