package poo_project;

import java.time.LocalDate;

public class Cyborg extends Pirate {
    String energySource;
    String installedWeapon;

    public Cyborg(String race, String crew, String name, LocalDate birthdate, long bounty, boolean isCaptured, boolean haki, String energySource, String installedWeapon) {
        super(race, crew, name, birthdate, bounty, isCaptured, haki);
        this.energySource = energySource;
        this.installedWeapon = installedWeapon;
    }

    /* GET */

    public String getEnergySource() {
        return energySource;
    }

    public String getInstalledWeapon() {
        return installedWeapon;
    }

    /* SET */

    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }

    public void setInstalledWeapon(String installedWeapon) {
        this.installedWeapon = installedWeapon;
    }

    @Override
    public String getMoreDetails() {
        return "Energy source : " + getEnergySource() + "\nInstalled weapon : " + getInstalledWeapon();
    }

}
