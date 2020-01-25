package dao.impl;

import dao.AbstractDao;
import dao.CarModelDAO;
import model.Car;
import model.CarModel;
import model.User;

public class CarModelDAOImpl extends AbstractDao implements CarModelDAO {

    @Override
    public void saveCarModel(CarModel carModel) {
        hibernateUtil.save(carModel);
    }

    @Override
    public void deleteCarModel(Long id) {
        hibernateUtil.delete(CarModel.class, id);
    }

    @Override
    public CarModel getCarModelById(Long id) {
        return entityManager.find(CarModel.class, id);
    }
}
