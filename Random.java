public class Random
{
    public static void main(String[] args)
    {
        double c=Math.random();
        double d=Math.random();
        if(c==d)
        {
            System.out.println(c+"\n"+d+"\nBoth are Equal");
        }
        else
        {
            System.out.println(c+"\n"+d+"\nBoth are Not Equal");
        }
    }
}
