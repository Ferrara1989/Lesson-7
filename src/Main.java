import java.util.Scanner;

public class Main {
    public static String symbolWithOperation = "";
    public static int numberEntry = 0;

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в простой калькулятор на Java!");
        calc(getInt(), getInt(), getOperation());
    }

    public static int getInt() {
        System.out.println("Введите число: ");
        numberEntry = new Scanner(System.in).nextInt();
        return numberEntry;
    }

    public static void calc(int num1, int num2, String symbolWithOperation) {
        if (symbolWithOperation.equals("+")) {
            System.out.println(num1 + num2);
        } else if (symbolWithOperation.equals("-")) {
            System.out.println(num1 - num2);
        } else if (symbolWithOperation.equals("*")) {
            System.out.println(num1 * num2);
        } else if (symbolWithOperation.equals("/")) {
        } else {
            System.out.println("Нет такой операции!");
        }
    }

    public static String getOperation() {
        System.out.println("Введите символ операции: ");
        symbolWithOperation = new Scanner(System.in).nextLine();
        return symbolWithOperation;
    }
}

