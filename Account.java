public class Account 
{
    String name = "malya";
    long accno = 2427180003714L;
    String ifsc = "SBI0420";
    String branch = "BTR";
    double bal = 0.0;
    static String bankname = "SBI";
    public static void showbankName()
    {
        System.out.println(bankname);
    }
    public void showaccountdetails()
    {
        System.out.println(name);
        System.out.println(accno);
        System.out.println(ifsc);
        System.out.println(branch);
    }
    public void deposit(double amt)
    {
        bal=bal+amt;
        System.out.println(bal);
    }
    public void withdraw(double amt)
    {
        if(bal>amt)
        {
            bal=bal-amt;
            System.out.println(bal);
        }
        else
        {
            System.out.println("insufficient balance");
        }
    }
    public static void main(String[] args) 
    {
        new Account().showaccountdetails();
        new Account().deposit(2450);
        new Account().withdraw(14);
        new Account().showbankName();
    }
}