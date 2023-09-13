public class Dowhileexample
{
   public static void check(int n) 
 {
    int count = 1;
    do 
    {
        System.out.println(count);
        count++;
    }
    while(count<=n);
}
public static void main(String[] args) 
{
    check(3);
    System.out.println("---------");
    check(1);
}
}