public class Basket {
    //Поля класса
    public double totalWeightOfAllGoods = 0;
    public String items = "";
    public String name = "";
    public int price = 0;
    public int count = 0;
    public double weight = 0;
    public int totalPrice = 0;
    public int limit = 999999999;

    // Конструкторы класса
    public Basket() {

    }

    public Basket(int limit) {
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this.items = items;
        this.totalPrice = totalPrice;
    }

    // Методы класса
    public void add(String name, int price) {
        add(name, price, 0);
    }

    public void add(String name, int price, double weight) {
        add(name, price, 1, weight);
    }

    public void add(String name, int price, int count, double weight) {
        if (check(name)) {
            return;
        }
        if (totalPrice + (price * count) > limit) {
            return;
        }
        totalWeightOfAllGoods = totalWeightOfAllGoods + weight * count;
        items = items + "\n" + name + " - " + price + " - " + count + " шт." + weight + "кг";
        totalPrice = totalPrice + (price * count);
    }

    public double getTotal() {
        return totalWeightOfAllGoods;
    }

    public void add(String name, int price, int count) {
        if (check(name)) {
            return;
        }
        if (totalPrice + (price * count) > limit) {
            return;
        }
        items = items + "\n" + name + " - " + price + " - " + count + " шт.";
        totalPrice = totalPrice + (price * count);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean check(String name) {
        return items.contains(name);
    }
}


