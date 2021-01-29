

import java.util.Scanner;

class Rectangle {
    double width, length, area;
    String color;

    Scanner sc = new Scanner(System.in);
    void setLength() {
        System.out.print("Enter the length of the Rectangle: ");
        length = sc.nextDouble();
    }

    void setWidth() {
        System.out.print("Enter the width of the Rectangle: ");
        width = sc.nextDouble();
    }

    void setColor() {
        System.out.print("Enter the color of the Rectangle: ");
        sc.nextLine();
        color = sc.nextLine();
    }

    void findArea() {
        area = length * width;
    }

    boolean compare(Rectangle a) {
        return (color.equals(a.color) && area == a.area);
    }
}

public class RectDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.println("Rectangle 1");
        r1.setLength();
        r1.setWidth();
        r1.setColor();

        System.out.println("Rectangle 2");
        r2.setLength();
        r2.setWidth();
        r2.setColor();

        r1.findArea();
        r2.findArea();

        System.out.println("Area of Rectangle-1: " + r1.area);
        System.out.println("Area of Rectangle-2: " + r2.area);

        if(r1.compare(r2))
            System.out.println("Matching Rectangles");
        else
            System.out.println("Non-Matching Rectangles");
    }
}
