public class ArrayCopy 
{
    public static void printarray(int[]a)
    {
        int[] res = new int[a.length];
        for(int index=0;index<=a.length-1;index++)
        {
            res[index]=a[index];
            System.out.print(res[index]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int[]a={1,3,4,7};
        printarray(a);   
    }
}
