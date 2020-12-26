package internal;

public class student1
{
 public float cie;
 public void setm(int c)
 {
 cie=c;
 }
 
 public void display()
 {
 System.out.println("CIE:"+cie);
 }
 }
 
 class packdemo17
 {
 public static void main(String s[])
 {
 student1 s1=new student1();
 s1.setm(28);
 s1.display();
 }
 }
 