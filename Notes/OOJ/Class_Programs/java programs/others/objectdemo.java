class obj
{
	 int x;
     obj(int z){x=z;}
	 void display()
	 {
	   System.out.println(x);
	 }
	 public String toString()
	 { return("From toString method:"+x);}
	 
}	 
	 
class objectdemo
{ 
  public static void main(String xx[])
  {
     Object o=new obj(100);
	  System.out.println(o);
	  obj o1=new obj(90);
	  o1.display();
	  //o=o1;
	  System.out.println(o.getClass().getName());
 
