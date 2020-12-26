class A 
{ private int a;
	A()
	{ System.out.println("A-Default Constructor");}
	A(int x)
	{
		a=x;
	}
	void disp()
	{
		System.out.println("a="+a);
	}
	
}
class B extends A
{   private int b;
	B()
	{ System.out.println("B-Default Constructor");}
	B(int x,int y)
	{
		super(x);
		b=y;
	}
	void disp()
	{	super.disp();
		System.out.println("b="+b);
	}
}	

class C extends B
{   int c;
	C()
	{ System.out.println("C-Default Constructor");}
	C(int x,int y,int z)
	{
		super(x,y);
		c=z;
	}
	void disp()
	{	super.disp();
		System.out.println("c="+c);
	}
}

class multilevel
{
	public static void main(String ss[])
	{
	A a=new A();
	A a1=new A(1);
	a1.disp();
	B b=new B();
	B b1=new B(10,20);
	b1.disp();
	C c=new C();
	C c1=new C(100,200,300);
	c1.disp();
	}

}
