package poo2;
import poo2.user;

public class GetInfo implements UserInfo {
    @Override
    public void getUsername(user user) {
        System.out.println(user.username());
    }

    public void getMail(user user) {
        System.out.println(user.mail());
    }

    public void getAge(user user) {
        System.out.println(user.age());
    }
}
