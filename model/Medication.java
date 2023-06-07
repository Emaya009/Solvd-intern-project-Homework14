package pharmacy.model;

public class Medication {
    private int medication_id;
    private int medication_code;
    private String medication_nme;
    private double cost;

    public Medication() {
    }

    public Medication(int medication_id, int medication_code, String medication_nme, double cost) {
        this.medication_id = medication_id;
        this.medication_code = medication_code;
        this.medication_nme = medication_nme;
        this.cost = cost;
    }

    public int getMedication_id() {
        return medication_id;
    }

    public void setMedication_id(int medication_id) {
        this.medication_id = medication_id;
    }

    public int getMedication_code() {
        return medication_code;
    }

    public void setMedication_code(int medication_code) {
        this.medication_code = medication_code;
    }

    public String getMedication_nme() {
        return medication_nme;
    }

    public void setMedication_nme(String medication_nme) {
        this.medication_nme = medication_nme;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "medication_id=" + medication_id +
                ", medication_code=" + medication_code +
                ", medication_nme='" + medication_nme + '\'' +
                ", cost=" + cost +
                '}';
    }
}
