public abstract class Staticmethod
{
    final static int a=10;
    static void add()
    {
        System.out.println("Static method");
    }
    public static void main(String[] args)
    {
        int i=Staticmethod.a;
        System.out.println(i);
        Staticmethod.add();
    }
}
