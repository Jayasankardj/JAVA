final public class Model2
{
    final void add(int a,int b)
    {
        a=6;b=10;
        int c=a+b;
        System.out.println("Add: "+c);
    }
    /*public class Adds extends Model2
    {
        void add(int a,int b)
        {
            a=6; b=5;
            float c=a+b;
            System.out.println("Add: "+c);
        }
    }*/
    public static void main(String[] args)
    {
        Model2 m2 = new Model2();
        m2.add(6,8);
        m2.add(4,3);
    }
}
