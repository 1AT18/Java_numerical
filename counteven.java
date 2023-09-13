public class counteven 
{
    public static void check(int[] a)
    {
        int count=0;
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]%2==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) 
    {
        int []a={1,4,2,5,6};
        check(a);
    }
}
