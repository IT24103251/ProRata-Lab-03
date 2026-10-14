import java.util.Scanner;

class IT24103251Lab3Q1B
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double price, quantity, amount, discount, finalAmount;

        System.out.print("Enter the price of 1kg of rice : ");
        price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy : ");
        quantity = input.nextDouble();

        amount = price * quantity;
        discount = amount * 10 / 100;
        finalAmount = amount - discount;

        System.out.println("Total amount           : " + amount);
        System.out.println("Discount (10%)         : " + discount);
        System.out.println("Amount you have to pay : " + finalAmount);
    }
}