class i1
{
void disp(){System.out.println("hi");}
public interface i2
{
 void disp1();
}
}

class A implements i1.i2
{
public void disp1()
{
 System.out.println("hello");
}
}
class nestedinter20
{
public static void main(String s[])
{
A a1= new A();
a1.disp1();
i1 i=new i1();
i.disp();
}
}
 