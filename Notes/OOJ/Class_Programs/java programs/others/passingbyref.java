class A
{ int a=10;
	public String toString()
	{ return ("a="+a);}
}
	
class autoboxingdemo22
{
public static void main(String sx[])
{
Integer i1=new Integer(100);
Integer i2=new Integer("200");
int i3=i1.intValue();
int i4=i2.intValue();
A a1=new A();
System.out.println(i1+" "+i2+" "+i3+" "+i4+" "+a1);
}
}
