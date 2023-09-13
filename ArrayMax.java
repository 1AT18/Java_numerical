public class ArrayMax 
{
    public static void maxiii (int[]a)
     {
      int max=a[0];
     {
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
     }
   }    
    public static void main(String[] args) 
    {
        int[] a ={2,4,80,86,7,9};
        maxiii(a);       
    }
}
