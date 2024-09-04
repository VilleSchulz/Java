package t04;



public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(20, "blue");
        shapes[1] = new Rectangle(22, 33, "red");
        shapes[2] = new Triangle(22, 33,"yellow");
        for (Shape shape : shapes) {
            shape.calculateArea();
        }
    }


}
