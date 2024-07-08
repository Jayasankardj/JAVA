class Maths_ext implements Maths
{
int add(int a,int b)
{
int c=a+b;
System.out.println("Sum: "+c);
}
int sub(int a,int b)
{
int c=a-b;
System.out.println("Sub: "+c);
}
int mul(int a,int b)
{
int c=a*b;
System.out.println("Mul: "+c);
}
int div(int a,int b)
{
int c=a/b;
System.out.println("Div: "+c);
}
public static void main(String[] args)
{
Maths_ext m1=new Maths_ext();
m1.add(10,5);
m1.sub(10,5);
m1.mul(10,5);
m1.div(10,5);
}
}

