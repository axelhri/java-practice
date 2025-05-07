package poo_project;

public class PrintPirateDetails implements PirateDetails {
    @Override
    public void printAllDetails(Pirate Pirate) {
        System.out.printf("Crew : %s\nName : %s\nBirthdate : %s\nBounty : %,d\nDead : %b",Pirate.getCrew(),Pirate.getName(),Pirate.getBirthdate(),Pirate.getBounty(),Pirate.getIsDead());
    }
}
