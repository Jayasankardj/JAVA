import java.util.Scanner;

public class Integers
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of integers to print: ");
        int a=s.nextInt();
        System.out.println("Integers are: ");
        for(int i=0; i<a;i++)
        {
            System.out.println(i);
        }
    }
}
