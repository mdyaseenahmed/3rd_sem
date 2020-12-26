class classdemo
{
private int a,b;
int c,d;
classdemo(){}
classdemo(int a1,int b1,int c1,int d1)
{a=a1;b=b1;c=c1;d=d1;}
classdemo(int x)
{a=b=c=d=x;}
void setvalue(int x,int y)
{
a=x;b=y;
}
void printvalue()
{
System.out.println("The values given are \n a="+a+" b="+b+"c="+c+"d="+d);
}
void printvalues(int xx)
{
	System.out.println("There are "+xx+" instance variables:"+"a="+a+" b="+b+"c="+c+"d="+d);
	
}

int sumvalues()
{return (a+b+c+d);}


}

class cdemomain5
{
public static void main(String sw[])
{
classdemo c1= new classdemo();
c1.setvalue(25,50);
c1.c=100;c1.d=200;
c1.printvalue();
System.out.println("The sum is "+c1.sumvalues());
classdemo c2= c1;
c2.c++;c2.d++;
c2.printvalue();
c1.printvalue();

classdemo c3=new classdemo(1,2,3,4);
classdemo c4=new classdemo(80);
c3.printvalue();
c3.printvalues(4);
c4.printvalue();

}


}