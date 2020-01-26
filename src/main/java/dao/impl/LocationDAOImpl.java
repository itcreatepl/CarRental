package dao.impl;

import dao.AbstractDao;
import dao.LocationDAO;
import model.CarModel;
import model.Location;

import javax.persistence.TypedQuery;
import java.util.List;

public class LocationDAOImpl extends AbstractDao implements LocationDAO {



    @Override
    public void saveLocation(Location location) {
        hibernateUtil.save(location);
    }

    @Override
    public void deleteLocation(Long id) {
        hibernateUtil.delete(Location.class,id);
    }

    @Override
    public Location getLocationById(Long id) {
        return entityManager.find(Location.class,id);
    }

    @Override
    public List<Location> getAllLocation() {
        TypedQuery<Location> query = entityManager.createQuery("FROM Location", Location.class);
        return query.getResultList();
    }
}
