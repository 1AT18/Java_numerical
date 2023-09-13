public class StringLasthalf 
{
    public static void main(String[] args) 
    {
        String S = "AKASH";
        for(int i=S.length();i>=(S.length()-1)/2;i++)
        {
            System.out.println(S.charAt(i));
        }
    }
}
