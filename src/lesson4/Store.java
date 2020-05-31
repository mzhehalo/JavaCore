package lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store {
    private List<Product> list1 = new ArrayList<>();

    public void addProduct(Product product) {

        if (product.getPrice() > 0 && product.getName().matches("[a-zA-Z]+")) {
            list1.add(product);
        }
    }

    public void result() {
        for (Product product1 : list1) {
            System.out.println(list1.indexOf(product1) + "" + product1);
        }
    }

    public void removeProduct(String productName) {

        System.out.println("---------------------------" +
                "---------------------------------------------------------------------------------------");

//        list1.removeIf(product -> product.getName().equals(productName));

        Iterator<Product> iterator = this.list1.iterator();
        while (iterator.hasNext()) {
            Product currentProduct = iterator.next();
            if (currentProduct.getName().equals(productName)) {
                iterator.remove();
            }
        }

        for (Product product : list1) {
            System.out.println(list1.indexOf(product) + " " + product);
        }
    }

    public void multipleTwoByType(TypesOfProducts type) {

        System.out.println("---------------------------" +
                "---------------------------------------------------------------------------------------");

        for (Product product : list1) {
            if (product.getType().equals(type)) {
                product.setPrice(product.getPrice() * 2);
            }
        }

        for (Product product : list1) {
            System.out.println(list1.indexOf(product) + " " + product);
        }
    }
}
