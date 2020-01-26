package service.impl;

import dao.UserDAO;
import dao.impl.UserDAOImpl;
import model.User;
import service.UserManagementService;

public class UserManagementServiceImpl implements UserManagementService {

    private UserDAO userDAO;

    public UserManagementServiceImpl() {
        this.userDAO = new UserDAOImpl();
    }

    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public void deleteUser(Long userId) {
        userDAO.deleteUser(userId);
    }
}
