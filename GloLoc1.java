public class GloLoc1 
{
    static int a = 150;
    public static void test()
    {
        int a = 25;
        System.out.println(a);
        System.out.println(GloLoc1.a);
    }
    public static void main(String[] args) 
    {
        test();
    }
}
