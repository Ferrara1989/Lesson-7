import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int num1 = getNumber();
        System.out.println("Введите второе число: ");
        int num2 = getNumber();
        System.out.println("Сумма " + num1 + "+" + num2 + " равна " + (num1 + num2));

    }

    public static int getNumber() {
        return new Scanner(System.in).nextInt();
    }
}

