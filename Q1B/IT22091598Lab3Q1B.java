import java.util.Scanner;

public class IT22091598Lab3Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter the number of kilograms: ");
        double kilograms = input.nextDouble();

        double total = price * kilograms;
        double discount = total * 0.10;
        double amountToPay = total - discount;

        System.out.println("Total bill: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Amount to pay after discount: " + amountToPay);

        input.close();
    }
}