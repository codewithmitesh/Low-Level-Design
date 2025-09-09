package SolidCheezy.LSP.BetterCode;

public class Rectangle implements IShape {
    protected double height;
    protected double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }
}