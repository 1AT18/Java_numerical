public class College 
{
    String name = "Akash gowda";
    String usn = "1AT18EC008";
    String schemee = "2018";
    Double cgpa = 6.8;
    String branch = "ECE";
    String yop = "2022";
    static String collegeName = "Atria institute of technology";
    public static void collegeName()
    {
        System.out.println(collegeName);
    }
    public void showstudentdetails()
    {
        System.out.println(name);
        System.out.println(usn);
        System.out.println(cgpa+" cgpa");
        System.out.println(branch);
        System.out.println(schemee+" scheme");
        System.out.println(yop+" yop");
    }
    public void check(double cgpa)
    {
        if(cgpa >= 70)
        {
            System.out.println("first class");
        }
        else
        {
            System.out.println("second class");
        }
    }
    public void updatemarks(double cgp)
    {
        cgpa=cgpa+cgp;
        System.out.println(cgpa);
    }
    public static void main(String[] args) 
    {
        collegeName();
        College a1=new College();
        a1.showstudentdetails();
        a1.updatemarks(1200);
        a1.check(2);
    }
}