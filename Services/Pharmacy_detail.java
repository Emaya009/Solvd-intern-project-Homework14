package pharmacy.Services;


import pharmacy.DAOimpl.GenericDAOImpl;

import java.util.List;

public class Pharmacy_detail {
    private GenericDAOImpl<Pharmacy_detail> pharmacyDetailGenericDAO;

    public Pharmacy_detail(GenericDAOImpl<Pharmacy_detail> pharmacyDetailGenericDAO) {
        this.pharmacyDetailGenericDAO = pharmacyDetailGenericDAO;
    }

    public void createPharmacy_detail(Pharmacy_detail pharmacyDetail) {
        pharmacyDetailGenericDAO.create(pharmacyDetail);
    }

    public Pharmacy_detail getPharmacy_detailById(int id) {
        return pharmacyDetailGenericDAO.getById(id);
    }

    public List<Pharmacy_detail> getAllPharmacy_detail() {
        return pharmacyDetailGenericDAO.getAll();
    }

    public void updatePharmacy_detail(Pharmacy_detail pharmacyDetail) {
        pharmacyDetailGenericDAO.update(pharmacyDetail);
    }
    public void deletePharmacy_detail(Pharmacy_detail pharmacyDetail) {
        pharmacyDetailGenericDAO.delete(pharmacyDetail);
    }
}
