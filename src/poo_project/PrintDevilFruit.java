package poo_project;

public class PrintDevilFruit implements DevilFruitDetails {
    @Override
    public void printDevilFruitDetails(DevilFruit Devilfruit) {
        System.out.println();
        System.out.printf("Fruit type : %s\nFruit name : %s",Devilfruit.getDevilFruitType(), Devilfruit.getDevilFruitName());
    }
}
