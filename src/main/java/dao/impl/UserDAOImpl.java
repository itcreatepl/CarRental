package dao.impl;

import dao.AbstractDao;
import dao.UserDAO;
import model.User;

public class UserDAOImpl extends AbstractDao implements UserDAO {

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public User getUserByLogin(String login) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }
}
