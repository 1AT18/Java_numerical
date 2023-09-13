public class AccountReference 
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
        AccountReference a1=new AccountReference();
        a1.showaccountdetails();
        a1.deposit(1000);
        a1.withdraw(100);
        a1.deposit(1);
        AccountReference a2=new AccountReference();
        a2.withdraw(2);
        a2.deposit(5);
        a1.showaccountdetails();
    }
}
