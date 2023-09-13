public class commonEnd 
{
    public static boolean comm(int [] a,int [] b)
    {
        if(a[0]==b[0]||a[a.length-1]==b[b.length-1])
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
        int [] a1 = {1,2,3};
        int [] b1 = {0,5,3};
        System.out.println(comm(a1,b1));
        
    }
    
}
