package service.impl;

import dao.CarRentalDAO;
import dao.impl.CarRentalDAOImpl;
import model.CarRental;
import service.CarManagementService;
import service.CarRentalManagementService;

import java.time.LocalDate;
import java.util.List;

public class CarRentalManagementServiceImpl implements CarRentalManagementService {

    CarRentalDAO carRentalDAO;

    public CarRentalManagementServiceImpl() {
        this.carRentalDAO = new CarRentalDAOImpl();
    }

    @Override
    public void saveCarRental(CarRental carRental) {
        carRentalDAO.saveCarRental(carRental);

    }

    @Override
    public void deleteCarRental(Long idRental) {
        carRentalDAO.deleteCarRental(idRental);
    }

    @Override
    public List<CarRental> getCarRentalByUser(Long userID) {
        return carRentalDAO.getCarRentalByUser(userID);
    }

    @Override
    public CarRental getCarRentalById(Long idRental) {
        return carRentalDAO.getCarRentalById(idRental);
    }

    @Override
    public List<CarRental> getCarRentalByDatePeriod(LocalDate dateFrom, LocalDate dateTo) {
        return carRentalDAO.getCarRentalByDatePeriod(dateFrom,dateTo);
    }
}
