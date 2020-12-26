class classdemo
{
private int a,b;
int c,d;
classdemo(){}
classdemo(classdemo x1){a=x1.a;b=x1.b;}
classdemo(int a1,int b1,int c1,int d1)
{a=a1;b=b1;c=c1;d=d1;}
classdemo(int x)
{a=b=c=d=x;}
void setvalue(int x,int y)
{
a=x;b=y;x++;y++;
}
void setvalueref(int xxx[])
{
a=xxx[0];b=xxx[1];xxx[1]++;xxx[0]++;
}
void printvalue()
{
System.out.println("The values given are \n a="+a+" b="+b+"c="+c+"d="+d);
}
void printvalues(int xx)
{
	System.out.println("There are "+xx+" instance variables:"+"a="+a+" b="+b+"c="+c+"d="+d);
	
}
/*
int printvalues(int xx)
{
	System.out.println("There are "+xx+" instance variables:"+"a="+a+" b="+b+"c="+c+"d="+d);
	return (100);
	
}
*/
int sumvalues()
{return (a+b+c+d);}
void objpass(classdemo x)
{a=x.a;x.a++;
 b=x.b;x.b++;
 c=x.c;x.c++;d=x.d;x.d++;}
}

class funcparademo6
{
public static void main(String sw[])
{
classdemo c1= new classdemo();
c1.printvalue();
int xxx[]={1,2,3,4};
int x=100,y=200;

c1.setvalue(x,y);
System.out.println("x="+x+" y="+y);
//c1.setvalueref(x,y);
System.out.println("after ref x="+x+" y="+y);
c1.setvalueref(xxx);
System.out.println("Array values after function call:"+xxx[0]+ " "+ xxx[1]);
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
c3.objpass(c4);
System.out.println("c3 object values:");
c3.printvalue();
System.out.println("c4 object values:");
c4.printvalue();
classdemo c5=new classdemo(c3);
c5.printvalue();
int xx=c5.printvalues(50);
System.out.println(xx);

}


}