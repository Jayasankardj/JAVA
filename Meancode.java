import java.util.Scanner;

public class Meancode
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Range of string: ");
        int a=s.nextInt();
        float sum=0;
        for (int i=0;i<a;i++)
        {
            int y=i+1;
            System.out.println("Enter "+y+" number: ");
            int x=s.nextInt();
            sum+=x;
        }
        float mean=sum/a;
        System.out.println("Mean of the values are: "+mean);
    }
}
