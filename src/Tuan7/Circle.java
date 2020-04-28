package Tuan7;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius){
        super.name = name;
        this.radius = radius;
    }

    @Override
    public double CaculateArea() {
        return Math.PI * radius * radius;
    }
}
