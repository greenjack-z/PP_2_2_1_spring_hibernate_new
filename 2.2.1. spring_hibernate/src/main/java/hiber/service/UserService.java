package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getUsersByCar(String carModel, int carSeries);
    List<User> listUsers();
}
