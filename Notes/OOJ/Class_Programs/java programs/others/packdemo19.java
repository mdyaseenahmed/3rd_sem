import internal.*;
import semend.*;


class packdemo19
{
public static void main(String s[])
{
internal.student1 s1= new internal.student1();
semend.student1 s2=new semend.student1(); 
s1.setm(30);
s2.setm(25);
s1.display();
s2.display();
System.out.println("Total Marks:"+(s1.cie+s2.see));
}
}

