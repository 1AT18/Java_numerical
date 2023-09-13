public class evennumber 
{

    public static void number(int n)
    {
        for(int count=1;count<=n;count++)
        {
            if(count%2==0)
            {
                System.out.println("even "+count);
            }
        }
    }
    public static void main(String[] args) 
    {
     number(100);   
    }
    
}
