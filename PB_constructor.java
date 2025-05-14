class myoffice
{
    private int Id;
    private String name;

    /*public myoffice()
    {
        name="TITAN POWER";
        Id=125;
    }*/
    public myoffice(String myname,int myId)                //with argument another process
    {
        name=myname;
        Id=myId;
    }
    public void getname()
    {
        System.out.println("The name is: "+name);
    }
    public void getId()
    {
        System.out.println(" The Id is: "+Id);
    }

}



public class PB_constructor {
    public static void main(String[] args) {
        myoffice ddj= new myoffice("TITAN POWER",1258);
        ddj.getname();
        ddj.getId();
    }
}

