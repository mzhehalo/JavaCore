package lesson4;

public class Main {
    public static void main(String[] args) {

        Product toothpaste = new Product("toothpaste",
                3, TypesOfProducts.CONVENIENCE_PRODUCTS,
                100,
                3);
        Product television = new Product("television",
                200, TypesOfProducts.SHOPPING_PRODUCTS,
                5000,
                40);
        Product rolex = new Product("rolexWatch",
                10000, TypesOfProducts.SPECIALITY_PRODUCTS,
                80,
                2);
        Product lifeInsurance = new Product("lifeInsurance",
                800, TypesOfProducts.UNSOUGHT_PRODUCTS,
                0,
                0);
        Product furniture = new Product("furniture",
                400, TypesOfProducts.SHOPPING_PRODUCTS,
                10000,
                1000);

        Store store1 = new Store();
//        store1.fillListProducts();
        store1.addProduct(toothpaste);
        store1.addProduct(television);
        store1.addProduct(rolex);
        store1.addProduct(lifeInsurance);
        store1.addProduct(furniture);
        store1.removeProduct("0");
        store1.multipleTwoByType(TypesOfProducts.SHOPPING_PRODUCTS);
        store1.premiumProducts();
        store1.sumByType(TypesOfProducts.SHOPPING_PRODUCTS);
        store1.avgByType();
    }
}

//  Створити клас Product (назва, ціна, тип (для цього можете створити енум) і ще 1-3 поля за власним бажанням).
//  Приватні поля, гетери-сетери, констркутор, туСтрінг, equals&hashcode.
//  Створити клас Store, який матиме поле - List продуктів.
//  Конструктор класу store не має жодних параметрів, в тілі просто ініціалізує List (new ArrayList<>).
//  В класі Store створити, і в мейні викликати, наступні методи:
//  1. Додати продукт в магазин. Але перш ніж додати його в ліст,
//  здійснити валідацію (чи ціна не від'ємна, чи в назві товару не присутні цифри).
//  2. Видалити продукт з магазину по назві.
//  3. Збільшити ціну для вказаного у параметрі типу продуктів удвічі
//  4. Усі товари, дорожчі вказаної суми, записати у окремий ліст і
//  вивести його на екран (наприклад "В нашому магазині продаються такі преміум товари:...)
//  5. Порахувати загальну суму усіх товарів вказаного у вхідному параметрі типу і вивести її на екран
//  6. Порахувати середню вартість усіх товарів в магазині і вивести це число на екран
//
//  Для роботи з колекцією варто ще створити метод, який наповнить наш магазин одразу же ж певною кількістю продуктів