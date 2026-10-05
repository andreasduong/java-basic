package lesson05.abstaction;

public class Circle extends Shape implements Drawable, Extendable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public void info() {
        System.out.println("This is a circle");
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

    @Override
    public void extend() {
        System.out.println("Circle extend");
    }
}
