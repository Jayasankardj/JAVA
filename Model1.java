public class Model1 implements Maths
{
    public int add(int a,int b)
    {
        int c=a+b;
        System.out.println("Sum: "+c);
        return c;
    }
    public int sub(int a,int b)
    {
        int c=a-b;
        System.out.println("Sub: "+c);
        return c;
    }
    public int mul(int a,int b)
    {
        int c=a*b;
        System.out.println("Mul: "+c);
        return c;
    }
    public int div(int a,int b)
    {
        int c=a/b;
        System.out.println("Div: "+c);
        return c;
    }
    public static void main(String[] args)
    {
        Maths m1=new Model1();
        m1.add(10,5);
        m1.sub(10,5);
        m1.mul(10,5);
        m1.div(10,5);
    }
}
