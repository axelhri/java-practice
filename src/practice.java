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

        Scanner input = new Scanner(System.in);

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

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("width ");
        width = input.nextDouble();

        System.out.print("height ");
        height = input.nextDouble();

        area = width * height;

        System.out.println("area is " + area + " cm²");

        input.close();
    }
}
