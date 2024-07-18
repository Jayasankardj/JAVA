import java.util.Arrays;

public class Missing
{
    public static void main(String[] args)
    {
        int a[]={1,9,2,8,5,7,4,6,0};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=i)
            {
                System.out.println("Missing Number: "+i);
                break;
            }
        }
    }
}
