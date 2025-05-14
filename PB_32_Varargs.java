import java .util.Scanner;
public class PB_32_Varargs {
    static int sum(int...arr)
    {
        int result=0;
        for(int a:arr){
            result=result+a;
        }
        return result;
    }

    public static void main(String[] args) {
        int a,b,c,d,e;
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers: ");
         a=sc.nextInt();
         b=sc.nextInt();
         c= sc.nextInt();
         d= sc.nextInt();
         e=sc.nextInt();
        System.out.println("the result of two no. "+ sum(a,b));
        System.out.println("the result is "+ sum(a,b,c,d,e));
    }
}
