package Lesson_3.Figuri;

import java.util.Scanner;

public class Rectangle implements PerimetrFigury {
    public String color;
    public String background;

    public Rectangle(String color, String backgrund) {
        this.color = color;
        this.background = backgrund;
    }

    public double perimetr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сторону a: ");
        double a = sc.nextDouble();
        System.out.print("Введите сторону b: ");
        double b = sc.nextDouble();

        return (a + b) * 2;
    }

    public void setColor() {
        System.out.println(STR."""
Цвет круга:\{color}
Окантовка :\{background}""");
    }

    @Override
    public void showInfo() {
        System.out.println(STR."""
Цвет круга:\{color}
Окантовка :\{background}
Ваш периметр :\{perimetr()}
""");


    }
}
