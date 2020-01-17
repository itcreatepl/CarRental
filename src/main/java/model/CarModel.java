package model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name="cars_models")
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_model")
    private Long idModel;
    private String name;
    private String generation;
    @Column(name="photo_directory")
    private String photoDirectory;
    private String type;
    @OneToMany(mappedBy = "carModel")
    private Set<Car> cars;
    @Column(name="daily_cost")
    private BigDecimal dailyCost;
}
