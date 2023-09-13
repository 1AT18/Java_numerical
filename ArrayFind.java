public class ArrayFind 
{
    public static void find(int[]a,int element)
    {
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]==element)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) 
    {
        int[] a1={10,20,30,40,50};
        find(a1,10);
        
    }
}
