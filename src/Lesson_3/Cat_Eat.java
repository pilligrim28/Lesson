package Lesson_3;

public class Cat_Eat {
    public static int eat;

    public Cat_Eat(int eat) {
        this.eat = eat;

    }
  static boolean demnishEat(int eat_n) {
        int demn = eat - eat_n;
        if (demn < 0)  return false;
        eat -= eat_n;
        return true;
    }
    void  addEat(int eat){
        this.eat += eat;
    }
     static class Cat_Info {
        public String name;
        public int appeating;
        public boolean satiety;

        public Cat_Info(String name, int appeating) {
            this.name = name;
            this. appeating= appeating;
            this.satiety =true;
        }
        public void CatInfoEating(){
            String isSatiety = !satiety ? "Наелся" : "Покорми кота!";
            System.out.println(name + ":" + isSatiety);
            }
            void eating(Cat_Eat cateat){
            if(satiety && demnishEat(appeating)) {
                satiety = false;

        }

    }
}}


