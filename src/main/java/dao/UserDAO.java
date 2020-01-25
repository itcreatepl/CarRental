package dao;

import model.User;

public interface UserDAO {

    void saveUser(User user);

    void deleteUser(Long userId);

    User getUserByLogin(String login);

    User getUserByEmail(String email);

}
