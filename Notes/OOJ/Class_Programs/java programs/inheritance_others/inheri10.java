class super1
{
int x;
private int y1;
void set1(){x=1;}
void sety1(int xx){y1=xx;}
void put1()
{System.out.println("SP Class:"+x);}
int puty1()
{return(y1);}
}

class sub1 extends super1
{
int y;
void set2(){x=10;sety1(15);y=20;}
//{set1();y=20;}
void put2(){System.out.println("SB Class:"+x+" "+puty1()+" "+y);}
}

class inheri10
{
public static void main(String xx[])
{
super1 sp1=new super1();
sp1.set1();
sp1.put1();
sub1 sb1=new sub1();
sb1.set2();
sb1.put2();
}

}