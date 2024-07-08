class Overload
{
void add(int a, int b)
{
a=6;b=5;
int c=a+b;
System.out.println("Sum is: "+c);
}
void add(int a,int b,int c)
{
a=9;b=7;c=4;
int d=a+b+c;
System.out.println("Sum is: "+d);
}

public static void main(String[] ar)
{
Overload o1=new Overload();
o1.add(4,8);
o1.add(2,4,6);
}
}
