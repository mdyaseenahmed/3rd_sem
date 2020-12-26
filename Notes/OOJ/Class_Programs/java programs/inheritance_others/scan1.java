import java.util.Scanner;
import java.io.*;
class scan1
{
 public static void main(String s[])throws IOException
 {
   int a=10,b=20;
   System.out.println("a="+a+" b="+b);
   System.out.println("Enter two integers:");
   Scanner x=new Scanner(System.in);
   int x1=x.nextInt();
   int y1=x.nextInt();
   System.out.println("x1="+x1+" y1="+y1);
   int x2=Integer.parseInt(s[0]);
    int y2=Integer.parseInt(s[1]);
    System.out.println("x2="+x2+" y2="+y2);
 }
}
