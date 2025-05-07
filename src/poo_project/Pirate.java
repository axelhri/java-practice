package poo_project;

import java.time.LocalDate;

public abstract class Pirate {
    String crew;
    String name;
    LocalDate birthdate;
    int bounty;
    boolean isDead;

    public Pirate(String crew, String name, LocalDate birthdate, int bounty, boolean isDead) {
        this.crew = crew;
        this.name = name;
        this.birthdate = birthdate;
        this.bounty = bounty;
        this.isDead = isDead;
    }

    /* GET */

    public String getCrew() {
        return crew;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getBounty() {
        return bounty;
    }

    public boolean getIsDead() {
        return isDead;
    }

    /* SET */

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setBounty(int bounty) {
        this.bounty = bounty;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }
}
