package lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store {
    private List<Product> list1 = new ArrayList<>();
    private List<Product> premiumProducts = new ArrayList<>();

    public void addProduct(Product product) {

        if (product.getPrice() > 0 && product.getName().matches("[a-zA-Z]+")) {
            list1.add(product);
        }
    }

    public void removeProduct(String productName) {

        System.out.println("---------------------------RemoveProduct" +
                "--------------------------------------------------------------------------------");

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

        System.out.println("---------------------------MultipleTwoByType" +
                "---------------------------------------------------------------------------");

        for (Product product : list1) {
            if (product.getType().equals(type)) {
                product.setPrice(product.getPrice() * 2);
            }
        }

        for (Product product : list1) {
            System.out.println(list1.indexOf(product) + " " + product);
        }
    }

    public void premiumProducts() {

        System.out.println("---------------------------Premium Products" +
                "------------------------------------------------------------------------------");

        for (Product product : list1) {
            if (product.getPrice() > 400) {
                premiumProducts.add(product);
            }
        }

        for (Product premiumProduct : premiumProducts) {
            System.out.println("Premium goods: " + premiumProduct);
        }
    }

    public void sumByType(TypesOfProducts type) {
        int sum = 0;
        System.out.println("---------------------------SumByType" +
                "------------------------------------------------------------------------------");
        for (Product product : list1) {
            if (type.equals(product.getType())) {
                sum += product.getPrice();
            }
        }

        System.out.println(sum);
    }

    public void avgByType() {
        int avg = 0;

        System.out.println("---------------------------AvgByType" +
                "------------------------------------------------------------------------------");
        for (Product product : list1) {
            avg += product.getPrice() / list1.size();
        }

        System.out.println(avg);
    }

//    public void fillListProducts() {
//        Product toothpaste = new Product("toothpaste",
//                3, TypesOfProducts.ConvenienceProducts,
//                100,
//                3);
//        Product television = new Product("television",
//                200, TypesOfProducts.ShoppingProducts,
//                5000,
//                40);
//        Product rolex = new Product("rolexWatch",
//                10000, TypesOfProducts.SpecialityProducts,
//                80,
//                2);
//        Product lifeInsurance = new Product("lifeInsurance",
//                800, TypesOfProducts.UnsoughtProducts,
//                0,
//                0);
//        Product furniture = new Product("furniture",
//                400, TypesOfProducts.ShoppingProducts,
//                10000,
//                1000);
//
//        this.list1.add(toothpaste);
//        this.list1.add(television);
//        this.list1.add(rolex);
//        this.list1.add(lifeInsurance);
//        this.list1.add(furniture);
//    }
}
