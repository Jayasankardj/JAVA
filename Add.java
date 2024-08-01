import java.util.Scanner;

public class Add
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a="120467";
        char[] d=a.toCharArray();
        char max= d[0];
        for(char digit : d)
        {
            if(digit>max)
            {
                max=digit;
            }
        }
        System.out.println("Maximum Number: "+max);
    }
}
