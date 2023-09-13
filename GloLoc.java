public class GloLoc 
{
    static int a;
    public static void test(int b)
    {
        int c = 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void main(String[] args) 
    {
        test(11);
        System.out.println(a);
    }
}
