class AutoBox2 {
// Take an Integer parameter and return
// an int value;
static int m(Integer v) {
return ++v ; // auto-unbox to int
}
public static void main(String args[]) {
// Pass an int to m() and assign the return value
// to an Integer. Here, the argument 100 is autoboxed
// into an Integer. The return value is also autoboxed
// into an Integer.
Integer iOb = m((int)100.5);
int i=iOb/3;
Integer iob1=iOb/3;
System.out.println("Changed:"+iOb+" "+i+" "+iob1);
}
}