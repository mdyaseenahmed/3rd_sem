interface i1
{
  void display();
}
interface i2
{
	void display1();
}

class A implements i1
{
  public void display()
  { System.out.println("Hello");}
}

abstract class B implements i1
{
	/*public void display()
	{ System.out.println("Hi");}*/

}

class B1 extends B implements i1,i2
{
	public void display()
	{
		System.out.println("Sub class- for interface1");
	}
	public void display1()
	{
		System.out.println("Sub class-for interface 2");
	}		
}
class interface1 
{
	public static void main(String ss[])
	{
	   i1 i = new A();
	   i1 j = new B1();
	   i.display();
	   j.display();
	   i2 j1 = new B1();
	   j1.display1();
	}
}

	
	   

 