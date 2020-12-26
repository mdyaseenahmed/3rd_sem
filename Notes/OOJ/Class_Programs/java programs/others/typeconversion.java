class Conversion 
{
	public static void main(String args[]) 
	{
		byte b=8;
		int i = 257,i1=b;//type conversion
		System.out.println(i1);
		double d = 323.142,d1=i;//type conversion
		System.out.println(d1);
		System.out.println("\nConversion of int to byte.");
		b = (byte) i;//type casting
		System.out.println("i and b " + i + " " + b);
		System.out.println("\nConversion of double to int.");
		i = (int) d;//type casting
		System.out.println("d and i " + d + " " + i);
		System.out.println("\nConversion of double to byte.");
		b = (byte) d;//type casting
		System.out.println("d and b " + d + " " + b);
	}
}
