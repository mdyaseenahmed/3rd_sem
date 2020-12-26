class sup1
{
 int a;
//sup1(){}
sup1(int a1)
{
a=a1;
}
void display()
{
System.out.println("In sup1 display a="+a);
}
}
class sup2 extends sup1
{
 int b;
//sup2(){}
sup2(int a1,int b1)
{
super(a1);
b=b1;
}
void display()
{
System.out.println("In sup2 display a="+a+"b="+b);
}
}
class sup3 extends sup1
{
 int c;
//sup3(){}
sup3(int a1,int c1)
{
super(a1);
c=c1;
}
void display()
{

System.out.println("In sup3 display a="+a+" c="+c);
}
}
class dynmethod14
{
public static void main(String ss[])
{
sup1 s1=new sup1(10);
sup2 s2=new sup2(100,200);
sup3 s3=new sup3(1000,2000);
sup1 s4;
s4=s1;
System.out.println("s1 a="+s4.a);

s4.display();
s4=s2;
System.out.println("s2 a="+s4.a);
//System.out.println("s2 b="+s4.b);
s4.display();
s4=s3;
s4.display();
}
}