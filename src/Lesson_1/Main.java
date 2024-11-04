package Lesson_1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printThreeWords();

    }

    static void printThreeWords() {
        System.out.println("Orange,\nBanana,\nApple");
    }

}
class SummCheckSign {
    public static void main(String[] args) {
        checkSumSign();
    }

    static void checkSumSign() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите число а:");

            int a = in.nextInt();
            System.out.print("Введите число b:");
            int b = in.nextInt();
            if (a + b >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }

        }
    }
}
class PrintColor{
 public static final String ANSI_RED = "\u001B[41m";
public static final String ANSI_GREEN = "\u001B[42m";
public static final String ANSI_YELLOW = "\u001B[43m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
       printColor();
    }

    static void printColor(){
         try (Scanner in = new Scanner(System.in)) {
             System.out.print("Введите число: ");
             int value = in.nextInt();
             if (value <= 0){
                 System.out.println(ANSI_RED +"Красный" + ANSI_RESET);
             }
             if (value == 100 & value > 0) {
                 System.out.println(ANSI_YELLOW +"Жёлтый" + ANSI_RESET);
             }
             else {
                 System.out.println(ANSI_GREEN +"Зеленый" + ANSI_RESET);

             }
         }

    }
}

class CompareNumbers {
    public static void main(String[] args) {
        compareNumbers();
    }

    static void compareNumbers() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите число a: ");
            int a = in.nextInt();
            System.out.print("Введите число b: ");
            int b = in.nextInt();


            if (a>=b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
        }
    }
}
class InputNumber {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите число a: ");
            int a = in.nextInt();
            System.out.print("Введите число b: ");
            int b = in.nextInt();
            int c = a + b;
             if (c>=10 && c<=20){
                 System.out.println(true);
             }
             else {
                 System.out.println(false);
             }

        }
    }
}
//Второе решение
class InputNumber2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите число a: ");
            int a = in.nextInt();
            System.out.print("Введите число b: ");
            int b = in.nextInt();
            int c = a + b;
            System.out.println(c >= 10 && c <= 20);

        }
    }
}
class InputNumberOtr {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите число a: ");
            int a = in.nextInt();

             if (a>=0){
                 System.out.println("Число положительное");
             }
             else {
                 System.out.println("Число отрицательное");
             }

        }
    }
}
class InputNumberPol {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите число a: ");
            int a = in.nextInt();

             if (a>=0){
                 System.out.println(true);
             }
             else {
                 System.out.println(false);
             }

        }
    }
}
//Нужно будет здесь рапзобраться
class TimesString {
 public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
     System.out.print("Введите слово или текст: ");
     String st =scan.nextLine();

     System.out.print("Введите количество строк: ");
     int number = scan.nextInt();
     for (int i=0; i<number; i++){
         System.out.println(st);
     }
   }
 }

 class VisokGod{
    public static void main (String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Введите год: ");
            int year = scan.nextInt();

            if (year % 4 != 0) {
                System.out.println(false);
            }
            else if (year % 400 == 0)
            {
                System.out.println(true);
            }
            else if (year % 100 == 0)
            {
                System.out.println(true);
            }
            else
            {
                System.out.println(true);
            }

        }
    }
   // Нужно проработать как сделать чтобы сработало в булиан
/* class VisokosGod2 {


        public static boolean visokoGod(int year) {
            int year = 0;
            if (year % 4 != 0) {
                return false;
            } else if (year % 400 == 0) {
                return true;
            } else if (year % 100 == 0) {
                return false;
            } else {
                return true;
            }


        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите год: ");
            int year = scan.nextInt();
            visokoGod(year);
        }
    }
*/
class MassiveArray {
       public static void main(String[] args) {
           int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
           for (int i = 0; i < array.length; i++) {
               if (array[i] == 0) {
                   array[i] = 1;
               }
                 else if (array[i] == 1) {
                       array[i] = 0;
                   }
               }
           System.out.println(Arrays.toString(array));
           }

       }

class MassiveArrayMen {
       public static void main(String[] args) {
           int[] array = {1,5,3,2,11,4,5,2,4,8,9,1};
           for (int i = 0; i < array.length; i++) {
               if (array[i] < 6) {
                   array[i]=array[i] * 2;
               }

               }
           System.out.println(Arrays.toString(array));
           }

       }

class DiagonalKub {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            System.out.print("Введите X: ");
            int x = scan.nextInt();
            System.out.print("Введите y: ");
            int y = scan.nextInt();


        int[][] arr = new int[x][y];

            for (int i = 0; i < arr.length; i++) {
                arr[i][arr.length - i - 1] = 1;
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][i] = 1;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            }

        }
    }
   class LenValue {
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину: ");
        int len = scan.nextInt();
        System.out.print("Введите число: ");
        int initialValue = scan.nextInt();

           lenArray(len, initialValue);

       }




       public static void lenArray(int len, int initialValue) {

           int[] arr = new int[len];
           for (int i = 0; i < len; i++) {
               arr[i] = initialValue;
               System.out.print("[" + i + "]" + arr[i] + " ");
           }

       }
   }



