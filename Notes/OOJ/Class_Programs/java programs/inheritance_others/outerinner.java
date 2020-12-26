class outer
{
int x;
void setx()
{x=10;}
void callinner()
{
inner i=new inner();
i.display();
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
System.out.println("x="+x+" y="+y);
}
}
}