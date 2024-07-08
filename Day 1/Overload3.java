class Overload3
{
void add(int a, float b)
{
a=6;b=4.3f;
float c=a+b;
System.out.println("Sum is: "+c);
}
void add(float a,int b)
{
a=2.6f;b=7;
float c=a+b;
System.out.println("Sum is: "+c);
}

public static void main(String[] ar)
{
Overload3 o1=new Overload3();
o1.add(3,5.5f);
o1.add(3.3f,5);
}
}
