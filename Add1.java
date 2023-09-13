import java.security.DrbgParameters.Reseed;

public class Add1 
{
    public static void add(int a , int b) 
    {
     int res = a + b;
     System.out.println(res);   
    }
    public static void main(String[] args) 
    {
        System.out.println("program starts....");
        add(20,30);
        System.out.println("program ends.....");   
    }
}