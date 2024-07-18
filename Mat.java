import java.util.Arrays;

public class Mat
{
    public static void main(String[] arg)
    {
        int a[]={3,6,4,7,2,9,10};
        int min=a[0];
        int i;
        for(i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);
    }
    /*public static void main(String[] arg)
    {
        int a[]={3,6,4,7,2,9,10};
        int b[]= Arrays.stream(a).sorted().toArray();
        System.out.println(b[0]);
    }
    public static void main(String[] arg)
    {
        int a[]={3,6,4,7,2,9,10};
        System.out.println(Arrays.stream(a).min());
    }*/

}
