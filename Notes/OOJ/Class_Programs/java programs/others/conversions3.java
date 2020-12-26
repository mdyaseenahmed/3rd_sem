
class conversions3
{
 public static void main(String s[])
 {
   byte b=1;short s1=1000,s2;int i1=100000,i2; long l1=1000000,l2;

   char c='+'; float f1=25.69f,f2; double d1=536987.125,d2;
System.out.println(b+" "+s1+" "+i1+" "+l1+" "+c+" "+f1+" "+d1);

s2=b;i2=s1;
System.out.println(s2+" "+ i2);

f2=(float)d1;i2=(int)l1;
System.out.println(f2+" "+ i2);
b=(byte)i1;
System.out.println(b);


 }
}
