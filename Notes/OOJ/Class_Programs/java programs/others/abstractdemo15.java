abstract class figure
{
int d1,d2;
void figure1(int x,int y)
{d1=x;d2=y;}
abstract void area();
}
class rectangle extends figure
{
 rectangle(int a1,int a2)
 {figure1(a1,a2);}
  
 void area()
 {System.out.println("Area of rectangle:"+(d1*d2));}
}

class triangle extends figure
{
	triangle(int a1,int a2)
	{ figure1(a1,a2);}
	void area()
 {System.out.println("Area of triangle:"+((d1*d2)/2));}
}

class abstractdemo15
{
public static void main(String s[])
{
	rectangle r=new rectangle(10,30);
	r.area();
	triangle t=new triangle(100,300);
	t.area();
	System.out.println("Dynamic method dispatch");
	figure f11=r;
	f11.area();
	f11=t;
	f11.area();
}
}
	
 
 