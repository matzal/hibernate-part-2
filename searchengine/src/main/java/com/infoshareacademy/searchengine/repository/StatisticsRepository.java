package com.infoshareacademy.searchengine.repository;

import com.infoshareacademy.searchengine.domain.User;

import javax.ejb.Stateless;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Stateless
public class StatisticsRepository {
    private static Map<User, Integer> statisticsRepository = new HashMap<>();

    /*public static Map<User, Integer> getRepository() {
        fillRepositoryWithDefaults();
        return statisticsRepository;
    }
*/
    /*private static void fillRepositoryWithDefaults() {
        List<User> repository = UsersRepository.getRepository();
        for (User user : repository) {
            statisticsRepository.putIfAbsent(user, 0);
        }
    }*/
}
