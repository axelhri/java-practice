package poo_project;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Swordsman zoro = new Swordsman(
                "Human",
                "Strawhat",
                "Roronoa Zoro",
                LocalDate.of(1503,11,11),
                1111000000L,
                false,
                true,
                3,
                new String[]{"Enma", "Wado Ichimonji", "Sandai Kitetsu"}
        );

        Swordsman mihawk = new Swordsman(
                "Human",
                "Cross Guild",
                "Dracule Mihawk",
                LocalDate.of(1481, 3, 9),
                3590000000L,
                false,
                true,
                1,
                new String[]{"Yoru"}
        );

        Swordsman pedro = new Swordsman(
                "Mink",
                "Guardians of Zou",
                "Pedro",
                LocalDate.of(1488, 6, 11),
                382000000L,
                false,
                true,
                1,
                new String[]{"Electro Blade"}
        );

        PirateDetails display = new PrintPirateDetails();
        display.printPirate(pedro);
    }
}
