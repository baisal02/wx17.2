public class Fivesquare extends Shape {
    private double a, b, c, d, e;

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public Fivesquare(double a, double b, double c, double d, double e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d + e;
    }

}
