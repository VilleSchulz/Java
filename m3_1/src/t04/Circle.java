package t04;

public class Circle extends Shape{

    public Circle(double radius) {
        super(radius);

    }
    @Override
    public void calculateArea(){
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area of circle with radius is %.2f : %.2f\n",height ,area);
    }
}
