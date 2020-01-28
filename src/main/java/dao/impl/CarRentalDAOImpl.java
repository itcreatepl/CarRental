package dao.impl;

import dao.AbstractDao;
import dao.CarRentalDAO;
import model.CarModel;
import model.CarRental;

import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

public class CarRentalDAOImpl extends AbstractDao implements CarRentalDAO {


    @Override
    public void saveCarRental(CarRental carRental) {
        hibernateUtil.save(carRental);
    }

    @Override
    public void deleteCarRental(Long id) {
        hibernateUtil.delete(CarRental.class, id);
    }

    @Override
    public List<CarRental> getCarRentalByUser(Long userID) {
        TypedQuery<CarRental> query = entityManager.createQuery("select cr from CarRental cr where cr.idRental = :id_user", CarRental.class);
        return query.setParameter("id_user", userID).getResultList();
    }

    @Override
    public CarRental getCarRentalById(Long idRental) {
        return entityManager.find(CarRental.class, idRental);
    }

    @Override
    public List<CarRental> getCarRentalByDatePeriod(LocalDate dateFrom, LocalDate dateTo) {
        TypedQuery<CarRental> query = entityManager.createQuery("select cr from CarRental cr " +
                "where not(cr.dateFrom > :dateTo OR cr.dateTo <:dateFrom)", CarRental.class);
        query.setParameter("date_from", dateFrom);
        query.setParameter("date_to", dateTo);
        return query.getResultList();
    }
}
