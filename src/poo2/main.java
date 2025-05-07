package poo2;

public class main {

    public static void main(String[] args) {
    user user1 = new user("axel", "axel@gmail.com", 25);
    UserInfo display = new PrintInfo();

        display.printUsername(user1);
        display.printMail(user1);
        display.printAge(user1);

        user1.setUsername("bob");
        user1.setMail("bob@gmail.com");
        user1.setAge(52);

        display.printUsername(user1);
        display.printMail(user1);
        display.printAge(user1);
    }
}

