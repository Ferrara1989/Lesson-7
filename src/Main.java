import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        print(userSurName(),userName(), userPatronymic(), DateOfBirth());
    }
    public static String userSurName() {
        System.out.println("Введите фамилию");
        return new Scanner(System.in).nextLine();
    }
    public static String userName() {
        System.out.println("Ввветие имя");
        return new Scanner(System.in).nextLine();
    }
    public static String userPatronymic() {
        System.out.println("Введите отчество");
        return new Scanner(System.in).nextLine();
    }
    public static int DateOfBirth() {
        System.out.println("Дату рождения");
        return new Scanner(System.in).nextInt();
    }
    public static void print(String userSurName, String userName, String userPatronymic, int DateOfBirth) {
        System.out.println("Фамилия" + userSurName);
        System.out.println("Имя" + userName);
        System.out.println("Отчество" + userPatronymic);
        System.out.println("Дата рождения" + DateOfBirth);
    }
}
