package Polymorfic.task_CGPT_2;

public class Rectangle extends Figure{
    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double getArea() {
        return height * width;
    }
    @Override
    void draw() {
        System.out.printf("Площа прямокутника: %.1f%n", getArea());
    }
}
