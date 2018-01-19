package by.test.demo.entity.epharm;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "medicaments")
public class Medicament implements Serializable {

    private static final long serialVersionUID = -1133690639270011812L;

    @Id
    private long id;
    private String name;
    private String group;
    private String form;
    private String amount;
    private String activeSubstances;
    private String country;
    private boolean isPrescription;
    private double price;
    private int quantity;

    public Medicament() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getActiveSubstances() {
        return activeSubstances;
    }

    public void setActiveSubstances(String activeSubstances) {
        this.activeSubstances = activeSubstances;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isPrescription() {
        return isPrescription;
    }

    public void setPrescription(boolean prescription) {
        isPrescription = prescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", form='" + form + '\'' +
                ", amount='" + amount + '\'' +
                ", activeSubstances='" + activeSubstances + '\'' +
                ", country='" + country + '\'' +
                ", isPrescription=" + isPrescription +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
