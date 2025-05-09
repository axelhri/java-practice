package poo_project;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Swordsman zoro = new Swordsman(
                "Human",
                "Straw Hat",
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

        Shooter usopp = new Shooter(
                "Human",
                "Straw Hat",
                "Usopp",
                LocalDate.of(1500, 4, 1),
                500_000_000L,
                false,
                true,
                "Slingshot",
                "Pop Greens",
                1
        );

        Cyborg franky = new Cyborg(
                "Cyborg",
                "Straw Hat Pirates",
                "Franky",
                LocalDate.of(1485, 3, 9),
                394_000_000L,
                false,
                false,
                "Cola",
                "Radical Beam"
        );

        DevilFruitUser luffy = new DevilFruitUser(
                "Human",
                "Straw Hat Pirates",
                "Monkey D. Luffy",
                LocalDate.of(1504, 5, 5),
                3_000_000_000L,
                false,
                true,
                "Mythical Zoan",
                "Hito Hito no Mi, Model: Nika",
                true
        );

        DevilFruitUser ener = new DevilFruitUser(
                "Skypiean",
                "God's Army",
                "Enel",
                LocalDate.of(1488, 5, 6),
                500_000_000L,
                false,
                false,
                "Logia",
                "Goro Goro no Mi",
                false
        );


        PirateDetails display = new PrintPirateDetails();
        display.printPirate(ener);
    }
}
