package RuleEngine;

// SIMPLE Violation class to notify the "APPROVE" or "REJECTED"
public class Violation {
    private final String message;

    public Violation(String message) {
        this.message = message;
    }

    // this is another static variable we can simple use it
    // it is a of() function we can use it later in code see it

    // here we have made constructor private hence when we need object
    // of private constructor we use the of() function
    public static Violation of(String message) {
        return new Violation(message);
    }

    // getter
    public String getMessage() {
        return message;
    }
}