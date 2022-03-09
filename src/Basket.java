public class Basket {
    public static String items = "";
    public static int totalPrice = 0;

    public static void main(String[] args) {
        add("молоко", 23);
        add("печенье", 34);
        print("Содержание корзины");
        System.out.println("Общая стоимость равна: " + getTotalPrice());
        clear();
        print("Содержание корзины");
        System.out.println("Общая стоимость равна: " + getTotalPrice());
    }
    public static void add(String name, int price) {
        items = items + "\n" + name + "-" + price;
        totalPrice = totalPrice + price;
    }
    public static void clear() {
        items = "";
        totalPrice = 0;
    }
    public static void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.println("Общая стоимость равна: " + getTotalPrice());
        }

        }
    public static int getTotalPrice() {
        return totalPrice;
    }
    public static boolean check(String name) {
        return items.contains(name);
    }
}

