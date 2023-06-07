package pharmacy.Services;

import pharmacy.DAOimpl.GenericDAOImpl;
import pharmacy.model.Medication;

import java.util.List;

public class MedicationService {
    private GenericDAOImpl<Medication> medicationGenericDAO;

    public MedicationService(GenericDAOImpl<Medication> medicationGenericDAO) {
        this.medicationGenericDAO = medicationGenericDAO;
    }

    public void createMedication(Medication medication) {
        medicationGenericDAO.create(medication);
    }

    public Medication getMedicationById(int id) {
        return medicationGenericDAO.getById(id);
    }

    public List<Medication> getAllMedication() {
        return medicationGenericDAO.getAll();
    }

    public void updateMedication(Medication medication) {
        medicationGenericDAO.update(medication);
    }
    public void deleteMedication(Medication medication) {
       medicationGenericDAO.delete(medication);
    }
}
