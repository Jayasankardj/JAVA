import java.util.Scanner;

public class Index
{
    public static void main(String[] args)
    {
        int a[]={5,2,8,4,1};
        int i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Elements: ");
        int x=s.nextInt();
        int y=s.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(a[i]==x)
            {
                System.out.println("Index of "+x+" Element is "+i);
            }
        }
        for(j=0;j<a.length;j++)
        {
            if(a[j]==y)
            {
                System.out.println("Index of "+y+" Element is "+j);
            }
        }
    }

}
