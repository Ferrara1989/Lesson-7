public class Main {
    public static void main(String[] args) {
        Basket totalWeightOfAllGoods = new Basket("товары", 30);
        totalWeightOfAllGoods.add("молоко", 25);
        totalWeightOfAllGoods.add("печенье", 23, 2);
        totalWeightOfAllGoods.add("какао", 34,3, 3);

        Basket getTotal = new Basket();
        getTotal.getTotal();
        System.out.println("Общий вес всех товаров: " + getTotal.getTotal());
    }
}

