public class DiagonalMatrix
{
    public static void main(String[] args)
    {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("First Diagonal: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                {
                    System.out.print("\t"+a[i][j]);
                }
            }
        }
        System.out.println("\nSecond Diagonal: ");
        for(int i=0;i<3;i++)
        {
            System.out.print("\t"+a[i][3-i-1]);
        }
    }
}
