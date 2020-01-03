/*********************************************************************************
Create an interface SAFE_DRIVING with an interface variable Safe_Speed & a member 
Function Speed_Of_The_Vehicle().

Create a class called drive that implements this interface. Display the Following Messages:

	1. If vehicle Speed is Greater than the Safe_Speed then Display "Drive Slow".
	2. If vehicle Speed is Less than the Safe_Speed then Display "Safe Driving".

***********************************************************************************/

import java.util.*;
import java.io.*;

interface SAFE_DRIVING 
{
    final static int Safe_Speed = 40;
    void Speed_Of_the_Vehicle();
}

class drive implements SAFE_DRIVING
{
    Scanner ip = new Scanner(System.in);
    int speed;
    public void Speed_Of_the_Vehicle()
    {
        System.out.print("Enter The Speed of The Vehicle : ");
        speed = ip.nextInt();
        
        if(speed>Safe_Speed)
        {
            System.out.println("Drive Slow.!");
        }
        else if(speed<=Safe_Speed)
        {
            System.out.println("Safe Driving.!");
        }
    }
}

public class SAFE_DRIVING_DEMO
{
	public static void main(String[] args) 
	{
		drive d = new drive();
		d.Speed_Of_the_Vehicle();
	}
}