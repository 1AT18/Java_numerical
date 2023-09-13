public class Dec
 {
  public static void main(String[] args)
  {
    int a = 12;
    int b = 17;
    int res = a + b + --a + a-- + b-- + --b + 10;
    System.out.println(res);
    System.out.println(a);
    System.out.println(b);
  }  
}
