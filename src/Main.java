public class Main {
    public static void main(String[] args) {
       Triangle triangle = new Triangle(2.4,3,4);
       System.out.println(triangle.getPerimeter());
       Rectangle rectangle = new Rectangle(2.5,3);
       System.out.println(rectangle.getPerimeter());
       Fivesquare fivesquare = new Fivesquare(1.2,2,3,4,5);
       System.out.println(fivesquare.getPerimeter());
       Cirlce circle = new Cirlce( 12.5);
       System.out.println(circle.getPerimeter());
       Octangle  octangle= new Octangle(2.6,3,4,4);
       System.out.println(octangle.getPerimeter());
    }
}