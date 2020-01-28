package dao.impl;

import dao.AbstractDao;
import dao.CarModelDAO;
import model.CarModel;
import model.CarType;

import javax.persistence.TypedQuery;
import java.util.List;

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

    @Override
    public List<CarModel> getAllCarModels() {
        TypedQuery<CarModel> query = entityManager.createQuery("FROM CarModel", CarModel.class);
        return query.getResultList();
    }

    @Override
    public List<CarModel> getCarModelsByCarType(CarType carType) {
        TypedQuery<CarModel> query = entityManager.createQuery("select cm from CarModel cm where cm.car_type = :car_type", CarModel.class);
        return query.setParameter("car_type", carType).getResultList();
    }
}
