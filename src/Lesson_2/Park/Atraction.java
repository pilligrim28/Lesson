package Lesson_2.Sotr;

public class Atraction {
    private String attractionName;
    private String workingHours;
    private double cost;

    public Atraction(String attractionName, String workingHours, double cost) {
        this.attractionName = attractionName;
        this.workingHours = workingHours;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("Название %s \tВремя работы: %s \nСтоимость: %s\n",
                attractionName, workingHours, cost);
    }


public void printInfo() {
    System.out.println("Название: " + attractionName);
    System.out.println("Время работы: " + workingHours);
    System.out.println("Стоимость: " + cost + " Руб");
}
  }
