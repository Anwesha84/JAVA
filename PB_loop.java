import java.util.Scanner;
public class PB_loop {
    public static void main(String[] args) {
      /*  int i,sum=0;
        for(i=0;i<=10;i++)
        {
            sum=sum+i;

        }
        System.out.println("the sum is: " +sum);

       */

       /* int i,rem=0,rev=0;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while(n!=0)
        {
           rem=n%10;
           rev=(rev*10)+rem;
           n=n/10;
        }
        System.out.println(rev);

        */
        int i;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println(2*i+1);
        }
    }
}
