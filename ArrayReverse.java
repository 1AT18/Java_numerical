public class ArrayReverse 
{
    public static void printarray(int[]a)
    {
        for(int index=a.length-1;index>=0;index--)
        {
            System.out.print(a[index]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int[]a={1,2,3,4};
        printarray(a);
    }
    
}
