package t04;

public class Circle extends Shape {

    public Circle(double radius,String color) {
        super(radius,color);


    }
    @Override
    public void calculateArea(){
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area of %s circle with radius is %.2f : %.2f\n",color,radius ,area);
    }
}
