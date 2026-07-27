package CorePrinciple;
import java.util.Scanner;
class ShapeCalculator {

    // Area of Circle
    public void area(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle : " + (int) area);
    }
    
    // Area of Rectangle
    public void area(int length, int width) {
        int area = length * width;
        System.out.println("Area of Rectangle : " + area);
    }

    // Area of Trapezoid
    public void area(int base1, int base2, int height) {
        int area = ((base1 + base2) * height) / 2;
        System.out.println("Area of Trapezoid : " + area);
    }
}

public class poly {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         ShapeCalculator sc = new ShapeCalculator();

        // Circle
        sc.area(5);

        // Rectangle
        sc.area(10, 20);

        // Trapezoid
        sc.area(8, 12, 5);

        scanner.close();
    }
}