// A simple generic class.
// Here, T is a type parameter that
// will be replaced by a real type
// when an object of type Gen is created.
class Gen<T><T1> {
T ob1;T1 ob2; // declare an object of type T
// Pass the constructor a reference to
// an object of type T.
Gen(T o1,T1 o2) {
ob1 = o1;ob2 = o2;
}
// Return ob.
void  getob() {
	T ob3;
	ob3=ob1;ob1=ob2;ob2=ob3;
#return (ob3);
}
// Show type of T.
void showType() {
System.out.println("Type of T is " +
ob.getClass().getName());
}
}
// Demonstrate the generic class.
class GenDemo1 {
public static void main(String args[]) {
// Create a Gen reference for Integers.
Gen<Integer> iOb;
// Create a Gen<Integer> object and assign its
// reference to iOb. Notice the use of autoboxing
// to encapsulate the value 88 within an Integer object.
iOb = new Gen<Integer>(88,100);
// Show the type of data used by iOb.
iOb.showType();
// Get the value in iOb. Notice that
// no cast is needed.
int v = iOb.getob();
System.out.println("value: " + v);
System.out.println();
// Create a Gen object for Strings.
Gen<String> strOb = new Gen<String> ("Generics Test"," Passed");
// Show the type of data used by strOb.
strOb.showType();
// Get the value of strOb. Again, notice
// that no cast is needed.
String str = strOb.getob();
System.out.println("value: " + str);
}
}