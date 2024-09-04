package t04;

public class Triangle extends Shape {
    public Triangle(double height, double width) {
        super(height, width);
    }

    @Override
    public void calculateArea() {
        area = (height * width) / 2;
        System.out.printf("Area of triangle with base %.2f and height %.2f : %.2f", width, height, area);
    }
}
