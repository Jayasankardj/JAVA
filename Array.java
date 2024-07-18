import java.util.Arrays;

public class Array
{
    public static void main(String[] args)
    {
        int a[]={5,3,8,6,0};
        int b[]={3,9,1,4,2};
        int c=Arrays.compare(a,b);
        int d=Arrays.mismatch(a,b);
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
