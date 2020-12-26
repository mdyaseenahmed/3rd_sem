class classdemo
{
private int a,b;
int c,d;
void setvalue(int x,int y)
{
a=x;b=y;
}
void printvalue()
{
System.out.println("The values given are \n a="+a+" b="+b+"c="+c+"d="+d);
}

}

class cdemomain4
{
public static void main(String sw[])
{
classdemo c1= new classdemo();
c1.setvalue(25,50);
c1.c=100;c1.d=200;
c1.printvalue();
}


}