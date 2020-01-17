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
}
