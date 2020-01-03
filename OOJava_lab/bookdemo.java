/*Create a Class Book Which Contains Four Members: name,author, price,num_pages.Include a constructor to set the Values For The Members.Include methods to set & get The Details Of The Objects. Include a  toString() method That could Display The Complete Details of the Book. Develop a Java Program To Create 'n' Book Objects.*/

import java.util.Scanner;
import java.io.*;

class book
{
	String name,author;
	int n_pages;
	double price;

	Scanner i = new Scanner(System.in);

	book()
	{
		System.out.println("Enter The Book Details : ");
		System.out.println("------------------------------");
		System.out.println("Enter The Book Name  : ");
		name=i.next();
		System.out.println("Enter The Author Name : ");
		author=i.next();
		System.out.println("Enter The Number Of Pages : ");
		n_pages=i.nextInt();
		System.out.println("Enter The Price : ");
		price=i.nextDouble();
	}

	public String toString()
	{
		return ("Name : "+name+"\nAuthor Name : "+author+"\nPages : "+n_pages+"\nPrice : "+price);
	}

	void put_data()
	{
		String str = toString();
		System.out.println(str);
	}
}

class bookdemo
{
	public static void main(String args[])	
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter The Number Of Books : ");
		n = sc.nextInt();
		
		book b[] = new book[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter The Details Of  "+(i+1)+" Book : ");
			System.out.println("----------------------------------------------");
			b[i] = new book();
		}
			
		for(int j=0;j<n;j++)
		{
			System.out.println("----------------------------------------------");
			System.out.println("The Details Of Book "+(j+1)+" is As Follows : ");
			System.out.println("----------------------------------------------");
			b[j].put_data();
		}
	}
}