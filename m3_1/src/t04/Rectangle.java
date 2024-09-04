package t04;

public class Rectangle extends Shape {
    public Rectangle(double height, double width,String color) {
        super(height,width,color);
    }

    @Override
    public void calculateArea() {
        area = height * width;
        System.out.printf("Area of %s rectancle with base %.2f and height %.2f : %.2f\n",color, width, height, area);

    }


}

