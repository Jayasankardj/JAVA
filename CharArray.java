import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CharArray
{
    public static void main(String[] args)
    {
        String[] a={"JAYA","HEMA","THEJ","KARA","KRIS","CHAI","MANU"};
        Queue l=new LinkedList<>();
        for(int i=0;i<7;i++)
        {
            l.add(a[i]);
        }
        for(int j=0;j<7;j++)
        {
            System.out.println("\nElements after pop: ");
            l.remove();
            System.out.println(l);
        }
    }
}

