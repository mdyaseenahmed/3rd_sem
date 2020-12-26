class personal
{
	String name;
	int age;
	
	personal()
	{ 
	  name=new String();
	  age=0;
	}
	personal(String xx,int yy)
	{ 
	  name=xx;
	  age=yy;
	}
	void setdata(String xx,int yy)
	{
		name=xx;
		age=yy;
	}
	void putdata()
	{
		System.out.println(name+" "+age);
	}
}

class student extends personal
{
	double cgpa;
	
	student()
	{ }
	student(String xx,int yy,double cgpa1)
	{ super(xx,yy);
	  cgpa=cgpa1;
	}
	void setdata(String xx,int yy,double cgpa1)
	{	name=xx;
		age=yy;
		cgpa=cgpa1;
	}
	void putdata()
	{	
		System.out.println("name:"+name+" age:"+age+" cgpa:"+cgpa);
	}
}

class faculty extends personal
{
	int no_publn;
	
	faculty()
	{ }
	faculty(String xx,int yy,int publn)
	{ super(xx,yy);
	  no_publn=publn;
	}
	void setdata(String xx,int yy,int publn)
	{	name=xx;
		age=yy;
		no_publn=publn;
	}
	void putdata()
	{	
		System.out.println("name:"+name+" age:"+ age+" publn:"+no_publn);
	}
}

class hierarchial
{
	public static void main(String ss[])
	{
		student s1=new student();
		s1.setdata("xxx",20,9.7);
		s1.putdata();
		faculty f1=new faculty();
		f1.setdata("yyy",40,5);
		f1.putdata();
	}
	
}