package lesson3;

public class WorkShop {
    private final Clothes[] clothes = new Clothes[10];

    public void execute() {
        TShirt tShirt1 = new TShirt(ClotheSize.S, 100, "red");
        tShirt1.toDressMan();
        tShirt1.toDressWoman();
        TShirt tShirt2 = new TShirt(ClotheSize.M, 200, "blue");
        tShirt2.toDressMan();
        tShirt2.toDressWoman();
        Dress dress1 = new Dress(ClotheSize.XXS, 150,"yellow");
        dress1.toDressWoman();
        Tie tie1 = new Tie(ClotheSize.M, 45,"green");
        tie1.toDressMan();
        clothes[0] = tShirt1;
        clothes[1] = tShirt2;
        clothes[2] = dress1;
        clothes[3] = tie1;
    }

    public MansClothes[] mansClothes() {
        MansClothes[] mansClothes = new MansClothes[clothes.length];

        int i = 0;
        for (Clothes clothe : clothes) {
            if (clothe instanceof MansClothes) {
                mansClothes[i] = (MansClothes) clothe;
                i++;
            }
        }
        return mansClothes;
    }

    public WomansClothes[] womansClothes() {
        WomansClothes[] womansClothes = new WomansClothes[clothes.length];

        int i = 0;
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomansClothes) {
                womansClothes[i] = (WomansClothes) clothe;
                i++;
            }
        }
        return womansClothes;
    }

}
