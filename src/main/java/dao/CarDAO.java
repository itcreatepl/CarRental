package dao;

import model.Car;

public interface CarDAO {

    void saveCar(Car car);

    void deleteCar(Long id);

    Car getCarById(Long id);

    Car getCarByRegistrationNumber(String registrationNumber);
}
