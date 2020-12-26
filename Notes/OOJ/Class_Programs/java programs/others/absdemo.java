abstract class base
{ int b;
  base(int x)
  {b=x;}
  abstract void square();
 }

class deri extends base
{
  deri(int y)
  {
    super(y);
  }  
  void square()
  {  System.out.println(b*b);}
 }

class absdemo
{
  public static void main(String[] args) 
    {
	   //base b=new base();
	   deri d=new deri(8);
	   d.square();
	}
} 
  