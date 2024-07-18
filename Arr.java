public class Arr
{
    public static void main(String[] arg)
    {
        int i,j;
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+a[i][j]+b[i][j]);
            }
            System.out.println(" ");
        }
    }
}
