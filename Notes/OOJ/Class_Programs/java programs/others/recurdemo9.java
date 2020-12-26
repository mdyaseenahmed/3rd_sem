class recur1
{ 
 int sum(int n)
 {
   if(n==0) return 0;
  int s=n+sum(n-1);
  return s;
 }
}

class recurdemo9
{
public static void main(String s[])
{
 recur1 r1=new recur1();
 int y=r1.sum(6);
 System.out.println(y);
 }
}