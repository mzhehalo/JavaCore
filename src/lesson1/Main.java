package lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car hyu = new Car(1,"i30", 1.5,120);
        Car[] arrCars = new Car[10];
        arrCars[0] = hyu;
        System.out.println(Arrays.toString(arrCars));
    }
}