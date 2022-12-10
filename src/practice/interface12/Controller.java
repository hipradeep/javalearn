package practice.interface12;

public class Controller {
    public static void main(String[] args) {

        UserServiceImpl userService=new UserServiceImpl();
        userService.createUser("pk");

        UserServices userService2=new UserServiceImpl();
        userService.createUser("pk");

    }
}
