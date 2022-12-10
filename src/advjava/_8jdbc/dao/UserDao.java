package advjava._8jdbc.dao;

import advjava._8jdbc.database.Database;
import advjava._8jdbc.entites.User;
import advjava._8jdbc.services.UserServices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class UserDao implements UserServices {
    Database db = null;
    Connection conn;


    public UserDao() {
        db = new Database();
        conn = db.getConnection();
    }

    @Override
    public void addUser(User user){
        String sql = " insert into users (name, roll_number, subject, course) values (?, ?, ?, ?)";
        try (PreparedStatement preparedStmt = conn.prepareStatement(sql)) {

            preparedStmt.setString(1, user.getName());
            preparedStmt.setString(2, user.getRollNo());
            preparedStmt.setString(3, user.getSubject());
            preparedStmt.setString(4, user.getCourse());
            preparedStmt.execute();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteUser(String rollNo)  {
        String sql = " delete from users where roll_number = ?";
        try(PreparedStatement preparedStmt = conn.prepareStatement(sql)) {
        preparedStmt.setString(1, rollNo);
        preparedStmt.execute();
        conn.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<User> allUser()  {
        List<User> userList = new ArrayList<>();
        String sql = " select * from users";
        try (PreparedStatement preparedStmt = conn.prepareStatement(sql)) {
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setName(rs.getString("name"));
                user.setRollNo(rs.getString("roll_number"));
                user.setCourse(rs.getString("course"));
                user.setSubject(rs.getString("subject"));
                userList.add(user);
            }

            conn.close();
            return userList;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return userList;

    }

    @Override
    public User getSingleUser(String rollNum)  {
        User user = new User();
        String sql = " select * from users where roll_number = ?";

        try (PreparedStatement preparedStmt = conn.prepareStatement(sql)) {
            preparedStmt.setString(1, rollNum);

            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                user.setRollNo(rs.getString(2));
                user.setName(rs.getString(3));
                user.setSubject(rs.getString(4));
                user.setCourse(rs.getString(5));
            }

            return user;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return user;

    }

    @Override
    public void updateUser(User user)  {
        String sql = " update users set name = ?, course =? , subject= ? where roll_number = ?";

         User updateUser= getSingleUser(user.getRollNo());
        System.out.println("get User");
        System.out.println(updateUser.toString());
         if(user.getName()!=null && !user.getName().isEmpty())
             updateUser.setName(user.getName());
         if(user.getSubject()!=null  && !user.getSubject().isEmpty())
             updateUser.setSubject(user.getSubject());
         if(user.getCourse()!=null && !user.getCourse().isEmpty())
             updateUser.setCourse(user.getCourse());

        try (PreparedStatement preparedStmt = conn.prepareStatement(sql)) {

            preparedStmt.setString(1, updateUser.getName());
            preparedStmt.setString(2, updateUser.getCourse());
            preparedStmt.setString(3, updateUser.getSubject());
            preparedStmt.setString(4, updateUser.getRollNo());
            preparedStmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
