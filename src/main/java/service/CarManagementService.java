package service;

import model.Car;

public interface CarManagementService {

    void saveCar(Car car);
    void deleteCar(Long id);


}
