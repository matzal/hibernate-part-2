package com.infoshareacademy.searchengine.dao;

import com.infoshareacademy.searchengine.domain.User;
import com.infoshareacademy.searchengine.interceptors.AddUserInterceptor;
import com.infoshareacademy.searchengine.interceptors.AddUserSetGenderInterceptor;
import com.infoshareacademy.searchengine.repository.UsersRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class UsersRepositoryDaoBean implements UsersRepositoryDao, UsersRepositoryDaoRemote {

    @EJB
    UsersRepository usersRepository;

    @Override
    @Interceptors({AddUserSetGenderInterceptor.class, AddUserInterceptor.class})
    public boolean addUser(User user) {
        if (!usersRepository.getUsersList().contains(user)) {
            usersRepository.addUser(user);
            return true;
        }
        return false;
    }

    @Override
    public User getUserById(int id) {
        /*List<User> userList = usersRepository.getUsersList();
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;*/
        return usersRepository.getUserById(id);
    }

    @Override
    public User getUserByLogin(String login) {
        /*List<User> userList = usersRepository.getUserByLogin(login);
        for (User user : userList) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;*/
        return usersRepository.getUserByLogin(login);
    }

    @Override
    public List<User> getUsersList() {
        return usersRepository.getUsersList();
    }

    @Override
    public List<String> getUsersNames() {
        List<String> usersNames = new ArrayList<>();
        for (User user : getUsersList()) {
            usersNames.add(user.getName());
        }
        return usersNames;
    }
}
