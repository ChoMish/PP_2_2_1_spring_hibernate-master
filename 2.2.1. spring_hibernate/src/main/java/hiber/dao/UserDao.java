package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   User getUserByModelAndSeraias(String model, int serias);
   List<User> listUsers();
}
