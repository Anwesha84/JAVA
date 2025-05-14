class animal
{
    private String name;
    private int no;       //no of legs

    public void getName() {
    System.out.println("The name of the animal is: "+name);
    }

    public void setName(String x) {
        name = x;
    }
    public void getno()
    {
        System.out.println("The no of leg is: "+no);

    }

    public void setNo(int n) {
        no = n;
    }
}
class insects extends animal
{
    int wings;
    public void getwings()
    {
        System.out.println("It is a insects");
        System.out.println("They can fly");
        System.out.println("the no of wings: "+wings);
    }

}


public class PB_45_inheritence {
    public static void main(String[] args) {
        animal a =new animal();
        a.setName("cat");
        a.getName();
        a.setNo(4);
        a.getno();

        insects i=new insects();
        i.setName("Butterfly");
        i.getName();
        i.setNo(6);
        i.getno();
        i.wings=2;
        i.getwings();
    }
}
