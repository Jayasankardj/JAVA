import java.util.Scanner;

public class ReverseString
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String b=s.nextLine();
        for(int i=b.length()-1;i>=0;i--)
        {
            System.out.print(b.charAt(i));
        }
    }
}
