import java.util.Scanner;

class IT24103251Lab3Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double monthlySalary, otHours, otRate, otAmount, totalSalary;

        System.out.print("Enter the monthly salary : ");
        monthlySalary = input.nextDouble();

        System.out.print("Enter the number of OT hours : ");
        otHours = input.nextDouble();

        System.out.print("Enter the OT hourly rate : ");
        otRate = input.nextDouble();

        otAmount = otHours * otRate;
        totalSalary = monthlySalary + otAmount;

        System.out.println("OT Amount    : " + otAmount);
        System.out.println("Total Salary : " + totalSalary);
    }
}