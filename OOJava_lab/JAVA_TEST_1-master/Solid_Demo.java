/*
Create a class Solid that defines the abstract member functions Calculate_area() and Calculate_volume(). The class Solid will be extended by cylinder, cone and sphere classes. 

1. Cylinder: Volume: 2πrh, Surface area: 2πrh +πr2
2. Cone: Volume: πr2h/3 Surface area: πr(r+√h2+r2) 
3. Sphere: Volume: (4/3) πr3  Area: 4 πr2
Show that the reference variable of Solid class can invoke the member functions Calculate_area() and Calculate_volume().
*/

import java.util.Scanner;
import java.lang.*;

abstract class Solid
{
    abstract void Cal_Area();
    abstract void Cal_Volume();
}

class Cylinder extends Solid
{
    int r,h;
    Scanner ip = new Scanner(System.in);
    
    void set_data()
    {
        System.out.print("Enter The Radius Of The Cylinder : ");
        r = ip.nextInt();
        System.out.print("Enter The Height Of The Cylinder : ");
        h = ip.nextInt();
    }
    
    public void Cal_Area()
    {
        System.out.println("Surface Area Of The Cylinder : "+((2*3.142*r*h)+(3.142*r*r))); //Surface area: 2πrh +πr2
    }
    
    public void Cal_Volume()
    {
        System.out.println("Volume Of The Cylinder is : "+(2*3.142*r*h)); //Volume: 2πrh
    }
}

class Cone extends Solid  
{
    int r,h;
    Scanner ip = new Scanner(System.in);
    void set_data()
    {
        System.out.print("Enter The Radius Of The Cone : ");
        r = ip.nextInt();
        System.out.print("Enter The Height Of The Cone : ");
        h = ip.nextInt();
    }
    
    public void Cal_Area()
    {
        System.out.println("Surface Area Of Cone : "+((3.142*r*r*h)/3));     //Surface area: πr(r+√h2+r2) 
    }
    
    public void Cal_Volume()  
    {
        double vol = (3.142*r)*(r+Math.sqrt(h*h)+r*r);
        System.out.println("Volume Of Cone : "+vol); ////Volume: πr2h/3
    }
}

class Sphere extends Solid
{
    int r;
    Scanner ip = new Scanner(System.in);
    void set_data()
    {
        System.out.print("Enter The Radius Of The Sphere : ");
        r = ip.nextInt();
    }
    
    public void Cal_Area()
    {
        System.out.println("Surface Are Of the Sphere : "+(3.142*r*r*r)); //Area: 4 πr2
    }
    
    public void Cal_Volume()
    {
        System.out.println("Volume Of Sphere : "+(4*3.142*r*r)); //Volume: (4/3) πr3
    }
}

public class Solid_Demo
{
	public static void main(String[] args) {
	    
	    Scanner ip = new Scanner(System.in);
	    Cylinder cy = new Cylinder();
	    Cone Co = new Cone();
	    Sphere Sp = new Sphere();
	    int ch;
	    do
        {
            System.out.println("---------------------");
		    System.out.print("The Choices Are : \n");
		    System.out.print("---------------------");
		    System.out.print("\n1. Surface Area Of Cylinder.\n2. Volume Of Cylinder.\n3. Surface Area Of Cone.\n4. Volume Of Cone.");
		    System.out.print("\n5. Surface Area Of Sphere.\n6. Volume Of Sphere.\n7. Exit.\nEnter Your Choice : ");
		    ch = ip.nextInt();
		    
		    switch(ch)
		    {
		        case 1 : cy.set_data();
		                 cy.Cal_Area();
		                 break;
		                 
		        case 2 : cy.set_data();
		                 cy.Cal_Volume();
		                 break;
		                 
		        case 3 : Co.set_data();
		                 Co.Cal_Area();
		                 break;
		                 
	            case 4 : Co.set_data();
	                     Co.Cal_Volume();
	                     break;
	                     
                case 5 : Sp.set_data();
                         Sp.Cal_Area();
                         break;
                         
                case 6 : Sp.set_data();
                         Sp.Cal_Volume();
                         break;
                         
                case 7 : System.exit(0); 
                         break;
                         
                default : System.out.println("Invalid Choice.!");         
		    }
	    }while(ch!=7);
    }
}
