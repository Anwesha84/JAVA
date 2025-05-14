class phone
{
    public void ShowTime()
    {
        System.out.println("It is 8.00am");
    }
    public void on()
    {
        System.out.println("Turning on phone....");
    }
}
class Smartphone extends phone{
    public void on()
    {
        System.out.println("Turning on Smartphone....");
    }
    public void PlayMusic()
    {
        System.out.println("Play the music....");
    }
}



public class PB_49_DynamicMethodDispatch {
    public static void main(String[] args) {
        phone nokia=new Smartphone();  //allowed
        //Smartphone nokia=new phone();  //not allowed

        nokia.on();  //will call the method of smartphone as the obj(nokia) is the ref of phone but the object of smartphone)
        nokia.ShowTime();
        //nokia.PlayMusic();   //not allowed as only class phone's methods can be called (syper class methods)

    }
}
