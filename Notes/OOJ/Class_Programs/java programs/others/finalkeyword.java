class A
{
	int x,y;
	void setdata()
	{
	   x=10;y=20;
	}
	final void display()
	{ 
		System.out.println(x+" "+y);
	}
}

final class B extends A
{int z;
  void setdata()
  {
    x=1;y=2;z=3;
  }
  void display()
  {
	System.out.println(x+" "+y+" "+z);
  }	
}

class C extends B
{}
class D
{
	public static void main(String ss[])
	{	final int xx=100;
			A a=new A();
			a.setdata();
			a.display();
			xx++;
			B b = new B();
			b.setdata();
			b.display();
	}
}