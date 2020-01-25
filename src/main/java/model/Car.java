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
    @Enumerated(EnumType.STRING)
    private CarStatus status;

    public Car() {
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(Double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public String getCarConditionNote() {
        return carConditionNote;
    }

    public void setCarConditionNote(String carConditionNote) {
        this.carConditionNote = carConditionNote;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }


}
