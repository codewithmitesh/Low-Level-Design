package SolidCheezy.DIP.BetterCode;

public class UserController {
    // now here are in UserController we are using the Database interface
    // means UserController is dependent on the Database interface not the concrete
    // class of SQLDatabase
    // this is a good practice as it follows the Dependency Inversion Principle
    // we dont depend on the concrete implementation but on the abstraction means
    // interface - this fixes the Dependency Inversion Principle violation
    private IDatabase database; // No Concrete Dependency

    // this what we pass the Interface in constructor is called Dependency Injection
    public UserController(IDatabase database) {
        this.database = database;
    }

    public void saveUser(String user) {
        database.saveUser(user);
    }
}
