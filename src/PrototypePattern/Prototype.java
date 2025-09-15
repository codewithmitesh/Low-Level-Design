package PrototypePattern;

// Creating genertic interface prototype which will have the 
// copy method that will be implemented by child simple, what ever class ka copy chahiye 
// that will implement the class
public interface Prototype<T extends Prototype<T>> {
    T copy();
}
