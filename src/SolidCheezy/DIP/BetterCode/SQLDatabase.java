package SolidCheezy.DIP.BetterCode;

class SQLDatabase implements IDatabase {
    // now this class is implementing the IDatabase interface, so it must provide an
    // implementation for the saveUser method
    // if i change the MySQL to postgress and oracle then only i need to change this
    // saveUser method
    // and it will not affect the UserController class - so this resolve the
    // Dependency Inversion Principle violation
    public void saveUser(String user) {
        // Code to save user to the database
        System.out.println("Saving user " + user + " to SQL database");
    }
}
