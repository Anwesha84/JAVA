 abstract  class phone1{
    abstract void switchoff();
    abstract void switchon();
    abstract void Ringtone();
}
class realme extends phone1{
    public void switchoff()
    {
        System.out.println("switching off");
    }
    public void switchon()
    {
        System.out.println("switching on");
    }
    public void Ringtone()
    {
        System.out.println("Hello moto");
    }
}


public class PB_53_AbstractClassAbstMethod {
    public static void main(String[] args) {
           realme pb=new realme();
          // phone1 p=new phone1();    we can not create obj of an abstract cls...error(phone1 is abstract; cannot be instantiated)


           pb.switchon();
           pb.Ringtone();
           pb.switchoff();
    }
}
