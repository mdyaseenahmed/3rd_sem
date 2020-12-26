/*Create a vehicle having non-static data member registration number and price. It also includes a static data member count. Non static member functions setregno( ) and getregno( ) are used to get and set the registration number and the price. A static member function getVehiclecount ( ) is used to return the number of vehicles in the garage. Create an array of n vehicles. Use constructor to increment the vehicle count when a vehicle is created. Include a method to display the registration number of the vehicle with the highest price.*/
import java.util.Scanner;
class vehicle
{
   int regno;
   float price;
   static int count;
   vehicle(){count++;}
   void setregno()
   {
     Scanner s=new Scanner(System.in);
	 regno=s.nextInt();
	 price=s.nextFloat();
	   
   }
   void getregno()
   {
     System.out.println("Details:");
	 System.out.println(regno+" "+price+" ");
   }
  static int getVehiclecount( )
  {
	return count;
  }	  

}

class vehicledemo
{	static vehicle v[];
	 public static void main(String sss[])
	 {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of vehicles:");
		int n=s.nextInt();
		v=new vehicle[n];
		for(int i=0;i<n;i++)
		{
			v[i]=new vehicle();
			v[i].setregno();
					
		}
		System.out.println("The vehicle details are:");
		for(int i=0;i<n;i++)
		{
			v[i].getregno();
					
		}
		 System.out.println(vehicle.getVehiclecount());
		 highestprice(n);
	 }

		 
		static void highestprice(int n)
        {		
		 System.out.println("The details of vehicles with highest price");
		 float p=v[0].price;int ind=0;
		 for(int i=1;i<n;i++)
		 {   if (v[i].price>p)
			{  p=v[i].price;ind=i;}
  		 }
		 System.out.println(v[ind].regno+" "+v[ind].price);
		 
	    }
	 
	 
}