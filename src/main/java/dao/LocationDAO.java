package dao;


import model.Location;

import java.util.List;

public interface LocationDAO {

    void saveLocation(Location location);

    void deleteLocation(Long id);

    Location getLocationById(Long id);

    List<Location> getAllLocation();
}
