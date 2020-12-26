class throwdemo
{
	public static void main(String ss[])
	{
		try
		{
		   System.out.println("Inside main");
		   throw new NullPointerException();
		   //System.out.println("NPE thrown");
		}
		catch(NullPointerException ne)
		{System.out.println("NPE caught");}
	}
}
	
			
		   
