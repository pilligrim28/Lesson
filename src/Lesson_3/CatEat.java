package Lesson_3;

public class CatEat{
    void main(String[] args){
        Cat_Eat.Cat_Info[] cats_info = {new Cat_Eat.Cat_Info("Маруся", 50),new Cat_Eat.Cat_Info("Кузя", 25), new Cat_Eat.Cat_Info("Маруся", 1) };
        Cat_Eat cats= new Cat_Eat(80);

        for (Cat_Eat.Cat_Info cat: cats_info){
            cat.eating(cats);
            cat.CatInfoEating();

        }
    }
}
