package dao;


import model.CarModel;

public interface CarModelDAO {

    void saveCarModel(CarModel carModel);

    void deleteCarModel(Long id);

    CarModel getCarModelById(Long id);
}

