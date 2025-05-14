class family
{
    int a;
    String name;
    public family()
    {
        System.out.println("It is our family");
    }
    public family(int a)
    {
        this.a=a;
        System.out.println("we have member number: "+a);

        
    }
    public family(String name)
    {
        this.name=name;
        System.out.println("The name of the head is: "+name);
    }
}
class Bhattacharjee extends family
{
    int b;
    public void family()
    {
        System.out.println("It is our Bhattacharjee family");
    }
    public void Bhattacharjee(int b)
    {
        this.b=b;
        System.out.println("we have no of pet cat: "+b);
    }

}

public class PB_practiceWithoutVideo
{
    public static void main(String[] args)
    {
        family ddlj=new family(4);
        Bhattacharjee ppj=new Bhattacharjee();

    }
}
