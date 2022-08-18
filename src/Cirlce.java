public class Cirlce extends Shape {
    private double diameter;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public Cirlce(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getPerimeter() {
        return diameter * Math.PI;
    }
}
