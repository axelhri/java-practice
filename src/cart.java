import java.util.Scanner;

public class cart {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What item would you like to buy ? : ");

        String item = input.nextLine();

        System.out.print("What is the price for each ? : ");

        int price = input.nextInt();

        System.out.print("How many would you like ? : ");

        int quantity = input.nextInt();

        double totalPrice = price * quantity / 100.0;

        if (quantity > 1 ) {
            System.out.print("You have bought " + quantity + ' ' + item + "/s" + "\nYour total is " + "$" + totalPrice);
        } else {
            System.out.print("You have bought " + quantity + ' ' + item + "\nYour total is " + "$" + totalPrice);
        }




        input.close();

    }
}
