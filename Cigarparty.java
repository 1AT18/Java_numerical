public class Cigarparty 
{
    public static boolean cigarparty (int cigars,boolean isweekend)
    {
        if(isweekend==false && cigars>=40 && cigars<=60)
        {
            return true;
        }
        else if(isweekend==true && cigars>=40)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(cigarparty(30,false));
        System.out.println(cigarparty(50,false));
        System.out.println(cigarparty(70,true));
    }
    
}
