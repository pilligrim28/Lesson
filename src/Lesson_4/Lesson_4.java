package Lesson_4;

public class Lesson_4 {

    public static void main(String[] args) {

        String[][] array = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                int result = method(array);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Число массива превышено!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Есть ошибка в ячейке: " + e.y + "x" + e.m);
        }

    }

    private static int method(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int y = 0; y < array.length; y++) {
            if (array[y].length != 4) {
                throw new MyArraySizeException();
            }
            for (int m = 0; m < array[y].length; m++) {
                try {
                    count = count + Integer.parseInt(array[y][m]);
                } catch (NumberFormatException e) {

                    throw new MyArrayDataException(y, m);
                }
            }

        }
        return count;
    }
}




