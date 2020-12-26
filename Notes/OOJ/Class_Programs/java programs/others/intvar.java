interface cons
{
  double pi=3.14;
}

class A implements cons
{
   A()
   {
		System.out.println(pi);
		//pi++;
   }

}

class intvar
{
    public static void main(String ss[])
	{
		A a = new A();
	}
}