import java.util.Vector;

public class Vectors
{
    public static void main(String[] args)
    {
        Vector v=new Vector();
        int j=0;
        for(int i=1;i<=10;i++)
        {
            if (i % 2 == 0)
            {
                v.add(i);
                j++;
            }
        }
        System.out.println("Even Numbers: "+v);
        for(int k=1;k<j;k++)
        {
            v.remove(k);
            j--;
        }
        System.out.println("Numbers: "+v);
    }
}
