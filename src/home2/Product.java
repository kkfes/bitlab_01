package home2;

public class Product {
    String name;
    int cost;

    public Product() {
    }

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Продукт{" +
                "Имя='" + name + '\'' +
                ", Стоймость=" + cost +
                '}';
    }
}
