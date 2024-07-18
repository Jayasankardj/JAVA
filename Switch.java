import java.util.Scanner;

public class Switch
{
    public static void main(String[] arg)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Select a colour B/R/G/Y : ");
        String color=x.nextLine();
        String c=color.toUpperCase();
        switch (c)
        {
            case "B":
                System.out.println("Blue");
                break;
            case "R":
                System.out.println("Red");
                break;
            case "G":
                System.out.println("Green");
                break;
            case "Y":
                System.out.println("Yellow");
                break;
            default:
                System.out.println("Not the given color");
                break;
        }
    }
}
