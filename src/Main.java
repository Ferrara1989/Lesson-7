import java.util.Scanner;

public class Main {
    public static int NumberEntry = 0;
    public static void main(String[] args) {
       System.out.println("Добро пожаловать в программу печати числа в квадрате!");
       System.out.println("Введите число: ");
        numberEntry();
        NumberInAaSquare();
    }
    public static void numberEntry() {
        NumberEntry = new Scanner(System.in).nextInt();
    }
    public static void NumberInAaSquare() {
        System.out.println("Число в квадрате: " + NumberEntry * 2);
        }
    }

