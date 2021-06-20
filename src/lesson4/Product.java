package lesson4;

import java.util.Objects;

public class Product {
    private String name;
    private int price;
    private TypesOfProducts type;
    private int weight;
    private double size;

    public Product(String name, int price, TypesOfProducts type, int weight, double size) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.weight = weight;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public TypesOfProducts getType() {
        return type;
    }

    public void setType(TypesOfProducts type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price &&
                weight == product.weight &&
                Double.compare(product.size, size) == 0 &&
                Objects.equals(name, product.name) &&
                type == product.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, type, weight, size);
    }
}
