class inheritence 
{
    void add(int a, int b) 
    {
        int c = a + b;
        System.out.println("SUM OF TWO NUMBERS IS (int) : " + c);
    }
    
    void add(double a, double b) 
    {
        double d = a + b;
        System.out.println("SUM OF TWO NUMBERS IS (double) : " + d);
    }
}

class Subclass extends inheritence 
{
    void add(int a, int b) 
    {
        int c = a + b;
        System.out.println("Overridden method: SUM OF TWO NUMBERS IS (int) : " + c);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        inheritence o1 = new inheritence();
        Subclass o2 = new Subclass();
        
        o1.add(15, 3);
        o1.add(5.4, 9.2);
        
        o2.add(4, 9);
        o2.add(6.5, 7.3);
    }
}