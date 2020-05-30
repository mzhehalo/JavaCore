package lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Cars
        Car hyundai = new Car(1,"i30", 1.5,120);
        Car mercedes = new Car(2,"200", 2.0,190);
        Car kia = new Car(3,"ceed", 1.9,150);
        Car landRover = new Car(4,"rangeR", 2.5,250);
        Car volkswagen = new Car(5,"nivus", 1.6,130);
        Car chevrolet = new Car(6,"camaro", 3.0,520);
        Car[] arrCars = new Car[6];
        arrCars[0] = hyundai;
        arrCars[1] = mercedes;
        arrCars[2] = kia;
        arrCars[3] = landRover;
        arrCars[4] = volkswagen;
        arrCars[5] = chevrolet;
        System.out.println(Arrays.toString(arrCars));
        for (Car arrCar : arrCars) {
            System.out.println(arrCar);
        }
        //Users
        User taras = new User(1,"Taras", "Leschyshyn", 30);
        User halyna = new User(2,"Halyna", "Leschyshyn", 29);
        User vova = new User(3,"Volodia", "Koprovski", 27);
        User bim = new User(4,"Bimchik", "Bimovich", 10);
        User kolya = new User(5,"Mikola", "Bondaryuk", 28);
        User[] users = new User[5];
        users[0] = taras;
        users[1] = halyna;
        users[2] = vova;
        users[3] = bim;
        users[4] = kolya;
        System.out.println(Arrays.toString(users));
        for (User user : users) {
            System.out.println(user);
        }
    }
}