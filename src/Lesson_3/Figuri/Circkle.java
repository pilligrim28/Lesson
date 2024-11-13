package Lesson_3.Figuri;

import java.util.Scanner;

public class Circkle  implements PerimetrFigury{
    public double radius;
    public String color ;
    public String background;

    public Circkle(String color, String backgrund){
        this.color= color;
        this.background = backgrund;
    }

    public double perimetr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        radius = sc.nextDouble();

        return Math.PI * radius * radius;
    }
public void setColor(){
    System.out.println(STR."""
Цвет круга:\{color}
Окантовка :\{background}""");
}
@Override
public void showInfo(){
    System.out.println(STR."""
Цвет круга:\{color}
Окантовка :\{background}
Ваш периметр :\{perimetr()}
""");


    }
}
