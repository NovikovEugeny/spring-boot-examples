package by.test.demo.entity.epharm;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

@Document(collection = "orders")
public class Order implements Serializable {

    private static final long serialVersionUID = -2148100330346166267L;

    @Id
    private long id;
    private long clientId;
    private Map<Long, Integer> medicaments;
    private double cost;
    private Date requestDate;
    private Date responseDate;
    private String status;

    public Order() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public Map<Long, Integer> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(Map<Long, Integer> medicaments) {
        this.medicaments = medicaments;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", medicaments=" + medicaments +
                ", cost=" + cost +
                ", requestDate=" + requestDate +
                ", responseDate=" + responseDate +
                ", status='" + status + '\'' +
                '}';
    }
}
