package poo2;

public class main {

    public static void main(String[] args) {
    user user1 = new user("axel", "axel@gmail.com", 25);
    UserInfo display = new GetInfo();
        display.getUsername(user1);
        display.getMail(user1);
        display.getAge(user1);
    }
}
