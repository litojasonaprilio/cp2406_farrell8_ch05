import java.util.Scanner;
public class AscendingAndDescending
{
    public static void main(String[] args)
    {
        int num1, num2, num3;
        int big, medium, small;

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        num1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter second integer: ");
        num2 = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter third integer: ");
        num3 = input3.nextInt();

        if (num1 >= num2 && num1 >= num3)
        {
            big = num1;
            if (num2 >= num3)
            {
                medium = num2;
                small = num3;
            }
            else
            {
                medium = num3;
                small = num2;
            }
        }
        else if (num2 >= num1 && num2 >= num3)
        {
            big = num2;
            if (num1 >= num3)
            {
                medium = num1;
                small = num3;
            }
            else
            {
                medium = num3;
                small = num1;
            }
        }
        else
        {
            big = num3;
            if (num1 > num2)
            {
                medium = num1;
                small = num2;
            }
            else
            {
                medium = num2;
                small = num1;
            }
        }
        System.out.println("Ascending: \n" + small + "\n" + medium + "\n" + big);
        System.out.println("Descending: \n" + big + "\n" + medium + "\n" + small);
    }
}
