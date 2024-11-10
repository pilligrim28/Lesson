package Lesson_2.Sotr;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sotrudniki {

    private String fio;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;


    public Sotrudniki(String fio, String position, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

public Sotrudniki() {

 Scanner sc = new Scanner(System.in);
            System.out.print("Введите ФИО Сотрудника: ");
            fio = sc.nextLine();
            System.out.print("Введите должность сотрудника: ");
            position = sc.nextLine();
            System.out.print("Введите E-mail сотрудника: ");
            email = sc.nextLine();
            System.out.print("Введите телефон сотрудника: ");
            phone = sc.nextLine();
            System.out.print("Введите зарплату сотрудника: ");
            salary = sc.nextDouble();
            System.out.print("Введите возраст сотрудника: ");
            age = sc.nextInt();

             String sotr =(
                    "\nФИО: " + fio +
                    "\nДолжность: " + position +
                     "\nE-mail: " + email +
                     "\nТелефон: " + phone +
                    "\nЗарплата: " + salary +
                    "\nВозраст: " + age);
//Нужно будет поработать над интефейсом и записью в бд и создавать из бд массив
 try (FileWriter writer = new FileWriter("notes3.txt", true)) {


            String text = sotr;
            writer.write(text);

            writer.append('\n');
            writer.append("---");

            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
            System.out.println(
                    "ФИО: " + fio +
                    "\nДолжность: " + position +
                     "\nE-mail: " + email +
                     "\nТелефон: " + phone +
                    "\nЗарплата: " + salary +
                    "\nВозраст: " + age);
}
}
