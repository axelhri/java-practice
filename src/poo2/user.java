package poo2;

public class user {
    String username;
    String mail;
    int age;

    public user(String username, String mail, int age) {
        this.username = username;
        this.mail = mail;
        this.age = age;
    }

    public String username() {
        return username;
    }

    public String mail() {
        return mail;
    }

    public int age() {
        return age;
    }
}
