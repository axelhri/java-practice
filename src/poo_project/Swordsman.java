package poo_project;

import java.time.LocalDate;
import java.util.Arrays;

public class Swordsman extends Pirate {
     int numberOfSwords;
     String[] swordName;

    public Swordsman(String race, String crew, String name, LocalDate birthdate, long bounty, boolean isCaptured, boolean haki, int numberOfSwords, String[] swordName) {
        super(race, crew, name, birthdate, bounty, isCaptured, haki);
        this.numberOfSwords = numberOfSwords;
        this.swordName = swordName;
    }


    /* GET */

    public int getNumberOfSwords() {
        return numberOfSwords;
    }

    public String[] getSwordName() {
        return swordName;
    }

    /* SET */

    public void setNumberOfSwords(int numberOfSwords) {
        this.numberOfSwords = numberOfSwords;
    }

    public void setSwordName(String[] swordName) {
        this.swordName = swordName;
    }

    @Override
    public String getMoreDetails() {
if (swordName.length > numberOfSwords || swordName.length < numberOfSwords) {
    throw new IllegalArgumentException("Nombre de sabres invalide");
} else {
        return "Number of Swords : " + getNumberOfSwords() + "\nSword name : " + Arrays.toString(getSwordName());
}
    }
}
