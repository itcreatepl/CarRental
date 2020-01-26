package service;

import model.User;

public interface UserManagementService {

    void saveUser(User user);

    void deleteUser(Long userId);
}
