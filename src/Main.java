import java.util.Scanner;

public class Main {
    public static int degreesСelsius = 0;
    public static int degressFahrenheit = 0;
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в конвертер температуры!");
        print(getCelsus(), getFarengeit());
    }
    public static int getCelsus() {
        System.out.println("Ввод градусов по Цельсию: ");
        degreesСelsius = new Scanner(System.in).nextInt();
        return degreesСelsius;
    }
    public static int getFarengeit() {
        System.out.println(degreesСelsius + " Цельсий (а) это " +
                (degreesСelsius * 1.8 + 32) + " Фарингейт ");
        degressFahrenheit = new Scanner(System.in).nextInt();
        return degressFahrenheit;
    }
    public static void print(int getCelsus, int getFarengeit) {
        System.out.println("Температура по Цельсию: " + getCelsus);
        System.out.println("Температура по Фарингейту: " + getFarengeit);
    }
}
