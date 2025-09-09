package SolidCheezy.DIP.BetterCode;

public class Program {
    public static void main(String[] args) {
        IDatabase database = new SQLDatabase();
        // So now we can pass the what ever Database implementation we want
        // our userController does not depend on the concrete class of SQLDatabase
        UserController userController = new UserController(database);
        userController.saveUser("John Doe");
    }
}