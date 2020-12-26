public class Test3
{ 
    public static void main(String[] args) 
    { 
        Object obj = new String("GeeksForGeeks"); 
        Class c = obj.getClass(); 
        System.out.println("Class of Object obj is : "
                           + c.getName()); 
    } 
} 