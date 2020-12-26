class A
{
  int a;
  A(){}
  A(int x){a=x;}
  void display()
  { System.out.println(a);}
}

class B extends A
{
  int b;
  B(){}
  B(int x,int y)
  {super(x);b=y;}
  void printb()
  { System.out.println(b);}
   void display()
  { System.out.println(a+" "+b);}

}

class dmd
{
  public static void main(String x[])
  {  A a1=new A(100);
	 A a2=new A(200);
     B b1= new B(10,20);
	 a1.display();
	 a2.display();
	 b1.display();
	 a1=a2;
	 a1.display();
	 a1=b1;
	 a1.display();
	 //a1.printb();
	 
   } 
 }
 