package model;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_location")
    private Long idLocation;
    private String name;
    private String address;
    @Column(name="additional_cost")
    private BigDecimal additionalCost;

    public Location() {

    }

    public Long getIdLocation() {
        return idLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getAdditionalCost() {
        return additionalCost;
    }

    public void setAdditionalCost(BigDecimal additionalCost) {
        this.additionalCost = additionalCost;
    }
}
