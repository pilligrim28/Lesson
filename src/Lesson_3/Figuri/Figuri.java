package Lesson_3.Figuri;

import java.util.Scanner;

public class Figuri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Введите номер фигуры: \n1.Круг\n2.Прямоугольник\n3.Треугольник");
            int figura = scanner.nextInt();
            if (figura == 1) {
                PerimetrFigury circkle = new Circkle("Красный", "Синий");
                circkle.showInfo();
            } else if (figura == 2) {
                PerimetrFigury rectangle = new Rectangle("Желтый", "Лазурный");


            } else if (figura == 3) {
                PerimetrFigury triangle = new Triangle("Белый", "Пепельный");
                triangle.showInfo();

            } else {
                System.out.println("Выберите число от 1 до 3!");

            }
        }


    }



