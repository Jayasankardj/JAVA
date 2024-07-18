public class Sort
{
    public static void main(String[] args)
    {
        int a[]={5,2,8,4,1};
        int i,j;
        for(i=0;i<a.length;i++)
        {
            for (j=0;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int k=0;k<a.length;k++)
        {
            System.out.print("\t"+a[k]);
        }
    }
}
