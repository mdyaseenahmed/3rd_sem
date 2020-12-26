
class gen<T>
{
T ob;
gen(){}
gen(T t)
{ob=t;}
void setobj(T t1)
{ob=t1;}
T retobj()
{return ob;}
void disp()
{System.out.println("Object:"+ob);

}
}

class generic1
{
public static void main(String s[])
{
gen<Integer> g1=new gen<Integer>(100);
g1.disp();
gen<Integer> g2=new gen<Integer>();//not able to send a generic object compilation error
g2.setobj(250);//
g2.disp();
gen<Integer> g3=new gen<Integer>();
int g31=g2.retobj();
System.out.println("g31:"+g31);
Integer i=new Integer(200);
gen<String> g4=new gen<String>("Hi");
g4.disp();
g3=g4;

}


}