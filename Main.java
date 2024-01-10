import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle(20,60);
        System.out.println("Rectangle is Area:"+rectangle.getArea());
        System.out.println("Rectangle is Perimeter:"+rectangle.getPerimeter());
        System.out.println("================================================");
        Square square=new Square(20);
        System.out.println("Square is Area:"+square.getArea());
        System.out.println("Square is Perimeter:"+square.getPerimeter());
    }
}