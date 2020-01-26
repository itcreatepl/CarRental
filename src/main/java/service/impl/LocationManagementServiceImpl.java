package service.impl;

import dao.LocationDAO;
import dao.impl.LocationDAOImpl;
import model.Location;
import service.LocationManagementService;

import java.util.List;

public class LocationManagementServiceImpl implements LocationManagementService {

    LocationDAO locationDAO;

    public LocationManagementServiceImpl() {
        locationDAO = new LocationDAOImpl();
    }

    @Override
    public void saveLocation(Location location) {
        locationDAO.saveLocation(location);
    }

    @Override
    public void deleteLocation(Long id) {
        locationDAO.deleteLocation(id);
    }

    @Override
    public List<Location> getAllLocation() {
        List<Location> allLocation = locationDAO.getAllLocation();
        return allLocation;
    }
}
