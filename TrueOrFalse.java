import java.util.Scanner;

public class TrueOrFalse
{
    public static void main(String[] args)
    {
        int a[]={2,4,6,8,0,};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int b=s.nextInt();
        boolean found=false;
        for(int i=0;i<a.length;i++)
        {
            if(b==a[i])
            {
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println("Number in the Array");
        }
        else
        {
            System.out.println("Number not in the Array");
        }
    }
}
