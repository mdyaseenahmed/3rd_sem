class sup1
{
private int a;
//sup1(){}
sup1(int a1)
{
a=a1;
}
void display()
{
System.out.println("a="+a);
}
}
class sup2 extends sup1
{
private int b;
//sup2(){}
sup2(int a1,int b1)
{
super(a1);
b=b1;
}
void display()
{
super.display();
System.out.println("b="+b);
}
}
class sup3 extends sup2
{
private int c;
//sup3(){}
sup3(int a1,int b1,int c1)
{
super(a1,b1);
c=c1;
}
void display()
{
super.display();
System.out.println("c="+c);
}
}
class superdemo12
{
public static void main(String ss[])
{
	sup2 s2=new sup2(1,2);
	s2.display();
sup3 s3=new sup3(10,20,30);
s3.display();
}
}