package poo_project;

public class PrintPirateDetails implements PirateDetails {
    @Override
    public void printPirate(Pirate Pirate) {
        System.out.printf("Race : %s\nCrew : %s\nName : %s\nBirthdate : %s\nBounty : %,d\nCaptured : %b\nHaki : %b\n%s",Pirate.getRace(), Pirate.getCrew(),Pirate.getName(),Pirate.getBirthdate(),Pirate.getBounty(),Pirate.getIsCaptured(),Pirate.getHaki(),Pirate.getMoreDetails());
    }
}
