package poo2;

public class PrintInfo implements UserInfo {
    @Override
    public void printUsername(user user) {
        System.out.println(user.getUsername());
    }

    public void printMail(user user) {
        System.out.println(user.getMail());
    }

    public void printAge(user user) {
        System.out.println(user.getAge());
    }
}
