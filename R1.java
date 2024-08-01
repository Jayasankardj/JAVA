abstract class Abstract
{
    String ConcreteMethod1(String fname, String lname)
    {
        fname="JAYA SANKAR";
        lname="REDDY";
        return fname+lname;
    }
    void ConcreteMethod2(int age, long phn)
    {
        age=19;
        phn=630246882;
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+phn);
    }
    abstract void AbstractMethod();
}
public class R1 extends Abstract
{
    void AbstractMethod()
    {
        System.out.println("Abstract Method");
    }
    public static void main(String[] args)
    {
        R1 obj=new R1();
        obj.ConcreteMethod1("HEMANTH", "K");
        obj.ConcreteMethod2( 19, 984833625);
        obj.AbstractMethod();
    }
}
