public class ifelseexample
{
    public static void check(int num) 
    {
        if (num<40)
        {
            System.out.println(num+"is lesser than 40");
        }
        else
        {
            System.out.println(num+"is greater than 40");
        }
    }
    public static void main(String[] args) {
        check(41);
        check(32);
    }
}
