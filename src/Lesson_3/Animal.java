package Lesson_3;

public class Animal {
    public String name;


    public Animal() {

    }

    public Animal(String name) {
        this.name = name;

    }


    public void animalinfo() {
        System.out.println(name);
    }
}

class Cat extends Animal {
    String animalName;
    int run;
    boolean swimming ;
    int swimming_run;
  int eat;

    public Cat(String animalName, int run, boolean swimming, int swimming_run) {

        this.animalName = animalName;
        this.run = run;
        this.swimming = swimming;
        this.swimming_run = swimming_run;
    }



    public void catPrintIfo() {
        String isSwimming = swimming ? "Да" : "Нет";
        System.out.println(STR."""
Имя кошки: \{animalName}
Дистанция: \{run}м.
Плавает: \{isSwimming}
Дистанция в плавании: \{swimming_run}м.""");
    }
}

class Dog extends Animal {
    String animalName;
    int run;
    boolean swimming;

    int swimming_run;

    public Dog(String animalName, int run, boolean swimming, int swimming_run) {

        this.animalName = animalName;
        this.run = run;
        this.swimming = swimming;

        this.swimming_run = swimming_run;

    }

    public void dogPrintIfo() {
         String isSwimming = swimming ? "Да" : "Нет";
        System.out.println(STR."""
Имя собаки: \{animalName}
Дистанция: \{run}м.
Плавает: \{isSwimming}
Дистанция в плавании: \{swimming_run}м.""");
    }
}



