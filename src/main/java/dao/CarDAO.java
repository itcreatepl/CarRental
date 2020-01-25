package dao;

import model.Car;
import model.CarStatus;

public interface CarDAO {

    void saveCar(Car car);

    void deleteCar(Long id);

    Car getCarById(Long id);

    Car getCarByRegistrationNumber(String registrationNumber);

    CarStatus getCarStatus(Long id);

    void changeCarStatus(Long id, CarStatus carStatus);
}
