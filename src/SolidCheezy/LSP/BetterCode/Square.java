package SolidCheezy.LSP.BetterCode;

public class Square implements IShape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}