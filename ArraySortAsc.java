public class ArraySortAsc 
{
 public static void sortarray(int[] a)
 {
    for(int i=0;i<=a.length-1;i++)
    {
        for(int j=i+1;j<=a.length-1;j++)
        {
            int temp = 0;
            if(a[i]>a[j])
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        System.out.println(a[i]);
    }
 }   
 public static void main(String[] args) 
 {
  int[] a ={10,1,5};
  sortarray(a);
 }
}
