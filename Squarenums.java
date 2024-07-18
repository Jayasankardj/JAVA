import java.util.Scanner;

public class Squarenums
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int b=s.nextInt();
        System.out.println("Square Numbers: ");
        for(int i=1;i<=b;i++)
        {
            double d= Math.sqrt(i);
            int in=(int) d;
            if(in==d)
            {
                System.out.print("\t"+i);
                count+=1;
            }
            else
            {
                continue;
            }
        }
        System.out.println("\nCount: "+count);
    }
}

