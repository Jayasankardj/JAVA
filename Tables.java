import java.util.Scanner;

public class Tables
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        j=s.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(j+" X "+i+" = "+i*j);
        }
    }
}
