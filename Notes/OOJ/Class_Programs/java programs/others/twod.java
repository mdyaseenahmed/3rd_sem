import java.util.Scanner;
class twod
{
	public static void main(String ss[])
	{
		/*int twod1[][]=new int[2][3];
		System.out.println("Enter the 2d array of size 2X3:");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				twod1[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(twod1[i][j]+" ");
			}
			System.out.println();
		}
		int twod2[][]=new int[3][];
		
		
		for(int i=0;i<3;i++)
		{   twod2[i]=new int[i+1];
			System.out.println("Enter "+(i+1)+"elements:");
			for(int j=0;j<i+1;j++)
			{
				twod2[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(twod2[i][j]+" ");
			}
			System.out.println();
		}
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 2d size:");
		int m=s.nextInt();
		int n=s.nextInt();
		int twod3[][]=new int[m][n];
		System.out.println("Enter the 2d array of size 2X3:");
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				twod3[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(twod3[i][j]+" ");
			}
			System.out.println();
		}
		*/
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number of rows:");
		int m=s.nextInt();
		int twod2[][]=new int[m][];
		
		
		for(int i=0;i<m;i++)
		{   System.out.print("Enter Number of columns:");
			int n[]=new int[m];
			n[i]=s.nextInt();
			twod2[i]=new int[n[i]];
			System.out.println("Enter "+n[i]+"elements:");
			for(int j=0;j<n[i];j++)
			{
				twod2[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n[i];j++)
			{
				System.out.print(twod2[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
		