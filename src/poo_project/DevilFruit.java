package poo_project;

import java.time.LocalDate;

public class DevilFruit extends Pirate {
    private String fruitType;
    private String fruitName;

    public DevilFruit(String crew, String name, LocalDate birthdate, int bounty, boolean isDead, String fruitType, String fruitName) {
        super(crew, name, birthdate, bounty, isDead);
        this.fruitType = fruitType;
        this.fruitName = fruitName;
    }


    /* GET */

    public String getDevilFruitName() {
        return fruitName;
    }

    public String getDevilFruitType() {
        return fruitType;
    }

    /* SET */

    public void setDevilFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setDevilFruitType(String fruitType) {
        this.fruitType = fruitType;
    }
}
