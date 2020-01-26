package service;

import model.Car;
import model.CarModel;

import java.util.List;

public interface CarModelManagementService {
    void saveCarModel(CarModel carModel);
    void deleteCarModel(Long id);
    CarModel getCarModelById(Long id);
    List<CarModel> getAllCarModels();
}
