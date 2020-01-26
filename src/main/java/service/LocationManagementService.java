package service;

import model.Location;

import java.util.List;

public interface LocationManagementService {
    void saveLocation(Location location);

    void deleteLocation(Long id);

    List<Location> getAllLocation();

}
