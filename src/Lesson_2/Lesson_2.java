package Lesson_2;

import java.util.Scanner;

public class Lesson_2 {
    static class Sotrudnik{
      public static String fio;
       public static String doljnost;
        public static String email;
        public static double zarplata;
      public static int age;
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Введите ФИО Сотрудника: ");
        fio = sc.nextLine();
         System.out.print("Введите возраст сотрудника: ");
         age = sc.nextInt();



        System.out.println("ФИО: "+ fio+ "\nВозраст: "+age);
       }
    }

   }

