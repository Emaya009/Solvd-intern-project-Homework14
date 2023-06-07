package pharmacy.Services;


import pharmacy.DAOimpl.GenericDAOImpl;
import pharmacy.model.Payment;

import java.util.List;

public class PaymentService {
    private GenericDAOImpl<Payment> paymentGenericDAO;
    public PaymentService(GenericDAOImpl<Payment> paymentGenericDAO) {
        this.paymentGenericDAO = paymentGenericDAO;
    }

    public void createPayment(Payment payment) {
        paymentGenericDAO.create(payment);
    }

    public Payment getPaymentById(int id) {
        return paymentGenericDAO.getById(id);
    }

    public List<Payment> getAllPayment() {
        return paymentGenericDAO.getAll();
    }

    public void updatePayment(Payment payment) {
        paymentGenericDAO.update(payment);
    }
    public void deletePayment(Payment payment) {
        paymentGenericDAO.delete(payment);
    }
}
