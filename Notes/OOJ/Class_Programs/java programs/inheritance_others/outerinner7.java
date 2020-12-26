class outer
{
int x;
void setx()
{x=10;}
void callinner()
{
inner i=new inner();
i.display();
disp();
}

class inner
{int y=10; 
void display()
{
System.out.println("x="+x+" y="+y);
}
}
void disp()
{
System.out.println("x="+x);//+" y="+y);
}
}


class outerinner7
{
	public static void main(String ss[])
	{
		outer ot1= new outer();
		ot1.setx();
		ot1.callinner();
		ot1.disp();
		
	}
	
	
}