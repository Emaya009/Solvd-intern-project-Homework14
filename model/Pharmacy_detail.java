package pharmacy.model;

import java.util.Date;

public class Pharmacy_detail {

private int prescription_id;
private int customer_id;
private int doctor_id;
private int payment_method_id;
private Date date;

    public Pharmacy_detail() {
    }

    public Pharmacy_detail(int prescription_id, int customer_id, int doctor_id, int payment_method_id, Date date) {
        this.prescription_id = prescription_id;
        this.customer_id = customer_id;
        this.doctor_id = doctor_id;
        this.payment_method_id = payment_method_id;
        this.date = date;
    }

    public int getPrescription_id() {
        return prescription_id;
    }

    public void setPrescription_id(int prescription_id) {
        this.prescription_id = prescription_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public int getPayment_method_id() {
        return payment_method_id;
    }

    public void setPayment_method_id(int payment_method_id) {
        this.payment_method_id = payment_method_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Pharmacy_detail{" +
                "prescription_id=" + prescription_id +
                ", customer_id=" + customer_id +
                ", doctor_id=" + doctor_id +
                ", payment_method_id=" + payment_method_id +
                ", date=" + date +
                '}';
    }
}
