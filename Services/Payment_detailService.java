package pharmacy.Services;

import pharmacy.DAOimpl.GenericDAOImpl;
import pharmacy.model.Payment_detail;

import java.util.List;

public class Payment_detailService {
    private GenericDAOImpl<Payment_detail> paymentDetailGenericDAO;

    public Payment_detailService(GenericDAOImpl<Payment_detail> paymentDetailGenericDAO) {
        this.paymentDetailGenericDAO = paymentDetailGenericDAO;
    }

    public void createPayment_detail(Payment_detail paymentDetail) {
        paymentDetailGenericDAO.create(paymentDetail);
    }

    public Payment_detail getPayment_detailById(int id) {
        return paymentDetailGenericDAO.getById(id);
    }

    public List<Payment_detail> getAllPayment_detail() {
        return paymentDetailGenericDAO.getAll();
    }

    public void updatePayment_detail(Payment_detail paymentDetail) {
       paymentDetailGenericDAO.update(paymentDetail);
    }
    public void deletePayment_detail(Payment_detail paymentDetail) {
        paymentDetailGenericDAO.delete(paymentDetail);
    }
}
