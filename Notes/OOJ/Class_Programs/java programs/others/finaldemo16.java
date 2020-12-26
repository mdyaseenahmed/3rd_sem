class final1
{
int d1,d2;
final void calc(int x,int y)
{d1=x;d2=y; System.out.println("d1="+d1+"d2="+d2+" prod:"+(d1*d2));}

}
final class final2 extends final1
{
 void calc(int a1,int a2)
 {d1=a1;d2=a2;System.out.println("d1="+d1+"d2="+d2+" add:"+(d1+d2));}
  
 void area()
 {System.out.println("Area of rectangle:"+(d1*d2));}
}
class final3 extends final2
{
	final3(int a1,int a2)
	{ d1=a1;d2=a2;}
	void area()
 {System.out.println("Hi");}
}

class finaldemo16
{
public static void main(String s[])
{   final int xx=10;
    xx=20; 
	final1 f1=new final1();
	f1.calc();
	final2 f2=new final2();
	f2.calc();
	
}
}
	
 
 