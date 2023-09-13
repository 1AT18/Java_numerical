public class ArrayExample 
{
    public static void main(String[] args) {
        {
            int[] a = {1,2,4,7,8};
            int lastindex = a.length-1;
            int middleindex = (a.length-1)/2;
            System.out.println("lastindex = "+lastindex);
            System.out.println("length = "+a.length);
            System.out.println("middleindex = "+middleindex);
            System.out.println(a[0]);
            System.out.println(a[1]);
            System.out.println(a[2]);
            System.out.println(a[3]);
            System.out.println(a[4]);
            System.out.println(a);
        }
    }
    
}
