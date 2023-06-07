package pharmacy.model;

public class Payment_detail {

    private int payment_id;
    private int order_id;
private int prod_id;
private int quantity_ordered;
private double price_each;
private int mode_id;

    public Payment_detail() {
    }

    public Payment_detail(int payment_id, int order_id, int prod_id, int quantity_ordered, double price_each, int mode_id) {
        this.payment_id = payment_id;
        this.order_id = order_id;
        this.prod_id = prod_id;
        this.quantity_ordered = quantity_ordered;
        this.price_each = price_each;
        this.mode_id = mode_id;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public int getQuantity_ordered() {
        return quantity_ordered;
    }

    public void setQuantity_ordered(int quantity_ordered) {
        this.quantity_ordered = quantity_ordered;
    }

    public double getPrice_each() {
        return price_each;
    }

    public void setPrice_each(double price_each) {
        this.price_each = price_each;
    }

    public int getMode_id() {
        return mode_id;
    }

    public void setMode_id(int mode_id) {
        this.mode_id = mode_id;
    }

    @Override
    public String toString() {
        return "Payment_detail{" +
                "payment_id=" + payment_id +
                ", order_id=" + order_id +
                ", prod_id=" + prod_id +
                ", quantity_ordered=" + quantity_ordered +
                ", price_each=" + price_each +
                ", mode_id=" + mode_id +
                '}';
    }
}
