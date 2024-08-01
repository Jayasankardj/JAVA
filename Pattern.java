import java.util.Scanner;

public class Pattern
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a=s.nextInt();
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("\t"+i);
            }
            System.out.print("\n");
        }

    }
}
