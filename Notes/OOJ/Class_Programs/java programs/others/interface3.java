interface one
{
  void dis();
}
interface two extends one
{
   void dis1();
}   

class A implements two
{
  public void dis()
  { System.out.println("Inside dis");}
  public void dis1()
  { System.out.println("Inside dis1");}
}

class interface3
{
    public static void main(String s[])
	{
	  A a1= new A();
	  a1.dis();
	  a1.dis1();
	}
}

