package service;

import model.CarRental;

import java.time.LocalDate;
import java.util.List;

public interface CarRentalManagementService {
    void saveCarRental(CarRental carRental);

    void deleteCarRental(Long idRental);

    List<CarRental> getCarRentalByUser(Long userID);

    CarRental getCarRentalById(Long idRental);

    List<CarRental> getCarRentalByDatePeriod(LocalDate dateFrom, LocalDate dateTo);
}
