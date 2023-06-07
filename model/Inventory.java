package pharmacy.model;

public class Inventory {

    private int inventory_id;
    private int product_id;
    private int bbunit;
    private int stripunit;
    private int tcvunit;
    private double bbcost;
    private double stripcost;
    private double tcvcost;

    private double bbprice;
    private double stripprice;
    private double tcvprice;

    public Inventory() {
    }

    public Inventory(int inventory_id, int product_id, int bbunit, int stripunit, int tcvunit, double bbcost, double stripcost, double tcvcost, double bbprice, double stripprice, double tcvprice) {
        this.inventory_id = inventory_id;
        this.product_id = product_id;
        this.bbunit = bbunit;
        this.stripunit = stripunit;
        this.tcvunit = tcvunit;
        this.bbcost = bbcost;
        this.stripcost = stripcost;
        this.tcvcost = tcvcost;
        this.bbprice = bbprice;
        this.stripprice = stripprice;
        this.tcvprice = tcvprice;
    }

    public int getInventory_id() {
        return inventory_id;
    }

    public void setInventory_id(int inventory_id) {
        this.inventory_id = inventory_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getBbunit() {
        return bbunit;
    }

    public void setBbunit(int bbunit) {
        this.bbunit = bbunit;
    }

    public int getStripunit() {
        return stripunit;
    }

    public void setStripunit(int stripunit) {
        this.stripunit = stripunit;
    }

    public int getTcvunit() {
        return tcvunit;
    }

    public void setTcvunit(int tcvunit) {
        this.tcvunit = tcvunit;
    }

    public double getBbcost() {
        return bbcost;
    }

    public void setBbcost(double bbcost) {
        this.bbcost = bbcost;
    }

    public double getStripcost() {
        return stripcost;
    }

    public void setStripcost(double stripcost) {
        this.stripcost = stripcost;
    }

    public double getTcvcost() {
        return tcvcost;
    }

    public void setTcvcost(double tcvcost) {
        this.tcvcost = tcvcost;
    }

    public double getBbprice() {
        return bbprice;
    }

    public void setBbprice(double bbprice) {
        this.bbprice = bbprice;
    }

    public double getStripprice() {
        return stripprice;
    }

    public void setStripprice(double stripprice) {
        this.stripprice = stripprice;
    }

    public double getTcvprice() {
        return tcvprice;
    }

    public void setTcvprice(double tcvprice) {
        this.tcvprice = tcvprice;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventory_id=" + inventory_id +
                ", product_id=" + product_id +
                ", bbunit=" + bbunit +
                ", stripunit=" + stripunit +
                ", tcvunit=" + tcvunit +
                ", bbcost=" + bbcost +
                ", stripcost=" + stripcost +
                ", tcvcost=" + tcvcost +
                ", bbprice=" + bbprice +
                ", stripprice=" + stripprice +
                ", tcvprice=" + tcvprice +
                '}';
    }
}
