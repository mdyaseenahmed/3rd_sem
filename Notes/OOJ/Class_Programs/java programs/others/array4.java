class obj
{
int x,y;
void display(int i){x=20+i;y=30+i;System.out.println(x+" "+y);}	
}	
class array4
{
 public static void main(String s[])
 {
   int a1[]={1,2,3};
   int a2[];
   a2=new int[5];
   for(int i=0;i<5;i++)
   {
    a2[i]=Integer.parseInt(s[i]);
   }
   obj o[]=new obj[10];
   for(int i=0;i<3;i++)
   {
	    o[i]=new obj();
		o[i].display(i);
   }
   
     

 }
}
