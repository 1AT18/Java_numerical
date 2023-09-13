public class ArrayDuplicate 
{
 public static void duplicate(int[] a)
 {
    for(int i=0;i<a.length;i++)
    {
        for(int j=i+1;j<=a.length-1;j++)
        {
            if(a[i]==a[j])
            {
                System.out.println(a[j]);
            }
        }
    } 
 }   
 public static void main(String[] args) 
 {
  int[] a1 ={2,3,4,5,2,7};
  duplicate(a1);   
 }
}
