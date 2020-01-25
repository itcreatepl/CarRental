package dao.impl;

import dao.AbstractDao;
import dao.UserDAO;
import model.User;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class UserDAOImpl extends AbstractDao implements UserDAO {
    @Override
    public void saveUser(User user) {
        hibernateUtil.save(user);
    }

    @Override
    public void deleteUser(Long userId) {
        hibernateUtil.delete(User.class, userId);
    }

    @Override
    public User getUserByLogin(String login) {
        TypedQuery<User> query = entityManager.createQuery("select u from User u where u.login = :login", User.class);
        return query.setParameter("login", login).getSingleResult();
    }

    @Override
    public User getUserByEmail(String email) {
        TypedQuery<User> query = entityManager.createQuery("select u from User u where u.email = :email", User.class);
        return query.setParameter("email", email).getSingleResult();
    }


}