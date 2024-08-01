import java.util.Scanner;

public class Vowels
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String b=s.nextLine();
        int j=0;
        int k=0;
        for(int i=0;i<b.length();i++)
        {
            if(b.charAt(i)=='a' || b.charAt(i)=='e' || b.charAt(i)=='i' || b.charAt(i)=='o' || b.charAt(i)=='u')
            {
                k+=1;
                continue;
            }
            else
            {
                j+=1;
                System.out.print(b.charAt(i));
            }
        }
        /*System.out.println("\nNumber of Vowels in string is : "+k);
        System.out.println("Number of Constants in string is : "+j);*/
    }
}
