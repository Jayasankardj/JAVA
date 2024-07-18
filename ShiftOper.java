public class ShiftOper
{
    public static void main(String[] args)
    {
        int a[]={2,5,7,8,3};
        int b[]={1,4,6,9,0};
        int d=5;
        int c=d<<2;
        for (int i=0;i<a.length;i++)
        {
           int  i1= a[i] << 2;
           System.out.println(i1);
        }
    }
}
