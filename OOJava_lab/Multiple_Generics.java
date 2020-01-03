/*Write a Program To Demonstrate Generics With Multiple Object Parameters.*/

class Gen<T1,T2>
{
    T1 ob1;
    T2 ob2;
    
    Gen(T1 o1,T2 o2)
    {
        ob1 = o1;
        ob2 = o2;
    }
    
    T1 getob1()
    {
        return ob1;
    }

    T2 getob2()
    {
        return ob2;
    }
    
    void showType()
    {
        System.out.println("Type of T1 is : "+ob1.getClass().getName());
        System.out.println("Type Of T2 is : "+ob2.getClass().getName());
    }
}

public class Generics_demo
{
        public static void main(String[] args)
	 {
		Gen<String,Integer> sio1 = new Gen<String,Integer>("Hello",80);
		sio1.showType();
		
		String v1 = sio1.getob1();
		System.out.println("Value 1 : "+v1);

        		int v2 = sio1.getob2();
		System.out.println("Value 2 : "+v2);
		
		Gen<Double,Boolean> ibo1 = new Gen<Double,Boolean>(9.16,false);
		ibo1.showType();
		
		double iv1 = ibo1.getob1();
		System.out.println("Value 1 : "+iv1);
		
		boolean bv1 = ibo1.getob2();
		System.out.println("Value 2 : "+bv1);
	}
}
