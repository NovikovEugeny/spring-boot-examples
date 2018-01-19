package by.test.demo.entity.polyclinic;

import java.io.Serializable;
import java.util.Date;

public class Prescription implements Serializable {

    private static final long serialVersionUID = -3695683519959975688L;

    private long id;
    private long medicamentId;
    private long doctorId;
    private int quantity;
    private Date startDate;
    private Date endDate;

    public Prescription() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMedicamentId() {
        return medicamentId;
    }

    public void setMedicamentId(long medicamentId) {
        this.medicamentId = medicamentId;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(long doctorId) {
        this.doctorId = doctorId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", medicamentId=" + medicamentId +
                ", doctorId=" + doctorId +
                ", quantity=" + quantity +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
