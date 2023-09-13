public class ArrayMin 
{
    public static void min(int[] a)
    {
    int min=a[0];
    {
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i] < min)
            {
                min=a[i];
            }
        }
        System.out.println(min);
    }
    }
    public static void main(String[] args) 
    {
     int[] a ={2,4,8,7};
     min(a);   
    }
}
