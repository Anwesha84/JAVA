class papri
{
    public papri()
    {
        System.out.println("I am a constructor");
    }
    public papri(int x)
    {
        System.out.println("I am a overloading constructor of animal with value of x : "+x);
    }


}
class arpan extends papri
{
    public arpan()
    {
        System.out.println("I am a derived class constuctor");
    }
    public arpan(int x,int y)
    {
        super(x);
        System.out.println("I am a derived class overloading constuctor of value y: "+y);
    }

}


public class PB_46_constructorINinheritance {
    public static void main(String[] args) {
        papri a=new papri();
        arpan i=new arpan(4,5);

    }
}





