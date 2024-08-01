import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int a[]={1,3,5,7,9,2,4,6,8};
        int i= Arrays.binarySearch(a,5);
        System.out.println("Index of Element 5 is: "+i);
        int[] j=Arrays.copyOf(a,5);
        System.out.print("Original Array is: ");
        for(int x=0;x<a.length;x++)
        {
            System.out.print("\t"+a[x]);
        }
        System.out.print("\nCopy of Array is: ");
        for(int x=0;x<j.length;x++)
        {
            System.out.print("\t"+j[x]);
        }

    }
}
