public class Thisis
{
    int a,b,c;
    int setValues(int a,int b)
    {
        this.a=a;
        this.b=b;
        c=a+b;
        return c;
    }
    int getValues()
    {
        return c;
    }
    public static void main(String ar[])
    {
        Thisis t=new Thisis();
        t.setValues(5,6);
        System.out.println(t.getValues());
    }
}
