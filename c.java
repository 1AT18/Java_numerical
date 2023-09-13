class a
{
    static int z1=5;
    public static void count()
    {
        System.out.println("count()");
    }
    public static void check()
    {
        System.out.println("check()");
    }
}
class b
{
    public static void test()
    {
        System.out.println("test()");
    }
}
public class c
{
    public static void display()
    {
        System.out.println("display()");
    }
    public static void main(String[] args) 
    {
        display();
        b.test();
        a.count();
        a.check();
        System.out.println(a.z1);
    }
}