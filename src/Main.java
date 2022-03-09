import java.util.Scanner;

public class Main {
    public static int a = 0;
    public static int b = 0;
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу вычисления наименьшего числа!");
        System.out.println("Введите певое число: ");
        firstNumber();
        System.out.println("Введите второе число: ");
        secondNumber();
        minAndMax();
    }
    public static void minAndMax() {
        if (b < a) {
            System.out.println("Наименьшее число: " + b);
        } else {
            System.out.println("Наименьшее число: " + a);
        }
    }
    public static void firstNumber() {
        a = new Scanner(System.in).nextInt();
    }
    public static void secondNumber() {
        b = new Scanner(System.in).nextInt();
    }
}
