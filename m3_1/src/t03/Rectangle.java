package t03;

public class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public void calculateArea() {
        area = height * width;
        System.out.printf("Area of rectancle with width %.2f and height %.2f : %.2f\n", width, height, area);

    }


}

