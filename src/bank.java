import java.util.Scanner;

public class bank {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {



        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("***************");
            System.out.println("Banking program");
            System.out.println("***************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4) : ");

            choice = input.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
            }
        }


        System.out.println("Thank you ! Have a nice day !");
        input.close();
    }

    static void showBalance(double balance){
        System.out.printf("$%,.2f\n",balance);
    }

    static double deposit() {
        System.out.print("Enter an amount to deposit : ");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        System.out.print("Enter amount to be withdrawn : ");
        double amount = input.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }
}
