import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

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

        System.out.printf(passOrFail,password);    */

/*        Scanner input = new Scanner(System.in);

        System.out.print("Enter the day of the week : ");

        String day = input.nextLine();

        switch (day) {
            case "Monday" -> System.out.println("It is Monday (1/7) 🥲");
            case "Tuesday" -> System.out.println("It is Tuesday (2/7) 😒");
            case "Wednesday" -> System.out.println("It is Wednesday (3/7) 😑");
            case "Thursday" -> System.out.println("It is Thursday (4/7) 😐");
            case "Friday" -> System.out.println("It is Friday (5/7) 😊");
            case "Saturday" -> System.out.println("It is Saturday (6/7) 😃");
            case "Sunday" -> System.out.println("It is Sunday (7/7) 😄");
            default -> System.out.printf("%s is not a day",day);
        }*/

/*        String name = "Axel";
        int age = 25;

        happyBirthday(name, age);
        test("This is a string");
        System.out.println(square(3));
        System.out.println(cube(3));
        String fullname = getFullName("Axel", "Houairi");
        System.out.println(fullname);

        if (ageCheck(18)) {
            System.out.println("You can enter");
        } else {
            System.out.println("You cannot enter");
        }*/

/*        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza);*/

        /*String[] fruits = {"apple","banana","mango"};

        fruits[0] = "pineapple";

        int numOfFruits = fruits.length;

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        Arrays.sort(fruits);
        Arrays.fill(fruits,"tomato");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(numOfFruits);*/

       /* Scanner input = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("What number of food do you want ? : ");

        size = input.nextInt();
        input.nextLine();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food : ");
            foods[i] = input.nextLine();
        }

        for (String food : foods) {
            System.out.println(food);
        }


        input.close();*/

/*        Scanner input = new Scanner(System.in);

        boolean isFound = false;*/
  /*      int[] numbers = {101,28,5,84,51,2};
        int target = 51;*/

 /*       String[] fruits = {"apple","banana","orange"};
        System.out.print("Enter a fruit to search for : ");
        String stringTarget = input.nextLine();*/


       /* String numTarget = input.nextLine();*/

 /*       for (int i = 0; i < numbers.length; i++) {
                if (target == numbers[i]) {
                    System.out.println("Element found at index : " + i);
                    System.out.println("The number found is " + numbers[i]);
                    isFound = true;
                    break;
                }
            }*/

/*        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(stringTarget)) {
                System.out.println("Element found at index : " + i);
                System.out.println("The fruit found is " + fruits[i]);
                isFound = true;
                break;
            }
        }

            if (!isFound) {
                System.out.println("Item not found");
            }

            input.close();*/

/*        System.out.println(add(1,2,3,4));
        System.out.println(average(4545,20,412,70));*/

        }

/*        static int add(int... numbersArray){
           int sum = 0;
           for (int number : numbersArray) {
               System.out.println(number);
               sum += number;
           }
           return sum;
        }

        static double average(double... numbersArray) {
        double sum = 0;

        if (numbersArray.length == 0) {
            return 0;
        }

        for (double number : numbersArray) {
            sum += number;
        }
        return sum / numbersArray.length;
        }*/


   /* static void happyBirthday (String name, int age) {
        System.out.println("Happy birthday to you !");
        System.out.printf("Happy birthday dear %s !\n",name);
        System.out.printf("You are %d years old !\n",age);
        System.out.println();
    }
    static void test (String param1) {
        System.out.println(param1);
    }
    static double square(double number) {
        return number * number;
    }
    static double cube(double number) {
        return number * number * number;
    }
    static String getFullName(String first, String last) {
        return first + " " + last;
    }
    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }*/

/*    static String bakePizza(String bread) {
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese) {
        return cheese + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }*/
    }