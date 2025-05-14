class MyEmployee
{
    private int salary;
    private String name;
    public MyEmployee()
    {
        salary=10000;
        name="Employee Name";
    }
    public MyEmployee(String Name,int SALARY)
    {
        name=Name;
        salary=SALARY;
    }
    public MyEmployee(String put)
    {
        name=put;
        salary=30000;
    }
    public void getname()
    {
        System.out.println("The name is: "+name);
    }
    public void getsalary()
    {
        System.out.println("The salry is: "+salary);
    }
}


public class PB_constructorPrac {
    public static void main(String[] args) {
        MyEmployee employee= new MyEmployee();
                employee.getname();
        employee.getsalary();
    }
}
