public class functioncall1
{
    public static void method1() //2
    {
        System.out.println("method1"); //3
        method2(); //4
    }
    public static void method2() //5
    {
        System.out.println("method2"); //6
    }
    public static void main(String[] args) 
    {
    method1();//1
    }

    
}
