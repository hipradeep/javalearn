package advjava._8jdbc.services;

import advjava._8jdbc.entites.User;

import java.sql.SQLException;
import java.util.List;

public interface UserServices {

    void addUser(User user) ;
    void deleteUser(String rollNo);
    List<User> allUser();
    User getSingleUser(String rollNum);
    void updateUser(User user);

}
