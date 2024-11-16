package Lesson_4;

public class MyArrayDataException extends Throwable {
    public int y;
    public int m;

    MyArrayDataException(int y, int m) {
        this.y = y;
        this.m = m;
    }
}
