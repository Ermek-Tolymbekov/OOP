public class Circle extends Shape {
    private double radius = 1.0;
    private final double pi = 3.14;
    Circle(){}
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double raduis, String color, boolean filled){
        super(color, filled);
        this.radius = raduis;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * pi;
    }
    public double getPerimeter(){
        return 2 * radius * pi;
    }
    @Override
    public String toString(){
        return "Circle[" + super.toString() + ",radius=" + radius + "]";
    }
}
