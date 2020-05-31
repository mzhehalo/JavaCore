package lesson3;

public class Pants extends Clothes implements MansClothes, WomansClothes {

    public Pants(ClotheSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void toDressMan() {
        System.out.println("To dress Man Pants!");
    }

    @Override
    public void toDressWoman() {
        System.out.println("To dress Woman Pants!");
    }
}
