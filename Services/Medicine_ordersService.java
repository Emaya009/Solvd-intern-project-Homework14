package pharmacy.Services;

import pharmacy.DAOimpl.GenericDAOImpl;
import pharmacy.model.Medicine_orders;

import java.util.List;

public class Medicine_ordersService {
    private GenericDAOImpl<Medicine_orders> medicineOrdersGenericDAO;

    public Medicine_ordersService(GenericDAOImpl<Medicine_orders> medicineOrdersGenericDAO) {
        this.medicineOrdersGenericDAO = medicineOrdersGenericDAO;
    }

    public void createMedicineorder(Medicine_orders medicineOrders) {
       medicineOrdersGenericDAO.create(medicineOrders);
    }

    public Medicine_orders getMedicineordersById(int id) {
        return medicineOrdersGenericDAO.getById(id);
    }

    public List<Medicine_orders> getAllMedicineorders() {
        return medicineOrdersGenericDAO.getAll();
    }

    public void updateMedicineorders(Medicine_orders medicineOrders) {
        medicineOrdersGenericDAO.update(medicineOrders);
    }
    public void deleteMedicineorders(Medicine_orders medicineOrders) {
        medicineOrdersGenericDAO.delete(medicineOrders);
    }
}
