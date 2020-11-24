package home3;

public class GoodItem {
    String name;
    int price;

    public GoodItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "GoodItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
