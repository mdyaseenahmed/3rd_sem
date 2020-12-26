//import java.io.Console;
class stack
{
	int stck[];
	int tos;
	int size;
	stack(int n)
	{  
	   tos=-1;
	   size=n;
	   stck=new int[size];
	}
	stack(){}
	void push(int x)
	{ 
	  if (tos<size)
	     stck[++tos]=x;
	  else
	     System.out.println("Stack overflow\n");
	}
	int pop()
	{ if(tos>=0)
		return stck[tos--];
	  else
	  { System.out.println("Stack underflow\n");  return -1;}
	 
	}
	void display()
	{ if (tos>=0)
		for(int i=0;i<tos;i++)
		{
		  System.out.println(stck[i]);
		
		}
	}
}

class stackdemo
{
	public static void main(String ss[])
	{
	   stack s= new stack(3);
	   s.push(10);
	   s.push(20);
	   s.push(30);
	   s.push(40);
	   System.out.println(s.pop());
	   System.out.println(s.pop());
	   System.out.println(s.pop());
	   System.out.println(s.pop());
	}

}