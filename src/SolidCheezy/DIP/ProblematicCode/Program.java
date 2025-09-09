package SolidCheezy.DIP.ProblematicCode;

public class Program {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.saveUser("John Doe");
    }
}