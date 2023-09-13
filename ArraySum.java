public class ArraySum
{
    public static void printarray(int[] a)
    {
        for(int index=0;index<=a.length-1;index++)
        {
            System.out.print(a[index] + " ");
        }
    }
    public static void main(String[] args) 
    {
        int[] a ={1,2,3,4,5};
        printarray(a);
    }   
}