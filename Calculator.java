public class Calculator 
{
    public static void cal(String operator,int num1,int num2)
    {
        switch(operator)
        {
            case "+":System.out.println(num1+num2);break;
            case "-":System.out.println(num1-num2);break;
            case "*":System.out.println(num1*num2);break;
            case "/":System.out.println(num1/num2);break;
            default :System.out.println("invalid");
        }
    }
    public static void main(String[] args) {
        {
        cal("+",2,2);
        cal("-",1, 3);
        cal("*",2,5);
        cal("/",5,5);
        }
    }
}
