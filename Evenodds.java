import java.util.Scanner;

public class Evenodds
{
    void even()
    {
        System.out.println("Even number");
    }
    void odd()
    {
        System.out.println("Odd number");
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a=s.nextInt();
        Evenodds e=new Evenodds();
        if(a%2==0)
        {
            e.even();
        }
        else
        {
            e.odd();
        }
    }
}
