class super1
{
int x;
private int y;
void setxy(){x=1;y=2;}

void putxy()
{System.out.println("SP Class:"+x+" "+y);}

}

class sub1 extends super1
{
int z;
void setz(){setxy();z=3;}

void putz()
{putxy(); System.out.println("SB Class:"+z);}
}

class inheri10a
{
public static void main(String xx[])
{
super1 sp1=new super1();
sp1.setxy();
sp1.putxy();
sub1 sb1=new sub1();
sb1.setz();
sb1.putz();
}

}