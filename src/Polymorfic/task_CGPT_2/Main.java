package Polymorfic.task_CGPT_2;

public class Main {
    /*Создай абстрактный класс Figure с методом:
    void draw();
    И абстрактным методом:
    double getArea();
    Реализуй:
    Rectangle (поля: ширина и высота)
    Circle (поле: радиус)
    В main():
    создай массив Figure[]
    вызови draw() и выведи площадь getArea() для каждой фигуры
    Подсказка: переопредели toString() в каждом классе, чтобы draw() просто печатал System.out.println(this).*/

    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(10,15),
                new Circle(10)
        };
        for(Figure i : figures) {
            i.draw();
        }
    }
}
