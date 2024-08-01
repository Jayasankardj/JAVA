import java.util.Scanner;

public class SimpleIntrest
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Simple Intrest: ");
        int a=s.nextInt();
        System.out.println("Enter Number of Terms: ");
        int b=s.nextInt();
        System.out.println("Enter Rate of Intrest: ");
        int c=s.nextInt();
        int p=(a*100)/(b*c);
        System.out.println("Principle Amount: "+p);
    }


}
