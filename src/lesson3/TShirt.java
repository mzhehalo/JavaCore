package lesson3;

public class TShirt extends Clothes implements MansClothes, WomansClothes {

    public TShirt(ClotheSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void toDressMan() {
        System.out.println("To dress Man T-Shirt!");
    }

    @Override
    public void toDressWoman() {
        System.out.println("To dress Woman T-Shirt!");
    }
}
