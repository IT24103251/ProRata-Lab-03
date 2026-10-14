import java.util.Scanner;

class IT24103251Lab3Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number, d1, d2, d3, d4, d5;

        System.out.print("Enter a five digit number : ");
        number = input.nextInt();

        d1 = number / 10000;
        d2 = number / 1000 % 10;
        d3 = number / 100 % 10;
        d4 = number / 10 % 10;
        d5 = number % 10;

        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
    }
}