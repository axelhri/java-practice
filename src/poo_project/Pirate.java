package poo_project;

import java.time.LocalDate;

public abstract class Pirate {
    String race;
    String crew;
    String name;
    LocalDate birthdate;
    long bounty;
    boolean isCaptured;
    boolean haki;

    public Pirate(String race, String crew, String name, LocalDate birthdate, long bounty, boolean isCaptured, boolean haki) {
        this.race = race;
        this.crew = crew;
        this.name = name;
        this.birthdate = birthdate;
        this.bounty = bounty;
        this.isCaptured = isCaptured;
        this.haki = haki;
    }

    /* GET */

    public String getRace() {
        return race;
    }

    public String getCrew() {
        return crew;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public long getBounty() {
        return bounty;
    }

    public boolean getIsCaptured() {
        return isCaptured;
    }

    public boolean getHaki() {
        return haki;
    }

    /* SET */

    public void setRace(String race) {
        this.race = race;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setBounty(long bounty) {
        this.bounty = bounty;
    }

    public void setIsCaptured(boolean isCaptured) {
        this.isCaptured = isCaptured;
    }

    public void setHaki(boolean haki) {
        this.haki = haki;
    }

    public abstract String getMoreDetails();
}
