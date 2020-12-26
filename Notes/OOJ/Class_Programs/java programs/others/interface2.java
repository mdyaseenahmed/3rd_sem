interface A
{
  void one();
  interface B
  {
    void two();
  }
}
	
class A1 implements A
{
   public void one()
  { System.out.println("Inside A1");}
   
}

class A2 implements A.B
{
  public void two()
  { System.out.println("Inside A2");}
}

class interface2 
{
   public static void main(String ss[])
   {
		A1 x=new A1();
		A2 y=new A2();
		x.one();
		x.two();
		y.two();
   
   }
}
  
