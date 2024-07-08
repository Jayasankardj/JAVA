class Overload2
{
void add(int a, int b)
{
a=6;b=5;
int c=a+b;
System.out.println("Sum is: "+c);
}
void add(float a,float b)
{
a=3.7f;b=4.8f;
float c=a+b;
System.out.println("Sum is: "+c);
}

public static void main(String[] ar)
{
Overload2 o1=new Overload2();
o1.add(4,8);
o1.add(3.5f,4.5f);
}
}
