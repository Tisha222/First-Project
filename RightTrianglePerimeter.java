import java.util.Scanner;
public class RightTrianglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the width of the triangle?");
        double width = scanner.nextDouble();
        System.out.println("What is the height of the triangle");
        double height = scanner.nextDouble();
        double hypotenuse = Math.hypot(width, height);
        double perimeter = width + height + hypotenuse;
        System.out.println("The perimenter of your right triangle is " + perimeter);
    }
}