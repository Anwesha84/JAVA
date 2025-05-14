
/*class employee
{
    int salary;
    String name;
    public void getSalary()
    {
        System.out.println("The Salary of the employee is "+salary);
    }
    public void getName()
    {
        System.out.println("The name is "+name);
    }
    public void setName(String n)
    {
        name=n;
    }

}
class cellphone
{
    public void ringing()
    {
        System.out.println("ringing........");
    }
}*/

class square
{
    int side;
    public void area()
    {
        float area;
        area=side*side;
        System.out.println("The area is: "+area);
    }
    public void perimeter()
    {
        float perimeter;
        perimeter=4*side;
        System.out.println("The perimeter is: "+perimeter);
    }
}
public class PB_39_classmethodAssignment {
    /*public static void main(String[] args) {
        //prblm1
        employee abj=new employee();
        abj.setName("Sandeep");
        abj.salary=25000;
        abj.getName();
        abj.getSalary();

        cellphone cellie=new cellphone();
        cellie.ringing();


    }*/
    public static void main(String[] args) {
        square ddj=new square();
        ddj.side=9;
        ddj.area();
        ddj.perimeter();
    }
}

