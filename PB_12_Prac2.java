

 import java.util.Scanner;
 public class PB_12_Prac2 {
        public static void main(String[] args) {
            int a=56;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number: ");
            int b=sc.nextInt();
            if(a>b)
            {
                System.out.println("The given no is greater");
            } else if (a<b)
            {
                System.out.println("The user given no is greater");
            }
            else
                System.out.println("The both no are equal");
        }
    }


