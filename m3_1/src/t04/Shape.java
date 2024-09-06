package t04;

abstract class Shape {

    public double height;
    String color;

    double area;
    public double radius;
    public double width;

    public Shape(double height, double width,String color) {
        this.height = height;
        this.width = width;
        this.color = color;

    }

    public Shape(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }


    public void calculateArea(){

    }
}
