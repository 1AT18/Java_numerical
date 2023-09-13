public class StringReverse 
{
    public static void printstring(int[] a1)
    {
        for(int index=a1.length()-1;index>=0;index--)
        {
            System.out.print(a1[index]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int[]a={1,2,3,4};
        printstring(a);
    }   
}
