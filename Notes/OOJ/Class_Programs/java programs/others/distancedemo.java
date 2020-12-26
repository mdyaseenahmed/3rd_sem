/*
Create a class Distance with private instance members feet and inches. Include methods to add the given two distances considering the fact that 12 inches = 1 feet and return back the resultant distance object. Include another method compare which compares and returns the highest among two distance objects.
*/
class Distance
{
  private int feet, inches;
  Distance()
  { feet=0;inches=0;}
  void setDistance(int f, int i)
  {
	feet=f;inches=i;
  }
  void printDistance()
  { System.out.println(feet+" "+inches);}
  Distance compare(Distance d)
  {  Distance temp=new Distance();
     if (feet>d.feet)
	    temp= this;
	else if(feet==d.feet)
	 {     if(inches>d.inches)
		    temp=this;
		  else if (inches<d.inches)
		     temp=d;
		  else
		    {
			  System.out.println("Both distances are equal");
			  System.exit(0);
			}
	  }
	  else
			temp=d;
	return temp;
 }
 
 Distance add(Distance d)
 {
    Distance temp=new Distance();
	temp.feet=feet+d.feet;
	temp.inches=inches+d.inches;
	if(temp.inches>=12.0)
	{
		temp.feet++;
		temp.inches-=12.0;
	}
	return temp;
 }	
}
class distancedemo
{
  public static void main(String s[])
   {
		Distance d1=new Distance();
		Distance d2=new Distance();
		d1.setDistance(10,11);
		d2.setDistance(10,10);
		d1.printDistance();
		d2.printDistance();
		System.out.println("Sum of the two objects:\n");
		Distance d3=d1.add(d2);
		d3.printDistance();
		Distance d4= d1.compare(d2);
		System.out.println("Highest among two objects:\n");
		d4.printDistance();

   }  
}   