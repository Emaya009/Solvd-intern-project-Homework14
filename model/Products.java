package pharmacy.model;

import org.w3c.dom.Text;

import java.util.Date;

public class Products {
    private int product_id;
    private String product_name;
    private int unit;
    private double taxing;
    private String batch_num;
    private Date manufactured_date;
    private Date import_date;
    private Date expire_date;
    private int manufacturer;
    private Text comment;

    public Products() {
    }

    public Products(int product_id, String product_name, int unit, double taxing, String batch_num, Date manufactured_date, Date import_date, Date expire_date, int manufacturer, Text comment) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.unit = unit;
        this.taxing = taxing;
        this.batch_num = batch_num;
        this.manufactured_date = manufactured_date;
        this.import_date = import_date;
        this.expire_date = expire_date;
        this.manufacturer = manufacturer;
        this.comment = comment;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getTaxing() {
        return taxing;
    }

    public void setTaxing(double taxing) {
        this.taxing = taxing;
    }

    public String getBatch_num() {
        return batch_num;
    }

    public void setBatch_num(String batch_num) {
        this.batch_num = batch_num;
    }

    public Date getManufactured_date() {
        return manufactured_date;
    }

    public void setManufactured_date(Date manufactured_date) {
        this.manufactured_date = manufactured_date;
    }

    public Date getImport_date() {
        return import_date;
    }

    public void setImport_date(Date import_date) {
        this.import_date = import_date;
    }

    public Date getExpire_date() {
        return expire_date;
    }

    public void setExpire_date(Date expire_date) {
        this.expire_date = expire_date;
    }

    public int getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(int manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Text getComment() {
        return comment;
    }

    public void setComment(Text comment) {
        this.comment = comment;
    }
    @Override
    public String toString() {
        return "Products{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", unit=" + unit +
                ", taxing=" + taxing +
                ", batch_num='" + batch_num + '\'' +
                ", manufactured_date=" + manufactured_date +
                ", import_date=" + import_date +
                ", expire_date=" + expire_date +
                ", manufacturer=" + manufacturer +
                ", comment=" + comment +
                '}';
    }
}
