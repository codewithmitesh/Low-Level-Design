package SolidCheezy.DIP.ProblematicCode;

public class UserController {
    // now here are in UserController we are using the SQLDatabase
    // means UserController is dependent on SQLDatabase class that is wrong we
    // should not
    // this violates the Dependency Inversion Principle
    private SQLDatabase sqlDatabase;

    public UserController() {
        // here too we are directly instantiating SQLDatabase that is wrong
        this.sqlDatabase = new SQLDatabase();
    }

    public void saveUser(String user) {
        sqlDatabase.saveUser(user);
    }
}
