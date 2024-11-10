package Lesson_2.Park;




public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }
    public  static void main(String[] args) {
           // Park park=new Park("Парк");
            Atraction atracOne = new Atraction("Звери", "10:00-14:00", 50);
            atracOne.printInfo();


        }

}





