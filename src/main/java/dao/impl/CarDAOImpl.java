package dao.impl;

import dao.AbstractDao;
import dao.CarDAO;
import model.Car;
import model.CarStatus;
import model.User;


import javax.persistence.TypedQuery;

public class CarDAOImpl extends AbstractDao implements CarDAO {

    @Override
    public void saveCar(Car car) {
        hibernateUtil.save(car);
    }

    @Override
    public void deleteCar(Long idCar) {
        hibernateUtil.delete(User.class, idCar);
    }

    @Override
    public Car getCarById(Long idCar) {
        return entityManager.find(Car.class, idCar);
    }

    @Override
    public Car getCarByRegistrationNumber(String registrationNumber) {
        TypedQuery<Car> query = entityManager.createQuery("select u from Car u where u.registration_number = :registration_number", Car.class);
        return query.setParameter("registration_number", registrationNumber).getSingleResult();
    }

    @Override
    public CarStatus getCarStatus(Long id) {
        Car car = getCarById(id);
        return car.getStatus();
    }

    @Override
    public void changeCarStatus(Long id, CarStatus carStatus) {
        Car car = getCarById(id);
        car.setStatus(carStatus);
        hibernateUtil.save(car);
    }
}
