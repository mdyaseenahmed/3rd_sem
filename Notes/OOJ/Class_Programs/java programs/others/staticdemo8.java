class static8
{static int xx=10;
 void callfn()
 {System.out.println("Inside static8-callfn:"+xx);
  staticdemo8.fun1(5,6);
  System.out.println("SD:"+staticdemo8.z);
 }
 /*protected void finalize()
 {System.out.println("Bye");}*/
}


class staticdemo8
{static int z=99;
int x=199;
static void fun1(int a,int b)
{
System.out.println(a+" "+b+" "+z);
}
static
{
  System.out.println("Hello"+z+" "+static8.xx);	
}
public static void main(String s[])
{System.out.println("Inside main method"+z);
fun1(10,20);
static8 s8=new static8();
s8.callfn();

}
static{
	System.out.println("bye");
}

}
