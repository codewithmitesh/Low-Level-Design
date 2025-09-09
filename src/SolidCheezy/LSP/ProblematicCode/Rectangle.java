package SolidCheezy.LSP.ProblematicCode;

public class Rectangle {
    protected double height;
    protected double width;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }
}
