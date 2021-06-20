package lesson3;

public class Tie extends Clothes implements MansClothes {

    public Tie(ClotheSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void toDressMan() {
        System.out.println("To dress Man Tie!");
    }
}
