class gen<T>
{
 T obj;
 gen(T o)
 {obj=o;}
 T retobj()
 { return obj;}
 void printtype()
 { System.out.println("Datatype:"+obj.getClass().getName());}
 }
 class genericdemo23
 {
 public static void main(String ss[])
 {
 gen<Integer> i=new gen<Integer>(290);
 int x=i.retobj();
 System.out.println("x="+x);
 i.printtype();
 
 gen<String> s=new gen<String>("Hello");
 String s1=s.retobj();
 System.out.println("s1="+s1);
 s.printtype();
 }
 }