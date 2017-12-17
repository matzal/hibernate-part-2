package com.infoshareacademy.searchengine.dao;

import com.infoshareacademy.searchengine.domain.User;
import com.infoshareacademy.searchengine.repository.StatisticsRepository;

import javax.ejb.Stateless;
import java.util.Map;

@Stateless
public class StatisticsRepositoryDaoBean implements StatisticsRepositoryDao {
    @Override
    public void addVisit(User user) {
       /* StatisticsRepository.getRepository().putIfAbsent(user, 0);
        Integer userStats = getStatisticsByUser(user);
        StatisticsRepository.getRepository().replace(user, userStats + 1);*/
    }

    @Override
    public Map<User, Integer> getAllStatistics() {
//        return StatisticsRepository.getRepository();
        return null;
    }

    @Override
    public Integer getStatisticsByUser(User user) {
//        return StatisticsRepository.getRepository().get(user);
        return null;
    }
}
