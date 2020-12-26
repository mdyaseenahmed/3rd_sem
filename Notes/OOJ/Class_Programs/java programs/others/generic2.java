class gen1<T,V>
{ T c1;V n1;
void disp(T c,V n)
{
	c1=c;n1=n;
for(int i=0;i<(Integer)n1;i++)
{
System.out.print(c1);
}
System.out.println();
}
void showType() {
System.out.println("The two data types in use are " +
c1.getClass()+" "+n1.getClass()+" "+c1.getClass().getName()+" "+n1.getClass().getName());//.getName());
}
}

class generic2
{
public static void main(String s[])
{
gen1<Character,Integer> g1=new gen1<Character,Integer>();
g1.disp('+',10);
g1.showType();

gen1<String,Integer> g2=new gen1<String,Integer>();
g2.disp("Hi ",10);
g2.showType();
}

}