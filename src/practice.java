import java.util.Random;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
/*        String firstname = "Axel";
        String lastname = "Houairi";


        String fullname = firstname + ' ' + lastname;
        System.out.println(fullname);

        boolean isAuthenticated = true;

        System.out.println("is " + fullname + ' ' + "Authenticated ?" + ' ' + isAuthenticated);*/

      /*  for (int i = 0; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(fullname + ' ');
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("buzz ");
            }
            System.out.println(i);
        }*/

        /*Scanner input = new Scanner(System.in);*/

/*        System.out.print("Enter your name : ");
        String name = input.nextLine();

        System.out.print("Enter your age : ");
        int age = input.nextInt();

        System.out.print("Enter your gpa : ");
        double gpa = input.nextDouble();

        System.out.print("Are you a student ? (true/false) ");
        boolean student = input.nextBoolean();

        System.out.println("Hello " + name + " you are " + age + " years old");
        System.out.println("Your gpa is :" + gpa);
        if (student) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }*/

/*        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("width ");
        width = input.nextDouble();

        System.out.print("height ");
        height = input.nextDouble();

        area = width * height;

        System.out.println("area is " + area + " cm²");*/

        /*input.close();*/

/*        Random random = new Random();

        int num1;
        int num2;
        int num3;
        double num4;

        num1 = random.nextInt(1,101);
        num2 = random.nextInt(1,101);
        num3 = random.nextInt(1,101);
        num4 = random.nextDouble(1,101);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        System.out.println((num1 + num2 + num3) * 5 / num4);

        boolean isRainy;
        boolean isSunny;

        isRainy = random.nextBoolean();
        isSunny = random.nextBoolean();

        System.out.println("Rainy : " + isRainy + "\nSunny : " + isSunny);

        if (isSunny && !isRainy) {
            System.out.println("Sunny day with no rain.");
        } else if (!isSunny && isRainy) {
            System.out.println("Rainy day with no sun.");
        } else if (!isSunny && !isRainy) {
            System.out.println("No sun and no rain.");
        } else {
            System.out.println("Both rainy and sunny.");
        }*/

/*        String name = "Luffy";
        char firstLetter = 'L';
        int age = 19;
        double height = 173.5;
        boolean isPirate = true;

        System.out.printf("Hello %s", name);
        System.out.printf("\n%c is the first letter of your name", firstLetter);
        System.out.printf("\nYou are %d years old", age);
        System.out.printf("\nYour height is %.1f cm", height);
        System.out.printf("\nAre you a pirate ? %b", isPirate);

        System.out.printf("\n%s is %d years old, his height is %f cm",name,age,height);

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("\n%.1f",price1);
        System.out.printf("\n%.2f",price2);
        System.out.printf("\n%.3f",price3);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("\nid : %04d", id1);
        System.out.printf("\nid : %03d", id2);
        System.out.printf("\nid : %6d", id3);
        System.out.printf("\nid : %d", id4);*/

/*        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount : ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %) : ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year : ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years : ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d year/s is $%.2f",years,amount);

        scanner.close();*/

/*        String password = "MyCoolPassword1234;";

        int length = password.length();
        char letter = password.charAt(0);
        int index = password.indexOf("P");
        int lastIndex = password.lastIndexOf("o");

        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);


        String passOrFail = password.length() < 16 ?  "Your password must have atleast 16 characters" : "Your password is now %s";

        System.out.printf(passOrFail,password);    }*/
}
