package poo_project;

import java.time.LocalDate;

public class DevilFruitUser extends Pirate {
    String fruitType;
    String fruitName;
    boolean isAwakened;

    public DevilFruitUser(String race, String crew, String name, LocalDate birthdate, long bounty, boolean isCaptured, boolean haki, String fruitType, String fruitName, boolean isAwakened) {
        super(race, crew, name, birthdate, bounty, isCaptured, haki);
        this.fruitType = fruitType;
        this.fruitName = fruitName;
        this.isAwakened = isAwakened;
    }

    /* GET */

    public String getFruitType() {
        return fruitType;
    }

    public String getFruitName() {
        return fruitName;
    }

    public boolean getIsAwakened() {
        return isAwakened;
    }

    /* SET */

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setIsAwakened(boolean isAwakened) {
        this.isAwakened = isAwakened;
    }

    @Override
    public String getMoreDetails() {
        return "Fruit type : " + getFruitType() + "\nFruit name : " + getFruitName() + "\nAwakened : " + getIsAwakened();
    }
}
