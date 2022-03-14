import java.util.Scanner;

public class Main {
    public static String text = "";
    public static void main(String[] args) {
        getText();
        print();
    }
    public static void getText() {
        System.out.println("Введите текст: ");
        text = new Scanner(System.in).nextLine();
    }
    public static void print() {
        System.out.println("Ваш текст: " + text);
    }
}
