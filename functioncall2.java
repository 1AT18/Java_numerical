public class functioncall2 
{
    public static void method1()//2
    {
       System.out.println("method1");//3
    }
    public static void method2()//2.1
    {
        System.out.println("method2");//3.1
    }
    public static void main(String[] args) 
    {
     method1();//1
     method2();//1.1
    }
    
}
