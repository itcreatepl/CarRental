package service.impl;

import dao.CarDAO;
import dao.impl.CarDAOImpl;
import dao.impl.UserDAOImpl;
import model.Car;
import service.CarManagementService;

public class CarManagementServiceImpl implements CarManagementService {

    CarDAO carDAO;

    public CarManagementServiceImpl() {
        this.carDAO = new CarDAOImpl();
    }

    @Override
    public void saveCar(Car car) {
        carDAO.saveCar(car);
    }

    @Override
    public void deleteCar(Long id) {
        carDAO.deleteCar(id);
    }
}
