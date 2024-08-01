import java.util.Scanner;

public class BinToDec
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int a=s.nextInt();
        String b=Integer.toBinaryString(a);
        String o=Integer.toOctalString(a);
        String h=Integer.toHexString(a);
        System.out.println("Binary Value: "+b);
        System.out.println("Octal Value: "+o);
        System.out.println("Hexal Value: "+h);
    }
}
