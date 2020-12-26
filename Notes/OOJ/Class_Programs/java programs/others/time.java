class Time{
	static int min,sec,hour;
	Time(int h,int m,int s){
		min=m;
		hour=h;
		sec=s;
	}
	Time(){
		min=0;
		sec=0;
		hour=0;
		
	}
}
class Timeadd
{
	static Time add(Time x,Time y){
		Time t3=new Time();
		t3.hour = x.hour + y.hour;
		t3.min = x.min + y.min;
		t3.sec = x.sec + y.sec;
		while(t3.hour>24)
			t3.hour-=24;
		while(t3.sec>60){
			t3.min=t3.min+1;
			t3.sec=t3.sec-60;
			}
		while(t3.min>60){
			t3.hour=t3.hour+1;
			t3.min=t3.min-60;
			}
			return t3;
			
			
	}
	
	public static void main(String s[]){
	Time t1 = new Time(1,2,3);
	Time t2 = new Time(1,2,3);
	Time t3 = new Time();
	t3 = add(t1,t2);
	System.out.println(t3.hour+":"+t3.min+":"+t3.sec);
	
	}
	
}