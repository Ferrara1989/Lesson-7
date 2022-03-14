import java.util.Scanner;

public class Main {
    public static int number = 0;
    public static int a = 0;
    public static void main(String[] args) {
    a = getNumber();
    results();
    }
    public static int getNumber() {
    number = new Scanner(System.in).nextInt();
    return number;
    }
    public static void results() {
        if (a % 3 == 0) {
            System.out.println("Не делится");
        }
    }
}
