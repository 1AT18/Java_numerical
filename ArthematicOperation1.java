public class ArthematicOperation1 
{
    
        public static int add(int a,int b)
        {
            int res =(a + b);
            return res;
        }
        public static int sub(int a,int b)
        {
            int res = a - b;
            return res;
        }
        public static int multi(int a,int b)
        {
            int res = a * b;
            return res;
        }
        public static int div(int a,int b)
        {
            int res = a / b;
            return res;
        }
        public static void main(String[] args) 
        {
             System.out.println(add(2,4));
            System.out.println(sub(5,6));
             System.out.println(multi(2,3));
            System.out.println(div(4,5));    
        }
}       

