import java.util.Scanner;

public class Main {
    public static int age = 0;
    public static void main(String[] args) {
        System.out.println("Какой у Вас возраст?");
        age = getAge();
        print();
    }
    public static int getAge() {
        System.out.println("Введите свой возраст: ");
        age = new Scanner(System.in).nextInt();
        return age;
    }
    public static void print() {
        System.out.println("Ваш возраст: " + age);
    }
}
