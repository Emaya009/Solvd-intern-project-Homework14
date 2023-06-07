package pharmacy.model;

import java.util.Date;

public class Payment {

    private int payment_model_id;
    private String payment_name;
    private String cheque_num;
    private Date cheque_date;
    private String bank;

    public Payment() {
    }

    public Payment(int payment_model_id, String payment_name, String cheque_num, Date cheque_date, String bank) {
        this.payment_model_id = payment_model_id;
        this.payment_name = payment_name;
        this.cheque_num = cheque_num;
        this.cheque_date = cheque_date;
        this.bank = bank;
    }

    public int getPayment_model_id() {
        return payment_model_id;
    }

    public void setPayment_model_id(int payment_model_id) {
        this.payment_model_id = payment_model_id;
    }

    public String getPayment_name() {
        return payment_name;
    }

    public void setPayment_name(String payment_name) {
        this.payment_name = payment_name;
    }

    public String getCheque_num() {
        return cheque_num;
    }

    public void setCheque_num(String cheque_num) {
        this.cheque_num = cheque_num;
    }

    public Date getCheque_date() {
        return cheque_date;
    }

    public void setCheque_date(Date cheque_date) {
        this.cheque_date = cheque_date;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "payment_model_id=" + payment_model_id +
                ", payment_name='" + payment_name + '\'' +
                ", cheque_num='" + cheque_num + '\'' +
                ", cheque_date=" + cheque_date +
                ", bank='" + bank + '\'' +
                '}';
    }
}
