package advjava._8jdbc;

import advjava._8jdbc.dao.UserDao;
import advjava._8jdbc.entites.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class JDBCExample {
    public static void main(String[] args) {

        boolean isExit = false;
        do {
            System.out.println("Choose options for JDBC :- ");
            System.out.println("1 : Add User");
            System.out.println("2 : Get Single User");
            System.out.println("3 : Get All User");
            System.out.println("4 : Update User");
            System.out.println("5 : Delete User");
            System.out.println("6 : Exit");
            System.out.print("Enter option : ");
            int ch = (new Scanner(System.in)).nextInt();

            switch (ch) {
                case 1:
                    addUser();
                    break;
                case 2:
                    getSingleUser();
                    break;
                case 3:
                    getAllUsers();
                    break;
                case 4:
                    updateUser();
                    break;
                case 5:
                    deleteUser();
                    break;
                case 6:
                    isExit = true;
                    break;
                default:
                    System.out.println("You enter wrong option");
            }

        } while (!isExit);

    }

    private static void updateUser() {
        UserDao ud = new UserDao();
        User u = new User();
        System.out.println("Enter User Details which to be update!");
        System.out.println("NOTE: User with ROLL_NO must exist in database.");
        System.out.print("Roll Number - : ");
        u.setRollNo((new Scanner(System.in)).nextLine());
        System.out.print("Name - : ");
        u.setName((new Scanner(System.in)).nextLine());
        System.out.print("Subject - : ");
        u.setSubject((new Scanner(System.in)).nextLine());
        System.out.print("Course - : ");
        u.setCourse((new Scanner(System.in)).nextLine());
        ud.updateUser(u);
        System.out.println("User Updated Successfully");
    }

    private static void deleteUser() {
        UserDao ud = new UserDao();
        System.out.print("Enter User Roll number :-");
        String rn = (new Scanner(System.in)).nextLine();
        ud.deleteUser(rn);
    }

    private static void getAllUsers() {
        UserDao ud = new UserDao();
        List<User> userList = ud.allUser();
        for (User u : userList) {
            System.out.println(u.toString());
        }
    }

    private static void getSingleUser() {
        UserDao ud = new UserDao();
        System.out.print("Enter User Roll number :-");
        String rn = (new Scanner(System.in)).nextLine();
        User usr = ud.getSingleUser(rn);
        System.out.println(usr.toString());
    }

    private static void addUser() {
        UserDao ud = new UserDao();
        User u = new User();
        System.out.println("Enter User Details");
        System.out.print("Roll Number - : ");
        u.setRollNo((new Scanner(System.in)).nextLine());
        System.out.print("Name - : ");
        u.setName((new Scanner(System.in)).nextLine());
        System.out.print("Subject - : ");
        u.setSubject((new Scanner(System.in)).nextLine());
        System.out.print("Course - : ");
        u.setCourse((new Scanner(System.in)).nextLine());
        ud.addUser(u);
        System.out.println("User Added Successfully");
    }


}
