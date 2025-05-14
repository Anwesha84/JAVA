
class food
{
    int amount;
    int salary;
    String name;
    public void details()
    {
        System.out.println("name is "+name);
        System.out.println("amount is "+amount);
    }
    public void getsalary()
    {
        System.out.println("salary is "+salary);
    }
}


public class PB_38_custom_class {
    public static void main(String[] args) {
        food biriyani=new food();
        food employee=new food();
        biriyani.amount=400;
        biriyani.name="mutton biriyani";
       /* System.out.println(biriyani.amount);
        System.out.println(biriyani.name);*/
        biriyani.details();

        employee.name="prithish";
        employee.salary=12000;
        employee.details();
        employee.getsalary();

    }
}
