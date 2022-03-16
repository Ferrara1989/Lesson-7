import java.util.Scanner;

public class Main {
    public static double degreesСelsius = 0;
    public static double degressFahrenheit = 0;
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в конвертер температуры!");
        print(getCelsus(), getFarengeit());
    }
    public static double getCelsus() {
        System.out.println("Ввод градусов по Цельсию: ");
        degreesСelsius = new Scanner(System.in).nextDouble();
        return degreesСelsius;
    }
    public static double getFarengeit() {
        degressFahrenheit = degreesСelsius * 1.8 + 32;
        return degressFahrenheit;
    }
    public static void print(double getCelsus, double getFarengeit) {
        System.out.println(getCelsus + " Цельсий (а) это " +
                (getFarengeit) + " Фарингейт ");
        System.out.println("Температура по Цельсию: " + getCelsus);
        System.out.println("Температура по Фарингейту: " + getFarengeit);
    }
}
