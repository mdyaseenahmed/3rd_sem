class sup11
{
sup11(){System.out.println("In sup11 constructor");}
}

class sup12 extends sup11
{
sup12(){System.out.println("In sup12 constructor");}
}
class sup13 extends sup12
{
sup13(){System.out.println("In sup13 constructor");}
}

class inheri11
{
public static void main(String s[])
{
sup13 s111=new sup13();
}
}