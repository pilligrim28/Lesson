package Lesson_2.Sotr;


public class Persons {
    String fio;
    String position;
    String email;
    String phone;
    int salary;
    public int age;

    public Persons() {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = (int) salary;
        this.age = age;


    }

    public Persons(String fio, String position, String email, String phone, int salary, int age) {
    }


    @Override
    public String toString() {
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                fio, position, email, phone, salary, age);
    }


    public void print() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Persons[] persArray = new Persons[5];

        persArray[0] = new Persons("Николаев Александр","Ревизор","bal@ya.ru", "+7964656323", 865226, 37);
        persArray[1] = new Persons("Николаева Ольга","Бухгалтер","antip@ya.ru","+79215989865", 56852,42);
        persArray[2] = new Persons("Ремизов Денис","Сантехник","rem@ya.ru", "+79646565623", 965226, 26);
        persArray[3] = new Persons("Гудков Александр","Менеджер","gud@ya.ru", "+7964685662", 1865226, 39);
        persArray[4] = new Persons("Шталь Святослав","Тренер","kll@ya.ru", "+7964685855", 5665226, 45);
        System.out.println(persArray[2]);


    }
}
