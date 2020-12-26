interface i1
{
void disp();
}

class A implements i1
{
public void disp()
{
 System.out.println("In A");
}
}
class B implements i1
{
public void disp()
{
 System.out.println("In B");
}
}
class interref21
{
public static void main(String s[])
{
i1 ii;
ii= new A();
ii.disp();
ii=new B();
ii.disp();
}
}
 