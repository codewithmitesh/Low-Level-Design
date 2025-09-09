package SolidCheezy.LSP.ProblematicCode;

public class Programm {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        System.out.println("Area of Rectangle: " + rectangle.getArea());

        Rectangle square = new Square();
        // this will not work because here when we set the width it will also set the
        // height
        square.setHeight(10);
        // this will not work because here when we set the height it will also set the
        // width
        square.setWidth(5);
        // now the height has been override by the width this will not work means will
        // give the wrong out put as this will do 5*5 as width and height both are 5
        // this is logically wrong also we cant say that sqare object is as-is as
        // rectangle
        // object this violates the Liskov Substitution Principle
        System.out.println("Area of Square: " + square.getArea());
    }
}