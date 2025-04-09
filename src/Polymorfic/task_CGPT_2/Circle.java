package Polymorfic.task_CGPT_2;

public class Circle extends Figure{
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.printf("Площа круга: %.1f%n", getArea());
    }
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}
