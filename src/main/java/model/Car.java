package model;

import javax.persistence.*;

@Entity
@Table(name="cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_car")
    private Long idCar;
    @Column(name="registration_number")
    private String registrationNumber;
    @Column(name="fuel_level")
    private Double fuelLevel;
    @Column(name="car_condition_note")
    private String carConditionNote;
    @ManyToOne
    @JoinColumn(name = "id_model")
    private CarModel carModel;
    @Column(name="production_year")
    private int productionYear;
    private int status;
}
