class AutoBox4 {
public static void main(String args[]) {
Integer iOb = 100;
Double dOb = 98.6;
iOb = (Integer)dOb + iOb;
System.out.println("iOb after expression: " + iOb);
}
}