class lev0
{
	int a;
	void seta(int x)
	{ a=x;}
	void puta()
	{ System.out.println(a);}
}
class lev1 extends lev0
{
	int b;
	void setb(int x)
	{ b=x;}
	void putb()
	{ System.out.println(b);}
}

class inhemain
{
	public static void main(String s[])
	{
	lev0 l1=new lev0();
	l1.seta(1);
	l1.puta();
	
	lev1 l2=new lev1();
	l2.seta(10);
	l2.setb(20);
	l2.puta();
	l2.putb();
	}
}