class sup1
{
 int a;
//sup1(){}
/*
sup1(int a1)
{
a=a1;
}

void display()
{
System.out.println("In sup1 a="+a);
}*/
}

class sup2 extends sup1
{
int a;
//sup2(){}
sup2(int a1,int b1)
{
super.a=a1;
a=b1;
}
void display()
{
System.out.println("In sup2 a="+super.a+" "+a);
}
}

class sup3 extends sup2
{
 int a;
//sup3(){}
sup3(int a1,int b1,int c1)
{
super(a1,b1);
a=c1;
}
void display()
{
super.display();
System.out.println("In sup3 a="+a);
}
}

class superuse13
{
public static void main(String ss[])
{
/*sup1 s1= new sup1(5);
s1.display();*/

sup2 s2=new sup2(10,20);
s2.display();
/*
sup3 s3=new sup3(100,200,300);
s3.display();*/

}
}