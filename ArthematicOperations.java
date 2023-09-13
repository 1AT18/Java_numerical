public class ArthematicOperations 
{
    public static void AO(int a,int b)
    {
        int res1 = a - b;
        int res2 = a + b;
        int res3 = a * b;
        int res4 = a / b;
        int res5 = a % b;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
    }
    public static void main(String[] args)
    {
        System.out.println("program starts....");
        AO(11,14);
        System.out.println("program ends");
    }    
}
