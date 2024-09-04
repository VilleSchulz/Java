package t04;

public class Triangle extends Shape {
    public Triangle(double height, double base, String color) {
        super(height, base, color);
    }

    @Override
    public void calculateArea() {
        area = (height * width) / 2;
        System.out.printf("Area of %s triangle with base %.2f and height %.2f : %.2f\n", color, width, height, area);
    }
}
