public class Greatest
{
    public static void main(String[] args)
    {
        int a=40;
        int b=20;
        int c=30;
        if(a>c || b>c)
        {
           if(a>b)
           {
               System.out.println("A is greatest");
           }
           else if (b>a)
           {
               System.out.println("B is greatest");
           }
        }
        else
        {
            System.out.println("C is greatest");
        }
    }
}
