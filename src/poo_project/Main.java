package poo_project;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DevilFruit pirate1 = new DevilFruit("Strawhat","Luffy", LocalDate.of(1999,5,25),3000000,false,"Zoan","Ito Ito no mi");
        PirateDetails display = new PrintPirateDetails();
        DevilFruitDetails display2 = new PrintDevilFruit();
        display.printAllDetails(pirate1);
        display2.printDevilFruitDetails(pirate1);
    }
}
