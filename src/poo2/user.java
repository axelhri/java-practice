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

    public String getUsername() {
        return username;
    }

    public String getMail() {
        return mail;
    }

    public int getAge() {
        return age;
    }

    public void setUsername(String name) {
       this.username = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
