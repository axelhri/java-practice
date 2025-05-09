package poo_project;

import java.time.LocalDate;
import java.util.Arrays;

public class Shooter extends Pirate {
    String weaponType;
    String ammoType;
    int weaponNumber;

    public Shooter(String race, String crew, String name, LocalDate birthdate, long bounty, boolean isCaptured, boolean haki, String weaponType, String ammoType, int weaponNumber) {
        super(race, crew, name, birthdate, bounty, isCaptured, haki);
        this.weaponType = weaponType;
        this.ammoType = ammoType;
        this.weaponNumber = weaponNumber;
    }

    /* GET */

    public String getWeaponType() {
        return weaponType;
    }

    public String getAmmoType() {
        return ammoType;
    }

    public int getWeaponNumber() {
        return weaponNumber;
    }

    /* SET */

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public void setAmmoType(String ammoType) {
        this.ammoType = ammoType;
    }

    public void setWeaponNumber(int weaponNumber) {
        this.weaponNumber = weaponNumber;
    }

    @Override
    public String getMoreDetails() {
            return "Weapon type : " + getWeaponType() + "\nAmmo type : " + getAmmoType() + "\nNumber of weapons : " + getWeaponNumber();
    }
}
