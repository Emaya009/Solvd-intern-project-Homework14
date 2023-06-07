package pharmacy.Services;


import pharmacy.DAOimpl.GenericDAOImpl;
import pharmacy.model.Prescription_items;

import java.util.List;

public class Prescription_itemsService {

    private GenericDAOImpl<Prescription_items> prescriptionItemsGenericDAO;

    public Prescription_itemsService(GenericDAOImpl<Prescription_items> prescriptionItemsGenericDAO) {
        this.prescriptionItemsGenericDAO = prescriptionItemsGenericDAO;
    }

    public void createPrescription_items(Prescription_items prescriptionItems) {
        prescriptionItemsGenericDAO.create(prescriptionItems);
    }

    public Prescription_items getPrescription_itemsById(int id) {
        return prescriptionItemsGenericDAO.getById(id);
    }

    public List<Prescription_items> getAllPrescription_items() {
        return prescriptionItemsGenericDAO.getAll();
    }

    public void updatePrescription_items(Prescription_items prescriptionItems) {
       prescriptionItemsGenericDAO.update(prescriptionItems);
    }
    public void deletePrescription_items(Prescription_items prescriptionItems) {
       prescriptionItemsGenericDAO.delete(prescriptionItems);
    }
}
