package Lesson_3;

public class Main {
    public static void main(String[] args) {
        Animal cat_animal = new Animal("Категория кошек");
        Cat cat = new Cat("Васька", 200, false, 0);
        cat_animal.animalinfo();
        cat.catPrintIfo();

        Animal dog_animal = new Animal("\nКатегория собак");
        Dog dog = new Dog("Барбос", 500, true, 10);
        dog_animal.animalinfo();
        dog.dogPrintIfo();


    }


}


