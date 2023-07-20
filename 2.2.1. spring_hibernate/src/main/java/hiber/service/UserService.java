package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    User getUserByModelAndSeraias(String model, int serias);
    List<User> listUsers();
}
