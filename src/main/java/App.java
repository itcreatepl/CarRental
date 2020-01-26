import model.*;
import service.impl.CarManagementServiceImpl;
import service.impl.CarModelManagementServiceImpl;
import utils.HibernateUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        HibernateUtil instance = HibernateUtil.getInstance();
        CarModelManagementServiceImpl carModelService = new CarModelManagementServiceImpl();
        CarManagementServiceImpl carService = new CarManagementServiceImpl();

//        CarModel carModel1= new CarModel();
//        carModel1.setName("Leon");
//        carModel1.setCarMark(CarMark.SEAT);
//        BigDecimal dailyCost = new BigDecimal("100");
//        carModel1.setDailyCost(dailyCost);
//        carModel1.setCarType(CarType.MEDIUM_CAR);
//        carModel1.setPhotoDirectory("img/car_models/seat-leon.png");
//
//        carModelService.saveCarModel(carModel1);
//
//        Car car1 = new Car();
//        car1.setStatus(CarStatus.AVAILABLE);
//        car1.setCarConditionNote("AFFTER CLEANING");
//        car1.setFuelLevel(1.0);
//        car1.setProductionYear(2018);
//        car1.setRegistrationNumber("WPI5781");
//        car1.setCarModel(carModel1);
//
//        carService.saveCar(car1);
//
//        Car car2 = new Car();
//        car2.setStatus(CarStatus.AVAILABLE);
//        car2.setCarConditionNote("NEW");
//        car2.setFuelLevel(0.4);
//        car2.setProductionYear(2019);
//        car2.setRegistrationNumber("DW3513X");
//        car2.setCarModel(carModel1);
//
//        carService.saveCar(car2);
//
//        Set<Car> cars= new HashSet<>();
//        cars.add(car1);
//        cars.add(car2);
//
//        carModel1.setCars(cars);
//        carModelService.saveCarModel(carModel1);


    }
}
