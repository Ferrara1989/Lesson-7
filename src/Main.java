import java.util.Scanner;

public class Main {
    public static int numberEntry = 0;

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программа выдает true если число больше 5 и false если меньше или равно 5!");
        System.out.println("Введите число: ");
        numberEntry();
        rightAndWrong();
    }

    public static void numberEntry() {
        numberEntry = new Scanner(System.in).nextInt();
    }

    public static void rightAndWrong() {
        if (numberEntry > 5) {
            System.out.println(true);
        }
        if (numberEntry <= 5) {
            System.out.println(false);
        }
    }
}





