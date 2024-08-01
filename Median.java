import java.util.Scanner;

public class Median
{
    public static void main(String[] args)
    {
        int arr[]= new int[100];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number of Digits: ");
        int y=s.nextInt();
        for(int j=0;j<y;j++)
        {
            System.out.println("Enter Number: ");
            int x=s.nextInt();
            arr[j]=x;
        }
        if(y%2==0)
        {
            int n1=y/2;
            int n2=(y+1)/2;
            System.out.println("Median of Numbers: "+arr[n1-1]+"\t"+arr[n2]);
        }
        else
        {
            int n2=(y)/2;
            System.out.println("Median of Numbers: "+arr[n2]);
        }
    }
}
