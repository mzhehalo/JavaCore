package lesson3;

public class Dress extends Clothes implements WomansClothes {

    public Dress(ClotheSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void toDressWoman() {
        System.out.println("To dress Woman Dress!");
    }
}
