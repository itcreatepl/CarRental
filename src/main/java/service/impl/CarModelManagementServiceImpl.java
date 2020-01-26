package service.impl;

import dao.CarDAO;
import dao.CarModelDAO;
import dao.UserDAO;
import dao.impl.CarDAOImpl;
import dao.impl.CarModelDAOImpl;
import dao.impl.UserDAOImpl;
import model.CarModel;
import service.CarModelManagementService;

import java.util.List;

public class CarModelManagementServiceImpl implements CarModelManagementService {

    CarModelDAO carModelDAO;
    CarDAO carDAO;
    UserDAO userDAO;

    public CarModelManagementServiceImpl() {
        this.carModelDAO = new CarModelDAOImpl();
        this.carDAO = new CarDAOImpl();
        this.userDAO = new UserDAOImpl();
    }

    @Override
    public CarModel getCarModelById(Long id) {
        return carModelDAO.getCarModelById(id);
    }

    @Override
    public void saveCarModel(CarModel carModel) {
        carModelDAO.saveCarModel(carModel);
    }

    @Override
    public void deleteCarModel(Long id) {
        carModelDAO.deleteCarModel(id);

    }

    @Override
    public List<CarModel> getAllCarModels() {
        return carModelDAO.getAllCarModels();
    }
}
