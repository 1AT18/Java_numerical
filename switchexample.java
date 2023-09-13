public class switchexample 
{
    public static void check(char option)
    {
       switch(option)
       {
          case 'A' :System.out.println("option a is selected");
          break;
          case 'B' :System.out.println("option b is selected");
          break;
          case 'C' :System.out.println("option c is selected");
          break;
          case 'D' :System.out.println("option d is selected");
          break;
          default:System.out.println("invalid option");
        }
    }

}

public static void main(String[] args)
{
    check('A' )
    check('2' )
    check('D' )
}
