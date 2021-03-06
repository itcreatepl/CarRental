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
    @Enumerated(EnumType.STRING)
    @Column(name="car_mark")
    private CarMark carMark;
    @Enumerated(EnumType.STRING)
    @Column(name="car_mark")
    private CarType carType;
    @OneToMany(mappedBy = "carModel")
    private Set<Car> cars;
    @Column(name="daily_cost")
    private BigDecimal dailyCost;

    public CarModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getPhotoDirectory() {
        return photoDirectory;
    }

    public void setPhotoDirectory(String photoDirectory) {
        this.photoDirectory = photoDirectory;
    }


    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    public BigDecimal getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(BigDecimal dailyCost) {
        this.dailyCost = dailyCost;
    }
}
