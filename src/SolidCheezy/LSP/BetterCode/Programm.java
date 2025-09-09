package SolidCheezy.LSP.BetterCode;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Programm {
    public static void main(String[] args) {
        // NOW THIS WILL NOT CREATE ANY ISSUE Because we have simple moved the 2
        // classes to implement the IShape interface
        // and his i shape interface simple has the getArea method
        // now each method can easily implement their own logic without affecting the
        // other

        // SO REMEMBER IN THE LSP WE SIMPEL CHANGE THE INHERITANCE TREE
        // IN THE TREE WE SIMPLE DO THE Path compression LIKE WE DO IN THE DISJOIN SET
        // SIMPLE
        // now we can simply have the simple
        IShape rectangle = new Rectangle(5, 10);
        IShape square = new Square(5);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Square area: " + square.getArea());
    }
}