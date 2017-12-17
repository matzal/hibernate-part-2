package com.infoshareacademy.searchengine.repository;

import com.infoshareacademy.searchengine.domain.Gender;
import com.infoshareacademy.searchengine.domain.Phone;
import com.infoshareacademy.searchengine.domain.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class UsersRepository {

    @PersistenceContext(unitName = "pUnit")
    private EntityManager entityManager;

    public boolean addUser(User user) {
        entityManager.persist(user);
        return true;
    }

    public User getUserById(int id) {
        return (User) entityManager.createNamedQuery("findUserById")
                .setParameter("id", id)
                .getSingleResult();
    }

    public User getUserByLogin(String login) {
        return (User) entityManager.createNamedQuery("findUserByLogin")
                .setParameter("login", login)
                .getSingleResult();
    }

    public List<User> getUsersList() {
        return entityManager.createNamedQuery("selectAllUsers").getResultList();
    }
}
