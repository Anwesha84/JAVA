interface bicycle
{
    void applyBreake(int decrement);
    void speedUp(int increment);
}
interface motorcycle
{
    void BlowHornW();
    void BlowHornP();
}
class Avoncycle implements bicycle,motorcycle
{
    int speed=7;
    void blowhorn()
    {
        System.out.println("Blow the horn");
    }

    @Override
    public void applyBreake(int decrement) {
        speed=speed-decrement;
        System.out.println("Speed before break: "+speed);
    }

    @Override
    public void speedUp(int increment) {
        speed=speed+increment;
        System.out.println("The highest speed is: "+speed);
    }

    @Override
    public void BlowHornP() {
        System.out.println("Main hoin nah po po po po");
    }

    @Override
    public void BlowHornW() {
        System.out.println("Kabhi khushi kabhi gum pe pe pe pe");
    }
}





public class PB_55_interfaces {
    public static void main(String[] args) {
        Avoncycle a=new Avoncycle();
        a.applyBreake(2);
        a.speedUp(7);
        a.blowhorn();
        a.BlowHornW();
        a.BlowHornP();
    }
}
