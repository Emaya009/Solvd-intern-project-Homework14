package pharmacy.model;

import pharmacy.Annotations.Column;
import pharmacy.Annotations.Id;

public class Manufacturers {
    @Id(name = "manufacture_id")
    @Column(name = "manufacture_id")
    private int manufacture_id;
    private String manufacture_name;
   // @Column(name = "manufacture_name")
    private String manufacture_license;
  //  @Column(name = "manufacture_license")
    private int address_id_manufacturer;
 //   @Column(name = "address_id_manufacturer")

    public Manufacturers() {
    }

    public Manufacturers(int manufacture_id, String manufacture_name, String manufacture_license, int address_id_manufacturer) {
        this.manufacture_id = manufacture_id;
        this.manufacture_name = manufacture_name;
        this.manufacture_license = manufacture_license;
        this.address_id_manufacturer = address_id_manufacturer;
    }

    public int getManufacture_id() {
        return manufacture_id;
    }

    public void setManufacture_id(int manufacture_id) {
        this.manufacture_id = manufacture_id;
    }

    public String getManufacture_name() {
        return manufacture_name;
    }

    public void setManufacture_name(String manufacture_name) {
        this.manufacture_name = manufacture_name;
    }

    public String getManufacture_license() {
        return manufacture_license;
    }

    public void setManufacture_license(String manufacture_license) {
        this.manufacture_license = manufacture_license;
    }

    public int getAddress_id_manufacturer() {
        return address_id_manufacturer;
    }

    public void setAddress_id_manufacturer(int address_id_manufacturer) {
        this.address_id_manufacturer = address_id_manufacturer;
    }

    @Override
    public String toString() {
        return "Manufacturers{" +
                "manufacture_id=" + manufacture_id +
                ", manufacture_name='" + manufacture_name + '\'' +
                ", manufacture_license='" + manufacture_license + '\'' +
                ", address_id_manufacturer=" + address_id_manufacturer +
                '}';
    }
}
