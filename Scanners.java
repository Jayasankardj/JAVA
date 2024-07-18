import java.util.Scanner;

public class Scanners
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Type: ");
        char a=s.nextLine().charAt(0);
        String b=s.nextLine();
        int c=s.nextInt();
        double d=s.nextDouble();
        float e=s.nextFloat();
        System.out.println("Values: "+a+" "+b+" "+c+" "+d+" "+e);
    }
}
