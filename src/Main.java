import java.util.Scanner;
public class Main {
    public static double Weight = 0;
    public static double Height = 0;
    public static double BMI = 0;
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу BMI!");
        print(bodyMass(), growth(),humanBMI());
    }
    public static double bodyMass() {
        System.out.println("Введите свою массу тела (кг): ");
        Weight = new Scanner(System.in).nextDouble();
        return Weight;
    }
    public static double growth() {
    System.out.println("Введите свой рост(см): ");
    Height = new Scanner(System.in).nextDouble();
    return Height;
    }
    public static double humanBMI() {
        BMI =  Weight/(Height * Height) * 10000;
        return BMI;
    }
    public static void print(double bodyMass, double growth, double humanBMI) {
        System.out.println("Ваш вес: " + bodyMass);
        System.out.println("Ваш рост: " + growth);
        System.out.println("Ваш BMI равен: " + humanBMI);
    }
}
