package dao;


import model.Car;
import model.CarModel;
import model.CarType;

import java.util.List;
import java.util.Set;

public interface CarModelDAO {

    void saveCarModel(CarModel carModel);

    void deleteCarModel(Long id);

    CarModel getCarModelById(Long id);

    List<CarModel> getAllCarModels();

    List<CarModel> getCarModelsByCarType(CarType carType);

}

