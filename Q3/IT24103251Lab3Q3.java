import java.util.Scanner;

class IT24103251Lab3Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int amount, notes;

        System.out.print("Enter the amount : ");
        amount = input.nextInt();

        notes = amount / 5000;
        System.out.println("5000 Notes - " + notes);
        amount = amount % 5000;

        notes = amount / 1000;
        System.out.println("1000 Notes - " + notes);
        amount = amount % 1000;

        notes = amount / 500;
        System.out.println("500 Notes - " + notes);
        amount = amount % 500;

        notes = amount / 200;
        System.out.println("200 Notes - " + notes);
        amount = amount % 200;

        notes = amount / 100;
        System.out.println("100 Notes - " + notes);
        amount = amount % 100;

        notes = amount / 50;
        System.out.println("50 Notes - " + notes);
        amount = amount % 50;

        notes = amount / 20;
        System.out.println("20 Notes - " + notes);
        amount = amount % 20;

        notes = amount / 10;
        System.out.println("10 Notes - " + notes);
        amount = amount % 10;

        notes = amount / 5;
        System.out.println("05 Notes - " + notes);
        amount = amount % 5;

        notes = amount / 2;
        System.out.println("02 Notes - " + notes);
        amount = amount % 2;

        notes = amount / 1;
        System.out.println("01 Notes - " + notes);
    }
}