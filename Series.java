public class Series
{
    public static void main(String[] args)
    {
        int a[]={1,5,11,19};
        for(int j=0;j<a.length;j++ )
        {
            for(int i=1; i<20 ;i+=2)
            {
                if(i==a[j])
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print("\t"+i);
                }
            }
            break;
        }
    }
}
