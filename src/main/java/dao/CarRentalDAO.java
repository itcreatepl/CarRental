package dao;

import model.CarModel;
import model.CarRental;

import java.time.LocalDate;
import java.util.List;

public interface CarRentalDAO {

    void saveCarRental(CarRental carRental);

    void deleteCarRental(Long id);

    List<CarRental> getCarRentalByUser(Long userID);

    CarRental getCarRentalById(Long idRental);

    List<CarRental> getCarRentalByDatePeriod(LocalDate dateFrom, LocalDate dateTo);
}
