import java.util.Scanner;

class IT24103251Lab3Q1A
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double price, quantity, amount;

        System.out.print("Enter the price of 1kg of rice : ");
        price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy : ");
        quantity = input.nextDouble();

        amount = price * quantity;

        System.out.println("Amount you have to pay : " + amount);
    }
}