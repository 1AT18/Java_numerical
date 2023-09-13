public class ifelseifexample 
{
    public static void check(int num)
    {
        if(num>40)
        {
            System.out.println(num+" is greater than 40");
        }
        else if(num<40)
        {
            System.out.println(num+" is lesser than 40");
        }
        else 
        {
            System.out.println(num+" is equal to 40");
        }
    }
    public static void main(String[] args) 
    {
        check(40);
        check(30);
        check(50);
    }
    
}
